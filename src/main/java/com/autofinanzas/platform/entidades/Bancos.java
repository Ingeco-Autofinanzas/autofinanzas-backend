package com.autofinanzas.platform.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Bancos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBanco;

    @Column(nullable = false)
    private String nombreBanco;

    @Column
    private double teaMin;

    @Column
    private double teaMax;

    @Column
    private double porcentajeCuotaInicialMin;

    @Column
    private double porcentajeCuotaInicialMax;

    @Column
    private double cuotaBalónFinalMin;

    @Column
    private double cuotaBalónFinalMax;

    @Column
    private int plazoCuotasMin;

    @Column
    private int plazoCuotasMax;

    @Column
    private int periodoGraciaMin;

    @Column
    private int periodoGraciaMax;

    public Bancos() {
    }

    public Bancos(int idBanco, String banco, double teaMin, double teaMax, double porcentajeCuotaInicialMin, double porcentajeCuotaInicialMax, double cuotaBalónFinalMin, double cuotaBalónFinalMax, int plazoCuotasMin, int plazoCuotasMax, int periodoGraciaMin, int periodoGraciaMax) {
        this.idBanco = idBanco;
        this.nombreBanco = banco;
        this.teaMin = teaMin;
        this.teaMax = teaMax;
        this.porcentajeCuotaInicialMin = porcentajeCuotaInicialMin;
        this.porcentajeCuotaInicialMax = porcentajeCuotaInicialMax;
        this.cuotaBalónFinalMin = cuotaBalónFinalMin;
        this.cuotaBalónFinalMax = cuotaBalónFinalMax;
        this.plazoCuotasMin = plazoCuotasMin;
        this.plazoCuotasMax = plazoCuotasMax;
        this.periodoGraciaMin = periodoGraciaMin;
        this.periodoGraciaMax = periodoGraciaMax;
    }
}