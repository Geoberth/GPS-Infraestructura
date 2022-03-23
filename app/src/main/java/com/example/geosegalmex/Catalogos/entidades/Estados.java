package com.example.geosegalmex.Catalogos.entidades;

import androidx.annotation.NonNull;

public class Estados {

    private int id;
    private String Idestado, Nomestado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdestado() {
        return Idestado;
    }

    public void setIdestado(String idestado) {
        Idestado = idestado;
    }

    public String getNomestado() {
        return Nomestado;
    }

    public void setNomestado(String nomestado) {
        Nomestado = nomestado;
    }

    @NonNull
    public String toString() {
        return Nomestado;
    }
}
