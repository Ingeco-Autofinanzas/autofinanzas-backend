package com.autofinanzas.platform.interfaces;

import com.autofinanzas.platform.dto.BancoDTO;
import com.autofinanzas.platform.entidades.Bancos;

import java.util.List;
import java.util.Optional;

public interface BancosInterface {
    List<BancoDTO> list();
    Optional<BancoDTO> listId(int id);
    BancoDTO insert(BancoDTO b);

}
