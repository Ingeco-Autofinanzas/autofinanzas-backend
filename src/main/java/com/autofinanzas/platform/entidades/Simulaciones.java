package com.autofinanzas.platform.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "simulaciones")
public class Simulaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsimulaciones;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_banco", nullable = false)
    private Bancos idBanco;

    @Column(name = "nombre_vehiculo")
    private String nombreVehiculo;

    @Column(name = "precio_vehiculo_usd")
    private Double precioVehiculoUsd;

    @Column(name = "cuota_inicial_porc")
    private Double cuotaInicialPorc;

    @Column(name = "monto_prestamo_usd")
    private Double montoPrestamoUsd;

    @Column(name = "plazo_meses")
    private Integer plazoMeses;

    @Column(name = "tea_aplicada_porc")
    private Double teaAplicadaPorc;

    @Column(name = "tcea_calculado")
    private Double tceaCalculado;

    @Column(name = "tipo_gracia")
    private String tipoGracia;

    @Column(name = "meses_gracia")
    private Integer mesesGracia;

    @Column(name = "van")
    private Double van;

    @Column(name = "tir")
    private Double tir;

    @Column(name = "cuota_balon")
    private Double cuotaBalon;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "tem_aplicada")
    private Double temAplicada;

    @Column(name = "desgravamen_incluido")
    private Boolean desgravamenIncluido;

    @Column(name = "seguro_vehicular_incluido")
    private Boolean seguroVehicularIncluido;

    public Simulaciones() {
    }

    public Simulaciones(Integer idsimulaciones, Usuario usuario, Bancos idBanco, String nombreVehiculo, Double precioVehiculoUsd, Double cuotaInicialPorc, Double montoPrestamoUsd, Integer plazoMeses, Double teaAplicadaPorc, Double tceaCalculado, String tipoGracia, Integer mesesGracia, Double van, Double tir, Double cuotaBalon, String estado, LocalDate fechaInicio, Double temAplicada, Boolean desgravamenIncluido, Boolean seguroVehicularIncluido) {
        this.idsimulaciones = idsimulaciones;
        this.usuario = usuario;
        this.idBanco = idBanco;
        this.nombreVehiculo = nombreVehiculo;
        this.precioVehiculoUsd = precioVehiculoUsd;
        this.cuotaInicialPorc = cuotaInicialPorc;
        this.montoPrestamoUsd = montoPrestamoUsd;
        this.plazoMeses = plazoMeses;
        this.teaAplicadaPorc = teaAplicadaPorc;
        this.tceaCalculado = tceaCalculado;
        this.tipoGracia = tipoGracia;
        this.mesesGracia = mesesGracia;
        this.van = van;
        this.tir = tir;
        this.cuotaBalon = cuotaBalon;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.temAplicada = temAplicada;
        this.desgravamenIncluido = desgravamenIncluido;
        this.seguroVehicularIncluido = seguroVehicularIncluido;
    }

    public Integer getIdsimulaciones() {
        return idsimulaciones;
    }

    public void setIdsimulaciones(Integer idsimulaciones) {
        this.idsimulaciones = idsimulaciones;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Bancos getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Bancos idBanco) {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Double getTemAplicada() {
        return temAplicada;
    }

    public void setTemAplicada(Double temAplicada) {
        this.temAplicada = temAplicada;
    }

    public Boolean getDesgravamenIncluido() {
        return desgravamenIncluido;
    }

    public void setDesgravamenIncluido(Boolean desgravamenIncluido) {
        this.desgravamenIncluido = desgravamenIncluido;
    }

    public Boolean getSeguroVehicularIncluido() {
        return seguroVehicularIncluido;
    }

    public void setSeguroVehicularIncluido(Boolean seguroVehicularIncluido) {
        this.seguroVehicularIncluido = seguroVehicularIncluido;
    }
}
