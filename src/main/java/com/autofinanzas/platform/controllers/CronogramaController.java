package com.autofinanzas.platform.controllers;

import com.autofinanzas.platform.interfaces.CronogramaPagosInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cronograma")
public class CronogramaController {
    @Autowired
    private CronogramaPagosInterface ci;
}
