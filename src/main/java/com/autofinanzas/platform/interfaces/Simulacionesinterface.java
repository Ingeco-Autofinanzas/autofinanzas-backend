package com.autofinanzas.platform.interfaces;

import com.autofinanzas.platform.entidades.Simulaciones;

import java.util.List;

public interface Simulacionesinterface {
    List<Simulaciones> listar();
    Simulaciones guardar(Simulaciones simulacion);
    Simulaciones actualizar(Simulaciones simulacion);
    void eliminar(Integer id);
    Simulaciones buscarPorId(Integer id);
}
