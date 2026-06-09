package com.autofinanzas.platform.Implements;

import com.autofinanzas.platform.entidades.Simulaciones;
import com.autofinanzas.platform.interfaces.Simulacionesinterface;
import com.autofinanzas.platform.repositorios.SimulacionesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class simulacionesImplement implements Simulacionesinterface {
    @Autowired
    private SimulacionesRepo sr;

    @Override
    public List<Simulaciones> listar() {
        return sr.findAll();
    }

    @Override
    public Simulaciones guardar(Simulaciones simulacion) {
        return sr.save(simulacion);
    }

    @Override
    public Simulaciones actualizar(Simulaciones simulacion) {
        return sr.save(simulacion);
    }

    @Override
    public void eliminar(Integer id) {
        sr.deleteById(id);
    }

    @Override
    public Simulaciones buscarPorId(Integer id) {
        return sr.findById(id).orElse(null);
    }
}
