package com.example.infraestructura.Infra_Granos;

public class Granos_bd {

    public static final String TABLA_BD = "TB_GRANOS";
    public static final String COLUMN_FOLIO = "FOLIO";
    public static final String COLUMN_FECHA = "FECHA";
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
    public static final String COLUMN_DOM = "DOM";
    public static final String COLUMN_CP = "CP";
    public static final String COLUMN_ALMACEN = "ALMACEN";
    public static final String COLUMN_CAPINST = "CAPINST";
    public static final String COLUMN_PRINCIPAL = "PRINCIPAL";
    public static final String COLUMN_SECUNDARIO = "SECUNDARIO";
    public static final String COLUMN_VOLUMEN = "VOLUMEN";
    public static final String COLUMN_SUPERF = "SUPERF";
    public static final String COLUMN_ESTADO = "ESTADO";
    public static final String COLUMN_LONGITUD = "LONGITUD";
    public static final String COLUMN_LATITUD = "LATITUD";
    public static final String COLUMN_F1 = "FOTO1";
    public static final String COLUMN_F2 = "FOTO2";
    public static final String COLUMN_BANDERA = "BANDERA";
    public static final String COLUMN_BANDERAFOTOS = "BANDERAFOTOS";

    public static final String CREAR_TABLA_GRANOS= "CREATE TABLE " + TABLA_BD + "("
            + COLUMN_FOLIO + " VARCHAR PRIMARY KEY, "
            + COLUMN_FECHA + " VARCHAR, "
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
            + COLUMN_DOM + " VARCHAR, "
            + COLUMN_CP + " VARCHAR, "
            + COLUMN_ALMACEN + " VARCHAR, "
            + COLUMN_CAPINST + " VARCHAR, "
            + COLUMN_PRINCIPAL + " VARCHAR, "
            + COLUMN_SECUNDARIO + " VARCHAR, "
            + COLUMN_VOLUMEN + " VARCHAR, "
            + COLUMN_SUPERF + " VARCHAR, "
            + COLUMN_ESTADO + " VARCHAR, "
            + COLUMN_LONGITUD + " VARCHAR, "
            + COLUMN_LATITUD + " VARCHAR, "
            + COLUMN_F1 + " VARCHAR, "
            + COLUMN_F2 + " VARCHAR, "
            + COLUMN_BANDERA + " VARCHAR, "
            + COLUMN_BANDERAFOTOS + " VARCHAR); ";

}
