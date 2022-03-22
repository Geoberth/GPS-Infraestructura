package com.example.geosegalmex.Infra_Lecheros;

import java.io.Serializable;

public class Lecheros_Model implements Serializable {

    private String folio, fecha, cveEntidad, entidad, cvedelegacion, delegacion, cveDdr, ddr, cveCader, cader, cveMunicipio, municipio, cveLocalidad, localidad, domiupp, nombreupp, estatus, numerovacas, numerovaqui, raza, cruza, otraraza, tipoordena, superficie, observaciones, longitud, latitud, foto1, foto2;

    public Lecheros_Model() {

    }

    public Lecheros_Model(String folio, String fecha, String cveEntidad, String entidad, String cvedelegacion, String delegacion, String cveDdr, String ddr, String cveCader, String cader, String cveMunicipio, String municipio, String cveLocalidad, String localidad, String domiupp, String nombreupp, String estatus, String numerovacas, String numerovaqui, String raza, String cruza, String otraraza, String tipoordena, String superficie, String observaciones, String longitud, String latitud, String foto1, String foto2) {
        this.folio = folio;
        this.fecha = fecha;
        this.cveEntidad = cveEntidad;
        this.entidad = entidad;
        this.cvedelegacion = cvedelegacion;
        this.delegacion = delegacion;
        this.cveDdr = cveDdr;
        this.ddr = ddr;
        this.cveCader = cveCader;
        this.cader = cader;
        this.cveMunicipio = cveMunicipio;
        this.municipio = municipio;
        this.cveLocalidad = cveLocalidad;
        this.localidad = localidad;

        this.domiupp = domiupp;
        this.nombreupp = nombreupp;
        this.estatus = estatus;
        this.numerovacas = numerovacas;
        this.numerovaqui = numerovaqui;
        this.raza = raza;
        this.cruza = cruza;
        this.otraraza = otraraza;
        this.tipoordena = tipoordena;
        this.superficie = superficie;
        this.observaciones = observaciones;
        this.longitud = longitud;
        this.latitud = latitud;
        this.foto1 = foto1;
        this.foto2 = foto2;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCveEntidad() {
        return cveEntidad;
    }

    public void setCveEntidad(String cveEntidad) {
        this.cveEntidad = cveEntidad;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getCvedelegacion() {
        return cvedelegacion;
    }

    public void setCvedelegacion(String cvedelegacion) {
        this.cvedelegacion = cvedelegacion;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getCveDdr() {
        return cveDdr;
    }

    public void setCveDdr(String cveDdr) {
        this.cveDdr = cveDdr;
    }

    public String getDdr() {
        return ddr;
    }

    public void setDdr(String ddr) {
        this.ddr = ddr;
    }

    public String getCveCader() {
        return cveCader;
    }

    public void setCveCader(String cveCader) {
        this.cveCader = cveCader;
    }

    public String getCader() {
        return cader;
    }

    public void setCader(String cader) {
        this.cader = cader;
    }

    public String getCveMunicipio() {
        return cveMunicipio;
    }

    public void setCveMunicipio(String cveMunicipio) {
        this.cveMunicipio = cveMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCveLocalidad() {
        return cveLocalidad;
    }

    public void setCveLocalidad(String cveLocalidad) {
        this.cveLocalidad = cveLocalidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDomiupp() {
        return domiupp;
    }

    public void setDomiupp(String domiupp) {
        this.domiupp = domiupp;
    }

    public String getNombreupp() {
        return nombreupp;
    }

    public void setNombreupp(String nombreupp) {
        this.nombreupp = nombreupp;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getNumerovacas() {
        return numerovacas;
    }

    public void setNumerovacas(String numerovacas) {
        this.numerovacas = numerovacas;
    }

    public String getNumerovaqui() {
        return numerovaqui;
    }

    public void setNumerovaqui(String numerovaqui) {
        this.numerovaqui = numerovaqui;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getCruza() {
        return cruza;
    }

    public void setCruza(String cruza) {
        this.cruza = cruza;
    }

    public String getOtraraza() {
        return otraraza;
    }

    public void setOtraraza(String otraraza) {
        this.otraraza = otraraza;
    }

    public String getTipoordena() {
        return tipoordena;
    }

    public void setTipoordena(String tipoordena) {
        this.tipoordena = tipoordena;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getFoto1() {
        return foto1;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public String getFoto2() {
        return foto2;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }
}

