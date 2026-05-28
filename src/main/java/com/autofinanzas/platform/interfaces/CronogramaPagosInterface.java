package com.autofinanzas.platform.interfaces;

import com.autofinanzas.platform.entidades.CronogramaPagos;

import java.util.List;
import java.util.Optional;

public interface CronogramaPagosInterface {
    public List<CronogramaPagos> list();
    public CronogramaPagos insert(CronogramaPagos cp);
    public Optional<CronogramaPagos> listId(int id);
    public void update(CronogramaPagos cp);
    public void delete(int id);
}
