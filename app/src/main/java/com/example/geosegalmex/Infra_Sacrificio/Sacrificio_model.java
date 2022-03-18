package com.example.geosegalmex.Infra_Sacrificio;
import java.io.Serializable;

public class Sacrificio_model implements Serializable {

    private String folio, fecha, cveEntidad, entidad, cvedelegacion, delegacion, cveDdr, ddr, cveCader, cader, cveMunicipio, municipio, cveLocalidad, localidad, tiporastro, rastro, estatus_rastro, turno, CIMequino, CIMbovino, CIMporcino, CIMovino, CIMcaprino, CIMave, CUMequino, CUMbovino, CUMporcino, CUMovino, CUMcaprino, CUMave, observaciones, longitud, latitud, foto1, foto2;

    public Sacrificio_model() {

    }

    public Sacrificio_model(String folio, String fecha, String cveEntidad, String entidad, String cvedelegacion, String delegacion, String cveDdr, String ddr, String cveCader, String cader, String cveMunicipio, String municipio, String cveLocalidad, String localidad, String tiporastro, String rastro, String estatus_rastro, String turno, String CIMequino, String CIMbovino, String CIMporcino, String CIMovino, String CIMcaprino, String CIMave, String CUMequino, String CUMbovino, String CUMporcino, String CUMovino, String CUMcaprino, String CUMave, String observaciones, String longitud, String latitud, String foto1, String foto2) {
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
        this.tiporastro = tiporastro;
        this.rastro = rastro;
        this.estatus_rastro = estatus_rastro;
        this.turno = turno;
        this.CIMequino = CIMequino;
        this.CIMbovino = CIMbovino;
        this.CIMporcino = CIMporcino;
        this.CIMovino = CIMovino;
        this.CIMcaprino = CIMcaprino;
        this.CIMave = CIMave;
        this.CUMequino = CUMequino;
        this.CUMbovino = CUMbovino;
        this.CUMporcino = CUMporcino;
        this.CUMovino = CUMovino;
        this.CUMcaprino = CUMcaprino;
        this.CUMave = CUMave;
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

    public String getTiporastro() {
        return tiporastro;
    }

    public void setTiporastro(String tiporastro) {
        this.tiporastro = tiporastro;
    }

    public String getRastro() {
        return rastro;
    }

    public void setRastro(String rastro) {
        this.rastro = rastro;
    }

    public String getEstatus_rastro() {
        return estatus_rastro;
    }

    public void setEstatus_rastro(String estatus_rastro) {
        this.estatus_rastro = estatus_rastro;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCIMequino() {
        return CIMequino;
    }

    public void setCIMequino(String CIMequino) {
        this.CIMequino = CIMequino;
    }

    public String getCIMbovino() {
        return CIMbovino;
    }

    public void setCIMbovino(String CIMbovino) {
        this.CIMbovino = CIMbovino;
    }

    public String getCIMporcino() {
        return CIMporcino;
    }

    public void setCIMporcino(String CIMporcino) {
        this.CIMporcino = CIMporcino;
    }

    public String getCIMovino() {
        return CIMovino;
    }

    public void setCIMovino(String CIMovino) {
        this.CIMovino = CIMovino;
    }

    public String getCIMcaprino() {
        return CIMcaprino;
    }

    public void setCIMcaprino(String CIMcaprino) {
        this.CIMcaprino = CIMcaprino;
    }

    public String getCIMave() {
        return CIMave;
    }

    public void setCIMave(String CIMave) {
        this.CIMave = CIMave;
    }

    public String getCUMequino() {
        return CUMequino;
    }

    public void setCUMequino(String CUMequino) {
        this.CUMequino = CUMequino;
    }

    public String getCUMbovino() {
        return CUMbovino;
    }

    public void setCUMbovino(String CUMbovino) {
        this.CUMbovino = CUMbovino;
    }

    public String getCUMporcino() {
        return CUMporcino;
    }

    public void setCUMporcino(String CUMporcino) {
        this.CUMporcino = CUMporcino;
    }

    public String getCUMovino() {
        return CUMovino;
    }

    public void setCUMovino(String CUMovino) {
        this.CUMovino = CUMovino;
    }

    public String getCUMcaprino() {
        return CUMcaprino;
    }

    public void setCUMcaprino(String CUMcaprino) {
        this.CUMcaprino = CUMcaprino;
    }

    public String getCUMave() {
        return CUMave;
    }

    public void setCUMave(String CUMave) {
        this.CUMave = CUMave;
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
