package com.example.geosegalmex.Infra_Sacrificio;

public class Sacrificio_bd {

    public static final String TABLA_BD = "TB_SACRIFICIO";
    public static final String COLUMN_FOLIO = "FOLIO";
    public static final String COLUMN_FECHA = "FECHA";
    public static final String COLUMN_CVEENTIDAD = "CVEENTIDAD";
    public static final String COLUMN_ENTIDAD = "ENTIDAD";
    public static final String COLUMN_CVEDELEGACION= "CVEDELEGACION";
    public static final String COLUMN_DELEGACION = "DELEGACION";
    public static final String COLUMN_CVEDDR = "CVEDDR";
    public static final String COLUMN_DDR = "DDR";
    public static final String COLUMN_CVECADER = "CVECADER";
    public static final String COLUMN_CADER = "CADER";
    public static final String COLUMN_CVEMUNICIPIO = "CVEMUNICIPIO";
    public static final String COLUMN_MUNICIPIO = "MUNICIPIO";
    public static final String COLUMN_CVELOCALIDAD = "CVELOCALIDAD";
    public static final String COLUMN_LOCALIDAD = "LOCALIDAD";
    public static final String COLUMN_TIPORASTRO = "TIPORASTRO";
    public static final String COLUMN_RASTRO = "RASTRO";
    public static final String COLUMN_ESTATUS_RASTRO = "ESTATUS_RASTRO";
    public static final String COLUMN_TURNO = "TURNO";
    public static final String COLUMN_CIMEQUINO = "CIMQEUINO";
    public static final String COLUMN_CIMBOVINO = "CIMBOVINO";
    public static final String COLUMN_CIMPORCINO = "CIMPORCINO";
    public static final String COLUMN_CIMOVINO = "CIMOVINO";
    public static final String COLUMN_CIMCAPRINO = "CIMCAPRINO";
    public static final String COLUMN_CIMAVE = "CIMAVE";
    public static final String COLUMN_CUMEQUINO = "CUMEQUINO";
    public static final String COLUMN_CUMBOVINO = "CUMBOVINO";
    public static final String COLUMN_CUMPORCINO = "CUMPORCINO";
    public static final String COLUMN_CUMOVINO = "CUMOVINO";
    public static final String COLUMN_CUMCAPRINO = "CUMCAPRINO";
    public static final String COLUMN_CUMAVE = "CUMAVE";
    public static final String COLUMN_OBSERVACIONES = "OBSERVACIONES";
    public static final String COLUMN_LONGITUD = "LONGITUD";
    public static final String COLUMN_LATITUD = "LATITUD";
    public static final String COLUMN_FOTO1 = "FOTO1";
    public static final String COLUMN_FOTO2 = "FOTO2";
    public static final String COLUMN_BANDERA = "BANDERA";

    public static final String CREAR_TABLA_SACRIFICO= "CREATE TABLE " + TABLA_BD + "("
            + COLUMN_FOLIO + " VARCHAR PRIMARY KEY, "
            + COLUMN_FECHA + " VARCHAR, "
            + COLUMN_CVEENTIDAD + " VARCHAR, "
            + COLUMN_ENTIDAD + " VARCHAR, "
            + COLUMN_CVEDELEGACION + " VARCHAR, "
            + COLUMN_DELEGACION + " VARCHAR, "
            + COLUMN_CVEDDR + " VARCHAR, "
            + COLUMN_DDR + " VARCHAR, "
            + COLUMN_CVECADER + " VARCHAR, "
            + COLUMN_CADER + " VARCHAR, "
            + COLUMN_CVEMUNICIPIO + " VARCHAR, "
            + COLUMN_MUNICIPIO + " VARCHAR, "
            + COLUMN_CVELOCALIDAD + " VARCHAR, "
            + COLUMN_LOCALIDAD + " VARCHAR, "
            + COLUMN_TIPORASTRO + " VARCHAR, "
            + COLUMN_RASTRO + " VARCHAR, "
            + COLUMN_ESTATUS_RASTRO + " VARCHAR, "
            + COLUMN_TURNO + " VARCHAR, "
            + COLUMN_CIMEQUINO + " VARCHAR, "
            + COLUMN_CIMBOVINO + " VARCHAR, "
            + COLUMN_CIMPORCINO + " VARCHAR, "
            + COLUMN_CIMOVINO + " VARCHAR, "
            + COLUMN_CIMCAPRINO + " VARCHAR, "
            + COLUMN_CIMAVE + " VARCHAR, "
            + COLUMN_CUMEQUINO + " VARCHAR, "
            + COLUMN_CUMBOVINO + " VARCHAR, "
            + COLUMN_CUMPORCINO + " VARCHAR, "
            + COLUMN_CUMOVINO + " VARCHAR, "
            + COLUMN_CUMCAPRINO + " VARCHAR, "
            + COLUMN_CUMAVE + " VARCHAR, "
            + COLUMN_OBSERVACIONES + " VARCHAR, "
            + COLUMN_LONGITUD + " VARCHAR, "
            + COLUMN_LATITUD + " VARCHAR, "
            + COLUMN_FOTO1 + " VARCHAR, "
            + COLUMN_FOTO2 + " VARCHAR, "
            + COLUMN_BANDERA + " VARCHAR); ";
}