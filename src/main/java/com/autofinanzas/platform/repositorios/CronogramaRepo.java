package com.autofinanzas.platform.repositorios;

import com.autofinanzas.platform.entidades.CronogramaPagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CronogramaRepo extends JpaRepository<CronogramaPagos,Integer> {
}
