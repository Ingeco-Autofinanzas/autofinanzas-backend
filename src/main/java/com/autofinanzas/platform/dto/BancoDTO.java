package com.autofinanzas.platform.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BancoDTO {
    private int idBanco;
    private String nombreBanco;
    private double teaMin;
    private double teaMax;
    private double porcentajeCuotaInicialMin;
    private double porcentajeCuotaInicialMax;
    private double cuotaBalónFinalMin;
    private double cuotaBalónFinalMax;
    private int plazoCuotasMin;
    private int plazoCuotasMax;
    private int periodoGraciaMin;
    private int periodoGraciaMax;
}
