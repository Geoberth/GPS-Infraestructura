package com.example.infraestructura.Infra_Engorda;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import com.example.infraestructura.General;
import com.example.infraestructura.Gps.UtilidadesTrayectoria;

import java.util.ArrayList;

public class EngordaBD extends SQLiteOpenHelper  {

    public static final String DB_NAME  = "CorralesdeEngorda";
    public static final int DB_VERSION = 5;

    public EngordaBD(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Engorda_bd.CREAR_TABLA_ENGORDA);
        db.execSQL(UtilidadesTrayectoria.CREAR_TABLA_TRAYECTORIA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Engorda_bd.TABLA_BD);
        db.execSQL("DROP TABLE IF EXISTS "+ UtilidadesTrayectoria.TABLA_TRAYECTORIA);
        onCreate(db);
    }

    public boolean addEngorda(Engorda_Model model){

        SQLiteDatabase db           = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Engorda_bd.COLUMN_FOLIO, model.getFolio());
        contentValues.put(Engorda_bd.COLUMN_FECHA, model.getFecha());
        contentValues.put(Engorda_bd.COLUMN_CVEENTIDAD, model.getCveEntidad());
        contentValues.put(Engorda_bd.COLUMN_ENTIDAD, model.getEntidad());
        contentValues.put(Engorda_bd.COLUMN_CVEREPRESENTACION, model.getCveRepresentacion());
        contentValues.put(Engorda_bd.COLUMN_REPRESENTACION, model.getRepresentacion());
        contentValues.put(Engorda_bd.COLUMN_CVEDDR, model.getCveDdr());
        contentValues.put(Engorda_bd.COLUMN_DDR, model.getDdr());
        contentValues.put(Engorda_bd.COLUMN_CVECADER, model.getCveCader());
        contentValues.put(Engorda_bd.COLUMN_CADER, model.getCader());
        contentValues.put(Engorda_bd.COLUMN_CVEMUNICIPIO, model.getCveMunicipio());
        contentValues.put(Engorda_bd.COLUMN_MUNICIPIO, model.getMunicipio());
        contentValues.put(Engorda_bd.COLUMN_CVELOCALIDAD, model.getCveLocalidad());
        contentValues.put(Engorda_bd.COLUMN_LOC, model.getLoc());
        contentValues.put(Engorda_bd.COLUMN_DOMUPP, model.getDomUpp());
        contentValues.put(Engorda_bd.COLUMN_NOMUPP, model.getNomUpp());
        contentValues.put(Engorda_bd.COLUMN_ESTATUS, model.getEstatus());
        contentValues.put(Engorda_bd.COLUMN_SISTEMA, model.getSistema());
        contentValues.put(Engorda_bd.COLUMN_ACTIVIDAD, model.getActividad());
        contentValues.put(Engorda_bd.COLUMN_RAZA, model.getRaza());
        contentValues.put(Engorda_bd.COLUMN_RAZACRUZA, model.getRazaCruza());
        contentValues.put(Engorda_bd.COLUMN_RAZAOTRA, model.getRazaOtra());
        contentValues.put(Engorda_bd.COLUMN_CAPINST, model.getCapInst());
        contentValues.put(Engorda_bd.COLUMN_CAPUTIL, model.getCapUtil());
        contentValues.put(Engorda_bd.COLUMN_TOTALANIM, model.getTotalAnim());
        contentValues.put(Engorda_bd.COLUMN_ENGORDA, model.getEngorda());
        contentValues.put(Engorda_bd.COLUMN_SUPERF, model.getSuperf());
        contentValues.put(Engorda_bd.COLUMN_OBSERV, model.getObserv());
        contentValues.put(Engorda_bd.COLUMN_LONGITUD, model.getLongitud());
        contentValues.put(Engorda_bd.COLUMN_LATITUD, model.getLatitud());
        contentValues.put(Engorda_bd.COLUMN_F1, model.getF1());
        contentValues.put(Engorda_bd.COLUMN_F2, model.getF2());
        contentValues.put(Engorda_bd.COLUMN_BANDERA, model.getBandera());
        contentValues.put(Engorda_bd.COLUMN_BANDERAFOTOS, model.getBanderaFoto());

        long result = db.insert(Engorda_bd.TABLA_BD, null, contentValues);
        db.close();

        if(result == -1) {
            return false;
        }else{
            return true;
        }

    }

    public void deleteEngorda(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS "+ Engorda_bd.TABLA_BD);
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

    public ArrayList<Engorda_Model> mostrarEngorda() {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            ArrayList<Engorda_Model> lista = new ArrayList<>();

            Cursor filas = bd.rawQuery("SELECT DISTINCT * FROM " + Engorda_bd.TABLA_BD + " WHERE " + Engorda_bd.COLUMN_BANDERA + " = 0 ORDER BY " + Engorda_bd.COLUMN_FOLIO + " ASC", null);
            if (filas.moveToFirst()) {

                do{
                    Engorda_Model cat = new Engorda_Model();
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
                    cat.setDomUpp(filas.getString(14));
                    cat.setNomUpp(filas.getString(15));
                    cat.setEstatus(filas.getString(16));
                    cat.setSistema(filas.getString(17));
                    cat.setActividad(filas.getString(18));
                    cat.setRaza(filas.getString(19));
                    cat.setRazaCruza(filas.getString(20));
                    cat.setRazaOtra(filas.getString(21));
                    cat.setCapInst(filas.getString(22));
                    cat.setCapUtil(filas.getString(23));
                    cat.setTotalAnim(filas.getString(24));
                    cat.setEngorda(filas.getString(25));
                    cat.setSuperf(filas.getString(26));
                    cat.setObserv(filas.getString(27));
                    cat.setLongitud(filas.getString(28));
                    cat.setLatitud(filas.getString(29));
                    cat.setF1(filas.getString(30));
                    cat.setF2(filas.getString(31));
                    cat.setBandera(filas.getString(32));
                    cat.setBanderaFoto(filas.getString(33));
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

    public ArrayList<Engorda_Model> mostrarFotosEngorda() {
        try {
            SQLiteDatabase bd = this.getReadableDatabase();
            ArrayList<Engorda_Model> lista = new ArrayList<>();

            Cursor filas = bd.rawQuery("SELECT DISTINCT * FROM " + Engorda_bd.TABLA_BD + " WHERE " + Engorda_bd.COLUMN_BANDERA + " = 1 AND " + Engorda_bd.COLUMN_BANDERAFOTOS + " = 0 ORDER BY " + Engorda_bd.COLUMN_FOLIO + " LIMIT 5", null);
            if (filas.moveToFirst()) {

                do{
                    Engorda_Model cat = new Engorda_Model();
                    cat.setFolio(filas.getString(0));
                    cat.setF1(filas.getString(30));
                    cat.setF2(filas.getString(31));
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

    public int  contarFotosEngorda() {
        String countQuery = "SELECT DISTINCT * FROM " + Engorda_bd.TABLA_BD + " WHERE " + Engorda_bd.COLUMN_BANDERA + " = 1 AND " + Engorda_bd.COLUMN_BANDERAFOTOS + " = 0";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }

    public boolean editarEngorda(String Folio, String bandera, String columna){
        boolean correcto = false;
        SQLiteDatabase db = this.getWritableDatabase();

        try{
            db.execSQL("UPDATE " + Engorda_bd.TABLA_BD + " SET " + columna + " = '" + bandera + "' WHERE " + Engorda_bd.COLUMN_FOLIO + " = '" + Folio + "'");
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
