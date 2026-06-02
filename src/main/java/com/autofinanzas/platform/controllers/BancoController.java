package com.autofinanzas.platform.controllers;

import com.autofinanzas.platform.dto.BancoDTO;
import com.autofinanzas.platform.interfaces.BancosInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/bancos")
@RestController
public class BancoController {
    @Autowired
    private BancosInterface bancosInterface;

    @GetMapping
    public ResponseEntity<List<BancoDTO>> listar() {
        return ResponseEntity.ok(bancosInterface.list());
    }

    @PostMapping
    public ResponseEntity<BancoDTO> insertar(BancoDTO bancoDTO) {
        BancoDTO nuevoBanco = bancosInterface.insert(bancoDTO);
        return ResponseEntity.ok(nuevoBanco);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BancoDTO> obtenerPorId(@PathVariable int id) {
        return bancosInterface.listId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
