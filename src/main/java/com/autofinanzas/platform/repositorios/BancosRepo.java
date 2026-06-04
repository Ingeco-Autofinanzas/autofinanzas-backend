package com.autofinanzas.platform.repositorios;

import com.autofinanzas.platform.entidades.Bancos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancosRepo extends JpaRepository<Bancos, Integer> {
}
