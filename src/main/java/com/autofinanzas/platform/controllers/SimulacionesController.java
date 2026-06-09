package com.autofinanzas.platform.controllers;


import com.autofinanzas.platform.entidades.Simulaciones;
import com.autofinanzas.platform.interfaces.Simulacionesinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/simulaciones")
@RestController
public class SimulacionesController {
    @Autowired
    private Simulacionesinterface SI;

    @GetMapping
    public List<Simulaciones> listar() {
        return SI.listar();
    }

    @PostMapping
    public Simulaciones guardar(@RequestBody Simulaciones simulacion) {
        return SI.guardar(simulacion);
    }

    @GetMapping("/{id}")
    public Simulaciones buscarPorId(@PathVariable Integer id) {
        return SI.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Simulaciones actualizar(@PathVariable Integer id, @RequestBody Simulaciones simulacion) {
        simulacion.setIdsimulaciones(id);
        return SI.actualizar(simulacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        SI.eliminar(id);
    }
}
