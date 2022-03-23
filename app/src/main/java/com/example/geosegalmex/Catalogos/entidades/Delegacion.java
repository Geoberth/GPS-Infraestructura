package com.example.geosegalmex.Catalogos.entidades;

import androidx.annotation.NonNull;

public class Delegacion {

    private int id;
    private String Iddelegacion, Nomdelegacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIddelegacion() {
        return Iddelegacion;
    }

    public void setIddelegacion(String iddelegacion) {
        Iddelegacion = iddelegacion;
    }

    public String getNomdelegacion() {
        return Nomdelegacion;
    }

    public void setNomdelegacion(String nomdelegacion) {
        Nomdelegacion = nomdelegacion;
    }

    @NonNull
    public String toString() {
        return Nomdelegacion;
    }
}
