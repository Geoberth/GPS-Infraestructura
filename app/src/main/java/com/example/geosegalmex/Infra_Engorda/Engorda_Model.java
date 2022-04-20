package com.example.geosegalmex.Infra_Engorda;

import java.io.Serializable;

public class Engorda_Model implements Serializable {

    private String folio, fecha, cveEntidad,entidad,cveRepresentacion,representacion,cveDdr,ddr,cveCader,cader,cveMunicipio,municipio,cveLocalidad,loc,domUpp,nomUpp,estatus,sistema,actividad,raza,razaCruza,razaOtra,capInst,capUtil,totalAnim,engorda,superf,observ,longitud,latitud,f1,f2,bandera,banderaFoto;

    public Engorda_Model() {

    }

    public Engorda_Model(String folio, String fecha, String cveEntidad, String entidad, String cveRepresentacion, String representacion, String cveDdr, String ddr, String cveCader, String cader, String cveMunicipio, String municipio, String cveLocalidad, String loc, String domUpp, String nomUpp, String estatus, String sistema, String actividad, String raza, String razaCruza, String razaOtra, String capInst, String capUtil, String totalAnim, String engorda, String superf, String observ, String longitud, String latitud, String f1, String f2, String bandera, String banderaFoto) {
        this.folio = folio;
        this.fecha = fecha;
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
        this.actividad = actividad;
        this.raza = raza;
        this.razaCruza = razaCruza;
        this.razaOtra = razaOtra;
        this.capInst = capInst;
        this.capUtil = capUtil;
        this.totalAnim = totalAnim;
        this.engorda = engorda;
        this.superf = superf;
        this.observ = observ;
        this.longitud = longitud;
        this.latitud = latitud;
        this.f1 = f1;
        this.f2 = f2;
        this.bandera = bandera;
        this.banderaFoto = banderaFoto;
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

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRazaCruza() {
        return razaCruza;
    }

    public void setRazaCruza(String razaCruza) {
        this.razaCruza = razaCruza;
    }

    public String getRazaOtra() {
        return razaOtra;
    }

    public void setRazaOtra(String razaOtra) {
        this.razaOtra = razaOtra;
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

    public String getEngorda() {
        return engorda;
    }

    public void setEngorda(String engorda) {
        this.engorda = engorda;
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

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public String getBanderaFoto() {
        return banderaFoto;
    }

    public void setBanderaFoto(String banderaFoto) {
        this.banderaFoto = banderaFoto;
    }
}
