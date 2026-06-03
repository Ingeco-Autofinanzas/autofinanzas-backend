package com.autofinanzas.platform.Implements;

import com.autofinanzas.platform.dto.BancoDTO;
import com.autofinanzas.platform.entidades.Bancos;
import com.autofinanzas.platform.interfaces.BancosInterface;
import com.autofinanzas.platform.repositorios.BancosRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancosImplement implements BancosInterface {
    @Autowired
    private BancosRepo banco;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<BancoDTO> list() {
        List<Bancos> bancos = banco.findAll();
        return bancos.stream().map(b -> modelMapper.map(b, BancoDTO.class)).toList();
    }

    @Override
    public Optional<BancoDTO> listId(int id) {
        Bancos bancos = banco.findById(id).orElse(null);
        if (bancos == null) {
            return Optional.empty();
        }
        return Optional.of(modelMapper.map(bancos, BancoDTO.class));
    }

    @Override
    public BancoDTO insert(BancoDTO b) {
        Bancos bancos = modelMapper.map(b, Bancos.class);
        Bancos savedBanco = banco.save(bancos);
        return modelMapper.map(savedBanco, BancoDTO.class);
    }


}
