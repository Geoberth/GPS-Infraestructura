package com.example.infraestructura.Infra_Lecheros;

public class Lecheros_bd {

    public static final String TABLA_BD = "TB_LECHEROS";
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

    public static final String COLUMN_DOMIUPP = "DOMIUPP";
    public static final String COLUMN_NOMBREUPP = "NOMBREUPP";
    public static final String COLUMN_ESTATUS = "ESTATUS";
    public static final String COLUMN_NUMEROVACAS = "NUMEROVACAS";
    public static final String COLUMN_NUMEROVAQUI = "NUMEROVAQUI";
    public static final String COLUMN_RAZA = "RAZA";
    public static final String COLUMN_CRUZA = "CRUZA";
    public static final String COLUMN_OTRARAZA = "OTRARAZA";
    public static final String COLUMN_TIPOORDENA = "TIPOORDENA";
    public static final String COLUMN_SUPERFICIE = "SUPERFICIE";
    public static final String COLUMN_OBSERVACIONES = "OBSERVACIONES";
    public static final String COLUMN_LONGITUD = "LONGITUD";
    public static final String COLUMN_LATITUD = "LATITUD";
    public static final String COLUMN_FOTO1 = "FOTO1";
    public static final String COLUMN_FOTO2 = "FOTO2";
    public static final String COLUMN_BANDERA = "BANDERA";
    public static final String COLUMN_BANDERAFOTOS = "BANDERAFOTOS";


    public static final String CREAR_TABLA_LECHEROS= "CREATE TABLE " + TABLA_BD + "("
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
            + COLUMN_DOMIUPP + " VARCHAR, "
            + COLUMN_NOMBREUPP + " VARCHAR, "
            + COLUMN_ESTATUS + " VARCHAR, "
            + COLUMN_NUMEROVACAS + " VARCHAR, "
            + COLUMN_NUMEROVAQUI + " VARCHAR, "
            + COLUMN_RAZA + " VARCHAR, "
            + COLUMN_CRUZA + " VARCHAR, "
            + COLUMN_OTRARAZA + " VARCHAR, "
            + COLUMN_TIPOORDENA + " VARCHAR, "
            + COLUMN_SUPERFICIE + " VARCHAR, "
            + COLUMN_OBSERVACIONES + " VARCHAR, "
            + COLUMN_LONGITUD + " VARCHAR, "
            + COLUMN_LATITUD + " VARCHAR, "
            + COLUMN_FOTO1 + " VARCHAR, "
            + COLUMN_FOTO2 + " VARCHAR, "
            + COLUMN_BANDERA + " VARCHAR, "
            + COLUMN_BANDERAFOTOS + " VARCHAR); ";


}
