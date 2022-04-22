package com.example.infraestructura.Infra_Granos;

import java.io.Serializable;

public class Granos_Model implements Serializable {

    private String folio, fecha, cveEntidad,entidad,cveRepresentacion,representacion,cveDdr,ddr,cveCader,cader,cveMunicipio,municipio,cveLocalidad,loc,dom,cp,almacen, capInst,principal,secundario,volumen,superf,estado,longitud,latitud,f1,f2,bandera,banderaFoto;

    public Granos_Model() {

    }

    public Granos_Model(String folio, String fecha, String cveEntidad, String entidad, String cveRepresentacion, String representacion, String cveDdr, String ddr, String cveCader, String cader, String cveMunicipio, String municipio, String cveLocalidad, String loc, String dom, String cp, String almacen, String capInst, String principal, String secundario, String volumen, String superf, String estado, String longitud, String latitud, String f1, String f2, String bandera, String banderaFoto) {
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
        this.dom = dom;
        this.cp = cp;
        this.almacen = almacen;
        this.capInst = capInst;
        this.principal = principal;
        this.secundario = secundario;
        this.volumen = volumen;
        this.superf = superf;
        this.estado = estado;
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

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public String getCapInst() {
        return capInst;
    }

    public void setCapInst(String capInst) {
        this.capInst = capInst;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getSecundario() {
        return secundario;
    }

    public void setSecundario(String secundario) {
        this.secundario = secundario;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getSuperf() {
        return superf;
    }

    public void setSuperf(String superf) {
        this.superf = superf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
