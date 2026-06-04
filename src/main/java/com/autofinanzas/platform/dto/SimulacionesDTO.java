package com.autofinanzas.platform.dto;

import java.time.LocalDate;

public class SimulacionesDTO {
    private Integer idsimulaciones;
    private Integer idUsuario;
    private Integer idBanco;
    private String nombreVehiculo;
    private Double precioVehiculoUsd;
    private Double cuotaInicialPorc;
    private Double montoPrestamoUsd;
    private Integer plazoMeses;
    private Double teaAplicadaPorc;
    private Double tceaCalculado;
    private String tipoGracia;
    private Integer mesesGracia;
    private Double van;
    private Double tir;
    private Double cuotaBalon;
    private String estado;
    private LocalDate fechaInicio;
    private Double temAplicada;
    private Boolean desgravamenIncluido;
    private Boolean seguroVehicularIncluido;

    public SimulacionesDTO() {
    }

    public Integer getId() {
        return idsimulaciones;
    }

    public void setId(Integer id) {
        this.idsimulaciones = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public Double getPrecioVehiculoUsd() {
        return precioVehiculoUsd;
    }

    public void setPrecioVehiculoUsd(Double precioVehiculoUsd) {
        this.precioVehiculoUsd = precioVehiculoUsd;
    }

    public Double getCuotaInicialPorc() {
        return cuotaInicialPorc;
    }

    public void setCuotaInicialPorc(Double cuotaInicialPorc) {
        this.cuotaInicialPorc = cuotaInicialPorc;
    }

    public Double getMontoPrestamoUsd() {
        return montoPrestamoUsd;
    }

    public void setMontoPrestamoUsd(Double montoPrestamoUsd) {
        this.montoPrestamoUsd = montoPrestamoUsd;
    }

    public Integer getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(Integer plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public Double getTeaAplicadaPorc() {
        return teaAplicadaPorc;
    }

    public void setTeaAplicadaPorc(Double teaAplicadaPorc) {
        this.teaAplicadaPorc = teaAplicadaPorc;
    }

    public Double getTceaCalculado() {
        return tceaCalculado;
    }

    public void setTceaCalculado(Double tceaCalculado) {
        this.tceaCalculado = tceaCalculado;
    }

    public String getTipoGracia() {
        return tipoGracia;
    }

    public void setTipoGracia(String tipoGracia) {
        this.tipoGracia = tipoGracia;
    }

    public Integer getMesesGracia() {
        return mesesGracia;
    }

    public void setMesesGracia(Integer mesesGracia) {
        this.mesesGracia = mesesGracia;
    }

    public Double getVan() {
        return van;
    }

    public void setVan(Double van) {
        this.van = van;
    }

    public Double getTir() {
        return tir;
    }

    public void setTir(Double tir) {
        this.tir = tir;
    }

    public Double getCuotaBalon() {
        return cuotaBalon;
    }

    public void setCuotaBalon(Double cuotaBalon) {
        this.cuotaBalon = cuotaBalon;
    }

    public Boolean getSeguroVehicularIncluido() {
        return seguroVehicularIncluido;
    }

    public void setSeguroVehicularIncluido(Boolean seguroVehicularIncluido) {
        this.seguroVehicularIncluido = seguroVehicularIncluido;
    }

    public Boolean getDesgravamenIncluido() {
        return desgravamenIncluido;
    }

    public void setDesgravamenIncluido(Boolean desgravamenIncluido) {
        this.desgravamenIncluido = desgravamenIncluido;
    }

    public Double getTemAplicada() {
        return temAplicada;
    }

    public void setTemAplicada(Double temAplicada) {
        this.temAplicada = temAplicada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
