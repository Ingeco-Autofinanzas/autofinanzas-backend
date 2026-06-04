package com.autofinanzas.platform.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "simulaciones")
public class Simulaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsimulaciones;

    ///@ManyToOne
    ///@JoinColumn(name = "id_usuario", nullable = false)
    ///private Usuario usuario;

    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

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

    public Integer getIdsimulaciones() {
        return idsimulaciones;
    }

    public void setIdsimulaciones(Integer idsimulaciones) {
        this.idsimulaciones = idsimulaciones;
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

    public Double getCuotaBalon() {
        return cuotaBalon;
    }

    public void setCuotaBalon(Double cuotaBalon) {
        this.cuotaBalon = cuotaBalon;
    }

    public Double getTir() {
        return tir;
    }

    public void setTir(Double tir) {
        this.tir = tir;
    }

    public Double getVan() {
        return van;
    }

    public void setVan(Double van) {
        this.van = van;
    }

    public Integer getMesesGracia() {
        return mesesGracia;
    }

    public void setMesesGracia(Integer mesesGracia) {
        this.mesesGracia = mesesGracia;
    }

    public String getTipoGracia() {
        return tipoGracia;
    }

    public void setTipoGracia(String tipoGracia) {
        this.tipoGracia = tipoGracia;
    }

    public Double getTceaCalculado() {
        return tceaCalculado;
    }

    public void setTceaCalculado(Double tceaCalculado) {
        this.tceaCalculado = tceaCalculado;
    }

    public Double getTeaAplicadaPorc() {
        return teaAplicadaPorc;
    }

    public void setTeaAplicadaPorc(Double teaAplicadaPorc) {
        this.teaAplicadaPorc = teaAplicadaPorc;
    }

    public Integer getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(Integer plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public Double getMontoPrestamoUsd() {
        return montoPrestamoUsd;
    }

    public void setMontoPrestamoUsd(Double montoPrestamoUsd) {
        this.montoPrestamoUsd = montoPrestamoUsd;
    }

    public Double getCuotaInicialPorc() {
        return cuotaInicialPorc;
    }

    public void setCuotaInicialPorc(Double cuotaInicialPorc) {
        this.cuotaInicialPorc = cuotaInicialPorc;
    }

    public Double getPrecioVehiculoUsd() {
        return precioVehiculoUsd;
    }

    public void setPrecioVehiculoUsd(Double precioVehiculoUsd) {
        this.precioVehiculoUsd = precioVehiculoUsd;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public Bancos getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Bancos idBanco) {
        this.idBanco = idBanco;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
