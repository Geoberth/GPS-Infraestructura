package com.example.infraestructura.Catalogos.entidades;

import androidx.annotation.NonNull;

public class Municipio {

    private int id;
    private String Idmunicipio, Nommunicipio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdmunicipio() {
        return Idmunicipio;
    }

    public void setIdmunicipio(String idmunicipio) {
        Idmunicipio = idmunicipio;
    }

    public String getNommunicipio() {
        return Nommunicipio;
    }

    public void setNommunicipio(String nommunicipio) {
        Nommunicipio = nommunicipio;
    }

    @NonNull
    public String toString() {
        return Nommunicipio;
    }

}
