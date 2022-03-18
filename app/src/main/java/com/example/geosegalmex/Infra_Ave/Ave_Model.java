package com.example.geosegalmex.Infra_Ave;

import java.io.Serializable;

public class Ave_Model implements Serializable {

    private String folio,cveEntidad,entidad,cveRepresentacion,representacion,cveDdr,ddr,cveCader,cader,cveMunicipio,municipio,cveLocalidad,loc,domUpp,nomUpp,estatus,sistema,especie,capInst,capUtil,totalAnim,numNaves,superf,observ,longitud,latitud,f1,f2;

    public Ave_Model() {

    }

    public Ave_Model(String folio, String cveEntidad, String entidad, String cveRepresentacion, String representacion, String cveDdr, String ddr, String cveCader, String cader, String cveMunicipio, String municipio, String cveLocalidad, String loc, String domUpp, String nomUpp, String estatus, String sistema, String especie, String capInst, String capUtil, String totalAnim, String numNaves, String superf, String observ, String longitud, String latitud, String f1, String f2) {
        this.folio = folio;
        this.cveEntidad = cveEntidad;
        this.entidad = entidad;
        this.cveRepresentacion = cveRepresentacion;
        this.representacion = representacion;
        this.cveDdr = cveDdr;
        this.ddr = ddr;
        this.cveCader = cveCader;
        this.cader = cader;
        this.cveMunicipio = cveMunicipio;
        this.municipio = municipio;
        this.cveLocalidad = cveLocalidad;
        this.loc = loc;
        this.domUpp = domUpp;
        this.nomUpp = nomUpp;
        this.estatus = estatus;
        this.sistema = sistema;
        this.especie = especie;
        this.capInst = capInst;
        this.capUtil = capUtil;
        this.totalAnim = totalAnim;
        this.numNaves = numNaves;
        this.superf = superf;
        this.observ = observ;
        this.longitud = longitud;
        this.latitud = latitud;
        this.f1 = f1;
        this.f2 = f2;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
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

    public String getCveRepresentacion() {
        return cveRepresentacion;
    }

    public void setCveRepresentacion(String cveRepresentacion) {
        this.cveRepresentacion = cveRepresentacion;
    }

    public String getRepresentacion() {
        return representacion;
    }

    public void setRepresentacion(String representacion) {
        this.representacion = representacion;
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

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getDomUpp() {
        return domUpp;
    }

    public void setDomUpp(String domUpp) {
        this.domUpp = domUpp;
    }

    public String getNomUpp() {
        return nomUpp;
    }

    public void setNomUpp(String nomUpp) {
        this.nomUpp = nomUpp;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCapInst() {
        return capInst;
    }

    public void setCapInst(String capInst) {
        this.capInst = capInst;
    }

    public String getCapUtil() {
        return capUtil;
    }

    public void setCapUtil(String capUtil) {
        this.capUtil = capUtil;
    }

    public String getTotalAnim() {
        return totalAnim;
    }

    public void setTotalAnim(String totalAnim) {
        this.totalAnim = totalAnim;
    }

    public String getNumNaves() {
        return numNaves;
    }

    public void setNumNaves(String numNaves) {
        this.numNaves = numNaves;
    }

    public String getSuperf() {
        return superf;
    }

    public void setSuperf(String superf) {
        this.superf = superf;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
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

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }
}
