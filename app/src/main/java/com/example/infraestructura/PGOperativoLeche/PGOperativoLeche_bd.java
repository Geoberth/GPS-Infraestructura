package com.example.infraestructura.PGOperativoLeche;

public class PGOperativoLeche_bd {

    public static final String TABLA_BD = "TB_PG_OPERATIVO_LECHE";
    public static final String COLUMN_FOLIO = "FOLIO";
    public static final String COLUMN_FECHA = "FECHA";
    public static final String COLUMN_CVEVENTANILLA = "CVEVEN";
    public static final String COLUMN_VENTANILLA = "VENTANILLA";
    public static final String COLUMN_CVEESTADO = "CVEEDO";
    public static final String COLUMN_ESTADO = "ENTIDAD";
    public static final String COLUMN_CVEMUNICIPIO = "CVEMUN";
    public static final String COLUMN_MUNICIPIO = "MUNICIPIO";
    public static final String COLUMN_CVELOCALIDAD = "CVELOC";
    public static final String COLUMN_LOCALIDAD = "LOCALIDAD";
    public static final String COLUMN_CALLE = "CALLE";
    public static final String COLUMN_CP = "CP";
    public static final String COLUMN_UNO = "UNO";
    public static final String COLUMN_UNOOBS = "UNOOBS";
    public static final String COLUMN_DOS = "DOS";
    public static final String COLUMN_DOSOBS = "DOSOBS";
    public static final String COLUMN_TRES = "TRES";
    public static final String COLUMN_TRESOBS = "TRESOBS";
    public static final String COLUMN_CUATRO = "CUATRO";
    public static final String COLUMN_CUATROOBS = "CUATROOBS";
    public static final String COLUMN_CINCO = "CINCO";
    public static final String COLUMN_CINCOOBS = "CINCOOBS";
    public static final String COLUMN_SEIS = "SEIS";
    public static final String COLUMN_SEISOBS = "SEISOBS";
    public static final String COLUMN_SIETE = "SIETE";
    public static final String COLUMN_SIETEOBS = "SIETEOBS";
    public static final String COLUMN_OCHO = "OCHO";
    public static final String COLUMN_OCHOOBS = "OCHOOBS";
    public static final String COLUMN_NUEVE = "NUEVE";
    public static final String COLUMN_NUEVEOBS = "NUEVEOBS";
    public static final String COLUMN_DIEZA = "DIEZA";
    public static final String COLUMN_DIEZB = "DIEZB";
    public static final String COLUMN_DIEZC = "DIEZC";
    public static final String COLUMN_DIEZD = "DIEZD";
    public static final String COLUMN_DIEZE = "DIEZE";
    public static final String COLUMN_DIEZF = "DIEZF";
    public static final String COLUMN_ONCE = "ONCE";
    public static final String COLUMN_ONCEOBS = "ONCEOBS";
    public static final String COLUMN_ONCEB = "ONCEB";
    public static final String COLUMN_ONCEBOBS = "ONCEBOBS";
    public static final String COLUMN_DOCE = "DOCE";
    public static final String COLUMN_DOCEOBS = "DOCEOBS";
    public static final String COLUMN_TRECE = "TRECE";
    public static final String COLUMN_FOTO1 = "FOTO1";
    public static final String COLUMN_FOTO2 = "FOTO2";
    public static final String COLUMN_LONGITUD = "LONGITUD";
    public static final String COLUMN_LATITUD = "LATITUD";

    public static final String CREAR_TABLA_PG_OPERATIVO_LECHE= "CREATE TABLE " + TABLA_BD + "("
            + COLUMN_FOLIO + " VARCHAR PRIMARY KEY, "
            + COLUMN_FECHA + " VARCHAR, "
            + COLUMN_CVEVENTANILLA + " VARCHAR, "
            + COLUMN_VENTANILLA + " VARCHAR, "
            + COLUMN_CVEESTADO + " VARCHAR, "
            + COLUMN_ESTADO + " VARCHAR, "
            + COLUMN_CVEMUNICIPIO + " VARCHAR, "
            + COLUMN_MUNICIPIO + " VARCHAR, "
            + COLUMN_CVELOCALIDAD + " VARCHAR, "
            + COLUMN_LOCALIDAD + " VARCHAR, "
            + COLUMN_CALLE + " VARCHAR, "
            + COLUMN_CP + " VARCHAR, "
            + COLUMN_UNO + " VARCHAR, "
            + COLUMN_UNOOBS + " VARCHAR, "
            + COLUMN_DOS + " VARCHAR, "
            + COLUMN_DOSOBS + " VARCHAR, "
            + COLUMN_TRES + " VARCHAR, "
            + COLUMN_TRESOBS + " VARCHAR, "
            + COLUMN_CUATRO + " VARCHAR, "
            + COLUMN_CUATROOBS + " VARCHAR, "
            + COLUMN_CINCO + " VARCHAR, "
            + COLUMN_CINCOOBS + " VARCHAR, "
            + COLUMN_SEIS + " VARCHAR, "
            + COLUMN_SEISOBS + " VARCHAR, "
            + COLUMN_SIETE + " VARCHAR, "
            + COLUMN_SIETEOBS + " VARCHAR, "
            + COLUMN_OCHO + " VARCHAR, "
            + COLUMN_OCHOOBS + " VARCHAR, "
            + COLUMN_NUEVE + " VARCHAR, "
            + COLUMN_NUEVEOBS + " VARCHAR, "
            + COLUMN_DIEZA + " VARCHAR, "
            + COLUMN_DIEZB + " VARCHAR, "
            + COLUMN_DIEZC + " VARCHAR, "
            + COLUMN_DIEZD + " VARCHAR, "
            + COLUMN_DIEZE + " VARCHAR, "
            + COLUMN_DIEZF + " VARCHAR, "
            + COLUMN_ONCE + " VARCHAR, "
            + COLUMN_ONCEOBS + " VARCHAR, "
            + COLUMN_ONCEB + " VARCHAR, "
            + COLUMN_ONCEBOBS + " VARCHAR, "
            + COLUMN_DOCE + " VARCHAR, "
            + COLUMN_DOCEOBS + " VARCHAR, "
            + COLUMN_TRECE + " VARCHAR, "
            + COLUMN_FOTO1 + " VARCHAR, "
            + COLUMN_FOTO2 + " VARCHAR, "
            + COLUMN_LONGITUD + " VARCHAR, "
            + COLUMN_LATITUD + " VARCHAR); " ;
}
