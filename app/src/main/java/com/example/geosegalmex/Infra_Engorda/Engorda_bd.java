package com.example.geosegalmex.Infra_Engorda;

public class Engorda_bd {

    public static final String TABLA_BD = "TB_ENGORDA";
    public static final String COLUMN_FOLIO = "FOLIO";
    public static final String COLUMN_CVEENTIDAD = "CVEENTIDAD";
    public static final String COLUMN_ENTIDAD = "ENTIDAD";
    public static final String COLUMN_CVEREPRESENTACION = "CVEREPRESENTACION";
    public static final String COLUMN_REPRESENTACION = "REPRESENTACION";
    public static final String COLUMN_CVEDDR = "CVEDDR";
    public static final String COLUMN_DDR = "DDR";
    public static final String COLUMN_CVECADER = "CVECADER";
    public static final String COLUMN_CADER = "CADER";
    public static final String COLUMN_CVEMUNICIPIO = "CVEMUNICIPIO";
    public static final String COLUMN_MUNICIPIO = "MUNICIPIO";
    public static final String COLUMN_CVELOCALIDAD = "CVELOCALIDAD";
    public static final String COLUMN_LOC = "LOC";
    public static final String COLUMN_DOMUPP = "DOMUPP";
    public static final String COLUMN_NOMUPP = "NOMUPP";
    public static final String COLUMN_ESTATUS = "ESTATUS";
    public static final String COLUMN_SISTEMA = "SISTEMA";
    public static final String COLUMN_ACTIVIDAD = "ACTIVIDAD";
    public static final String COLUMN_RAZA = "RAZA";
    public static final String COLUMN_RAZACRUZA = "RAZACRUZA";
    public static final String COLUMN_RAZAOTRA = "RAZAOTRA";
    public static final String COLUMN_CAPINST = "CAPINST";
    public static final String COLUMN_CAPUTIL = "CAPUTIL";
    public static final String COLUMN_TOTALANIM = "TOTALANIM";
    public static final String COLUMN_ENGORDA = "ENGORDA";
    public static final String COLUMN_SUPERF = "SUPERF";
    public static final String COLUMN_OBSERV = "OBSERV";
    public static final String COLUMN_LONGITUD = "LONGITUD";
    public static final String COLUMN_LATITUD = "LATITUD";
    public static final String COLUMN_F1 = "FOTO1";
    public static final String COLUMN_F2 = "FOTO2";

    public static final String CREAR_TABLA_ENGORDA= "CREATE TABLE " + TABLA_BD + "("
        + COLUMN_FOLIO + " VARCHAR PRIMARY KEY, "
        + COLUMN_CVEENTIDAD + " VARCHAR, "
        + COLUMN_ENTIDAD + " VARCHAR, "
        + COLUMN_CVEREPRESENTACION + " VARCHAR, "
        + COLUMN_REPRESENTACION + " VARCHAR, "
        + COLUMN_CVEDDR + " VARCHAR, "
        + COLUMN_DDR + " VARCHAR, "
        + COLUMN_CVECADER + " VARCHAR, "
        + COLUMN_CADER + " VARCHAR, "
        + COLUMN_CVEMUNICIPIO + " VARCHAR, "
        + COLUMN_MUNICIPIO + " VARCHAR, "
        + COLUMN_CVELOCALIDAD + " VARCHAR, "
        + COLUMN_LOC + " VARCHAR, "
        + COLUMN_DOMUPP + " VARCHAR, "
        + COLUMN_NOMUPP + " VARCHAR, "
        + COLUMN_ESTATUS + " VARCHAR, "
        + COLUMN_SISTEMA + " VARCHAR, "
        + COLUMN_ACTIVIDAD + " VARCHAR, "
        + COLUMN_RAZA + " VARCHAR, "
        + COLUMN_RAZACRUZA + " VARCHAR, "
        + COLUMN_RAZAOTRA + " VARCHAR, "
        + COLUMN_CAPINST + " VARCHAR, "
        + COLUMN_CAPUTIL + " VARCHAR, "
        + COLUMN_TOTALANIM + " VARCHAR, "
        + COLUMN_ENGORDA + " VARCHAR, "
        + COLUMN_SUPERF + " VARCHAR, "
        + COLUMN_OBSERV + " VARCHAR, "
        + COLUMN_LONGITUD + " VARCHAR, "
        + COLUMN_LATITUD + " VARCHAR, "
        + COLUMN_F1 + " VARCHAR, "
        + COLUMN_F2 + " VARCHAR); ";

}
