package com.example.geosegalmex.Infra_Lecheros;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import com.example.geosegalmex.General;
import com.example.geosegalmex.Gps.UtilidadesTrayectoria;

import java.util.ArrayList;

public class LecherosBD extends SQLiteOpenHelper {

    public static final String DB_NAME = "EstablosLecheros";
    public static final int DB_VERSION = 4;

    public LecherosBD(Context context) {super(context, DB_NAME, null, DB_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Lecheros_bd.CREAR_TABLA_LECHEROS);
        db.execSQL(UtilidadesTrayectoria.CREAR_TABLA_TRAYECTORIA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+ Lecheros_bd.TABLA_BD);
        db.execSQL("DROP TABLE IF EXISTS "+ UtilidadesTrayectoria.TABLA_TRAYECTORIA);
        onCreate(db);

    }

    public boolean addLecheros(Lecheros_Model model){
        SQLiteDatabase db           = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Lecheros_bd.COLUMN_FOLIO, model.getFolio());
        contentValues.put(Lecheros_bd.COLUMN_FECHA, model.getFecha());
        contentValues.put(Lecheros_bd.COLUMN_CVEENTIDAD, model.getCveEntidad());
        contentValues.put(Lecheros_bd.COLUMN_ENTIDAD, model.getEntidad());
        contentValues.put(Lecheros_bd.COLUMN_CVEDELEGACION, model.getCvedelegacion());
        contentValues.put(Lecheros_bd.COLUMN_DELEGACION, model.getDelegacion());
        contentValues.put(Lecheros_bd.COLUMN_CVEDDR, model.getCveDdr());
        contentValues.put(Lecheros_bd.COLUMN_DDR, model.getDdr());
        contentValues.put(Lecheros_bd.COLUMN_CVECADER, model.getCveCader());
        contentValues.put(Lecheros_bd.COLUMN_CADER, model.getCader());
        contentValues.put(Lecheros_bd.COLUMN_CVEMUNICIPIO, model.getCveMunicipio());
        contentValues.put(Lecheros_bd.COLUMN_MUNICIPIO, model.getMunicipio());
        contentValues.put(Lecheros_bd.COLUMN_CVELOCALIDAD, model.getCveLocalidad());
        contentValues.put(Lecheros_bd.COLUMN_LOCALIDAD, model.getLocalidad());
        contentValues.put(Lecheros_bd.COLUMN_DOMIUPP, model.getDomiupp());
        contentValues.put(Lecheros_bd.COLUMN_NOMBREUPP, model.getNombreupp());
        contentValues.put(Lecheros_bd.COLUMN_ESTATUS, model.getNombreupp());
        contentValues.put(Lecheros_bd.COLUMN_NUMEROVACAS, model.getNumerovacas());
        contentValues.put(Lecheros_bd.COLUMN_NUMEROVAQUI, model.getNumerovaqui());
        contentValues.put(Lecheros_bd.COLUMN_RAZA, model.getRaza());
        contentValues.put(Lecheros_bd.COLUMN_CRUZA, model.getCruza());
        contentValues.put(Lecheros_bd.COLUMN_OTRARAZA, model.getOtraraza());
        contentValues.put(Lecheros_bd.COLUMN_TIPOORDENA, model.getTipoordena());
        contentValues.put(Lecheros_bd.COLUMN_SUPERFICIE, model.getSuperficie());
        contentValues.put(Lecheros_bd.COLUMN_OBSERVACIONES, model.getObservaciones());
        contentValues.put(Lecheros_bd.COLUMN_LONGITUD, model.getLongitud());
        contentValues.put(Lecheros_bd.COLUMN_LATITUD, model.getLatitud());
        contentValues.put(Lecheros_bd.COLUMN_FOTO1, model.getFoto1());
        contentValues.put(Lecheros_bd.COLUMN_FOTO2, model.getFoto2());
        contentValues.put(Lecheros_bd.COLUMN_BANDERA, model.getBandera());
        contentValues.put(Lecheros_bd.COLUMN_BANDERAFOTOS, model.getBanderaFoto());
        long result = db.insert(Lecheros_bd.TABLA_BD, null, contentValues);
        db.close();

        if(result == -1) {
            return false;
        }else{
            return true;
        }
    }
    public void deleteLecheros(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS "+ Lecheros_bd.TABLA_BD);
        db.execSQL("DROP TABLE IF EXISTS "+ UtilidadesTrayectoria.TABLA_TRAYECTORIA);
        onCreate(db);
        if (android.os.Build.VERSION.SDK_INT == Build.VERSION_CODES.P){
            db.close();
        }
    }
    public boolean addTrayectoriaS(String folioPro, String folioBrig, String longGpsSave, String latiGpsSave, String horaActl, String fechaActl){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //contentValues.put(UtilidadesTrayectoria.COLUMN_FOLIO,folioPro);
        contentValues.put(UtilidadesTrayectoria.COLUMN_FOLIO, General.Foliocuestion);
        //contentValues.put(UtilidadesTrayectoria.COLUMN_FOLIO_TECNICO,Principal.userId);
        contentValues.put(UtilidadesTrayectoria.COLUMN_LONGITUD_TRAY,latiGpsSave);
        contentValues.put(UtilidadesTrayectoria.COLUMN_LATITUD_TRAY,longGpsSave);
        contentValues.put(UtilidadesTrayectoria.COLUMN_HRACTUAL_TRAY,horaActl);
        contentValues.put(UtilidadesTrayectoria.COLUMN_FCACTUAL_TRAY,fechaActl);

        long result = db.insert(UtilidadesTrayectoria.TABLA_TRAYECTORIA, null, contentValues);
        db.close();
        if(result == -1) {
            return false;
        }else{
            return true;
        }
    }

    public ArrayList<Lecheros_Model> mostrarLecheros() {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            ArrayList<Lecheros_Model> lista = new ArrayList<>();

            Cursor filas = bd.rawQuery("SELECT DISTINCT * FROM " + Lecheros_bd.TABLA_BD + " WHERE " + Lecheros_bd.COLUMN_BANDERA + " = 0 ORDER BY " + Lecheros_bd.COLUMN_FOLIO + " ASC", null);
            if (filas.moveToFirst()) {

                do{
                    Lecheros_Model cat = new Lecheros_Model();
                    cat.setFolio(filas.getString(0));
                    cat.setFecha(filas.getString(1));
                    cat.setCveEntidad(filas.getString(2));
                    cat.setEntidad(filas.getString(3));
                    cat.setCvedelegacion(filas.getString(4));
                    cat.setDelegacion(filas.getString(5));
                    cat.setCveDdr(filas.getString(6));
                    cat.setDdr(filas.getString(7));
                    cat.setCveCader(filas.getString(8));
                    cat.setCader(filas.getString(9));
                    cat.setCveMunicipio(filas.getString(10));
                    cat.setMunicipio(filas.getString(11));
                    cat.setCveLocalidad(filas.getString(12));
                    cat.setLocalidad(filas.getString(13));
                    cat.setDomiupp(filas.getString(14));
                    cat.setNombreupp(filas.getString(15));
                    cat.setEstatus(filas.getString(16));
                    cat.setNumerovacas(filas.getString(17));
                    cat.setNumerovaqui(filas.getString(18));
                    cat.setRaza(filas.getString(19));
                    cat.setCruza(filas.getString(20));
                    cat.setOtraraza(filas.getString(21));
                    cat.setTipoordena(filas.getString(22));
                    cat.setSuperficie(filas.getString(23));
                    cat.setObservaciones(filas.getString(24));
                    cat.setLongitud(filas.getString(25));
                    cat.setLatitud(filas.getString(26));
                    cat.setFoto1(filas.getString(27));
                    cat.setFoto2(filas.getString(28));
                    cat.setBandera(filas.getString(29));
                    cat.setBanderaFoto(filas.getString(30));
                    lista.add(cat);
                } while (filas.moveToNext());
                filas.close();
                bd.close();
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public ArrayList<Lecheros_Model> mostrarFotosLecheros() {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            ArrayList<Lecheros_Model> lista = new ArrayList<>();

            Cursor filas = bd.rawQuery("SELECT DISTINCT * FROM " + Lecheros_bd.TABLA_BD + " WHERE " + Lecheros_bd.COLUMN_BANDERA + " = 1 AND " + Lecheros_bd.COLUMN_BANDERAFOTOS + " = 0 ORDER BY " + Lecheros_bd.COLUMN_FOLIO + " LIMIT 5", null);
            if (filas.moveToFirst()) {

                do{
                    Lecheros_Model cat = new Lecheros_Model();
                    cat.setFolio(filas.getString(0));
                    cat.setFoto1(filas.getString(27));
                    cat.setFoto2(filas.getString(28));
                    lista.add(cat);
                } while (filas.moveToNext());
                filas.close();
                bd.close();
                return lista;
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public int  contarFotosLecheros() {
        String countQuery = "SELECT DISTINCT * FROM " + Lecheros_bd.TABLA_BD + " WHERE " + Lecheros_bd.COLUMN_BANDERA + " = 1 AND " + Lecheros_bd.COLUMN_BANDERAFOTOS + " = 0";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }

    public boolean editarLecheros(String Folio, String bandera, String columna){
        boolean correcto = false;
        SQLiteDatabase db = this.getWritableDatabase();

        try{
            db.execSQL("UPDATE " + Lecheros_bd.TABLA_BD + " SET " + columna + " = '" + bandera + "' WHERE " + Lecheros_bd.COLUMN_FOLIO + " = '" + Folio + "'");
            correcto = true;
        } catch (Exception ex){
            ex.toString();
            correcto = false;
        } finally{
            db.close();
        }
        return correcto;
    }


}
