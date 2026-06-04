package com.autofinanzas.platform.Implements;

import com.autofinanzas.platform.dto.UsuarioDTO;
import com.autofinanzas.platform.entidades.Usuario;
import com.autofinanzas.platform.interfaces.UsuarioInterface;
import com.autofinanzas.platform.repositorios.UsuarioRepo;
import com.autofinanzas.platform.security.entities.Role;
import com.autofinanzas.platform.security.entities.User;
import com.autofinanzas.platform.security.repositories.RoleRepository;
import com.autofinanzas.platform.security.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UsuarioImplement implements UsuarioInterface {

    @Autowired
    private UsuarioRepo usuariosRepo;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<UsuarioDTO> list() {
        List<Usuario> usuarios = usuariosRepo.findAll();
        return usuarios.stream().map(this::convertirADTO).toList();
    }

    @Override
    public Optional<UsuarioDTO> listId(Long id) {
        Usuario usuario = usuariosRepo.findById(id).orElse(null);

        if (usuario == null) {
            return Optional.empty();
        }

        return Optional.of(convertirADTO(usuario));
    }

    @Override
    public UsuarioDTO insert(UsuarioDTO usuarioDTO) {
        if (usuariosRepo.existsByEmailIgnoreCase(usuarioDTO.getEmail())) {
            throw new RuntimeException("El email ya se encuentra registrado");
        }

        if (userRepository.findByUsername(usuarioDTO.getEmail()).isPresent()) {
            throw new RuntimeException("El usuario de seguridad ya existe");
        }

        Role rolUsuario = roleRepository.findByName("ROLE_USUARIO")
                .orElseGet(() -> roleRepository.save(new Role(null, "ROLE_USUARIO")));

        String passwordEncriptado = passwordEncoder.encode(usuarioDTO.getPassword());

        User user = new User();
        user.setUsername(usuarioDTO.getEmail());
        user.setPassword(passwordEncriptado);

        Set<Role> roles = new HashSet<>();
        roles.add(rolUsuario);
        user.setRoles(roles);

        User userGuardado = userRepository.save(user);

        Usuario usuario = new Usuario();
        usuario.setNombreApellidos(usuarioDTO.getNombreApellidos());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setPassword(passwordEncriptado);
        usuario.setUser(userGuardado);

        Usuario usuarioGuardado = usuariosRepo.save(usuario);
        return convertirADTO(usuarioGuardado);
    }

    @Override
    public UsuarioDTO update(Long id, UsuarioDTO usuarioDTO) {
        Usuario usuario = usuariosRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        usuario.setNombreApellidos(usuarioDTO.getNombreApellidos());
        usuario.setEmail(usuarioDTO.getEmail());

        if (usuario.getUser() != null) {
            usuario.getUser().setUsername(usuarioDTO.getEmail());
        }

        if (usuarioDTO.getPassword() != null && !usuarioDTO.getPassword().isBlank()) {
            String passwordEncriptado = passwordEncoder.encode(usuarioDTO.getPassword());
            usuario.setPassword(passwordEncriptado);

            if (usuario.getUser() != null) {
                usuario.getUser().setPassword(passwordEncriptado);
            }
        }

        Usuario usuarioActualizado = usuariosRepo.save(usuario);
        return convertirADTO(usuarioActualizado);
    }

    @Override
    public void delete(Long id) {
        Usuario usuario = usuariosRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        User user = usuario.getUser();

        usuariosRepo.delete(usuario);

        if (user != null) {
            userRepository.delete(user);
        }
    }

    private UsuarioDTO convertirADTO(Usuario usuario) {
        UsuarioDTO dto = modelMapper.map(usuario, UsuarioDTO.class);

        if (usuario.getUser() != null) {
            dto.setUserId(usuario.getUser().getId());
        }

        dto.setPassword(null);
        return dto;
    }
}