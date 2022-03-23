package com.example.geosegalmex.Catalogos.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

public class DbCatalogos extends DbHelper {
    public DbCatalogos(@Nullable Context context) {
        super(context);
    }

    public Cursor mostrarEstados() {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            Cursor filas = bd.rawQuery("SELECT DISTINCT * FROM " + TABLE_ESTADOS + " ORDER BY Nomestado ASC", null);
            if (filas.moveToFirst()) {
                return filas;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public Cursor mostrarDelegacion(String t_estado) {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            Cursor filas = bd.rawQuery("SELECT DISTINCT Iddelegacion, Nomdelegacion FROM " + t_estado + " ORDER BY Nomdelegacion ASC", null);
            if (filas.moveToFirst()) {
                return filas;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public Cursor mostrarDdr(String t_estado, String delegacion) {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            Cursor filas = bd.rawQuery("SELECT DISTINCT Idddr, Nomddr FROM " + t_estado + " WHERE Nomdelegacion LIKE '" + delegacion + "' ORDER BY Nomddr ASC", null);
            if (filas.moveToFirst()) {
                return filas;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public Cursor mostrarCader(String t_estado, String delegacion, String ddr) {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            Cursor filas = bd.rawQuery("SELECT DISTINCT Idcader, Nomcader FROM " + t_estado + " WHERE Nomdelegacion LIKE '" + delegacion + "' AND Nomddr LIKE '" + ddr + "' ORDER BY Nomcader ASC", null);
            if (filas.moveToFirst()) {
                return filas;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public Cursor mostrarMunicipio(String t_estado, String delegacion, String ddr, String cader) {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            Cursor filas = bd.rawQuery("SELECT DISTINCT Idmunicipio, Nommunicipio FROM " + t_estado + " WHERE Nomdelegacion LIKE '" + delegacion + "' AND Nomddr LIKE '" + ddr + "' AND Nomcader LIKE '" + cader + "' ORDER BY Nommunicipio ASC", null);
            if (filas.moveToFirst()) {
                return filas;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }


}