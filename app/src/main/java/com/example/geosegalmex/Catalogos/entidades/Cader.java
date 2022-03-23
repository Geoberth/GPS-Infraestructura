package com.example.geosegalmex.Catalogos.entidades;

import androidx.annotation.NonNull;

public class Cader {

    private int id;
    private String Idcader, Nomcader;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdcader() {
        return Idcader;
    }

    public void setIdcader(String idcader) {
        Idcader = idcader;
    }

    public String getNomcader() {
        return Nomcader;
    }

    public void setNomcader(String nomcader) {
        Nomcader = nomcader;
    }

    @NonNull
    public String toString() {
        return Nomcader;
    }
}
