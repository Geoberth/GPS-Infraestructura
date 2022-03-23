package com.example.geosegalmex.Catalogos.entidades;

import androidx.annotation.NonNull;

public class Ddr {

    private int id;
    private String Idddr, Nomddr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdddr() {
        return Idddr;
    }

    public void setIdddr(String idddr) {
        Idddr = idddr;
    }

    public String getNomddr() {
        return Nomddr;
    }

    public void setNomddr(String nomddr) {
        Nomddr = nomddr;
    }

    @NonNull
    public String toString() {
        return Nomddr;
    }
}
