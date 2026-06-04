package com.autofinanzas.platform.controllers;

import com.autofinanzas.platform.dto.UsuarioDTO;
import com.autofinanzas.platform.interfaces.UsuarioInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/usuarios")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioInterface usuarioInterface;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> listar() {
        return ResponseEntity.ok(usuarioInterface.list());
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> insertar(@RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO nuevoUsuario = usuarioInterface.insert(usuarioDTO);
        return ResponseEntity.ok(nuevoUsuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> obtenerPorId(@PathVariable Long id) {
        return usuarioInterface.listId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDTO> actualizar(@PathVariable Long id,
                                                 @RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO usuarioActualizado = usuarioInterface.update(id, usuarioDTO);
        return ResponseEntity.ok(usuarioActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        usuarioInterface.delete(id);
        return ResponseEntity.noContent().build();
    }
}