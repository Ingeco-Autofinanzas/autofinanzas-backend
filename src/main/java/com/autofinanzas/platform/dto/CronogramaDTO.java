package com.autofinanzas.platform.dto;

import com.autofinanzas.platform.entidades.Simulaciones;

import java.time.LocalDate;

public class CronogramaDTO {
    private int idCronogramaPago;
    private int numeroCuota;
    private Double saldoInicial;
    private Double saldoFinal;
    private Double interes;
    private Double cuotaMensual;
    private Double amortizacion;
    private Double Sdegravamen;
    private Double Svehicular;
    private LocalDate fechaPago;
    private Simulaciones simulaciones;

    public Simulaciones getSimulaciones() {
        return simulaciones;
    }

    public void setSimulaciones(Simulaciones simulaciones) {
        this.simulaciones = simulaciones;
    }

    public int getIdCronogramaPago() {
        return idCronogramaPago;
    }

    public void setIdCronogramaPago(int idCronogramaPago) {
        this.idCronogramaPago = idCronogramaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(Double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public Double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(Double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public Double getSdegravamen() {
        return Sdegravamen;
    }

    public void setSdegravamen(Double sdegravamen) {
        Sdegravamen = sdegravamen;
    }

    public Double getSvehicular() {
        return Svehicular;
    }

    public void setSvehicular(Double svehicular) {
        Svehicular = svehicular;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }
}
