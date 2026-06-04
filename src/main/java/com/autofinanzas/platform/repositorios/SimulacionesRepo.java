package com.autofinanzas.platform.repositorios;

import com.autofinanzas.platform.entidades.Simulaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SimulacionesRepo extends JpaRepository<Simulaciones, Integer> {
    List<Simulaciones> findByUsuario_IdUsuario(Long idUsuario);
    List<Simulaciones> findByIdBanco_IdBanco(Integer idBanco);
}
