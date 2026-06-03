package com.autofinanzas.platform.Implements;

import com.autofinanzas.platform.interfaces.Simulacionesinterface;
import com.autofinanzas.platform.repositorios.SimulacionesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class simulacionesImplement implements Simulacionesinterface {
    @Autowired
    private SimulacionesRepo sr;


}
