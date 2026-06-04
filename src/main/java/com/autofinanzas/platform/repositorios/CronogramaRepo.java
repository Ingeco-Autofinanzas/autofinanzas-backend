package com.autofinanzas.platform.repositorios;

import com.autofinanzas.platform.entidades.CronogramaPagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CronogramaRepo extends JpaRepository<CronogramaPagos,Integer> {
    List<CronogramaPagos> findByIdCronogramaPago(int idCP);
}
