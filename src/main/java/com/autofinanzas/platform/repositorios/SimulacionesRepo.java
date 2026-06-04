package com.autofinanzas.platform.repositorios;

import com.autofinanzas.platform.entidades.Simulaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SimulacionesRepo extends JpaRepository<Simulaciones, Integer> {
    List<Simulaciones> findByUsuario_Id(Integer idUsuario);
    List<Simulaciones> findByBanco_Id(Integer idBanco);
}
