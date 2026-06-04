package com.autofinanzas.platform.interfaces;

import com.autofinanzas.platform.dto.UsuarioDTO;

import java.util.List;
import java.util.Optional;

public interface UsuarioInterface {

    List<UsuarioDTO> list();

    Optional<UsuarioDTO> listId(Long id);

    UsuarioDTO insert(UsuarioDTO usuarioDTO);

    UsuarioDTO update(Long id, UsuarioDTO usuarioDTO);

    void delete(Long id);
}