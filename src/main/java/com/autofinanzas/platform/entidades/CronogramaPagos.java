package com.autofinanzas.platform.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="CronogramaPagos")
public class CronogramaPagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCronogramaPago;
    @Column(name="numeroCuota",nullable = false)
    private int numeroCuota;
    @Column(name="saldoInicial",nullable = false)
    private Double saldoInicial;
    @Column(name="saldoFinal",nullable = false)
    private Double saldoFinal;
    @Column(name="interes",nullable = false)
    private Double interes;
    @Column(name="cuotaMensual",nullable = false)
    private Double cuotaMensual;
    @Column(name="amortizacion",nullable = false)
    private Double amortizacion;
    @Column(name="Sdegravamen",nullable = false)
    private Double Sdegravamen;
    @Column(name="Svehicular",nullable = false)
    private Double Svehicular;
    @Column(name="fechaPago",nullable = false)
    private LocalDate fechaPago;

    @ManyToOne
    @JoinColumn(name="idsimulaciones")
    Simulaciones simulaciones;

    public CronogramaPagos() {
    }

    public CronogramaPagos(int idCronogramaPago, int numeroCuota, Double saldoInicial, Double saldoFinal, Double interes, Double cuotaMensual, Double amortizacion, Double sdegravamen, Double svehicular, LocalDate fechaPago, Simulaciones simulaciones) {
        this.idCronogramaPago = idCronogramaPago;
        this.numeroCuota = numeroCuota;
        this.saldoInicial = saldoInicial;
        this.saldoFinal = saldoFinal;
        this.interes = interes;
        this.cuotaMensual = cuotaMensual;
        this.amortizacion = amortizacion;
        Sdegravamen = sdegravamen;
        Svehicular = svehicular;
        this.fechaPago = fechaPago;
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

    public Simulaciones getSimulaciones() {
        return simulaciones;
    }

    public void setSimulaciones(Simulaciones simulaciones) {
        this.simulaciones = simulaciones;
    }
}
