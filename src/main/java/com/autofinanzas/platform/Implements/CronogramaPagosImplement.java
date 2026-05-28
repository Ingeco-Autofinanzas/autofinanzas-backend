package com.autofinanzas.platform.Implements;

import com.autofinanzas.platform.entidades.CronogramaPagos;
import com.autofinanzas.platform.interfaces.CronogramaPagosInterface;
import com.autofinanzas.platform.repositorios.CronogramaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CronogramaPagosImplement implements CronogramaPagosInterface {
    @Autowired
    private CronogramaRepo cr;
    @Override
    public List<CronogramaPagos> list() {
        return cr.findAll();
    }

    @Override
    public CronogramaPagos insert(CronogramaPagos cp) {
        return cr.save(cp);
    }

    @Override
    public Optional<CronogramaPagos> listId(int id) {
        return cr.findById(id);
    }

    @Override
    public void update(CronogramaPagos cp) {
        cr.save(cp);
    }

    @Override
    public void delete(int id) {
        cr.deleteById(id);
    }
}
