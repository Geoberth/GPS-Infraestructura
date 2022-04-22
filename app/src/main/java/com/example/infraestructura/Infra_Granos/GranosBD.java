package com.example.infraestructura.Infra_Granos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import com.example.infraestructura.General;
import com.example.infraestructura.Gps.UtilidadesTrayectoria;

import java.util.ArrayList;

public class GranosBD extends SQLiteOpenHelper {

    public static final String DB_NAME  = "AlmacenesdeGranos";
    public static final int DB_VERSION = 1;

    public GranosBD(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Granos_bd.CREAR_TABLA_GRANOS);
        db.execSQL(UtilidadesTrayectoria.CREAR_TABLA_TRAYECTORIA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Granos_bd.TABLA_BD);
        db.execSQL("DROP TABLE IF EXISTS "+ UtilidadesTrayectoria.TABLA_TRAYECTORIA);
        onCreate(db);
    }

    public boolean addGranos(Granos_Model model){

        SQLiteDatabase db           = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Granos_bd.COLUMN_FOLIO, model.getFolio());
        contentValues.put(Granos_bd.COLUMN_FECHA, model.getFecha());
        contentValues.put(Granos_bd.COLUMN_CVEENTIDAD, model.getCveEntidad());
        contentValues.put(Granos_bd.COLUMN_ENTIDAD, model.getEntidad());
        contentValues.put(Granos_bd.COLUMN_CVEREPRESENTACION, model.getCveRepresentacion());
        contentValues.put(Granos_bd.COLUMN_REPRESENTACION, model.getRepresentacion());
        contentValues.put(Granos_bd.COLUMN_CVEDDR, model.getCveDdr());
        contentValues.put(Granos_bd.COLUMN_DDR, model.getDdr());
        contentValues.put(Granos_bd.COLUMN_CVECADER, model.getCveCader());
        contentValues.put(Granos_bd.COLUMN_CADER, model.getCader());
        contentValues.put(Granos_bd.COLUMN_CVEMUNICIPIO, model.getCveMunicipio());
        contentValues.put(Granos_bd.COLUMN_MUNICIPIO, model.getMunicipio());
        contentValues.put(Granos_bd.COLUMN_CVELOCALIDAD, model.getCveLocalidad());
        contentValues.put(Granos_bd.COLUMN_LOC, model.getLoc());
        contentValues.put(Granos_bd.COLUMN_DOM, model.getDom());
        contentValues.put(Granos_bd.COLUMN_CP, model.getCp());
        contentValues.put(Granos_bd.COLUMN_ALMACEN, model.getAlmacen());
        contentValues.put(Granos_bd.COLUMN_CAPINST, model.getCapInst());
        contentValues.put(Granos_bd.COLUMN_PRINCIPAL, model.getPrincipal());
        contentValues.put(Granos_bd.COLUMN_SECUNDARIO, model.getSecundario());
        contentValues.put(Granos_bd.COLUMN_VOLUMEN, model.getVolumen());
        contentValues.put(Granos_bd.COLUMN_SUPERF, model.getSuperf());
        contentValues.put(Granos_bd.COLUMN_ESTADO, model.getEstado());
        contentValues.put(Granos_bd.COLUMN_LONGITUD, model.getLongitud());
        contentValues.put(Granos_bd.COLUMN_LATITUD, model.getLatitud());
        contentValues.put(Granos_bd.COLUMN_F1, model.getF1());
        contentValues.put(Granos_bd.COLUMN_F2, model.getF2());
        contentValues.put(Granos_bd.COLUMN_BANDERA, model.getBandera());
        contentValues.put(Granos_bd.COLUMN_BANDERAFOTOS, model.getBanderaFoto());

        long result = db.insert(Granos_bd.TABLA_BD, null, contentValues);
        db.close();

        if(result == -1) {
            return false;
        }else{
            return true;
        }

    }

    public void deleteGranos(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS "+ Granos_bd.TABLA_BD);
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

    public ArrayList<Granos_Model> mostrarGranos() {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            ArrayList<Granos_Model> lista = new ArrayList<>();

            Cursor filas = bd.rawQuery("SELECT DISTINCT * FROM " + Granos_bd.TABLA_BD + " WHERE " + Granos_bd.COLUMN_BANDERA + " = 0 ORDER BY " + Granos_bd.COLUMN_FOLIO + " ASC", null);
            if (filas.moveToFirst()) {

                do{
                    Granos_Model cat = new Granos_Model();
                    cat.setFolio(filas.getString(0));
                    cat.setFecha(filas.getString(1));
                    cat.setCveEntidad(filas.getString(2));
                    cat.setEntidad(filas.getString(3));
                    cat.setCveRepresentacion(filas.getString(4));
                    cat.setRepresentacion(filas.getString(5));
                    cat.setCveDdr(filas.getString(6));
                    cat.setDdr(filas.getString(7));
                    cat.setCveCader(filas.getString(8));
                    cat.setCader(filas.getString(9));
                    cat.setCveMunicipio(filas.getString(10));
                    cat.setMunicipio(filas.getString(11));
                    cat.setCveLocalidad(filas.getString(12));
                    cat.setLoc(filas.getString(13));
                    cat.setDom(filas.getString(14));
                    cat.setCp(filas.getString(15));
                    cat.setAlmacen(filas.getString(16));
                    cat.setCapInst(filas.getString(17));
                    cat.setPrincipal(filas.getString(18));
                    cat.setSecundario(filas.getString(19));
                    cat.setVolumen(filas.getString(20));
                    cat.setSuperf(filas.getString(21));
                    cat.setEstado(filas.getString(22));
                    cat.setLongitud(filas.getString(23));
                    cat.setLatitud(filas.getString(24));
                    cat.setF1(filas.getString(25));
                    cat.setF2(filas.getString(26));
                    cat.setBandera(filas.getString(27));
                    cat.setBanderaFoto(filas.getString(28));
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

    public ArrayList<Granos_Model> mostrarFotosGranos() {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            ArrayList<Granos_Model> lista = new ArrayList<>();

            Cursor filas = bd.rawQuery("SELECT DISTINCT * FROM " + Granos_bd.TABLA_BD + " WHERE " + Granos_bd.COLUMN_BANDERA + " = 1 AND " + Granos_bd.COLUMN_BANDERAFOTOS + " = 0 ORDER BY " + Granos_bd.COLUMN_FOLIO + " LIMIT 5", null);
            if (filas.moveToFirst()) {

                do{
                    Granos_Model cat = new Granos_Model();
                    cat.setFolio(filas.getString(0));
                    cat.setF1(filas.getString(25));
                    cat.setF2(filas.getString(26));
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

    public int  contarFotosGranos() {
        String countQuery = "SELECT DISTINCT * FROM " + Granos_bd.TABLA_BD + " WHERE " + Granos_bd.COLUMN_BANDERA + " = 1 AND " + Granos_bd.COLUMN_BANDERAFOTOS + " = 0";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }

    public boolean editarGranos(String Folio, String bandera, String columna){
        boolean correcto = false;
        SQLiteDatabase db = this.getWritableDatabase();

        try{
            db.execSQL("UPDATE " + Granos_bd.TABLA_BD + " SET " + columna + " = '" + bandera + "' WHERE " + Granos_bd.COLUMN_FOLIO + " = '" + Folio + "'");
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
