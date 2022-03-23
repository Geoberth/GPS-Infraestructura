package com.example.geosegalmex.Catalogos.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static final String BASE_NOMBRE = "db_catalogos.db";
    private static final int BASE_VERSION = 4;
    protected static final String TABLE_ESTADOS = "t_estados";
    protected static final String TABLE_AGUASCALIENTES = "t_aguascalientes";
    protected static final String TABLE_BC = "t_bc";
    protected static final String TABLE_BCS = "t_bcs";
    protected static final String TABLE_CAMPECHE = "t_campeche";
    protected static final String TABLE_CHIAPAS = "t_chiapas";
    protected static final String TABLE_CHIHUAHUA = "t_chihuahua";
    protected static final String TABLE_CDMX = "t_cdmx";
    protected static final String TABLE_COAHUILA = "t_coahuila";
    protected static final String TABLE_COLIMA = "t_colima";
    protected static final String TABLE_DURANGO = "t_durango";
    protected static final String TABLE_GUANAJUATO = "t_guanajuato";
    protected static final String TABLE_GUERRERO = "t_guerrero";
    protected static final String TABLE_HIDALGO = "t_hidalgo";
    protected static final String TABLE_JALISCO = "t_jalisco";
    protected static final String TABLE_MEXICO = "t_mexico";
    protected static final String TABLE_MICHOACAN = "t_michoacan";
    protected static final String TABLE_MORELOS = "t_morelos";
    protected static final String TABLE_NAYARIT = "t_nayarit";
    protected static final String TABLE_NL = "t_nl";
    protected static final String TABLE_OAXACA = "t_oaxaca";
    protected static final String TABLE_PUEBLA = "t_puebla";
    protected static final String TABLE_QUERETARO = "t_queretaro";
    protected static final String TABLE_QUINTANAROO = "t_quintanaroo";
    protected static final String TABLE_SANLUIS = "t_sanluis";
    protected static final String TABLE_SINALOA = "t_sinaloa";
    protected static final String TABLE_SONORA = "t_sonora";
    protected static final String TABLE_TABASCO = "t_tabasco";
    protected static final String TABLE_TAMAULIPAS = "t_tamaulipas";
    protected static final String TABLE_TLAXCALA = "t_tlaxcala";
    protected static final String TABLE_VERACRUZ= "t_veracruz";
    protected static final String TABLE_YUCATAN = "t_yucatan";
    protected static final String TABLE_ZACATECAS = "t_zacatecas";


    public DbHelper(@Nullable Context context) {
        super(context, BASE_NOMBRE, null, BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_ESTADOS + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Idestado TEXT NOT NULL," +
                "Nomestado TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_ESTADOS + " (id, Idestado, Nomestado) VALUES" +
                "(1,'1','Aguascalientes')," +
                "(2,'2','Baja California')," +
                "(3,'3','Baja California Sur')," +
                "(4,'4','Campeche')," +
                "(5,'5','Coahuila')," +
                "(6,'6','Colima')," +
                "(7,'7','Chiapas')," +
                "(8,'8','Chihuahua')," +
                "(9,'9','Ciudad de México')," +
                "(10,'10','Durango')," +
                "(11,'11','Guanajuato')," +
                "(12,'12','Guerrero')," +
                "(13,'13','Hidalgo')," +
                "(14,'14','Jalisco')," +
                "(15,'15','México')," +
                "(16,'16','Michoacán')," +
                "(17,'17','Morelos')," +
                "(18,'18','Nayarit')," +
                "(19,'19','Nuevo León')," +
                "(20,'20','Oaxaca')," +
                "(21,'21','Puebla')," +
                "(22,'22','Querétaro')," +
                "(23,'23','Quintana Roo')," +
                "(24,'24','San Luis Potosí')," +
                "(25,'25','Sinaloa')," +
                "(26,'26','Sonora')," +
                "(27,'27','Tabasco')," +
                "(28,'28','Tamaulipas')," +
                "(29,'29','Tlaxcala')," +
                "(30,'30','Veracruz')," +
                "(31,'31','Yucatán')," +
                "(32,'32','Zacatecas')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_AGUASCALIENTES + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_AGUASCALIENTES + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'1','Aguascalientes','1','Aguascalientes','1','Aguascalientes','1','Aguascalientes')," +
                "(2,'1','Aguascalientes','1','Aguascalientes','1','Aguascalientes','2','Asientos')," +
                "(3,'1','Aguascalientes','1','Aguascalientes','1','Aguascalientes','5','Jesús María')," +
                "(4,'1','Aguascalientes','1','Aguascalientes','1','Aguascalientes','10','El Llano')," +
                "(5,'1','Aguascalientes','1','Aguascalientes','1','Aguascalientes','11','San Francisco de Los Romo')," +
                "(6,'1','Aguascalientes','1','Aguascalientes','2','Calvillo','3','Calvillo')," +
                "(7,'1','Aguascalientes','1','Aguascalientes','3','Pabellón','4','Cosío')," +
                "(8,'1','Aguascalientes','1','Aguascalientes','3','Pabellón','6','Pabellón de Arteaga')," +
                "(9,'1','Aguascalientes','1','Aguascalientes','3','Pabellón','7','Rincón de Romos')," +
                "(10,'1','Aguascalientes','1','Aguascalientes','3','Pabellón','8','San José de Gracia')," +
                "(11,'1','Aguascalientes','1','Aguascalientes','3','Pabellón','9','Tepezalá')," +
                "(12,'1','Aguascalientes','1','Aguascalientes','4','Villa Juárez','2','Asientos')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_BC + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_BC + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'2','Baja California','2','Ensenada','1','Tijuana','4','Tijuana')," +
                "(2,'2','Baja California','2','Ensenada','1','Tijuana','5','Playas de Rosarito')," +
                "(3,'2','Baja California','2','Ensenada','2','Tecate','3','Tecate')," +
                "(4,'2','Baja California','2','Ensenada','3','Ensenada','1','Ensenada')," +
                "(5,'2','Baja California','2','Ensenada','4','San Quintín','1','Ensenada')," +
                "(6,'2','Baja California','2','Ensenada','4','San Quintín','6','San Quintín')," +
                "(7,'2','Baja California','3','Río Colorado','1','Hechicera','2','Mexicali')," +
                "(8,'2','Baja California','3','Río Colorado','2','Benito Juárez','2','Mexicali')," +
                "(9,'2','Baja California','3','Río Colorado','4','Cerro Prieto','2','Mexicali')," +
                "(10,'2','Baja California','3','Río Colorado','5','G. Victoria','2','Mexicali')," +
                "(11,'2','Baja California','3','Río Colorado','6','Colonias Nuevas','2','Mexicali')," +
                "(12,'2','Baja California','3','Río Colorado','7','Delta','2','Mexicali')," +
                "(13,'2','Baja California','3','Río Colorado','8','Valle Chico','2','Mexicali')," +
                "(14,'2','Baja California','3','Río Colorado','8','Valle Chico','7','San Felipe')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_BCS + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_BCS + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'3','Baja California Sur','4','Mulegé','1','Mulegé','2','Mulegé')," +
                "(2,'3','Baja California Sur','4','Mulegé','2','Vizcaíno','2','Mulegé')," +
                "(3,'3','Baja California Sur','5','Comondú','1','Comondú','1','Comondú')," +
                "(4,'3','Baja California Sur','5','Comondú','1','Comondú','9','Loreto')," +
                "(5,'3','Baja California Sur','6','La Paz','1','La Paz','3','La Paz')," +
                "(6,'3','Baja California Sur','7','Los Cabos','1','Santiago','8','Los Cabos')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_CAMPECHE + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_CAMPECHE + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'4','Campeche','8','Hecelchakán','1','Calkiní','1','Calkiní')," +
                "(2,'4','Campeche','8','Hecelchakán','1','Calkiní','13','Dzitbalché')," +
                "(3,'4','Campeche','8','Hecelchakán','2','Tenabo','8','Tenabo')," +
                "(4,'4','Campeche','8','Hecelchakán','3','Hecelchakán','5','Hecelchakán')," +
                "(5,'4','Campeche','9','Campeche','1','Castamay','2','Campeche')," +
                "(6,'4','Campeche','9','Campeche','2','Hopelchén','6','Hopelchén')," +
                "(7,'4','Campeche','9','Campeche','3','Dzibalchen','6','Hopelchén')," +
                "(8,'4','Campeche','9','Campeche','3','Dzibalchen','10','Calakmul')," +
                "(9,'4','Campeche','10','Champotón','1','Ciudad del Sol/Champotón','4','Champotón')," +
                "(10,'4','Campeche','10','Champotón','1','Ciudad del Sol/Champotón','12','Seybaplaya')," +
                "(11,'4','Campeche','10','Champotón','2','Yohaltúm','4','Champotón')," +
                "(12,'4','Campeche','10','Champotón','2','Yohaltúm','9','Escárcega')," +
                "(13,'4','Campeche','10','Champotón','2','Yohaltúm','10','Calakmul')," +
                "(14,'4','Campeche','11','Escárcega','1','Escárcega/Candelaria','3','Carmen')," +
                "(15,'4','Campeche','11','Escárcega','1','Escárcega/Candelaria','9','Escárcega')," +
                "(16,'4','Campeche','11','Escárcega','1','Escárcega/Candelaria','11','Candelaria')," +
                "(17,'4','Campeche','11','Escárcega','2','Sta. Adelaida','3','Carmen')," +
                "(18,'4','Campeche','11','Escárcega','2','Sta. Adelaida','7','Palizada')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_CHIAPAS + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_CHIAPAS + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','2','Acala')," +
                "(2,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','12','Berriozábal')," +
                "(3,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','27','Chiapa de Corzo')," +
                "(4,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','28','Chiapilla')," +
                "(5,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','29','Chicoasén')," +
                "(6,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','44','Ixtapa')," +
                "(7,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','61','Ocozocoautla de Espinosa')," +
                "(8,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','63','Osumacinta')," +
                "(9,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','79','San Fernando')," +
                "(10,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','85','Soyaló')," +
                "(11,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','86','Suchiapa')," +
                "(12,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','98','Totolapa')," +
                "(13,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','101','Tuxtla Gutiérrez')," +
                "(14,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','110','San Lucas')," +
                "(15,'7','Chiapas','18','Tuxtla Gutiérrez','1','Tuxtla Gutiérrez','123','Emiliano Zapata')," +
                "(16,'7','Chiapas','18','Tuxtla Gutiérrez','2','Tecpatán','18','Coapilla')," +
                "(17,'7','Chiapas','18','Tuxtla Gutiérrez','2','Tecpatán','21','Copainalá')," +
                "(18,'7','Chiapas','18','Tuxtla Gutiérrez','2','Tecpatán','60','Ocotepec')," +
                "(19,'7','Chiapas','18','Tuxtla Gutiérrez','2','Tecpatán','92','Tecpatán')," +
                "(20,'7','Chiapas','18','Tuxtla Gutiérrez','2','Tecpatán','124','Mezcalapa')," +
                "(21,'7','Chiapas','18','Tuxtla Gutiérrez','3','Cintalapa','17','Cintalapa')," +
                "(22,'7','Chiapas','18','Tuxtla Gutiérrez','3','Cintalapa','46','Jiquipilas')," +
                "(23,'7','Chiapas','18','Tuxtla Gutiérrez','4','Venustiano Carranza','58','Nicolás Ruíz')," +
                "(24,'7','Chiapas','18','Tuxtla Gutiérrez','4','Venustiano Carranza','106','Venustiano Carranza')," +
                "(25,'7','Chiapas','19','San Cristóbal de las Casas','1','San Cristóbal de Las Casas','7','Amatenango del Valle')," +
                "(26,'7','Chiapas','19','San Cristóbal de las Casas','1','San Cristóbal de Las Casas','23','Chamula')," +
                "(27,'7','Chiapas','19','San Cristóbal de las Casas','1','San Cristóbal de Las Casas','49','Larráinzar')," +
                "(28,'7','Chiapas','19','San Cristóbal de las Casas','1','San Cristóbal de Las Casas','75','Las Rosas')," +
                "(29,'7','Chiapas','19','San Cristóbal de las Casas','1','San Cristóbal de Las Casas','78','San Cristóbal de Las Casas')," +
                "(30,'7','Chiapas','19','San Cristóbal de las Casas','1','San Cristóbal de Las Casas','93','Tenejapa')," +
                "(31,'7','Chiapas','19','San Cristóbal de las Casas','1','San Cristóbal de Las Casas','94','Teopisca')," +
                "(32,'7','Chiapas','19','San Cristóbal de las Casas','1','San Cristóbal de Las Casas','111','Zinacantán')," +
                "(33,'7','Chiapas','19','San Cristóbal de las Casas','1','San Cristóbal de Las Casas','119','Santiago El Pinar')," +
                "(34,'7','Chiapas','19','San Cristóbal de las Casas','2','Altamirano/Oxchuc','4','Altamirano')," +
                "(35,'7','Chiapas','19','San Cristóbal de las Casas','2','Altamirano/Oxchuc','24','Chanal')," +
                "(36,'7','Chiapas','19','San Cristóbal de las Casas','2','Altamirano/Oxchuc','38','Huixtán')," +
                "(37,'7','Chiapas','19','San Cristóbal de las Casas','2','Altamirano/Oxchuc','64','Oxchuc')," +
                "(38,'7','Chiapas','19','San Cristóbal de las Casas','2','Altamirano/Oxchuc','112','San Juan Cancuc')," +
                "(39,'7','Chiapas','19','San Cristóbal de las Casas','3','Chenalhó','22','Chalchihuitán')," +
                "(40,'7','Chiapas','19','San Cristóbal de las Casas','3','Chenalhó','26','Chenalhó')," +
                "(41,'7','Chiapas','19','San Cristóbal de las Casas','3','Chenalhó','56','Mitontic')," +
                "(42,'7','Chiapas','19','San Cristóbal de las Casas','3','Chenalhó','66','Pantelhó')," +
                "(43,'7','Chiapas','19','San Cristóbal de las Casas','3','Chenalhó','113','Aldama')," +
                "(44,'7','Chiapas','20','Comitán','1','Trinitaria','19','Comitán de Domínguez')," +
                "(45,'7','Chiapas','20','Comitán','1','Trinitaria','83','Socoltenango')," +
                "(46,'7','Chiapas','20','Comitán','1','Trinitaria','99','La Trinitaria')," +
                "(47,'7','Chiapas','20','Comitán','1','Trinitaria','104','Tzimol')," +
                "(48,'7','Chiapas','20','Comitán','2','San Gregorio','19','Comitán de Domínguez')," +
                "(49,'7','Chiapas','20','Comitán','2','San Gregorio','30','Chicomuselo')," +
                "(50,'7','Chiapas','20','Comitán','2','San Gregorio','34','Frontera Comalapa')," +
                "(51,'7','Chiapas','20','Comitán','3','Margaritas','41','La Independencia')," +
                "(52,'7','Chiapas','20','Comitán','3','Margaritas','52','Las Margaritas')," +
                "(53,'7','Chiapas','20','Comitán','3','Margaritas','115','Maravilla Tenejapa')," +
                "(54,'7','Chiapas','21','Villa Flores','1','Villaflores','23','Chamula')," +
                "(55,'7','Chiapas','21','Villa Flores','1','Villaflores','108','Villaflores')," +
                "(56,'7','Chiapas','21','Villa Flores','2','Villa Corzo','107','Villa Corzo')," +
                "(57,'7','Chiapas','21','Villa Flores','2','Villa Corzo','122','El Parral')," +
                "(58,'7','Chiapas','21','Villa Flores','3','Independencia','8','Angel Albino Corzo')," +
                "(59,'7','Chiapas','21','Villa Flores','3','Independencia','20','La Concordia')," +
                "(60,'7','Chiapas','21','Villa Flores','3','Independencia','117','Montecristo de Guerrero')," +
                "(61,'7','Chiapas','22','Pichucalco','1','Pichucalco','5','Amatán')," +
                "(62,'7','Chiapas','22','Pichucalco','1','Pichucalco','25','Chapultenango')," +
                "(63,'7','Chiapas','22','Pichucalco','1','Pichucalco','43','Ixtacomitán')," +
                "(64,'7','Chiapas','22','Pichucalco','1','Pichucalco','45','Ixtapangajoya')," +
                "(65,'7','Chiapas','22','Pichucalco','1','Pichucalco','68','Pichucalco')," +
                "(66,'7','Chiapas','22','Pichucalco','1','Pichucalco','84','Solosuchiapa')," +
                "(67,'7','Chiapas','22','Pichucalco','2','Juárez','33','Francisco León')," +
                "(68,'7','Chiapas','22','Pichucalco','2','Juárez','48','Juárez')," +
                "(69,'7','Chiapas','22','Pichucalco','2','Juárez','62','Ostuacán')," +
                "(70,'7','Chiapas','22','Pichucalco','2','Juárez','74','Reforma')," +
                "(71,'7','Chiapas','22','Pichucalco','2','Juárez','88','Sunuapa')," +
                "(72,'7','Chiapas','22','Pichucalco','3','Tapilula','42','Ixhuatán')," +
                "(73,'7','Chiapas','22','Pichucalco','3','Tapilula','67','Pantepec')," +
                "(74,'7','Chiapas','22','Pichucalco','3','Tapilula','73','Rayón')," +
                "(75,'7','Chiapas','22','Pichucalco','3','Tapilula','90','Tapalapa')," +
                "(76,'7','Chiapas','22','Pichucalco','3','Tapilula','91','Tapilula')," +
                "(77,'7','Chiapas','22','Pichucalco','4','Bochil','13','Bochil')," +
                "(78,'7','Chiapas','22','Pichucalco','4','Bochil','47','Jitotol')," +
                "(79,'7','Chiapas','22','Pichucalco','4','Bochil','72','Pueblo Nuevo Solistahuacán')," +
                "(80,'7','Chiapas','22','Pichucalco','4','Bochil','121','Rincón Chamula San Pedro')," +
                "(81,'7','Chiapas','22','Pichucalco','5','Simojovel','14','El Bosque')," +
                "(82,'7','Chiapas','22','Pichucalco','5','Simojovel','39','Huitiupán')," +
                "(83,'7','Chiapas','22','Pichucalco','5','Simojovel','81','Simojovel')," +
                "(84,'7','Chiapas','22','Pichucalco','5','Simojovel','118','San Andrés Duraznal')," +
                "(85,'7','Chiapas','23','Palenque','1','Palenque','16','Catazajá')," +
                "(86,'7','Chiapas','23','Palenque','1','Palenque','50','La Libertad')," +
                "(87,'7','Chiapas','23','Palenque','1','Palenque','65','Palenque')," +
                "(88,'7','Chiapas','23','Palenque','1','Palenque','77','Salto de Agua')," +
                "(89,'7','Chiapas','23','Palenque','2','Yajalon','31','Chilón')," +
                "(90,'7','Chiapas','23','Palenque','2','Yajalon','76','Sabanilla')," +
                "(91,'7','Chiapas','23','Palenque','2','Yajalon','82','Sitalá')," +
                "(92,'7','Chiapas','23','Palenque','2','Yajalon','96','Tila')," +
                "(93,'7','Chiapas','23','Palenque','2','Yajalon','100','Tumbalá')," +
                "(94,'7','Chiapas','23','Palenque','2','Yajalon','109','Yajalón')," +
                "(95,'7','Chiapas','23','Palenque','4','Ocosingo','59','Ocosingo')," +
                "(96,'7','Chiapas','24','Motozintla','1','Amatenango/Motozintla','6','Amatenango de La Frontera')," +
                "(97,'7','Chiapas','24','Motozintla','1','Amatenango/Motozintla','11','Bella Vista')," +
                "(98,'7','Chiapas','24','Motozintla','1','Amatenango/Motozintla','53','Mazapa de Madero')," +
                "(99,'7','Chiapas','24','Motozintla','1','Amatenango/Motozintla','57','Motozintla')," +
                "(100,'7','Chiapas','24','Motozintla','2','Porvenir','10','Bejucal de Ocampo')," +
                "(101,'7','Chiapas','24','Motozintla','2','Porvenir','36','La Grandeza')," +
                "(102,'7','Chiapas','24','Motozintla','2','Porvenir','70','El Porvenir')," +
                "(103,'7','Chiapas','24','Motozintla','2','Porvenir','80','Siltepec')," +
                "(104,'7','Chiapas','24','Motozintla','2','Porvenir','120','Capitán Luis Ángel Vidal')," +
                "(105,'7','Chiapas','24','Motozintla','2','Porvenir','125','Honduras de la Sierra')," +
                "(106,'7','Chiapas','25','Tapachula','1','Tapachula','15','Cacahoatán')," +
                "(107,'7','Chiapas','25','Tapachula','1','Tapachula','35','Frontera Hidalgo')," +
                "(108,'7','Chiapas','25','Tapachula','1','Tapachula','54','Mazatán')," +
                "(109,'7','Chiapas','25','Tapachula','1','Tapachula','55','Metapa')," +
                "(110,'7','Chiapas','25','Tapachula','1','Tapachula','89','Tapachula')," +
                "(111,'7','Chiapas','25','Tapachula','1','Tapachula','102','Tuxtla Chico')," +
                "(112,'7','Chiapas','25','Tapachula','1','Tapachula','105','Unión Juárez')," +
                "(113,'7','Chiapas','25','Tapachula','2','Suchiate','35','Frontera Hidalgo')," +
                "(114,'7','Chiapas','25','Tapachula','2','Suchiate','87','Suchiate')," +
                "(115,'7','Chiapas','25','Tapachula','3','Huixtla','37','Huehuetán')," +
                "(116,'7','Chiapas','25','Tapachula','3','Huixtla','40','Huixtla')," +
                "(117,'7','Chiapas','25','Tapachula','3','Huixtla','71','Villa Comaltitlán')," +
                "(118,'7','Chiapas','25','Tapachula','3','Huixtla','103','Tuzantán')," +
                "(119,'7','Chiapas','25','Tapachula','4','Acapetahua','1','Acacoyagua')," +
                "(120,'7','Chiapas','25','Tapachula','4','Acapetahua','3','Acapetahua')," +
                "(121,'7','Chiapas','25','Tapachula','4','Acapetahua','32','Escuintla')," +
                "(122,'7','Chiapas','25','Tapachula','4','Acapetahua','51','Mapastepec')," +
                "(123,'7','Chiapas','26','Tonalá','1','Tonalá','9','Arriaga')," +
                "(124,'7','Chiapas','26','Tonalá','1','Tonalá','97','Tonalá')," +
                "(125,'7','Chiapas','26','Tonalá','2','Pijijiapan','69','Pijijiapan')," +
                "(126,'7','Chiapas','27','Selva Lacandona','1','Frontera Corozal/Echeverría','59','Ocosingo')," +
                "(127,'7','Chiapas','27','Selva Lacandona','2','Nuevo Orizaba','59','Ocosingo')," +
                "(128,'7','Chiapas','27','Selva Lacandona','2','Nuevo Orizaba','114','Benemérito de Las Américas')," +
                "(129,'7','Chiapas','27','Selva Lacandona','2','Nuevo Orizaba','116','Marqués de Comillas')," +
                "(130,'7','Chiapas','27','Selva Lacandona','3','San Quintín/Tacitas','59','Ocosingo')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_CHIHUAHUA + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_CHIHUAHUA + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'8','Chihuahua','28','Casas Grandes','1','Nuevo Casas Grandes','13','Casas Grandes')," +
                "(2,'8','Chihuahua','28','Casas Grandes','1','Nuevo Casas Grandes','50','Nuevo Casas Grandes')," +
                "(3,'8','Chihuahua','28','Casas Grandes','2','Janos','35','Janos')," +
                "(4,'8','Chihuahua','28','Casas Grandes','3','Ascensión','5','Ascensión')," +
                "(5,'8','Chihuahua','29','Buenaventura','1','Buenaventura','10','Buenaventura')," +
                "(6,'8','Chihuahua','29','Buenaventura','1','Buenaventura','23','Galeana')," +
                "(7,'8','Chihuahua','30','El Carmen','1','El Carmen','10','Buenaventura')," +
                "(8,'8','Chihuahua','30','El Carmen','2','Villa Ahumada','1','Ahumada')," +
                "(9,'8','Chihuahua','31','Valle de Juárez','1','San Isidro','37','Juárez')," +
                "(10,'8','Chihuahua','31','Valle de Juárez','2','Praxedis G. Guerrero','28','Guadalupe')," +
                "(11,'8','Chihuahua','31','Valle de Juárez','2','Praxedis G. Guerrero','53','Praxedis G. Guerrero')," +
                "(12,'8','Chihuahua','32','Madera','1','Madera','40','Madera')," +
                "(13,'8','Chihuahua','32','Madera','2','Gómez Farías','25','Gómez Farías')," +
                "(14,'8','Chihuahua','32','Madera','2','Gómez Farías','34','Ignacio Zaragoza')," +
                "(15,'8','Chihuahua','32','Madera','3','Soto Máynez','48','Namiquipa')," +
                "(16,'8','Chihuahua','32','Madera','4','El Terrero','48','Namiquipa')," +
                "(17,'8','Chihuahua','33','Cuauhtémoc','1','Anahuac','17','Cuauhtémoc')," +
                "(18,'8','Chihuahua','33','Cuauhtémoc','2','Álvaro Obregón','17','Cuauhtémoc')," +
                "(19,'8','Chihuahua','33','Cuauhtémoc','3','Riva Palacio','54','Riva Palacio')," +
                "(20,'8','Chihuahua','33','Cuauhtémoc','4','Cusihuiriachi','18','Cusihuiriachi')," +
                "(21,'8','Chihuahua','33','Cuauhtémoc','5','Carichí','12','Carichí')," +
                "(22,'8','Chihuahua','33','Cuauhtémoc','6','Bachíniva','6','Bachíniva')," +
                "(23,'8','Chihuahua','34','Papigochi','1','La Junta','31','Guerrero')," +
                "(24,'8','Chihuahua','34','Papigochi','2','Guerrero','31','Guerrero')," +
                "(25,'8','Chihuahua','34','Papigochi','3','Matachí','43','Matachí')," +
                "(26,'8','Chihuahua','34','Papigochi','3','Matachí','63','Temósachic')," +
                "(27,'8','Chihuahua','35','Chihuahua','1','Tabalaopa','4','Aquiles Serdán')," +
                "(28,'8','Chihuahua','35','Chihuahua','1','Tabalaopa','19','Chihuahua')," +
                "(29,'8','Chihuahua','35','Chihuahua','2','Villa Aldama','2','Aldama')," +
                "(30,'8','Chihuahua','35','Chihuahua','3','General Trias','24','Santa Isabel')," +
                "(31,'8','Chihuahua','35','Chihuahua','3','General Trias','26','Gran Morelos')," +
                "(32,'8','Chihuahua','35','Chihuahua','3','General Trias','61','Satevó')," +
                "(33,'8','Chihuahua','35','Chihuahua','4','Belisario Dominguez','22','Dr. Belisario Domínguez')," +
                "(34,'8','Chihuahua','35','Chihuahua','4','Belisario Dominguez','49','Nonoava')," +
                "(35,'8','Chihuahua','35','Chihuahua','4','Belisario Dominguez','57','San Francisco de Borja')," +
                "(36,'8','Chihuahua','36','Bajo Río Conchos','1','Coyame','15','Coyame del Sotol')," +
                "(37,'8','Chihuahua','36','Bajo Río Conchos','2','Ojinaga','52','Ojinaga')," +
                "(38,'8','Chihuahua','36','Bajo Río Conchos','3','M. Benavides','42','Manuel Benavides')," +
                "(39,'8','Chihuahua','37','San Juanito','1','San Juanito','8','Batopilas')," +
                "(40,'8','Chihuahua','37','San Juanito','1','San Juanito','9','Bocoyna')," +
                "(41,'8','Chihuahua','37','San Juanito','1','San Juanito','41','Maguarichi')," +
                "(42,'8','Chihuahua','37','San Juanito','1','San Juanito','46','Morelos')," +
                "(43,'8','Chihuahua','37','San Juanito','2','Tomochi','47','Moris')," +
                "(44,'8','Chihuahua','37','San Juanito','2','Tomochi','51','Ocampo')," +
                "(45,'8','Chihuahua','37','San Juanito','2','Tomochi','66','Uruachi')," +
                "(46,'8','Chihuahua','37','San Juanito','3','San Rafael','65','Urique')," +
                "(47,'8','Chihuahua','37','San Juanito','4','Témoris','20','Chínipas')," +
                "(48,'8','Chihuahua','37','San Juanito','4','Témoris','30','Guazapares')," +
                "(49,'8','Chihuahua','38','Balleza','1','Balleza','7','Balleza')," +
                "(50,'8','Chihuahua','38','Balleza','2','Guachochi','27','Guachochi')," +
                "(51,'8','Chihuahua','38','Balleza','3','Guadalupe Y Calvo','29','Guadalupe Y Calvo')," +
                "(52,'8','Chihuahua','39','Parral','1','Parral','3','Allende')," +
                "(53,'8','Chihuahua','39','Parral','1','Parral','32','Hidalgo del Parral')," +
                "(54,'8','Chihuahua','39','Parral','1','Parral','44','Matamoros')," +
                "(55,'8','Chihuahua','39','Parral','1','Parral','59','San Francisco del Oro')," +
                "(56,'8','Chihuahua','39','Parral','1','Parral','60','Santa Bárbara')," +
                "(57,'8','Chihuahua','39','Parral','2','El Tule','33','Huejotitán')," +
                "(58,'8','Chihuahua','39','Parral','2','El Tule','56','Rosario')," +
                "(59,'8','Chihuahua','39','Parral','2','El Tule','64','El Tule')," +
                "(60,'8','Chihuahua','39','Parral','3','Valle de Zaragoza','67','Valle de Zaragoza')," +
                "(61,'8','Chihuahua','40','Delicias','1','Camargo','11','Camargo')," +
                "(62,'8','Chihuahua','40','Delicias','1','Camargo','58','San Francisco de Conchos')," +
                "(63,'8','Chihuahua','40','Delicias','2','Saucillo','16','La Cruz')," +
                "(64,'8','Chihuahua','40','Delicias','2','Saucillo','62','Saucillo')," +
                "(65,'8','Chihuahua','40','Delicias','3','Delicias','21','Delicias')," +
                "(66,'8','Chihuahua','40','Delicias','3','Delicias','45','Meoqui')," +
                "(67,'8','Chihuahua','40','Delicias','3','Delicias','55','Rosales')," +
                "(68,'8','Chihuahua','40','Delicias','3','Delicias','62','Saucillo')," +
                "(69,'8','Chihuahua','40','Delicias','4','Lázaro Cárdenas','38','Julimes')," +
                "(70,'8','Chihuahua','40','Delicias','4','Lázaro Cárdenas','45','Meoqui')," +
                "(71,'8','Chihuahua','40','Delicias','4','Lázaro Cárdenas','55','Rosales')," +
                "(72,'8','Chihuahua','40','Delicias','5','Julimes','38','Julimes')," +
                "(73,'8','Chihuahua','41','Río Florido','1','Villa López','14','Coronado')," +
                "(74,'8','Chihuahua','41','Río Florido','1','Villa López','36','Jiménez')," +
                "(75,'8','Chihuahua','41','Río Florido','1','Villa López','39','López')," +
                "(76,'8','Chihuahua','41','Río Florido','2','Jiménez','36','Jiménez')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_CDMX + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_CDMX + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','2','Azcapotzalco')," +
                "(2,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','3','Coyoacán')," +
                "(3,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','5','Gustavo A. Madero')," +
                "(4,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','6','Iztacalco')," +
                "(5,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','7','Iztapalapa')," +
                "(6,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','12','Tlalpan')," +
                "(7,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','13','Xochimilco')," +
                "(8,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','14','Benito Juárez')," +
                "(9,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','15','Cuauhtémoc')," +
                "(10,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','16','Miguel Hidalgo')," +
                "(11,'9','Ciudad de México','42','Xochimilco','1','San Mateo Xalpa','17','Venustiano Carranza')," +
                "(12,'9','Ciudad de México','42','Xochimilco','2','San Antonio Tecómitl','9','Milpa Alta')," +
                "(13,'9','Ciudad de México','42','Xochimilco','2','San Antonio Tecómitl','11','Tláhuac')," +
                "(14,'9','Ciudad de México','42','Xochimilco','3','San Nicolás Totolapan','4','Cuajimalpa de Morelos')," +
                "(15,'9','Ciudad de México','42','Xochimilco','3','San Nicolás Totolapan','8','La Magdalena Contreras')," +
                "(16,'9','Ciudad de México','42','Xochimilco','3','San Nicolás Totolapan','10','Álvaro Obregón')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_COAHUILA + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_COAHUILA + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'5','Coahuila','12','Acuña','1','Jiménez','2','Acuña')," +
                "(2,'5','Coahuila','12','Acuña','1','Jiménez','14','Jiménez')," +
                "(3,'5','Coahuila','12','Acuña','2','Zaragoza','3','Allende')," +
                "(4,'5','Coahuila','12','Acuña','2','Zaragoza','19','Morelos')," +
                "(5,'5','Coahuila','12','Acuña','2','Zaragoza','37','Villa Unión')," +
                "(6,'5','Coahuila','12','Acuña','2','Zaragoza','38','Zaragoza')," +
                "(7,'5','Coahuila','12','Acuña','3','Piedras Negras','12','Guerrero')," +
                "(8,'5','Coahuila','12','Acuña','3','Piedras Negras','13','Hidalgo')," +
                "(9,'5','Coahuila','12','Acuña','3','Piedras Negras','22','Nava')," +
                "(10,'5','Coahuila','12','Acuña','3','Piedras Negras','25','Piedras Negras')," +
                "(11,'5','Coahuila','13','Sabinas','1','San Juan Sabinas','28','Sabinas')," +
                "(12,'5','Coahuila','13','Sabinas','1','San Juan Sabinas','32','San Juan de Sabinas')," +
                "(13,'5','Coahuila','13','Sabinas','2','Múzquiz','20','Múzquiz')," +
                "(14,'5','Coahuila','13','Sabinas','3','Progreso','15','Juárez')," +
                "(15,'5','Coahuila','13','Sabinas','3','Progreso','26','Progreso')," +
                "(16,'5','Coahuila','14','Frontera','1','Monclova','5','Candela')," +
                "(17,'5','Coahuila','14','Frontera','1','Monclova','6','Castaños')," +
                "(18,'5','Coahuila','14','Frontera','1','Monclova','10','Frontera')," +
                "(19,'5','Coahuila','14','Frontera','1','Monclova','18','Monclova')," +
                "(20,'5','Coahuila','14','Frontera','2','San Buenaventura','1','Abasolo')," +
                "(21,'5','Coahuila','14','Frontera','2','San Buenaventura','8','Escobedo')," +
                "(22,'5','Coahuila','14','Frontera','2','San Buenaventura','21','Nadadores')," +
                "(23,'5','Coahuila','14','Frontera','2','San Buenaventura','31','San Buenaventura')," +
                "(24,'5','Coahuila','14','Frontera','3','Cuatro Ciénegas','7','Cuatro Ciénegas')," +
                "(25,'5','Coahuila','14','Frontera','3','Cuatro Ciénegas','16','Lamadrid')," +
                "(26,'5','Coahuila','14','Frontera','3','Cuatro Ciénegas','29','Sacramento')," +
                "(27,'5','Coahuila','14','Frontera','4','Ocampo','23','Ocampo')," +
                "(28,'5','Coahuila','14','Frontera','4','Ocampo','34','Sierra Mojada')," +
                "(29,'5','Coahuila','15','Saltillo','1','Arteaga','4','Arteaga')," +
                "(30,'5','Coahuila','15','Saltillo','2','General Cepeda','11','General Cepeda')," +
                "(31,'5','Coahuila','15','Saltillo','3','Parras de La Fuente','24','Parras')," +
                "(32,'5','Coahuila','15','Saltillo','4','Ramos Arizpe','27','Ramos Arizpe')," +
                "(33,'5','Coahuila','15','Saltillo','5','Agua Nueva','30','Saltillo')," +
                "(34,'33','Región Lagunera','192','Laguna-Coahuila','5','Sn. Pedro','33','San Pedro')," +
                "(35,'33','Región Lagunera','192','Laguna-Coahuila','6','Fco. I. Madero','9','Francisco I. Madero')," +
                "(36,'33','Región Lagunera','192','Laguna-Coahuila','8','Matamoros','17','Matamoros')," +
                "(37,'33','Región Lagunera','192','Laguna-Coahuila','11','Torreón','35','Torreón')," +
                "(38,'33','Región Lagunera','192','Laguna-Coahuila','12','Viesca','36','Viesca')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_COLIMA + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_COLIMA + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'6','Colima','16','Colima','1','Coquimatlán','2','Colima')," +
                "(2,'6','Colima','16','Colima','1','Coquimatlán','4','Coquimatlán')," +
                "(3,'6','Colima','16','Colima','1','Coquimatlán','10','Villa de Álvarez')," +
                "(4,'6','Colima','16','Colima','2','Comala','3','Comala')," +
                "(5,'6','Colima','16','Colima','2','Comala','5','Cuauhtémoc')," +
                "(6,'6','Colima','16','Colima','2','Comala','8','Minatitlán')," +
                "(7,'6','Colima','17','Tecomán','1','Armería','1','Armería')," +
                "(8,'6','Colima','17','Tecomán','1','Armería','6','Ixtlahuacán')," +
                "(9,'6','Colima','17','Tecomán','1','Armería','9','Tecomán')," +
                "(10,'6','Colima','17','Tecomán','2','Santiago','7','Manzanillo')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_DURANGO + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_DURANGO + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'10','Durango','43','Durango','2','Canatlán','1','Canatlán')," +
                "(2,'10','Durango','43','Durango','2','Canatlán','39','Nuevo Ideal')," +
                "(3,'10','Durango','43','Durango','3','Durango','5','Durango')," +
                "(4,'10','Durango','43','Durango','4','Mezquital','14','Mezquital')," +
                "(5,'10','Durango','43','Durango','10','Poanas','22','Poanas')," +
                "(6,'10','Durango','43','Durango','11','Vicente Guerrero','16','Nombre de Dios')," +
                "(7,'10','Durango','43','Durango','11','Vicente Guerrero','33','Súchil')," +
                "(8,'10','Durango','43','Durango','11','Vicente Guerrero','38','Vicente Guerrero')," +
                "(9,'10','Durango','44','El Salto','1','San Miguel de Cruces','26','San Dimas')," +
                "(10,'10','Durango','44','El Salto','2','El Salto','23','Pueblo Nuevo')," +
                "(11,'10','Durango','44','El Salto','2','El Salto','34','Tamazula')," +
                "(12,'10','Durango','45','Guadalupe Victoria','1','Cuencamé','4','Cuencamé')," +
                "(13,'10','Durango','45','Guadalupe Victoria','1','Cuencamé','21','Peñón Blanco')," +
                "(14,'10','Durango','45','Guadalupe Victoria','1','Cuencamé','31','Santa Clara')," +
                "(15,'10','Durango','45','Guadalupe Victoria','2','Guadalupe Victoria','4','Cuencamé')," +
                "(16,'10','Durango','45','Guadalupe Victoria','2','Guadalupe Victoria','8','Guadalupe Victoria')," +
                "(17,'10','Durango','45','Guadalupe Victoria','2','Guadalupe Victoria','20','Pánuco de Coronado')," +
                "(18,'10','Durango','45','Guadalupe Victoria','12','San Juan del Río','3','Coneto de Comonfort')," +
                "(19,'10','Durango','45','Guadalupe Victoria','12','San Juan del Río','28','San Juan del Río')," +
                "(20,'10','Durango','46','Villa Ocampo','1','Villa Ocampo','17','Ocampo')," +
                "(21,'10','Durango','46','Villa Ocampo','2','Guanaceví','9','Guanaceví')," +
                "(22,'10','Durango','46','Villa Ocampo','3','Revolución','10','Hidalgo')," +
                "(23,'10','Durango','46','Villa Ocampo','3','Revolución','11','Indé')," +
                "(24,'10','Durango','46','Villa Ocampo','4','Santa María del Oro','18','El Oro')," +
                "(25,'10','Durango','46','Villa Ocampo','4','Santa María del Oro','25','San Bernardo')," +
                "(26,'10','Durango','47','Santiago Papasquiaro','1','Tepehuanes','2','Canelas')," +
                "(27,'10','Durango','47','Santiago Papasquiaro','1','Tepehuanes','35','Tepehuanes')," +
                "(28,'10','Durango','47','Santiago Papasquiaro','1','Tepehuanes','37','Topia')," +
                "(29,'10','Durango','47','Santiago Papasquiaro','2','Santiago Papasquiaro','19','Otáez')," +
                "(30,'10','Durango','47','Santiago Papasquiaro','2','Santiago Papasquiaro','32','Santiago Papasquiaro')," +
                "(31,'33','Región Lagunera','191','Laguna-Durango','2','Ceballos','13','Mapimí')," +
                "(32,'33','Región Lagunera','191','Laguna-Durango','3','San Luis  Cordero','29','San Luis del Cordero')," +
                "(33,'33','Región Lagunera','191','Laguna-Durango','4','Sn. Pedro El Gallo','30','San Pedro del Gallo')," +
                "(34,'33','Región Lagunera','191','Laguna-Durango','10','Lerdo','12','Lerdo')," +
                "(35,'33','Región Lagunera','191','Laguna-Durango','13','Gómez Palacio','7','Gómez Palacio')," +
                "(36,'33','Región Lagunera','191','Laguna-Durango','14','Simón Bolívar','6','General Simón Bolívar')," +
                "(37,'33','Región Lagunera','191','Laguna-Durango','15','Nazas','15','Nazas')," +
                "(38,'33','Región Lagunera','191','Laguna-Durango','16','Rodeo','24','Rodeo')," +
                "(39,'33','Región Lagunera','191','Laguna-Durango','17','San Juan de Guadalupe','27','San Juan de Guadalupe')," +
                "(40,'33','Región Lagunera','191','Laguna-Durango','18','Bermejillo','13','Mapimí')," +
                "(41,'33','Región Lagunera','191','Laguna-Durango','19','Tlahualilo','36','Tlahualilo')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_GUANAJUATO + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_GUANAJUATO + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'11','Guanajuato','48','Dolores Hidalgo','1','San Felipe','22','Ocampo')," +
                "(2,'11','Guanajuato','48','Dolores Hidalgo','1','San Felipe','30','San Felipe')," +
                "(3,'11','Guanajuato','48','Dolores Hidalgo','2','Dolores Hidalgo','14','Dolores Hidalgo Cuna de la Independencia Nacional')," +
                "(4,'11','Guanajuato','48','Dolores Hidalgo','2','Dolores Hidalgo','29','San Diego de La Unión')," +
                "(5,'11','Guanajuato','48','Dolores Hidalgo','3','San Miguel de Allende','3','San Miguel de Allende')," +
                "(6,'11','Guanajuato','49','San Luis de la Paz','1','San Luis de La Paz','13','Doctor Mora')," +
                "(7,'11','Guanajuato','49','San Luis de la Paz','1','San Luis de La Paz','33','San Luis de La Paz')," +
                "(8,'11','Guanajuato','49','San Luis de la Paz','2','Xichú/Victoria','43','Victoria')," +
                "(9,'11','Guanajuato','49','San Luis de la Paz','2','Xichú/Victoria','45','Xichú')," +
                "(10,'11','Guanajuato','49','San Luis de la Paz','3','Tierra Blanca/Sn Jose Iturbide','6','Atarjea')," +
                "(11,'11','Guanajuato','49','San Luis de la Paz','3','Tierra Blanca/Sn Jose Iturbide','32','San José Iturbide')," +
                "(12,'11','Guanajuato','49','San Luis de la Paz','3','Tierra Blanca/Sn Jose Iturbide','34','Santa Catarina')," +
                "(13,'11','Guanajuato','49','San Luis de la Paz','3','Tierra Blanca/Sn Jose Iturbide','40','Tierra Blanca')," +
                "(14,'11','Guanajuato','50','León','1','Leon','20','León')," +
                "(15,'11','Guanajuato','50','León','2','San Francisco del Rincón','8','Manuel Doblado')," +
                "(16,'11','Guanajuato','50','León','2','San Francisco del Rincón','25','Purísima del Rincón')," +
                "(17,'11','Guanajuato','50','León','2','San Francisco del Rincón','31','San Francisco del Rincón')," +
                "(18,'11','Guanajuato','50','León','3','Silao/Guanajuato','15','Guanajuato')," +
                "(19,'11','Guanajuato','50','León','3','Silao/Guanajuato','26','Romita')," +
                "(20,'11','Guanajuato','50','León','3','Silao/Guanajuato','37','Silao de La Victoria')," +
                "(21,'11','Guanajuato','51','Celaya','1','Celaya','4','Apaseo El Alto')," +
                "(22,'11','Guanajuato','51','Celaya','1','Celaya','5','Apaseo El Grande')," +
                "(23,'11','Guanajuato','51','Celaya','1','Celaya','7','Celaya')," +
                "(24,'11','Guanajuato','51','Celaya','1','Celaya','9','Comonfort')," +
                "(25,'11','Guanajuato','51','Celaya','1','Celaya','35','Santa Cruz de Juventino Rosas')," +
                "(26,'11','Guanajuato','51','Celaya','1','Celaya','39','Tarimoro')," +
                "(27,'11','Guanajuato','51','Celaya','2','Jerécuaro','10','Coroneo')," +
                "(28,'11','Guanajuato','51','Celaya','2','Jerécuaro','19','Jerécuaro')," +
                "(29,'11','Guanajuato','52','Cortazar','1','Irapuato','17','Irapuato')," +
                "(30,'11','Guanajuato','52','Cortazar','1','Irapuato','24','Pueblo Nuevo')," +
                "(31,'11','Guanajuato','52','Cortazar','3','Pénjamo','23','Pénjamo')," +
                "(32,'11','Guanajuato','52','Cortazar','4','Yuriria','21','Moroleón')," +
                "(33,'11','Guanajuato','52','Cortazar','4','Yuriria','41','Uriangato')," +
                "(34,'11','Guanajuato','52','Cortazar','4','Yuriria','46','Yuriria')," +
                "(35,'11','Guanajuato','52','Cortazar','5','Acámbaro','2','Acámbaro')," +
                "(36,'11','Guanajuato','52','Cortazar','5','Acámbaro','38','Tarandacuao')," +
                "(37,'11','Guanajuato','52','Cortazar','6','Salvatierra','28','Salvatierra')," +
                "(38,'11','Guanajuato','52','Cortazar','6','Salvatierra','36','Santiago Maravatío')," +
                "(39,'11','Guanajuato','52','Cortazar','7','Valle Santiago','18','Jaral del Progreso')," +
                "(40,'11','Guanajuato','52','Cortazar','7','Valle Santiago','42','Valle de Santiago')," +
                "(41,'11','Guanajuato','52','Cortazar','8','Salamanca','11','Cortazar')," +
                "(42,'11','Guanajuato','52','Cortazar','8','Salamanca','27','Salamanca')," +
                "(43,'11','Guanajuato','52','Cortazar','8','Salamanca','44','Villagrán')," +
                "(44,'11','Guanajuato','52','Cortazar','9','Abasolo','1','Abasolo')," +
                "(45,'11','Guanajuato','52','Cortazar','9','Abasolo','12','Cuerámaro')," +
                "(46,'11','Guanajuato','52','Cortazar','9','Abasolo','16','Huanímaro')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_GUERRERO + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_GUERRERO + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'12','Guerrero','53','Atoyac','1','Técpan de Galeana','57','Técpan de Galeana')," +
                "(2,'12','Guerrero','53','Atoyac','4','La Unión','16','Coahuayutla de José María Izazaga')," +
                "(3,'12','Guerrero','53','Atoyac','4','La Unión','68','La Unión de Isidoro Montes de Oca')," +
                "(4,'12','Guerrero','53','Atoyac','5','Petatlán','38','Zihuatanejo de Azueta')," +
                "(5,'12','Guerrero','53','Atoyac','5','Petatlán','48','Petatlán')," +
                "(6,'12','Guerrero','53','Atoyac','6','Coyuca de Benítez','11','Atoyac de Álvarez')," +
                "(7,'12','Guerrero','53','Atoyac','6','Coyuca de Benítez','14','Benito Juárez')," +
                "(8,'12','Guerrero','53','Atoyac','6','Coyuca de Benítez','21','Coyuca de Benítez')," +
                "(9,'12','Guerrero','54','Las Vigas','1','Ometepec','36','Igualapa')," +
                "(10,'12','Guerrero','54','Las Vigas','1','Ometepec','46','Ometepec')," +
                "(11,'12','Guerrero','54','Las Vigas','1','Ometepec','62','Tlacoachistlahuaca')," +
                "(12,'12','Guerrero','54','Las Vigas','1','Ometepec','71','Xochistlahuaca')," +
                "(13,'12','Guerrero','54','Las Vigas','2','Acapulco','1','Acapulco de Juárez')," +
                "(14,'12','Guerrero','54','Las Vigas','2','Acapulco','39','Juan R. Escudero')," +
                "(15,'12','Guerrero','54','Las Vigas','3','San Marcos','18','Copala')," +
                "(16,'12','Guerrero','54','Las Vigas','3','San Marcos','25','Cuautepec')," +
                "(17,'12','Guerrero','54','Las Vigas','3','San Marcos','30','Florencio Villarreal')," +
                "(18,'12','Guerrero','54','Las Vigas','3','San Marcos','53','San Marcos')," +
                "(19,'12','Guerrero','54','Las Vigas','4','Ayutla','12','Ayutla de Los Libres')," +
                "(20,'12','Guerrero','54','Las Vigas','4','Ayutla','56','Tecoanapa')," +
                "(21,'12','Guerrero','54','Las Vigas','5','San Luis Acatlán','52','San Luis Acatlán')," +
                "(22,'12','Guerrero','54','Las Vigas','6','Cuajinicuilapa','13','Azoyú')," +
                "(23,'12','Guerrero','54','Las Vigas','6','Cuajinicuilapa','23','Cuajinicuilapa')," +
                "(24,'12','Guerrero','54','Las Vigas','6','Cuajinicuilapa','77','Marquelia')," +
                "(25,'12','Guerrero','54','Las Vigas','6','Cuajinicuilapa','80','Juchitán')," +
                "(26,'12','Guerrero','55','Altamirano','1','Coyuca de Catalán','22','Coyuca de Catalán')," +
                "(27,'12','Guerrero','55','Altamirano','1','Coyuca de Catalán','50','Pungarabato')," +
                "(28,'12','Guerrero','55','Altamirano','2','Zirándaro','73','Zirándaro')," +
                "(29,'12','Guerrero','55','Altamirano','3','Cutzamala de Pinzón','27','Cutzamala de Pinzón')," +
                "(30,'12','Guerrero','55','Altamirano','3','Cutzamala de Pinzón','64','Tlalchapa')," +
                "(31,'12','Guerrero','55','Altamirano','4','Arcelia','7','Arcelia')," +
                "(32,'12','Guerrero','55','Altamirano','4','Arcelia','67','Tlapehuala')," +
                "(33,'12','Guerrero','55','Altamirano','5','Ajuchitlán del Progreso','3','Ajuchitlán del Progreso')," +
                "(34,'12','Guerrero','55','Altamirano','5','Ajuchitlán del Progreso','54','San Miguel Totolapan')," +
                "(35,'12','Guerrero','56','Chilpancingo','1','Tixtla','29','Chilpancingo de Los Bravo')," +
                "(36,'12','Guerrero','56','Chilpancingo','1','Tixtla','42','Mártir de Cuilapan')," +
                "(37,'12','Guerrero','56','Chilpancingo','1','Tixtla','61','Tixtla de Guerrero')," +
                "(38,'12','Guerrero','56','Chilpancingo','2','Chichihualco','32','General Heliodoro Castillo')," +
                "(39,'12','Guerrero','56','Chilpancingo','2','Chichihualco','40','Leonardo Bravo')," +
                "(40,'12','Guerrero','56','Chilpancingo','2','Chichihualco','75','Eduardo Neri')," +
                "(41,'12','Guerrero','56','Chilpancingo','3','Quechultenango','44','Mochitlán')," +
                "(42,'12','Guerrero','56','Chilpancingo','3','Quechultenango','51','Quechultenango')," +
                "(43,'12','Guerrero','56','Chilpancingo','4','Chilapa','2','Ahuacuotzingo')," +
                "(44,'12','Guerrero','56','Chilpancingo','4','Chilapa','28','Chilapa de Álvarez')," +
                "(45,'12','Guerrero','56','Chilpancingo','4','Chilapa','74','Zitlala')," +
                "(46,'12','Guerrero','56','Chilpancingo','4','Chilapa','79','José Joaquín de Herrera')," +
                "(47,'12','Guerrero','57','Tlapa','1','Xalpatláhuac','20','Copanatoyac')," +
                "(48,'12','Guerrero','57','Tlapa','1','Xalpatláhuac','66','Tlapa de Comonfort')," +
                "(49,'12','Guerrero','57','Tlapa','1','Xalpatláhuac','69','Xalpatláhuac')," +
                "(50,'12','Guerrero','57','Tlapa','2','Olinalá','24','Cualác')," +
                "(51,'12','Guerrero','57','Tlapa','2','Olinalá','45','Olinalá')," +
                "(52,'12','Guerrero','57','Tlapa','3','Huamuxtitlán','5','Alpoyeca')," +
                "(53,'12','Guerrero','57','Tlapa','3','Huamuxtitlán','33','Huamuxtitlán')," +
                "(54,'12','Guerrero','57','Tlapa','3','Huamuxtitlán','70','Xochihuehuetlán')," +
                "(55,'12','Guerrero','57','Tlapa','4','Zapotitlan Tablas','10','Atlixtac')," +
                "(56,'12','Guerrero','57','Tlapa','4','Zapotitlan Tablas','63','Tlacoapa')," +
                "(57,'12','Guerrero','57','Tlapa','4','Zapotitlan Tablas','72','Zapotitlán Tablas')," +
                "(58,'12','Guerrero','57','Tlapa','4','Zapotitlan Tablas','76','Acatepec')," +
                "(59,'12','Guerrero','57','Tlapa','5','Atlamajalcingo del Monte','9','Atlamajalcingo del Monte')," +
                "(60,'12','Guerrero','57','Tlapa','5','Atlamajalcingo del Monte','41','Malinaltepec')," +
                "(61,'12','Guerrero','57','Tlapa','5','Atlamajalcingo del Monte','81','Iliatenco')," +
                "(62,'12','Guerrero','57','Tlapa','6','Alcozauca','4','Alcozauca de Guerrero')," +
                "(63,'12','Guerrero','57','Tlapa','6','Alcozauca','65','Tlalixtaquilla de Maldonado')," +
                "(64,'12','Guerrero','57','Tlapa','7','Metlatónoc','43','Metlatónoc')," +
                "(65,'12','Guerrero','57','Tlapa','7','Metlatónoc','78','Cochoapa El Grande')," +
                "(66,'12','Guerrero','58','Iguala','1','Tepecoacuilco','15','Buenavista de Cuéllar')," +
                "(67,'12','Guerrero','58','Iguala','1','Tepecoacuilco','35','Iguala de La Independencia')," +
                "(68,'12','Guerrero','58','Iguala','1','Tepecoacuilco','59','Tepecoacuilco de Trujano')," +
                "(69,'12','Guerrero','58','Iguala','2','Huitzuco','8','Atenango del Río')," +
                "(70,'12','Guerrero','58','Iguala','2','Huitzuco','19','Copalillo')," +
                "(71,'12','Guerrero','58','Iguala','2','Huitzuco','34','Huitzuco de Los Figueroa')," +
                "(72,'12','Guerrero','58','Iguala','3','Cocula','17','Cocula')," +
                "(73,'12','Guerrero','58','Iguala','4','Teloloapan','6','Apaxtla')," +
                "(74,'12','Guerrero','58','Iguala','4','Teloloapan','26','Cuetzala del Progreso')," +
                "(75,'12','Guerrero','58','Iguala','4','Teloloapan','31','General Canuto A. Neri')," +
                "(76,'12','Guerrero','58','Iguala','4','Teloloapan','47','Pedro Ascencio Alquisiras')," +
                "(77,'12','Guerrero','58','Iguala','4','Teloloapan','58','Teloloapan')," +
                "(78,'12','Guerrero','58','Iguala','5','Taxco de Alarcón','37','Ixcateopan de Cuauhtémoc')," +
                "(79,'12','Guerrero','58','Iguala','5','Taxco de Alarcón','49','Pilcaya')," +
                "(80,'12','Guerrero','58','Iguala','5','Taxco de Alarcón','55','Taxco de Alarcón')," +
                "(81,'12','Guerrero','58','Iguala','5','Taxco de Alarcón','60','Tetipac')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_HIDALGO + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_HIDALGO + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'13','Hidalgo','59','Huejutla','1','Huejutla','26','Huazalingo')," +
                        "(2,'13','Hidalgo','59','Huejutla','1','Huejutla','28','Huejutla de Reyes')," +
                        "(3,'13','Hidalgo','59','Huejutla','2','Atlapexco','11','Atlapexco')," +
                        "(4,'13','Hidalgo','59','Huejutla','2','Atlapexco','25','Huautla')," +
                        "(5,'13','Hidalgo','59','Huejutla','2','Atlapexco','78','Xochiatipan')," +
                        "(6,'13','Hidalgo','59','Huejutla','2','Atlapexco','80','Yahualica')," +
                        "(7,'13','Hidalgo','59','Huejutla','3','Orizatlán','32','Jaltocán')," +
                        "(8,'13','Hidalgo','59','Huejutla','3','Orizatlán','46','San Felipe Orizatlán')," +
                        "(9,'13','Hidalgo','60','Zacualtipán','1','Molango','20','Eloxochitlán')," +
                        "(10,'13','Hidalgo','60','Zacualtipán','1','Molango','33','Juárez Hidalgo')," +
                        "(11,'13','Hidalgo','60','Zacualtipán','1','Molango','42','Molango de Escamilla')," +
                        "(12,'13','Hidalgo','60','Zacualtipán','1','Molango','71','Tlahuiltepa')," +
                        "(13,'13','Hidalgo','60','Zacualtipán','1','Molango','79','Xochicoatlán')," +
                        "(14,'13','Hidalgo','60','Zacualtipán','2','Metztitlán','37','Metztitlán')," +
                        "(15,'13','Hidalgo','60','Zacualtipán','3','Tlanchinol','14','Calnali')," +
                        "(16,'13','Hidalgo','60','Zacualtipán','3','Tlanchinol','34','Lolotla')," +
                        "(17,'13','Hidalgo','60','Zacualtipán','3','Tlanchinol','62','Tepehuacán de Guerrero')," +
                        "(18,'13','Hidalgo','60','Zacualtipán','3','Tlanchinol','73','Tlanchinol')," +
                        "(19,'13','Hidalgo','60','Zacualtipán','4','Zacualtipán','36','San Agustín Metzquititlán')," +
                        "(20,'13','Hidalgo','60','Zacualtipán','4','Zacualtipán','68','Tianguistengo')," +
                        "(21,'13','Hidalgo','60','Zacualtipán','4','Zacualtipán','81','Zacualtipán de Ángeles')," +
                        "(22,'13','Hidalgo','61','Tulancingo','1','Tulancingo','1','Acatlán')," +
                        "(23,'13','Hidalgo','61','Tulancingo','1','Tulancingo','2','Acaxochitlán')," +
                        "(24,'13','Hidalgo','61','Tulancingo','1','Tulancingo','16','Cuautepec de Hinojosa')," +
                        "(25,'13','Hidalgo','61','Tulancingo','1','Tulancingo','56','Santiago Tulantepec de Lugo Guerrero')," +
                        "(26,'13','Hidalgo','61','Tulancingo','1','Tulancingo','57','Singuilucan')," +
                        "(27,'13','Hidalgo','61','Tulancingo','1','Tulancingo','77','Tulancingo de Bravo')," +
                        "(28,'13','Hidalgo','61','Tulancingo','2','San Bartolo Tutotepec','4','Agua Blanca de Iturbide')," +
                        "(29,'13','Hidalgo','61','Tulancingo','2','San Bartolo Tutotepec','27','Huehuetla')," +
                        "(30,'13','Hidalgo','61','Tulancingo','2','San Bartolo Tutotepec','35','Metepec')," +
                        "(31,'13','Hidalgo','61','Tulancingo','2','San Bartolo Tutotepec','53','San Bartolo Tutotepec')," +
                        "(32,'13','Hidalgo','61','Tulancingo','2','San Bartolo Tutotepec','60','Tenango de Doria')," +
                        "(33,'13','Hidalgo','62','Pachuca','1','Pachuca','22','Epazoyucan')," +
                        "(34,'13','Hidalgo','62','Pachuca','1','Pachuca','48','Pachuca de Soto')," +
                        "(35,'13','Hidalgo','62','Pachuca','1','Pachuca','51','Mineral de La Reforma')," +
                        "(36,'13','Hidalgo','62','Pachuca','1','Pachuca','52','San Agustín Tlaxiaca')," +
                        "(37,'13','Hidalgo','62','Pachuca','1','Pachuca','66','Villa de Tezontepec')," +
                        "(38,'13','Hidalgo','62','Pachuca','1','Pachuca','69','Tizayuca')," +
                        "(39,'13','Hidalgo','62','Pachuca','1','Pachuca','75','Tolcayuca')," +
                        "(40,'13','Hidalgo','62','Pachuca','1','Pachuca','82','Zapotlán de Juárez')," +
                        "(41,'13','Hidalgo','62','Pachuca','1','Pachuca','83','Zempoala')," +
                        "(42,'13','Hidalgo','62','Pachuca','2','Atotonilco','12','Atotonilco El Grande')," +
                        "(43,'13','Hidalgo','62','Pachuca','2','Atotonilco','24','Huasca de Ocampo')," +
                        "(44,'13','Hidalgo','62','Pachuca','2','Atotonilco','38','Mineral del Chico')," +
                        "(45,'13','Hidalgo','62','Pachuca','2','Atotonilco','39','Mineral del Monte')," +
                        "(46,'13','Hidalgo','62','Pachuca','2','Atotonilco','45','Omitlán de Juárez')," +
                        "(47,'13','Hidalgo','62','Pachuca','3','Apan','7','Almoloya')," +
                        "(48,'13','Hidalgo','62','Pachuca','3','Apan','8','Apan')," +
                        "(49,'13','Hidalgo','62','Pachuca','3','Apan','21','Emiliano Zapata')," +
                        "(50,'13','Hidalgo','62','Pachuca','3','Apan','61','Tepeapulco')," +
                        "(51,'13','Hidalgo','62','Pachuca','3','Apan','72','Tlanalapa')," +
                        "(52,'13','Hidalgo','63','Mixquiahuala','1','Alfajayucan','6','Alfajayucan')," +
                        "(53,'13','Hidalgo','63','Mixquiahuala','2','Ixmiquilpan','15','Cardonal')," +
                        "(54,'13','Hidalgo','63','Mixquiahuala','2','Ixmiquilpan','30','Ixmiquilpan')," +
                        "(55,'13','Hidalgo','63','Mixquiahuala','2','Ixmiquilpan','58','Tasquillo')," +
                        "(56,'13','Hidalgo','63','Mixquiahuala','3','Chilcuautla','19','Chilcuautla')," +
                        "(57,'13','Hidalgo','63','Mixquiahuala','4','Actopan','3','Actopan')," +
                        "(58,'13','Hidalgo','63','Mixquiahuala','4','Actopan','9','El Arenal')," +
                        "(59,'13','Hidalgo','63','Mixquiahuala','4','Actopan','23','Francisco I. Madero')," +
                        "(60,'13','Hidalgo','63','Mixquiahuala','4','Actopan','54','San Salvador')," +
                        "(61,'13','Hidalgo','63','Mixquiahuala','4','Actopan','55','Santiago de Anaya')," +
                        "(62,'13','Hidalgo','63','Mixquiahuala','5','Mixquiahuala','41','Mixquiahuala de Juárez')," +
                        "(63,'13','Hidalgo','63','Mixquiahuala','5','Mixquiahuala','50','Progreso de Obregón')," +
                        "(64,'13','Hidalgo','63','Mixquiahuala','5','Mixquiahuala','67','Tezontepec de Aldama')," +
                        "(65,'13','Hidalgo','63','Mixquiahuala','6','Tlahuelilpan','5','Ajacuba')," +
                        "(66,'13','Hidalgo','63','Mixquiahuala','6','Tlahuelilpan','10','Atitalaquia')," +
                        "(67,'13','Hidalgo','63','Mixquiahuala','6','Tlahuelilpan','13','Atotonilco de Tula')," +
                        "(68,'13','Hidalgo','63','Mixquiahuala','6','Tlahuelilpan','65','Tetepango')," +
                        "(69,'13','Hidalgo','63','Mixquiahuala','6','Tlahuelilpan','70','Tlahuelilpan')," +
                        "(70,'13','Hidalgo','63','Mixquiahuala','6','Tlahuelilpan','74','Tlaxcoapan')," +
                        "(71,'13','Hidalgo','63','Mixquiahuala','7','Tula','63','Tepeji del Río de Ocampo')," +
                        "(72,'13','Hidalgo','63','Mixquiahuala','7','Tula','64','Tepetitlán')," +
                        "(73,'13','Hidalgo','63','Mixquiahuala','7','Tula','76','Tula de Allende')," +
                        "(74,'13','Hidalgo','64','Huichapan','1','Chapulhuacán','18','Chapulhuacán')," +
                        "(75,'13','Hidalgo','64','Huichapan','1','Chapulhuacán','31','Jacala de Ledezma')," +
                        "(76,'13','Hidalgo','64','Huichapan','1','Chapulhuacán','40','La Misión')," +
                        "(77,'13','Hidalgo','64','Huichapan','1','Chapulhuacán','49','Pisaflores')," +
                        "(78,'13','Hidalgo','64','Huichapan','2','Zimapán','43','Nicolás Flores')," +
                        "(79,'13','Hidalgo','64','Huichapan','2','Zimapán','47','Pacula')," +
                        "(80,'13','Hidalgo','64','Huichapan','2','Zimapán','84','Zimapán')," +
                        "(81,'13','Hidalgo','64','Huichapan','3','Huichapan','17','Chapantongo')," +
                        "(82,'13','Hidalgo','64','Huichapan','3','Huichapan','29','Huichapan')," +
                        "(83,'13','Hidalgo','64','Huichapan','3','Huichapan','44','Nopala de Villagrán')," +
                        "(84,'13','Hidalgo','64','Huichapan','3','Huichapan','59','Tecozautla')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_JALISCO + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_JALISCO + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'14','Jalisco','65','Zapopan','1','Palos Altos','29','Cuquío')," +
                        "(2,'14','Jalisco','65','Zapopan','1','Palos Altos','45','Ixtlahuacán del Río')," +
                        "(3,'14','Jalisco','65','Zapopan','2','Tesistán','39','Guadalajara')," +
                        "(4,'14','Jalisco','65','Zapopan','2','Tesistán','71','San Cristóbal de La Barranca')," +
                        "(5,'14','Jalisco','65','Zapopan','2','Tesistán','120','Zapopan')," +
                        "(6,'14','Jalisco','65','Zapopan','3','Tlajomulco','2','Acatlán de Juárez')," +
                        "(7,'14','Jalisco','65','Zapopan','3','Tlajomulco','97','Tlajomulco de Zúñiga')," +
                        "(8,'14','Jalisco','65','Zapopan','3','Tlajomulco','98','San Pedro Tlaquepaque')," +
                        "(9,'14','Jalisco','65','Zapopan','3','Tlajomulco','114','Villa Corona')," +
                        "(10,'14','Jalisco','65','Zapopan','4','Zapotlanejo','70','El Salto')," +
                        "(11,'14','Jalisco','65','Zapopan','4','Zapotlanejo','101','Tonalá')," +
                        "(12,'14','Jalisco','65','Zapopan','4','Zapotlanejo','124','Zapotlanejo')," +
                        "(13,'14','Jalisco','66','Lagos de Moreno','1','Jalostotitlán','46','Jalostotitlán')," +
                        "(14,'14','Jalisco','66','Lagos de Moreno','1','Jalostotitlán','73','San Juan de Los Lagos')," +
                        "(15,'14','Jalisco','66','Lagos de Moreno','1','Jalostotitlán','117','Cañadas de Obregón')," +
                        "(16,'14','Jalisco','66','Lagos de Moreno','2','Teocaltiche','35','Encarnación de Díaz')," +
                        "(17,'14','Jalisco','66','Lagos de Moreno','2','Teocaltiche','91','Teocaltiche')," +
                        "(18,'14','Jalisco','66','Lagos de Moreno','2','Teocaltiche','116','Villa Hidalgo')," +
                        "(19,'14','Jalisco','66','Lagos de Moreno','3','Lagos de Moreno','53','Lagos de Moreno')," +
                        "(20,'14','Jalisco','66','Lagos de Moreno','3','Lagos de Moreno','64','Ojuelos de Jalisco')," +
                        "(21,'14','Jalisco','66','Lagos de Moreno','4','Unión de San Antonio','72','San Diego de Alejandría')," +
                        "(22,'14','Jalisco','66','Lagos de Moreno','4','Unión de San Antonio','74','San Julián')," +
                        "(23,'14','Jalisco','66','Lagos de Moreno','4','Unión de San Antonio','109','Unión de San Antonio')," +
                        "(24,'14','Jalisco','66','Lagos de Moreno','5','Arandas','8','Arandas')," +
                        "(25,'14','Jalisco','66','Lagos de Moreno','5','Arandas','48','Jesús María')," +
                        "(26,'14','Jalisco','66','Lagos de Moreno','5','Arandas','78','San Miguel El Alto')," +
                        "(27,'14','Jalisco','66','Lagos de Moreno','5','Arandas','125','San Ignacio Cerro Gordo')," +
                        "(28,'14','Jalisco','66','Lagos de Moreno','6','Yahualica','60','Mexticacán')," +
                        "(29,'14','Jalisco','66','Lagos de Moreno','6','Yahualica','118','Yahualica de González Gallo')," +
                        "(30,'14','Jalisco','66','Lagos de Moreno','7','Tepatitlán','1','Acatic')," +
                        "(31,'14','Jalisco','66','Lagos de Moreno','7','Tepatitlán','93','Tepatitlán de Morelos')," +
                        "(32,'14','Jalisco','66','Lagos de Moreno','7','Tepatitlán','111','Valle de Guadalupe')," +
                        "(33,'14','Jalisco','67','Ameca','1','Tequila','5','Amatitán')," +
                        "(34,'14','Jalisco','67','Ameca','1','Tequila','40','Hostotipaquillo')," +
                        "(35,'14','Jalisco','67','Ameca','1','Tequila','55','Magdalena')," +
                        "(36,'14','Jalisco','67','Ameca','1','Tequila','94','Tequila')," +
                        "(37,'14','Jalisco','67','Ameca','2','Antonio Escobedo','3','Ahualulco de Mercado')," +
                        "(38,'14','Jalisco','67','Ameca','2','Antonio Escobedo','7','San Juanito de Escobedo')," +
                        "(39,'14','Jalisco','67','Ameca','2','Antonio Escobedo','36','Etzatlán')," +
                        "(40,'14','Jalisco','67','Ameca','2','Antonio Escobedo','75','San Marcos')," +
                        "(41,'14','Jalisco','67','Ameca','3','Tala','9','El Arenal')," +
                        "(42,'14','Jalisco','67','Ameca','3','Tala','83','Tala')," +
                        "(43,'14','Jalisco','67','Ameca','3','Tala','95','Teuchitlán')," +
                        "(44,'14','Jalisco','67','Ameca','4','Ameca','6','Ameca')," +
                        "(45,'14','Jalisco','67','Ameca','5','Cocula','24','Cocula')," +
                        "(46,'14','Jalisco','67','Ameca','5','Cocula','77','San Martín Hidalgo')," +
                        "(47,'14','Jalisco','67','Ameca','6','Mixtlán','12','Atenguillo')," +
                        "(48,'14','Jalisco','67','Ameca','6','Mixtlán','38','Guachinango')," +
                        "(49,'14','Jalisco','67','Ameca','6','Mixtlán','62','Mixtlán')," +
                        "(50,'14','Jalisco','67','Ameca','7','Mascota','58','Mascota')," +
                        "(51,'14','Jalisco','67','Ameca','7','Mascota','80','San Sebastián del Oeste')," +
                        "(52,'14','Jalisco','67','Ameca','8','Talpa de Allende','84','Talpa de Allende')," +
                        "(53,'14','Jalisco','68','Tomatlán','1','Tomatlán','100','Tomatlán')," +
                        "(54,'14','Jalisco','68','Tomatlán','2','La Huerta','27','Cuautitlán de García Barragán')," +
                        "(55,'14','Jalisco','68','Tomatlán','2','La Huerta','43','La Huerta')," +
                        "(56,'14','Jalisco','68','Tomatlán','3','Casimiro Castillo','21','Casimiro Castillo')," +
                        "(57,'14','Jalisco','68','Tomatlán','3','Casimiro Castillo','68','Villa Purificación')," +
                        "(58,'14','Jalisco','68','Tomatlán','4','Cihuatlan','22','Cihuatlán')," +
                        "(59,'14','Jalisco','68','Tomatlán','5','Puerto Vallarta','20','Cabo Corrientes')," +
                        "(60,'14','Jalisco','68','Tomatlán','5','Puerto Vallarta','67','Puerto Vallarta')," +
                        "(61,'14','Jalisco','69','El Grullo','1','Unión de Tula','17','Ayutla')," +
                        "(62,'14','Jalisco','69','El Grullo','1','Unión de Tula','28','Cuautla')," +
                        "(63,'14','Jalisco','69','El Grullo','1','Unión de Tula','34','Ejutla')," +
                        "(64,'14','Jalisco','69','El Grullo','1','Unión de Tula','110','Unión de Tula')," +
                        "(65,'14','Jalisco','69','El Grullo','2','Tecolotlán','11','Atengo')," +
                        "(66,'14','Jalisco','69','El Grullo','2','Tecolotlán','52','Juchitlán')," +
                        "(67,'14','Jalisco','69','El Grullo','2','Tecolotlán','88','Tecolotlán')," +
                        "(68,'14','Jalisco','69','El Grullo','2','Tecolotlán','90','Tenamaxtlán')," +
                        "(69,'14','Jalisco','69','El Grullo','3','Autlán','15','Autlán de Navarro')," +
                        "(70,'14','Jalisco','69','El Grullo','3','Autlán','37','El Grullo')," +
                        "(71,'14','Jalisco','69','El Grullo','4','El Limón','54','El Limón')," +
                        "(72,'14','Jalisco','69','El Grullo','4','El Limón','102','Tonaya')," +
                        "(73,'14','Jalisco','69','El Grullo','4','El Limón','106','Tuxcacuesco')," +
                        "(74,'14','Jalisco','70','La Barca','1','La Barca','18','La Barca')," +
                        "(75,'14','Jalisco','70','La Barca','2','Ocotlán','47','Jamay')," +
                        "(76,'14','Jalisco','70','La Barca','2','Ocotlán','51','Juanacatlán')," +
                        "(77,'14','Jalisco','70','La Barca','2','Ocotlán','63','Ocotlán')," +
                        "(78,'14','Jalisco','70','La Barca','2','Ocotlán','66','Poncitlán')," +
                        "(79,'14','Jalisco','70','La Barca','2','Ocotlán','123','Zapotlán del Rey')," +
                        "(80,'14','Jalisco','70','La Barca','3','Atotonilco','13','Atotonilco El Alto')," +
                        "(81,'14','Jalisco','70','La Barca','3','Atotonilco','105','Tototlán')," +
                        "(82,'14','Jalisco','70','La Barca','4','Jocotepec','30','Chapala')," +
                        "(83,'14','Jalisco','70','La Barca','4','Jocotepec','44','Ixtlahuacán de Los Membrillos')," +
                        "(84,'14','Jalisco','70','La Barca','4','Jocotepec','50','Jocotepec')," +
                        "(85,'14','Jalisco','70','La Barca','4','Jocotepec','96','Tizapán El Alto')," +
                        "(86,'14','Jalisco','70','La Barca','4','Jocotepec','107','Tuxcueca')," +
                        "(87,'14','Jalisco','70','La Barca','5','Ayotlán','16','Ayotlán')," +
                        "(88,'14','Jalisco','70','La Barca','5','Ayotlán','33','Degollado')," +
                        "(89,'14','Jalisco','71','Ciudad Guzmán','1','Zacoalco de Torres','4','Amacueca')," +
                        "(90,'14','Jalisco','71','Ciudad Guzmán','1','Zacoalco de Torres','14','Atoyac')," +
                        "(91,'14','Jalisco','71','Ciudad Guzmán','1','Zacoalco de Torres','89','Techaluta de Montenegro')," +
                        "(92,'14','Jalisco','71','Ciudad Guzmán','1','Zacoalco de Torres','92','Teocuitatlán de Corona')," +
                        "(93,'14','Jalisco','71','Ciudad Guzmán','1','Zacoalco de Torres','119','Zacoalco de Torres')," +
                        "(94,'14','Jalisco','71','Ciudad Guzmán','2','Tapalpa','10','Atemajac de Brizuela')," +
                        "(95,'14','Jalisco','71','Ciudad Guzmán','2','Tapalpa','32','Chiquilistlán')," +
                        "(96,'14','Jalisco','71','Ciudad Guzmán','2','Tapalpa','86','Tapalpa')," +
                        "(97,'14','Jalisco','71','Ciudad Guzmán','3','Mazamitla','26','Concepción de Buenos Aires')," +
                        "(98,'14','Jalisco','71','Ciudad Guzmán','3','Mazamitla','57','La Manzanilla de la Paz')," +
                        "(99,'14','Jalisco','71','Ciudad Guzmán','3','Mazamitla','59','Mazamitla')," +
                        "(100,'14','Jalisco','71','Ciudad Guzmán','3','Mazamitla','69','Quitupan')," +
                        "(101,'14','Jalisco','71','Ciudad Guzmán','3','Mazamitla','112','Valle de Juárez')," +
                        "(102,'14','Jalisco','71','Ciudad Guzmán','4','Tamazula','85','Tamazula de Gordiano')," +
                        "(103,'14','Jalisco','71','Ciudad Guzmán','5','Tuxpan','103','Tonila')," +
                        "(104,'14','Jalisco','71','Ciudad Guzmán','5','Tuxpan','108','Tuxpan')," +
                        "(105,'14','Jalisco','71','Ciudad Guzmán','5','Tuxpan','121','Zapotiltic')," +
                        "(106,'14','Jalisco','71','Ciudad Guzmán','6','Sayula','23','Zapotlán el Grande')," +
                        "(107,'14','Jalisco','71','Ciudad Guzmán','6','Sayula','79','Gómez Farías')," +
                        "(108,'14','Jalisco','71','Ciudad Guzmán','6','Sayula','82','Sayula')," +
                        "(109,'14','Jalisco','71','Ciudad Guzmán','6','Sayula','113','San Gabriel')," +
                        "(110,'14','Jalisco','71','Ciudad Guzmán','7','Tecalitlán','65','Pihuamo')," +
                        "(111,'14','Jalisco','71','Ciudad Guzmán','7','Tecalitlán','87','Tecalitlán')," +
                        "(112,'14','Jalisco','71','Ciudad Guzmán','8','Jilotlán','49','Jilotlán de Los Dolores')," +
                        "(113,'14','Jalisco','71','Ciudad Guzmán','8','Jilotlán','56','Santa María del Oro')," +
                        "(114,'14','Jalisco','71','Ciudad Guzmán','9','Tolimán','99','Tolimán')," +
                        "(115,'14','Jalisco','71','Ciudad Guzmán','9','Tolimán','122','Zapotitlán de Vadillo')," +
                        "(116,'14','Jalisco','72','Colotlán','1','Huejúcar','25','Colotlán')," +
                        "(117,'14','Jalisco','72','Colotlán','1','Huejúcar','41','Huejúcar')," +
                        "(118,'14','Jalisco','72','Colotlán','1','Huejúcar','81','Santa María de Los Ángeles')," +
                        "(119,'14','Jalisco','72','Colotlán','2','Totatiche','104','Totatiche')," +
                        "(120,'14','Jalisco','72','Colotlán','2','Totatiche','115','Villa Guerrero')," +
                        "(121,'14','Jalisco','72','Colotlán','3','Huejuquilla','42','Huejuquilla El Alto')," +
                        "(122,'14','Jalisco','72','Colotlán','3','Huejuquilla','61','Mezquitic')," +
                        "(123,'14','Jalisco','72','Colotlán','4','Chimaltitán','19','Bolaños')," +
                        "(124,'14','Jalisco','72','Colotlán','4','Chimaltitán','31','Chimaltitán')," +
                        "(125,'14','Jalisco','72','Colotlán','4','Chimaltitán','76','San Martín de Bolaños')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_MEXICO + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_MEXICO + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'15','México','73','Toluca','1','Lerma','37','Huixquilucan')," +
                        "(2,'15','México','73','Toluca','1','Lerma','51','Lerma')," +
                        "(3,'15','México','73','Toluca','1','Lerma','62','Ocoyoacac')," +
                        "(4,'15','México','73','Toluca','1','Lerma','76','San Mateo Atenco')," +
                        "(5,'15','México','73','Toluca','2','Almoloya de Juárez','5','Almoloya de Juárez')," +
                        "(6,'15','México','73','Toluca','3','Zinacantepec','118','Zinacantepec')," +
                        "(7,'15','México','73','Toluca','4','Tenango del Valle','49','Joquicingo')," +
                        "(8,'15','México','73','Toluca','4','Tenango del Valle','72','Rayón')," +
                        "(9,'15','México','73','Toluca','4','Tenango del Valle','73','San Antonio La Isla')," +
                        "(10,'15','México','73','Toluca','4','Tenango del Valle','90','Tenango del Valle')," +
                        "(11,'15','México','73','Toluca','5','Toluca','54','Metepec')," +
                        "(12,'15','México','73','Toluca','5','Toluca','106','Toluca')," +
                        "(13,'15','México','73','Toluca','6','Temoaya','87','Temoaya')," +
                        "(14,'15','México','73','Toluca','7','Santiago Tianguistengo','6','Almoloya del Río')," +
                        "(15,'15','México','73','Toluca','7','Santiago Tianguistengo','12','Atizapán')," +
                        "(16,'15','México','73','Toluca','7','Santiago Tianguistengo','19','Capulhuac')," +
                        "(17,'15','México','73','Toluca','7','Santiago Tianguistengo','43','Xalatlaco')," +
                        "(18,'15','México','73','Toluca','7','Santiago Tianguistengo','98','Texcalyacac')," +
                        "(19,'15','México','73','Toluca','7','Santiago Tianguistengo','101','Tianguistenco')," +
                        "(20,'15','México','73','Toluca','8','Mexicalzingo','18','Calimaya')," +
                        "(21,'15','México','73','Toluca','8','Mexicalzingo','27','Chapultepec')," +
                        "(22,'15','México','73','Toluca','8','Mexicalzingo','55','Mexicaltzingo')," +
                        "(23,'15','México','73','Toluca','9','Xonacatlán','67','Otzolotepec')," +
                        "(24,'15','México','73','Toluca','9','Xonacatlán','115','Xonacatlán')," +
                        "(25,'15','México','74','Zumpango','1','Zumpango','10','Apaxco')," +
                        "(26,'15','México','74','Zumpango','1','Zumpango','36','Hueypoxtla')," +
                        "(27,'15','México','74','Zumpango','1','Zumpango','44','Jaltenco')," +
                        "(28,'15','México','74','Zumpango','1','Zumpango','59','Nextlalpan')," +
                        "(29,'15','México','74','Zumpango','1','Zumpango','81','Tecámac')," +
                        "(30,'15','México','74','Zumpango','1','Zumpango','96','Tequixquiac')," +
                        "(31,'15','México','74','Zumpango','1','Zumpango','120','Zumpango')," +
                        "(32,'15','México','74','Zumpango','1','Zumpango','125','Tonanitla')," +
                        "(33,'15','México','74','Zumpango','2','San Juan Teotihuacán','2','Acolman')," +
                        "(34,'15','México','74','Zumpango','2','San Juan Teotihuacán','16','Axapusco')," +
                        "(35,'15','México','74','Zumpango','2','San Juan Teotihuacán','61','Nopaltepec')," +
                        "(36,'15','México','74','Zumpango','2','San Juan Teotihuacán','65','Otumba')," +
                        "(37,'15','México','74','Zumpango','2','San Juan Teotihuacán','75','San Martín de Las Pirámides')," +
                        "(38,'15','México','74','Zumpango','2','San Juan Teotihuacán','84','Temascalapa')," +
                        "(39,'15','México','74','Zumpango','2','San Juan Teotihuacán','92','Teotihuacán')," +
                        "(40,'15','México','74','Zumpango','2','San Juan Teotihuacán','100','Tezoyuca')," +
                        "(41,'15','México','74','Zumpango','3','Cuautitlán','23','Coyotepec')," +
                        "(42,'15','México','74','Zumpango','3','Cuautitlán','24','Cuautitlán')," +
                        "(43,'15','México','74','Zumpango','3','Cuautitlán','35','Huehuetoca')," +
                        "(44,'15','México','74','Zumpango','3','Cuautitlán','53','Melchor Ocampo')," +
                        "(45,'15','México','74','Zumpango','3','Cuautitlán','91','Teoloyucan')," +
                        "(46,'15','México','74','Zumpango','3','Cuautitlán','95','Tepotzotlán')," +
                        "(47,'15','México','74','Zumpango','3','Cuautitlán','108','Tultepec')," +
                        "(48,'15','México','74','Zumpango','3','Cuautitlán','109','Tultitlán')," +
                        "(49,'15','México','74','Zumpango','3','Cuautitlán','121','Cuautitlán Izcalli')," +
                        "(50,'15','México','74','Zumpango','4','Nicolás Romero','13','Atizapán de Zaragoza')," +
                        "(51,'15','México','74','Zumpango','4','Nicolás Romero','38','Isidro Fabela')," +
                        "(52,'15','México','74','Zumpango','4','Nicolás Romero','46','Jilotzingo')," +
                        "(53,'15','México','74','Zumpango','4','Nicolás Romero','57','Naucalpan de Juárez')," +
                        "(54,'15','México','74','Zumpango','4','Nicolás Romero','60','Nicolás Romero')," +
                        "(55,'15','México','74','Zumpango','4','Nicolás Romero','104','Tlalnepantla de Baz')," +
                        "(56,'15','México','75','Texcoco','1','Atenco','11','Atenco')," +
                        "(57,'15','México','75','Texcoco','1','Atenco','20','Coacalco de Berriozábal')," +
                        "(58,'15','México','75','Texcoco','1','Atenco','28','Chiautla')," +
                        "(59,'15','México','75','Texcoco','1','Atenco','30','Chiconcuac')," +
                        "(60,'15','México','75','Texcoco','1','Atenco','33','Ecatepec de Morelos')," +
                        "(61,'15','México','75','Texcoco','1','Atenco','69','Papalotla')," +
                        "(62,'15','México','75','Texcoco','1','Atenco','93','Tepetlaoxtoc')," +
                        "(63,'15','México','75','Texcoco','2','Texcoco','58','Nezahualcóyotl')," +
                        "(64,'15','México','75','Texcoco','2','Texcoco','99','Texcoco')," +
                        "(65,'15','México','75','Texcoco','3','Ixtapaluca','29','Chicoloapan')," +
                        "(66,'15','México','75','Texcoco','3','Ixtapaluca','31','Chimalhuacán')," +
                        "(67,'15','México','75','Texcoco','3','Ixtapaluca','39','Ixtapaluca')," +
                        "(68,'15','México','75','Texcoco','3','Ixtapaluca','70','La Paz')," +
                        "(69,'15','México','75','Texcoco','4','Chalco','22','Cocotitlán')," +
                        "(70,'15','México','75','Texcoco','4','Chalco','25','Chalco')," +
                        "(71,'15','México','75','Texcoco','4','Chalco','122','Valle de Chalco Solidaridad')," +
                        "(72,'15','México','75','Texcoco','5','Amecameca','9','Amecameca')," +
                        "(73,'15','México','75','Texcoco','5','Amecameca','17','Ayapango')," +
                        "(74,'15','México','75','Texcoco','5','Amecameca','103','Tlalmanalco')," +
                        "(75,'15','México','75','Texcoco','6','Juchitepec','50','Juchitepec')," +
                        "(76,'15','México','75','Texcoco','6','Juchitepec','83','Temamatla')," +
                        "(77,'15','México','75','Texcoco','6','Juchitepec','89','Tenango del Aire')," +
                        "(78,'15','México','75','Texcoco','7','Atlautla','15','Atlautla')," +
                        "(79,'15','México','75','Texcoco','7','Atlautla','34','Ecatzingo')," +
                        "(80,'15','México','75','Texcoco','7','Atlautla','68','Ozumba')," +
                        "(81,'15','México','75','Texcoco','7','Atlautla','94','Tepetlixpa')," +
                        "(82,'15','México','76','Tejupilco','1','Luvianos','123','Luvianos')," +
                        "(83,'15','México','76','Tejupilco','2','Temascaltepec','77','San Simón de Guerrero')," +
                        "(84,'15','México','76','Tejupilco','2','Temascaltepec','86','Temascaltepec')," +
                        "(85,'15','México','76','Tejupilco','3','Tejupilco','82','Tejupilco')," +
                        "(86,'15','México','76','Tejupilco','4','Amatepec','8','Amatepec')," +
                        "(87,'15','México','76','Tejupilco','5','Palmar Chico','8','Amatepec')," +
                        "(88,'15','México','76','Tejupilco','6','Tlatlaya','105','Tlatlaya')," +
                        "(89,'15','México','76','Tejupilco','7','San Antonio del Rosario','105','Tlatlaya')," +
                        "(90,'15','México','77','Atlacomulco','1','San Felipe del Progreso','74','San Felipe del Progreso')," +
                        "(91,'15','México','77','Atlacomulco','2','La Trinidad','124','San José del Rincón')," +
                        "(92,'15','México','77','Atlacomulco','3','Atlacomulco','14','Atlacomulco')," +
                        "(93,'15','México','77','Atlacomulco','4','Ixtlahuaca','42','Ixtlahuaca')," +
                        "(94,'15','México','77','Atlacomulco','5','Temascalcingo','85','Temascalcingo')," +
                        "(95,'15','México','77','Atlacomulco','6','Oro El','64','El Oro')," +
                        "(96,'15','México','77','Atlacomulco','7','San Bartolo Morelos','56','Morelos')," +
                        "(97,'15','México','77','Atlacomulco','8','Acambay','1','Acambay de Ruíz Castañeda')," +
                        "(98,'15','México','77','Atlacomulco','9','Jocotitlán','48','Jocotitlán')," +
                        "(99,'15','México','77','Atlacomulco','10','Jiquipilco','47','Jiquipilco')," +
                        "(100,'15','México','78','Coatepec Harinas','1','Texcaltitlán','97','Texcaltitlán')," +
                        "(101,'15','México','78','Coatepec Harinas','2','Tenancingo','88','Tenancingo')," +
                        "(102,'15','México','78','Coatepec Harinas','2','Tenancingo','119','Zumpahuacán')," +
                        "(103,'15','México','78','Coatepec Harinas','3','Coatepec Harinas','21','Coatepec Harinas')," +
                        "(104,'15','México','78','Coatepec Harinas','4','Ocuilan','63','Ocuilan')," +
                        "(105,'15','México','78','Coatepec Harinas','5','Sultepec','80','Sultepec')," +
                        "(106,'15','México','78','Coatepec Harinas','6','Zacualpan','117','Zacualpan')," +
                        "(107,'15','México','78','Coatepec Harinas','7','Malinalco','52','Malinalco')," +
                        "(108,'15','México','78','Coatepec Harinas','8','Almoloya de Alquisiras','4','Almoloya de Alquisiras')," +
                        "(109,'15','México','78','Coatepec Harinas','9','Villa Guerrero','113','Villa Guerrero')," +
                        "(110,'15','México','78','Coatepec Harinas','10','Tonatico','40','Ixtapan de La Sal')," +
                        "(111,'15','México','78','Coatepec Harinas','10','Tonatico','107','Tonatico')," +
                        "(112,'15','México','79','Valle de Bravo','1','Valle de Bravo','110','Valle de Bravo')," +
                        "(113,'15','México','79','Valle de Bravo','2','Villa Victoria','114','Villa Victoria')," +
                        "(114,'15','México','79','Valle de Bravo','3','Villa de Allende','111','Villa de Allende')," +
                        "(115,'15','México','79','Valle de Bravo','4','Otzoloapan','66','Otzoloapan')," +
                        "(116,'15','México','79','Valle de Bravo','4','Otzoloapan','78','Santo Tomás')," +
                        "(117,'15','México','79','Valle de Bravo','4','Otzoloapan','116','Zacazonapan')," +
                        "(118,'15','México','79','Valle de Bravo','5','Amanalco','7','Amanalco')," +
                        "(119,'15','México','79','Valle de Bravo','6','Donato Guerra','32','Donato Guerra')," +
                        "(120,'15','México','79','Valle de Bravo','6','Donato Guerra','41','Ixtapan del Oro')," +
                        "(121,'15','México','80','Jilotepec','1','Chapa de Mota','26','Chapa de Mota')," +
                        "(122,'15','México','80','Jilotepec','1','Chapa de Mota','102','Timilpan')," +
                        "(123,'15','México','80','Jilotepec','1','Chapa de Mota','112','Villa del Carbón')," +
                        "(124,'15','México','80','Jilotepec','2','Jilotepec','45','Jilotepec')," +
                        "(125,'15','México','80','Jilotepec','2','Jilotepec','79','Soyaniquilpan de Juárez')," +
                        "(126,'15','México','80','Jilotepec','3','Arroyozarco','3','Aculco')," +
                        "(127,'15','México','80','Jilotepec','3','Arroyozarco','71','Polotitlán')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_MICHOACAN + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_MICHOACAN + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'16','Michoacán','81','Coahuayana','1','Aquila','8','Aquila')," +
                        "(2,'16','Michoacán','81','Coahuayana','2','Coahuayana','14','Coahuayana')," +
                        "(3,'16','Michoacán','81','Coahuayana','3','Chinicuila','26','Chinicuila')," +
                        "(4,'16','Michoacán','82','Aguililla','1','Aguililla','2','Aguililla')," +
                        "(5,'16','Michoacán','82','Aguililla','2','Coalcomán','15','Coalcomán de Vázquez Pallares')," +
                        "(6,'16','Michoacán','83','Lázaro Cárdenas','1','Lázaro Cárdenas','52','Lázaro Cárdenas')," +
                        "(7,'16','Michoacán','83','Lázaro Cárdenas','2','Arteaga','10','Arteaga')," +
                        "(8,'16','Michoacán','84','Huacana','1','Zicuirán','35','La Huacana')," +
                        "(9,'16','Michoacán','84','Huacana','2','Churumuco','29','Churumuco')," +
                        "(10,'16','Michoacán','84','Huacana','3','Las Cruces','96','Tumbiscatío')," +
                        "(11,'16','Michoacán','85','Apatzingán','1','Apatzingán','6','Apatzingán')," +
                        "(12,'16','Michoacán','85','Apatzingán','2','Tepalcatepec','89','Tepalcatepec')," +
                        "(13,'16','Michoacán','85','Apatzingán','3','Buenavista','12','Buenavista')," +
                        "(14,'16','Michoacán','85','Apatzingán','4','Cuatro Caminos','55','Múgica')," +
                        "(15,'16','Michoacán','85','Apatzingán','4','Cuatro Caminos','64','Parácuaro')," +
                        "(16,'16','Michoacán','85','Apatzingán','5','Gabriel Zamora','33','Gabriel Zamora')," +
                        "(17,'16','Michoacán','85','Apatzingán','5','Gabriel Zamora','59','Nuevo Urecho')," +
                        "(18,'16','Michoacán','86','Uruapan','1','Parangaricutiro','58','Nuevo Parangaricutiro')," +
                        "(19,'16','Michoacán','86','Uruapan','1','Parangaricutiro','83','Tancítaro')," +
                        "(20,'16','Michoacán','86','Uruapan','1','Parangaricutiro','102','Uruapan')," +
                        "(21,'16','Michoacán','86','Uruapan','2','Ziracuaretiro','87','Taretan')," +
                        "(22,'16','Michoacán','86','Uruapan','2','Ziracuaretiro','90','Tingambato')," +
                        "(23,'16','Michoacán','86','Uruapan','2','Ziracuaretiro','111','Ziracuaretiro')," +
                        "(24,'16','Michoacán','86','Uruapan','3','Paracho','21','Charapan')," +
                        "(25,'16','Michoacán','86','Uruapan','3','Paracho','24','Cherán')," +
                        "(26,'16','Michoacán','86','Uruapan','3','Paracho','56','Nahuatzen')," +
                        "(27,'16','Michoacán','86','Uruapan','3','Paracho','65','Paracho')," +
                        "(28,'16','Michoacán','87','Zamora','1','Zamora','23','Chavinda')," +
                        "(29,'16','Michoacán','87','Zamora','1','Zamora','30','Ecuandureo')," +
                        "(30,'16','Michoacán','87','Zamora','1','Zamora','42','Ixtlán')," +
                        "(31,'16','Michoacán','87','Zamora','1','Zamora','43','Jacona')," +
                        "(32,'16','Michoacán','87','Zamora','1','Zamora','84','Tangamandapio')," +
                        "(33,'16','Michoacán','87','Zamora','1','Zamora','108','Zamora')," +
                        "(34,'16','Michoacán','87','Zamora','2','Tangancícuaro','25','Chilchota')," +
                        "(35,'16','Michoacán','87','Zamora','2','Tangancícuaro','70','Purépero')," +
                        "(36,'16','Michoacán','87','Zamora','2','Tangancícuaro','85','Tangancícuaro')," +
                        "(37,'16','Michoacán','87','Zamora','2','Tangancícuaro','94','Tlazazalca')," +
                        "(38,'16','Michoacán','87','Zamora','3','Reyes Los','68','Peribán')," +
                        "(39,'16','Michoacán','87','Zamora','3','Reyes Los','75','Los Reyes')," +
                        "(40,'16','Michoacán','87','Zamora','4','Cotija','19','Cotija')," +
                        "(41,'16','Michoacán','87','Zamora','4','Cotija','91','Tingüindín')," +
                        "(42,'16','Michoacán','87','Zamora','4','Cotija','95','Tocumbo')," +
                        "(43,'16','Michoacán','88','Sahuayo','1','Venustiano Carranza','11','Briseñas')," +
                        "(44,'16','Michoacán','88','Sahuayo','1','Venustiano Carranza','62','Pajacuarán')," +
                        "(45,'16','Michoacán','88','Sahuayo','1','Venustiano Carranza','74','Cojumatlán de Régules')," +
                        "(46,'16','Michoacán','88','Sahuayo','1','Venustiano Carranza','76','Sahuayo')," +
                        "(47,'16','Michoacán','88','Sahuayo','1','Venustiano Carranza','103','Venustiano Carranza')," +
                        "(48,'16','Michoacán','88','Sahuayo','1','Venustiano Carranza','105','Vista Hermosa')," +
                        "(49,'16','Michoacán','88','Sahuayo','2','Jiquilpan','45','Jiquilpan')," +
                        "(50,'16','Michoacán','88','Sahuayo','2','Jiquilpan','51','Marcos Castellanos')," +
                        "(51,'16','Michoacán','88','Sahuayo','2','Jiquilpan','104','Villamar')," +
                        "(52,'16','Michoacán','89','La Piedad','1','Vista Hermosa','86','Tanhuato')," +
                        "(53,'16','Michoacán','89','La Piedad','1','Vista Hermosa','105','Vista Hermosa')," +
                        "(54,'16','Michoacán','89','La Piedad','1','Vista Hermosa','106','Yurécuaro')," +
                        "(55,'16','Michoacán','89','La Piedad','2','Numarán','28','Churintzio')," +
                        "(56,'16','Michoacán','89','La Piedad','2','Numarán','60','Numarán')," +
                        "(57,'16','Michoacán','89','La Piedad','2','Numarán','67','Penjamillo')," +
                        "(58,'16','Michoacán','89','La Piedad','2','Numarán','69','La Piedad')," +
                        "(59,'16','Michoacán','89','La Piedad','2','Numarán','109','Zináparo')," +
                        "(60,'16','Michoacán','89','La Piedad','3','Zacapu','16','Coeneo')," +
                        "(61,'16','Michoacán','89','La Piedad','3','Zacapu','37','Huaniqueo')," +
                        "(62,'16','Michoacán','89','La Piedad','3','Zacapu','44','Jiménez')," +
                        "(63,'16','Michoacán','89','La Piedad','3','Zacapu','63','Panindícuaro')," +
                        "(64,'16','Michoacán','89','La Piedad','3','Zacapu','107','Zacapu')," +
                        "(65,'16','Michoacán','89','La Piedad','4','Sixto Verduzco','4','Angamacutiro')," +
                        "(66,'16','Michoacán','89','La Piedad','4','Sixto Verduzco','54','Morelos')," +
                        "(67,'16','Michoacán','89','La Piedad','4','Sixto Verduzco','71','Puruándiro')," +
                        "(68,'16','Michoacán','89','La Piedad','4','Sixto Verduzco','113','José Sixto Verduzco')," +
                        "(69,'16','Michoacán','90','Pátzcuaro','1','Quiroga','32','Erongarícuaro')," +
                        "(70,'16','Michoacán','90','Pátzcuaro','1','Quiroga','39','Huiramba')," +
                        "(71,'16','Michoacán','90','Pátzcuaro','1','Quiroga','48','Lagunillas')," +
                        "(72,'16','Michoacán','90','Pátzcuaro','1','Quiroga','66','Pátzcuaro')," +
                        "(73,'16','Michoacán','90','Pátzcuaro','1','Quiroga','73','Quiroga')," +
                        "(74,'16','Michoacán','90','Pátzcuaro','1','Quiroga','100','Tzintzuntzan')," +
                        "(75,'16','Michoacán','90','Pátzcuaro','2','Villa Escalante','9','Ario')," +
                        "(76,'16','Michoacán','90','Pátzcuaro','2','Villa Escalante','79','Salvador Escalante')," +
                        "(77,'16','Michoacán','90','Pátzcuaro','3','Tacámbaro','82','Tacámbaro')," +
                        "(78,'16','Michoacán','90','Pátzcuaro','4','Turicato','97','Turicato')," +
                        "(79,'16','Michoacán','91','Morelia','1','Morelia','1','Acuitzio')," +
                        "(80,'16','Michoacán','91','Morelia','1','Morelia','49','Madero')," +
                        "(81,'16','Michoacán','91','Morelia','1','Morelia','53','Morelia')," +
                        "(82,'16','Michoacán','91','Morelia','2','Cuitzeo','18','Copándaro')," +
                        "(83,'16','Michoacán','91','Morelia','2','Cuitzeo','20','Cuitzeo')," +
                        "(84,'16','Michoacán','91','Morelia','2','Cuitzeo','27','Chucándiro')," +
                        "(85,'16','Michoacán','91','Morelia','2','Cuitzeo','36','Huandacareo')," +
                        "(86,'16','Michoacán','91','Morelia','2','Cuitzeo','78','Santa Ana Maya')," +
                        "(87,'16','Michoacán','91','Morelia','3','Álvaro Obregón','3','Álvaro Obregón')," +
                        "(88,'16','Michoacán','91','Morelia','3','Álvaro Obregón','22','Charo')," +
                        "(89,'16','Michoacán','91','Morelia','3','Álvaro Obregón','40','Indaparapeo')," +
                        "(90,'16','Michoacán','91','Morelia','3','Álvaro Obregón','88','Tarímbaro')," +
                        "(91,'16','Michoacán','91','Morelia','4','Queréndaro','72','Queréndaro')," +
                        "(92,'16','Michoacán','91','Morelia','4','Queréndaro','110','Zinapécuaro')," +
                        "(93,'16','Michoacán','91','Morelia','5','Tzitzio','101','Tzitzio')," +
                        "(94,'16','Michoacán','92','Huetamo','1','Purechucho','38','Huetamo')," +
                        "(95,'16','Michoacán','92','Huetamo','1','Purechucho','92','Tiquicheo de Nicolás Romero')," +
                        "(96,'16','Michoacán','92','Huetamo','2','San Lucas','77','San Lucas')," +
                        "(97,'16','Michoacán','92','Huetamo','3','Carácuaro','13','Carácuaro')," +
                        "(98,'16','Michoacán','92','Huetamo','3','Carácuaro','57','Nocupétaro')," +
                        "(99,'16','Michoacán','92','Huetamo','4','Tuzantla','99','Tuzantla')," +
                        "(100,'16','Michoacán','93','Zitácuaro','1','Contepec','17','Contepec')," +
                        "(101,'16','Michoacán','93','Zitácuaro','1','Contepec','31','Epitacio Huerta')," +
                        "(102,'16','Michoacán','93','Zitácuaro','2','Maravatío','50','Maravatío')," +
                        "(103,'16','Michoacán','93','Zitácuaro','2','Maravatío','80','Senguio')," +
                        "(104,'16','Michoacán','93','Zitácuaro','2','Maravatío','93','Tlalpujahua')," +
                        "(105,'16','Michoacán','93','Zitácuaro','3','Ciudad Hidalgo','7','Aporo')," +
                        "(106,'16','Michoacán','93','Zitácuaro','3','Ciudad Hidalgo','34','Hidalgo')," +
                        "(107,'16','Michoacán','93','Zitácuaro','3','Ciudad Hidalgo','41','Irimbo')," +
                        "(108,'16','Michoacán','93','Zitácuaro','3','Ciudad Hidalgo','47','Jungapeo')," +
                        "(109,'16','Michoacán','93','Zitácuaro','3','Ciudad Hidalgo','98','Tuxpan')," +
                        "(110,'16','Michoacán','93','Zitácuaro','4','Zitácuaro','5','Angangueo')," +
                        "(111,'16','Michoacán','93','Zitácuaro','4','Zitácuaro','46','Juárez')," +
                        "(112,'16','Michoacán','93','Zitácuaro','4','Zitácuaro','61','Ocampo')," +
                        "(113,'16','Michoacán','93','Zitácuaro','4','Zitácuaro','81','Susupuato')," +
                        "(114,'16','Michoacán','93','Zitácuaro','4','Zitácuaro','112','Zitácuaro')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_MORELOS + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_MORELOS + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'17','Morelos','94','Zacatepec-Galeana','1','Galeana','1','Amacuzac')," +
                        "(2,'17','Morelos','94','Zacatepec-Galeana','1','Galeana','12','Jojutla')," +
                        "(3,'17','Morelos','94','Zacatepec-Galeana','1','Galeana','17','Puente de Ixtla')," +
                        "(4,'17','Morelos','94','Zacatepec-Galeana','1','Galeana','24','Tlaltizapán de Zapata')," +
                        "(5,'17','Morelos','94','Zacatepec-Galeana','1','Galeana','25','Tlaquiltenango')," +
                        "(6,'17','Morelos','94','Zacatepec-Galeana','1','Galeana','31','Zacatepec')," +
                        "(7,'17','Morelos','94','Zacatepec-Galeana','1','Galeana','35','Xoxocotla')," +
                        "(8,'17','Morelos','94','Zacatepec-Galeana','2','Alpuyeca','5','Coatlán del Río')," +
                        "(9,'17','Morelos','94','Zacatepec-Galeana','2','Alpuyeca','8','Emiliano Zapata')," +
                        "(10,'17','Morelos','94','Zacatepec-Galeana','2','Alpuyeca','14','Mazatepec')," +
                        "(11,'17','Morelos','94','Zacatepec-Galeana','2','Alpuyeca','15','Miacatlán')," +
                        "(12,'17','Morelos','94','Zacatepec-Galeana','2','Alpuyeca','18','Temixco')," +
                        "(13,'17','Morelos','94','Zacatepec-Galeana','2','Alpuyeca','21','Tetecala')," +
                        "(14,'17','Morelos','94','Zacatepec-Galeana','2','Alpuyeca','28','Xochitepec')," +
                        "(15,'17','Morelos','94','Zacatepec-Galeana','2','Alpuyeca','34','Coatetelco')," +
                        "(16,'17','Morelos','94','Zacatepec-Galeana','3','Cuernavaca','7','Cuernavaca')," +
                        "(17,'17','Morelos','94','Zacatepec-Galeana','3','Cuernavaca','11','Jiutepec')," +
                        "(18,'17','Morelos','94','Zacatepec-Galeana','4','Yautepec','2','Atlatlahucan')," +
                        "(19,'17','Morelos','94','Zacatepec-Galeana','4','Yautepec','9','Huitzilac')," +
                        "(20,'17','Morelos','94','Zacatepec-Galeana','4','Yautepec','20','Tepoztlán')," +
                        "(21,'17','Morelos','94','Zacatepec-Galeana','4','Yautepec','23','Tlalnepantla')," +
                        "(22,'17','Morelos','94','Zacatepec-Galeana','4','Yautepec','26','Tlayacapan')," +
                        "(23,'17','Morelos','94','Zacatepec-Galeana','4','Yautepec','27','Totolapan')," +
                        "(24,'17','Morelos','94','Zacatepec-Galeana','4','Yautepec','29','Yautepec')," +
                        "(25,'17','Morelos','94','Zacatepec-Galeana','5','Tetela del Volcán/Yecapixtla','16','Ocuituco')," +
                        "(26,'17','Morelos','94','Zacatepec-Galeana','5','Tetela del Volcán/Yecapixtla','22','Tetela del Volcán')," +
                        "(27,'17','Morelos','94','Zacatepec-Galeana','5','Tetela del Volcán/Yecapixtla','30','Yecapixtla')," +
                        "(28,'17','Morelos','94','Zacatepec-Galeana','5','Tetela del Volcán/Yecapixtla','32','Zacualpan')," +
                        "(29,'17','Morelos','94','Zacatepec-Galeana','5','Tetela del Volcán/Yecapixtla','33','Temoac')," +
                        "(30,'17','Morelos','94','Zacatepec-Galeana','5','Tetela del Volcán/Yecapixtla','36','Hueyapan')," +
                        "(31,'17','Morelos','94','Zacatepec-Galeana','6','Cuautla','3','Axochiapan')," +
                        "(32,'17','Morelos','94','Zacatepec-Galeana','6','Cuautla','4','Ayala')," +
                        "(33,'17','Morelos','94','Zacatepec-Galeana','6','Cuautla','6','Cuautla')," +
                        "(34,'17','Morelos','94','Zacatepec-Galeana','6','Cuautla','10','Jantetelco')," +
                        "(35,'17','Morelos','94','Zacatepec-Galeana','6','Cuautla','13','Jonacatepec')," +
                        "(36,'17','Morelos','94','Zacatepec-Galeana','6','Cuautla','19','Tepalcingo')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAYARIT + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_NAYARIT + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'18','Nayarit','95','Santiago Ixcuintla','1','Tuxpan','10','Rosamorada')," +
                        "(2,'18','Nayarit','95','Santiago Ixcuintla','1','Tuxpan','11','Ruíz')," +
                        "(3,'18','Nayarit','95','Santiago Ixcuintla','1','Tuxpan','18','Tuxpan')," +
                        "(4,'18','Nayarit','95','Santiago Ixcuintla','2','Tizate','15','Santiago Ixcuintla')," +
                        "(5,'18','Nayarit','96','Compostela','1','Peñita de Jaltemba/Las Varas','4','Compostela')," +
                        "(6,'18','Nayarit','96','Compostela','1','Peñita de Jaltemba/Las Varas','13','San Pedro Lagunillas')," +
                        "(7,'18','Nayarit','96','Compostela','2','San Juan de Abajo','20','Bahía de Banderas')," +
                        "(8,'18','Nayarit','97','Ahuacatlán','1','Ahuacatlán','2','Ahuacatlán')," +
                        "(9,'18','Nayarit','97','Ahuacatlán','1','Ahuacatlán','3','Amatlán de Cañas')," +
                        "(10,'18','Nayarit','97','Ahuacatlán','1','Ahuacatlán','6','Ixtlán del Río')," +
                        "(11,'18','Nayarit','97','Ahuacatlán','1','Ahuacatlán','7','Jala')," +
                        "(12,'18','Nayarit','97','Ahuacatlán','2','Santa María del Oro','14','Santa María del Oro')," +
                        "(13,'18','Nayarit','97','Ahuacatlán','2','Santa María del Oro','19','La Yesca')," +
                        "(14,'18','Nayarit','98','Acaponeta','1','Acaponeta','1','Acaponeta')," +
                        "(15,'18','Nayarit','98','Acaponeta','1','Acaponeta','5','Huajicori')," +
                        "(16,'18','Nayarit','98','Acaponeta','2','Tecuala','16','Tecuala')," +
                        "(17,'18','Nayarit','99','Tepic','1','San Blas','8','Xalisco')," +
                        "(18,'18','Nayarit','99','Tepic','1','San Blas','9','Del Nayar')," +
                        "(19,'18','Nayarit','99','Tepic','1','San Blas','12','San Blas')," +
                        "(20,'18','Nayarit','99','Tepic','1','San Blas','17','Tepic')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NL + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_NL + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'19','Nuevo León','100','Anáhuac','1','Anahuac','5','Anáhuac')," +
                        "(2,'19','Nuevo León','100','Anáhuac','2','Lampazos de Naranjo','32','Lampazos de Naranjo')," +
                        "(3,'19','Nuevo León','100','Anáhuac','3','Sabinas Hidalgo','8','Bustamante')," +
                        "(4,'19','Nuevo León','100','Anáhuac','3','Sabinas Hidalgo','44','Sabinas Hidalgo')," +
                        "(5,'19','Nuevo León','100','Anáhuac','3','Sabinas Hidalgo','51','Villaldama')," +
                        "(6,'19','Nuevo León','100','Anáhuac','4','Vallecillo','40','Parás')," +
                        "(7,'19','Nuevo León','100','Anáhuac','4','Vallecillo','50','Vallecillo')," +
                        "(8,'19','Nuevo León','101','Apodaca','3','Cerralvo','2','Agualeguas')," +
                        "(9,'19','Nuevo León','101','Apodaca','3','Cerralvo','11','Cerralvo')," +
                        "(10,'19','Nuevo León','101','Apodaca','3','Cerralvo','23','General Treviño')," +
                        "(11,'19','Nuevo León','101','Apodaca','3','Cerralvo','35','Melchor Ocampo')," +
                        "(12,'19','Nuevo León','101','Apodaca','4','Salinas Victoria','1','Abasolo')," +
                        "(13,'19','Nuevo León','101','Apodaca','4','Salinas Victoria','10','El Carmen')," +
                        "(14,'19','Nuevo León','101','Apodaca','4','Salinas Victoria','12','Ciénega de Flores')," +
                        "(15,'19','Nuevo León','101','Apodaca','4','Salinas Victoria','18','García')," +
                        "(16,'19','Nuevo León','101','Apodaca','4','Salinas Victoria','37','Mina')," +
                        "(17,'19','Nuevo León','101','Apodaca','4','Salinas Victoria','45','Salinas Victoria')," +
                        "(18,'19','Nuevo León','101','Apodaca','4','Salinas Victoria','47','Hidalgo')," +
                        "(19,'19','Nuevo León','101','Apodaca','5','Apodaca','6','Apodaca')," +
                        "(20,'19','Nuevo León','101','Apodaca','5','Apodaca','18','García')," +
                        "(21,'19','Nuevo León','101','Apodaca','5','Apodaca','19','San Pedro Garza García')," +
                        "(22,'19','Nuevo León','101','Apodaca','5','Apodaca','21','General Escobedo')," +
                        "(23,'19','Nuevo León','101','Apodaca','5','Apodaca','26','Guadalupe')," +
                        "(24,'19','Nuevo León','101','Apodaca','5','Apodaca','39','Monterrey')," +
                        "(25,'19','Nuevo León','101','Apodaca','5','Apodaca','41','Pesquería')," +
                        "(26,'19','Nuevo León','101','Apodaca','5','Apodaca','46','San Nicolás de los Garza')," +
                        "(27,'19','Nuevo León','101','Apodaca','5','Apodaca','48','Santa Catarina')," +
                        "(28,'19','Nuevo León','101','Apodaca','6','Pesquería','16','Doctor González')," +
                        "(29,'19','Nuevo León','101','Apodaca','6','Pesquería','25','General Zuazua')," +
                        "(30,'19','Nuevo León','101','Apodaca','6','Pesquería','28','Higueras')," +
                        "(31,'19','Nuevo León','101','Apodaca','6','Pesquería','34','Marín')," +
                        "(32,'19','Nuevo León','101','Apodaca','6','Pesquería','41','Pesquería')," +
                        "(33,'19','Nuevo León','101','Apodaca','7','China','13','China')," +
                        "(34,'19','Nuevo León','101','Apodaca','7','China','27','Los Herreras')," +
                        "(35,'19','Nuevo León','101','Apodaca','7','China','42','Los Ramones')," +
                        "(36,'19','Nuevo León','101','Apodaca','8','General Bravo','3','Los Aldamas')," +
                        "(37,'19','Nuevo León','101','Apodaca','8','General Bravo','15','Doctor Coss')," +
                        "(38,'19','Nuevo León','101','Apodaca','8','General Bravo','20','General Bravo')," +
                        "(39,'19','Nuevo León','102','Montemorelos','1','Montemorelos','4','Allende')," +
                        "(40,'19','Nuevo León','102','Montemorelos','1','Montemorelos','22','General Terán')," +
                        "(41,'19','Nuevo León','102','Montemorelos','1','Montemorelos','38','Montemorelos')," +
                        "(42,'19','Nuevo León','102','Montemorelos','1','Montemorelos','43','Rayones')," +
                        "(43,'19','Nuevo León','102','Montemorelos','2','Linares','29','Hualahuises')," +
                        "(44,'19','Nuevo León','102','Montemorelos','2','Linares','30','Iturbide')," +
                        "(45,'19','Nuevo León','102','Montemorelos','2','Linares','33','Linares')," +
                        "(46,'19','Nuevo León','102','Montemorelos','3','General Terán','13','China')," +
                        "(47,'19','Nuevo León','102','Montemorelos','3','General Terán','22','General Terán')," +
                        "(48,'19','Nuevo León','102','Montemorelos','3','General Terán','42','Los Ramones')," +
                        "(49,'19','Nuevo León','102','Montemorelos','4','Cadereyta Jiménez','9','Cadereyta Jiménez')," +
                        "(50,'19','Nuevo León','102','Montemorelos','4','Cadereyta Jiménez','31','Juárez')," +
                        "(51,'19','Nuevo León','102','Montemorelos','5','Santiago','38','Montemorelos')," +
                        "(52,'19','Nuevo León','102','Montemorelos','5','Santiago','49','Santiago')," +
                        "(53,'19','Nuevo León','103','Galeana','1','Galeana','17','Galeana')," +
                        "(54,'19','Nuevo León','103','Galeana','2','San Rafael','17','Galeana')," +
                        "(55,'19','Nuevo León','103','Galeana','3','El Potosí','17','Galeana')," +
                        "(56,'19','Nuevo León','103','Galeana','4','Aramberri','7','Aramberri')," +
                        "(57,'19','Nuevo León','103','Galeana','4','Aramberri','24','General Zaragoza')," +
                        "(58,'19','Nuevo León','103','Galeana','5','Doctor Arroyo','14','Doctor Arroyo')," +
                        "(59,'19','Nuevo León','103','Galeana','5','Doctor Arroyo','36','Mier Y Noriega')," +
                        "(60,'19','Nuevo León','103','Galeana','6','Santa Ana','14','Doctor Arroyo')");
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_OAXACA + "(" +
                "id INTEGER PRIMARY KEY NOT NULL," +
                "Iddelegacion TEXT NOT NULL," +
                "Nomdelegacion TEXT NOT NULL," +
                "Idddr TEXT NOT NULL," +
                "Nomddr TEXT NOT NULL," +
                "Idcader TEXT NOT NULL," +
                "Nomcader TEXT NOT NULL," +
                "Idmunicipio TEXT NOT NULL," +
                "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_OAXACA + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','4','Asunción Cuyotepeji')," +
                "(2,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','11','Calihualá')," +
                "(3,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','16','Coicoyán de Las Flores')," +
                "(4,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','22','Cosoltepec')," +
                "(5,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','32','Fresnillo de Trujano')," +
                "(6,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','34','Guadalupe de Ramírez')," +
                "(7,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','39','Heroica Ciudad de Huajuapan de León')," +
                "(8,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','55','Mariscala de Juárez')," +
                "(9,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','65','Ixpantepec Nieves')," +
                "(10,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','81','San Agustín Atenango')," +
                "(11,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','89','San Andrés Dinicuiti')," +
                "(12,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','99','San Andrés Tepetlapa')," +
                "(13,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','152','San Francisco Tlapancingo')," +
                "(14,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','160','San Jerónimo Silacayoapilla')," +
                "(15,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','164','San Jorge Nuchita')," +
                "(16,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','165','San José Ayuquila')," +
                "(17,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','181','San Juan Bautista Suchitepec')," +
                "(18,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','183','San Juan Bautista Tlachichilco')," +
                "(19,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','186','San Juan Cieneguilla')," +
                "(20,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','199','San Juan Ihualtepec')," +
                "(21,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','230','San Lorenzo Victoria')," +
                "(22,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','237','San Marcos Arteaga')," +
                "(23,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','242','San Martín Peras')," +
                "(24,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','245','San Martín Zacatepec')," +
                "(25,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','251','San Mateo Nejápam')," +
                "(26,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','259','San Miguel Ahuehuetitlán')," +
                "(27,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','261','San Miguel Amatitlán')," +
                "(28,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','286','San Miguel Tlacotepec')," +
                "(29,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','290','San Nicolás Hidalgo')," +
                "(30,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','340','San Pedro Y San Pablo Tequixtepec')," +
                "(31,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','348','San Sebastián Tecomaxtlahuaca')," +
                "(32,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','352','San Simón Zahuatlán')," +
                "(33,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','373','Santa Catarina Zapoquila')," +
                "(34,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','376','Santa Cruz de Bravo')," +
                "(35,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','381','Santa Cruz Tacache de Mina')," +
                "(36,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','400','Santa María Camotlán')," +
                "(37,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','455','Santiago Ayuquililla')," +
                "(38,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','456','Santiago Cacaloxtepec')," +
                "(39,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','459','Santiago Chazumba')," +
                "(40,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','461','Santiago del Río')," +
                "(41,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','462','Santiago Huajolotitlán')," +
                "(42,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','469','Santiago Juxtlahuaca')," +
                "(43,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','476','Santiago Miltepec')," +
                "(44,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','484','Santiago Tamazola')," +
                "(45,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','501','Santiago Yucuyachi')," +
                "(46,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','520','Santo Domingo Tonalá')," +
                "(47,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','524','Santo Domingo Yodohino')," +
                "(48,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','528','Santos Reyes Tepejillo')," +
                "(49,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','529','Santos Reyes Yucuná')," +
                "(50,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','537','Silacayoápam')," +
                "(51,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','549','H. V. Tezoatlán de Segura y Luna, C. de la I.de O.')," +
                "(52,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','567','Zapotitlán Lagunas')," +
                "(53,'20','Oaxaca','104','Huajuapan de León','1','Huajuapan','568','Zapotitlán Palmas')," +
                "(54,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','18','Concepción Buenavista')," +
                "(55,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','47','Santa Magdalena Jicotlán')," +
                "(56,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','93','San Andrés Lagunas')," +
                "(57,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','105','San Antonino Monte Verde')," +
                "(58,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','106','San Antonio Acutla')," +
                "(59,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','121','San Bartolo Soyaltepec')," +
                "(60,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','129','San Cristóbal Suchixtlahuaca')," +
                "(61,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','151','San Francisco Teopan')," +
                "(62,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','176','San Juan Bautista Coixtlahuaca')," +
                "(63,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','221','San Juan Teposcolula')," +
                "(64,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','256','San Mateo Tlapiltepec')," +
                "(65,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','283','San Miguel Tequixtepec')," +
                "(66,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','287','San Miguel Tulancingo')," +
                "(67,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','321','San Pedro Nopala')," +
                "(68,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','332','San Pedro Topiltepec')," +
                "(69,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','339','San Pedro Y San Pablo Teposcolula')," +
                "(70,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','341','San Pedro Yucunama')," +
                "(71,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','346','San Sebastián Nicananduta')," +
                "(72,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','405','Villa de Chilapa de Díaz')," +
                "(73,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','422','Santa María Nativitas')," +
                "(74,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','423','Santa María Nduayaco')," +
                "(75,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','464','Santiago Ihuitlán Plumas')," +
                "(76,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','479','Santiago Nejapilla')," +
                "(77,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','486','Villa Tejúpam de La Unión')," +
                "(78,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','488','Santiago Tepetlapa')," +
                "(79,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','499','Santiago Yolomécatl')," +
                "(80,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','518','Santo Domingo Tlatayápam')," +
                "(81,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','521','Santo Domingo Tonaltepec')," +
                "(82,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','536','San Vicente Nuñú')," +
                "(83,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','540','Villa de Tamazulápam del Progreso')," +
                "(84,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','547','Teotongo')," +
                "(85,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','548','Tepelmeme Villa de Morelos')," +
                "(86,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','552','Tlacotepec Plumas')," +
                "(87,'20','Oaxaca','104','Huajuapan de León','2','Tamazulapan','556','La Trinidad Vista Hermosa')," +
                "(88,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','6','Asunción Nochixtlán')," +
                "(89,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','46','Magdalena Jaltepec')," +
                "(90,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','54','Magdalena Zahuatlán')," +
                "(91,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','94','San Andrés Nuxiño')," +
                "(92,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','96','San Andrés Sinaxtla')," +
                "(93,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','140','San Francisco Chindúa')," +
                "(94,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','144','San Francisco Jaltepetongo')," +
                "(95,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','147','San Francisco Nuxaño')," +
                "(96,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','195','San Juan Diuxi')," +
                "(97,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','215','San Juan Sayultepec')," +
                "(98,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','217','San Juan Tamazola')," +
                "(99,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','224','San Juan Yucuita')," +
                "(100,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','250','San Mateo Etlatongo')," +
                "(101,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','255','San Mateo Sindihui')," +
                "(102,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','264','San Miguel Chicahua')," +
                "(103,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','270','San Miguel Huautla')," +
                "(104,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','274','San Miguel Piedras')," +
                "(105,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','281','San Miguel Tecomatlán')," +
                "(106,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','304','San Pedro Coxcaltepec Cántaros')," +
                "(107,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','329','San Pedro Teozacoalco')," +
                "(108,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','331','San Pedro Tidaá')," +
                "(109,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','395','Santa María Apazco')," +
                "(110,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','404','Santa María Chachoápam')," +
                "(111,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','451','Santiago Apoala')," +
                "(112,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','463','Santiago Huauclilla')," +
                "(113,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','492','Santiago Tilantongo')," +
                "(114,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','493','Santiago Tillo')," +
                "(115,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','511','Santo Domingo Nuxaá')," +
                "(116,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','523','Santo Domingo Yanhuitlán')," +
                "(117,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','562','Magdalena Yodocono de Porfirio Díaz')," +
                "(118,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','564','Yutanduchi de Guerrero')," +
                "(119,'20','Oaxaca','104','Huajuapan de León','3','Nochixtlán','569','Santa Inés de Zaragoza')," +
                "(120,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','20','Constancia del Rosario')," +
                "(121,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','26','Chalcatongo de Hidalgo')," +
                "(122,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','37','Mesones Hidalgo')," +
                "(123,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','50','Magdalena Peñasco')," +
                "(124,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','73','Putla Villa de Guerrero')," +
                "(125,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','76','La Reforma')," +
                "(126,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','86','San Agustín Tlacotepec')," +
                "(127,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','88','San Andrés Cabecera Nueva')," +
                "(128,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','110','San Antonio Sinicahua')," +
                "(129,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','119','San Bartolomé Yucuañe')," +
                "(130,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','127','San Cristóbal Amoltepec')," +
                "(131,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','133','San Esteban Atatlahuca')," +
                "(132,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','172','San Juan Achiutla')," +
                "(133,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','208','San Juan Mixtepec')," +
                "(134,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','210','San Juan Ñumí')," +
                "(135,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','218','San Juan Teita')," +
                "(136,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','239','San Martín Huamelúlpam')," +
                "(137,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','240','San Martín Itunyoso')," +
                "(138,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','252','San Mateo Peñasco')," +
                "(139,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','258','San Miguel Achiutla')," +
                "(140,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','269','San Miguel El Grande')," +
                "(141,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','297','San Pablo Tijaltepec')," +
                "(142,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','300','San Pedro Amuzgos')," +
                "(143,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','317','San Pedro Mártir Yucuxaco')," +
                "(144,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','320','San Pedro Molinos')," +
                "(145,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','370','Santa Catarina Tayata')," +
                "(146,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','371','Santa Catarina Ticuá')," +
                "(147,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','372','Santa Catarina Yosonotú')," +
                "(148,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','377','Santa Cruz Itundujia')," +
                "(149,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','379','Santa Cruz Nundaco')," +
                "(150,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','382','Santa Cruz Tacahua')," +
                "(151,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','383','Santa Cruz Tayata')," +
                "(152,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','392','Santa Lucía Monteverde')," +
                "(153,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','397','Heroica Ciudad de Tlaxiaco')," +
                "(154,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','408','Santa María del Rosario')," +
                "(155,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','415','Santa María Ipalapa')," +
                "(156,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','430','Santa María Tataltepec')," +
                "(157,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','444','Santa María Yolotepec')," +
                "(158,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','445','Santa María Yosoyúa')," +
                "(159,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','446','Santa María Yucuhiti')," +
                "(160,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','447','Santa María Zacatepec')," +
                "(161,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','480','Santiago Nundiche')," +
                "(162,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','481','Santiago Nuyoó')," +
                "(163,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','500','Santiago Yosondúa')," +
                "(164,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','510','Santo Domingo Ixcatlán')," +
                "(165,'20','Oaxaca','104','Huajuapan de León','4','Tlaxiaco','532','Santo Tomás Ocotepec')," +
                "(166,'20','Oaxaca','105','Valles Centrales','1','Etla','7','Asunción Ocotlán')," +
                "(167,'20','Oaxaca','105','Valles Centrales','1','Etla','13','Ciénega de Zimatlán')," +
                "(168,'20','Oaxaca','105','Valles Centrales','1','Etla','23','Cuilápam de Guerrero')," +
                "(169,'20','Oaxaca','105','Valles Centrales','1','Etla','33','Guadalupe Etla')," +
                "(170,'20','Oaxaca','105','Valles Centrales','1','Etla','45','Magdalena Apasco')," +
                "(171,'20','Oaxaca','105','Valles Centrales','1','Etla','48','Magdalena Mixtepec')," +
                "(172,'20','Oaxaca','105','Valles Centrales','1','Etla','49','Magdalena Ocotlán')," +
                "(173,'20','Oaxaca','105','Valles Centrales','1','Etla','63','Nazareno Etla')," +
                "(174,'20','Oaxaca','105','Valles Centrales','1','Etla','67','Oaxaca de Juárez')," +
                "(175,'20','Oaxaca','105','Valles Centrales','1','Etla','68','Ocotlán de Morelos')," +
                "(176,'20','Oaxaca','105','Valles Centrales','1','Etla','72','San José del Progreso')," +
                "(177,'20','Oaxaca','105','Valles Centrales','1','Etla','77','Reyes Etla')," +
                "(178,'20','Oaxaca','105','Valles Centrales','1','Etla','83','San Agustín de Las Juntas')," +
                "(179,'20','Oaxaca','105','Valles Centrales','1','Etla','84','San Agustín Etla')," +
                "(180,'20','Oaxaca','105','Valles Centrales','1','Etla','87','San Agustín Yatareni')," +
                "(181,'20','Oaxaca','105','Valles Centrales','1','Etla','91','San Andrés Huayápam')," +
                "(182,'20','Oaxaca','105','Valles Centrales','1','Etla','92','San Andrés Ixtlahuaca')," +
                "(183,'20','Oaxaca','105','Valles Centrales','1','Etla','102','San Andrés Zautla')," +
                "(184,'20','Oaxaca','105','Valles Centrales','1','Etla','103','San Antonino Castillo Velasco')," +
                "(185,'20','Oaxaca','105','Valles Centrales','1','Etla','104','San Antonino El Alto')," +
                "(186,'20','Oaxaca','105','Valles Centrales','1','Etla','107','San Antonio de La Cal')," +
                "(187,'20','Oaxaca','105','Valles Centrales','1','Etla','108','San Antonio Huitepec')," +
                "(188,'20','Oaxaca','105','Valles Centrales','1','Etla','112','San Baltazar Chichicápam')," +
                "(189,'20','Oaxaca','105','Valles Centrales','1','Etla','115','San Bartolo Coyotepec')," +
                "(190,'20','Oaxaca','105','Valles Centrales','1','Etla','123','San Bernardo Mixtepec')," +
                "(191,'20','Oaxaca','105','Valles Centrales','1','Etla','132','San Dionisio Ocotlán')," +
                "(192,'20','Oaxaca','105','Valles Centrales','1','Etla','135','San Felipe Tejalápam')," +
                "(193,'20','Oaxaca','105','Valles Centrales','1','Etla','150','San Francisco Telixtlahuaca')," +
                "(194,'20','Oaxaca','105','Valles Centrales','1','Etla','157','San Jacinto Amilpas')," +
                "(195,'20','Oaxaca','105','Valles Centrales','1','Etla','161','San Jerónimo Sosola')," +
                "(196,'20','Oaxaca','105','Valles Centrales','1','Etla','162','San Jerónimo Taviche')," +
                "(197,'20','Oaxaca','105','Valles Centrales','1','Etla','174','Ánimas Trujano')," +
                "(198,'20','Oaxaca','105','Valles Centrales','1','Etla','175','San Juan Bautista Atatlahuca')," +
                "(199,'20','Oaxaca','105','Valles Centrales','1','Etla','178','San Juan Bautista Guelache')," +
                "(200,'20','Oaxaca','105','Valles Centrales','1','Etla','179','San Juan Bautista Jayacatlán')," +
                "(201,'20','Oaxaca','105','Valles Centrales','1','Etla','192','San Juan Chilateca')," +
                "(202,'20','Oaxaca','105','Valles Centrales','1','Etla','193','San Juan del Estado')," +
                "(203,'20','Oaxaca','105','Valles Centrales','1','Etla','227','San Lorenzo Cacaotepec')," +
                "(204,'20','Oaxaca','105','Valles Centrales','1','Etla','243','San Martín Tilcajete')," +
                "(205,'20','Oaxaca','105','Valles Centrales','1','Etla','271','San Miguel Mixtepec')," +
                "(206,'20','Oaxaca','105','Valles Centrales','1','Etla','273','San Miguel Peras')," +
                "(207,'20','Oaxaca','105','Valles Centrales','1','Etla','284','San Miguel Tilquiápam')," +
                "(208,'20','Oaxaca','105','Valles Centrales','1','Etla','292','San Pablo Cuatro Venados')," +
                "(209,'20','Oaxaca','105','Valles Centrales','1','Etla','293','San Pablo Etla')," +
                "(210,'20','Oaxaca','105','Valles Centrales','1','Etla','294','San Pablo Huitzo')," +
                "(211,'20','Oaxaca','105','Valles Centrales','1','Etla','295','San Pablo Huixtepec')," +
                "(212,'20','Oaxaca','105','Valles Centrales','1','Etla','301','San Pedro Apóstol')," +
                "(213,'20','Oaxaca','105','Valles Centrales','1','Etla','310','San Pedro Ixtlahuaca')," +
                "(214,'20','Oaxaca','105','Valles Centrales','1','Etla','315','San Pedro Mártir')," +
                "(215,'20','Oaxaca','105','Valles Centrales','1','Etla','328','San Pedro Taviche')," +
                "(216,'20','Oaxaca','105','Valles Centrales','1','Etla','338','Villa de Etla')," +
                "(217,'20','Oaxaca','105','Valles Centrales','1','Etla','342','San Raymundo Jalpan')," +
                "(218,'20','Oaxaca','105','Valles Centrales','1','Etla','350','San Sebastián Tutla')," +
                "(219,'20','Oaxaca','105','Valles Centrales','1','Etla','358','Santa Ana Tlapacoyan')," +
                "(220,'20','Oaxaca','105','Valles Centrales','1','Etla','360','Santa Ana Zegache')," +
                "(221,'20','Oaxaca','105','Valles Centrales','1','Etla','368','Santa Catarina Minas')," +
                "(222,'20','Oaxaca','105','Valles Centrales','1','Etla','369','Santa Catarina Quiané')," +
                "(223,'20','Oaxaca','105','Valles Centrales','1','Etla','375','Santa Cruz Amilpas')," +
                "(224,'20','Oaxaca','105','Valles Centrales','1','Etla','378','Santa Cruz Mixtepec')," +
                "(225,'20','Oaxaca','105','Valles Centrales','1','Etla','385','Santa Cruz Xoxocotlán')," +
                "(226,'20','Oaxaca','105','Valles Centrales','1','Etla','387','Santa Gertrudis')," +
                "(227,'20','Oaxaca','105','Valles Centrales','1','Etla','388','Santa Inés del Monte')," +
                "(228,'20','Oaxaca','105','Valles Centrales','1','Etla','389','Santa Inés Yatzeche')," +
                "(229,'20','Oaxaca','105','Valles Centrales','1','Etla','390','Santa Lucía del Camino')," +
                "(230,'20','Oaxaca','105','Valles Centrales','1','Etla','393','Santa Lucía Ocotlán')," +
                "(231,'20','Oaxaca','105','Valles Centrales','1','Etla','398','Ayoquezco de Aldama')," +
                "(232,'20','Oaxaca','105','Valles Centrales','1','Etla','399','Santa María Atzompa')," +
                "(233,'20','Oaxaca','105','Valles Centrales','1','Etla','403','Santa María Coyotepec')," +
                "(234,'20','Oaxaca','105','Valles Centrales','1','Etla','409','Santa María del Tule')," +
                "(235,'20','Oaxaca','105','Valles Centrales','1','Etla','426','Santa María Peñoles')," +
                "(236,'20','Oaxaca','105','Valles Centrales','1','Etla','452','Santiago Apóstol')," +
                "(237,'20','Oaxaca','105','Valles Centrales','1','Etla','483','Santiago Suchilquitongo')," +
                "(238,'20','Oaxaca','105','Valles Centrales','1','Etla','487','Santiago Tenango')," +
                "(239,'20','Oaxaca','105','Valles Centrales','1','Etla','494','Santiago Tlazoyaltepec')," +
                "(240,'20','Oaxaca','105','Valles Centrales','1','Etla','519','Santo Domingo Tomaltepec')," +
                "(241,'20','Oaxaca','105','Valles Centrales','1','Etla','530','Santo Tomás Jalieza')," +
                "(242,'20','Oaxaca','105','Valles Centrales','1','Etla','531','Santo Tomás Mazaltepec')," +
                "(243,'20','Oaxaca','105','Valles Centrales','1','Etla','539','Soledad Etla')," +
                "(244,'20','Oaxaca','105','Valles Centrales','1','Etla','553','Tlalixtac de Cabrera')," +
                "(245,'20','Oaxaca','105','Valles Centrales','1','Etla','555','Trinidad Zaachila')," +
                "(246,'20','Oaxaca','105','Valles Centrales','1','Etla','561','Yaxe')," +
                "(247,'20','Oaxaca','105','Valles Centrales','1','Etla','565','Villa de Zaachila')," +
                "(248,'20','Oaxaca','105','Valles Centrales','1','Etla','570','Zimatlán de Álvarez')," +
                "(249,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','51','Magdalena Teitipac')," +
                "(250,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','78','Rojas de Cuauhtémoc')," +
                "(251,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','118','San Bartolomé Quialana')," +
                "(252,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','131','San Dionisio Ocotepec')," +
                "(253,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','145','San Francisco Lachigoló')," +
                "(254,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','194','San Juan del Río')," +
                "(255,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','197','San Juan Guelavía')," +
                "(256,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','219','San Juan Teitipac')," +
                "(257,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','226','San Lorenzo Albarradas')," +
                "(258,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','233','San Lucas Quiaviní')," +
                "(259,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','298','San Pablo Villa de Mitla')," +
                "(260,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','325','San Pedro Quiatoni')," +
                "(261,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','333','San Pedro Totolápam')," +
                "(262,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','343','San Sebastián Abasolo')," +
                "(263,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','349','San Sebastián Teitipac')," +
                "(264,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','356','Santa Ana del Valle')," +
                "(265,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','380','Santa Cruz Papalutla')," +
                "(266,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','411','Santa María Guelacé')," +
                "(267,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','449','Santa María Zoquitlán')," +
                "(268,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','475','Santiago Matatlán')," +
                "(269,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','506','Santo Domingo Albarradas')," +
                "(270,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','546','Teotitlán del Valle')," +
                "(271,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','550','San Jerónimo Tlacochahuaya')," +
                "(272,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','551','Tlacolula de Matamoros')," +
                "(273,'20','Oaxaca','105','Valles Centrales','2','Tlacolula','560','Villa Díaz Ordaz')," +
                "(274,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','15','Coatecas Altas')," +
                "(275,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','17','La Compañía')," +
                "(276,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','28','Heroica Ciudad de Ejutla de Crespo')," +
                "(277,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','59','Miahuatlán de Porfirio Díaz')," +
                "(278,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','61','Monjas')," +
                "(279,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','69','La Pe')," +
                "(280,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','80','San Agustín Amatengo')," +
                "(281,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','95','San Andrés Paxtlán')," +
                "(282,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','101','San Andrés Zabache')," +
                "(283,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','126','San Cristóbal Amatlán')," +
                "(284,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','146','San Francisco Logueche')," +
                "(285,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','148','San Francisco Ozolotepec')," +
                "(286,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','154','San Ildefonso Amatlán')," +
                "(287,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','159','San Jerónimo Coatlán')," +
                "(288,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','167','San José del Peñasco')," +
                "(289,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','170','San José Lachiguiri')," +
                "(290,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','203','San Juan Lachigalla')," +
                "(291,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','209','San Juan Mixtepec')," +
                "(292,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','211','San Juan Ozolotepec')," +
                "(293,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','235','San Luis Amatlán')," +
                "(294,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','236','San Marcial Ozolotepec')," +
                "(295,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','238','San Martín de Los Cansecos')," +
                "(296,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','241','San Martín Lachilá')," +
                "(297,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','254','San Mateo Río Hondo')," +
                "(298,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','263','San Miguel Coatlán')," +
                "(299,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','268','San Miguel Ejutla')," +
                "(300,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','279','San Miguel Suchixtepec')," +
                "(301,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','289','San Nicolás')," +
                "(302,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','291','San Pablo Coatlán')," +
                "(303,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','319','San Pedro Mixtepec')," +
                "(304,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','344','San Sebastián Coatlán')," +
                "(305,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','347','San Sebastián Río Hondo')," +
                "(306,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','351','San Simón Almolongas')," +
                "(307,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','353','Santa Ana')," +
                "(308,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','362','Santa Catarina Cuixtla')," +
                "(309,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','384','Santa Cruz Xitla')," +
                "(310,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','391','Santa Lucía Miahuatlán')," +
                "(311,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','424','Santa María Ozolotepec')," +
                "(312,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','495','Santiago Xanica')," +
                "(313,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','512','Santo Domingo Ozolotepec')," +
                "(314,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','533','Santo Tomás Tamazulapan')," +
                "(315,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','534','San Vicente Coatlán')," +
                "(316,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','538','Sitio de Xitlapehua')," +
                "(317,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','542','Taniche')," +
                "(318,'20','Oaxaca','105','Valles Centrales','3','Miahuatlán','563','Yogana')," +
                "(319,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','137','San Francisco Cahuacuá')," +
                "(320,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','149','San Francisco Sola')," +
                "(321,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','155','San Ildefonso Sola')," +
                "(322,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','158','San Jacinto Tlacotepec')," +
                "(323,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','229','San Lorenzo Texmelúcan')," +
                "(324,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','277','Villa Sola de Vega')," +
                "(325,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','386','Santa Cruz Zenzontepec')," +
                "(326,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','420','Santa María Lachixío')," +
                "(327,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','429','Santa María Sola')," +
                "(328,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','448','Santa María Zaniza')," +
                "(329,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','450','Santiago Amoltepec')," +
                "(330,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','477','Santiago Minas')," +
                "(331,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','491','Santiago Textitlán')," +
                "(332,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','516','Santo Domingo Teojomulco')," +
                "(333,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','535','San Vicente Lachixío')," +
                "(334,'20','Oaxaca','105','Valles Centrales','4','Sola de Vega','566','San Mateo Yucutindoo')," +
                "(335,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','56','Mártires de Tacubaya')," +
                "(336,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','70','Pinotepa de Don Luis')," +
                "(337,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','82','San Agustín Chayuco')," +
                "(338,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','90','San Andrés Huaxpaltepec')," +
                "(339,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','111','San Antonio Tepetlapa')," +
                "(340,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','168','San José Estancia Grande')," +
                "(341,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','180','San Juan Bautista Lo de Soto')," +
                "(342,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','185','San Juan Cacahuatepec')," +
                "(343,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','188','San Juan Colorado')," +
                "(344,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','225','San Lorenzo')," +
                "(345,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','285','San Miguel Tlacamama')," +
                "(346,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','302','San Pedro Atoyac')," +
                "(347,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','312','San Pedro Jicayán')," +
                "(348,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','345','San Sebastián Ixcapa')," +
                "(349,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','367','Santa Catarina Mechoacán')," +
                "(350,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','402','Santa María Cortijo')," +
                "(351,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','414','Santa María Huazolotitlán')," +
                "(352,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','466','Santiago Ixtayutla')," +
                "(353,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','467','Santiago Jamiltepec')," +
                "(354,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','474','Santiago Llano Grande')," +
                "(355,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','482','Santiago Pinotepa Nacional')," +
                "(356,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','485','Santiago Tapextla')," +
                "(357,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','489','Santiago Tetepec')," +
                "(358,'20','Oaxaca','106','Costa','1','Pinotepa Nacional','507','Santo Domingo Armenta')," +
                "(359,'20','Oaxaca','106','Costa','2','Río Grande','318','San Pedro Mixtepec')," +
                "(360,'20','Oaxaca','106','Costa','2','Río Grande','334','Villa de Tututepec de Melchor Ocampo')," +
                "(361,'20','Oaxaca','106','Costa','2','Río Grande','401','Santa María Colotepec')," +
                "(362,'20','Oaxaca','106','Costa','2','Río Grande','439','Santa María Tonameca')," +
                "(363,'20','Oaxaca','106','Costa','2','Río Grande','509','Santo Domingo de Morelos')," +
                "(364,'20','Oaxaca','106','Costa','2','Río Grande','543','Tataltepec de Valdés')," +
                "(365,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','12','Candelaria Loxicha')," +
                "(366,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','71','Pluma Hidalgo')," +
                "(367,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','85','San Agustín Loxicha')," +
                "(368,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','113','San Baltazar Loxicha')," +
                "(369,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','117','San Bartolomé Loxicha')," +
                "(370,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','253','San Mateo Piñas')," +
                "(371,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','266','San Miguel del Puerto')," +
                "(372,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','306','San Pedro El Alto')," +
                "(373,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','324','San Pedro Pochutla')," +
                "(374,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','366','Santa Catarina Loxicha')," +
                "(375,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','413','Santa María Huatulco')," +
                "(376,'20','Oaxaca','106','Costa','3','Pochutla/San Pedro Pochutla','439','Santa María Tonameca')," +
                "(377,'20','Oaxaca','106','Costa','4','Santos Reyes Nopala','153','San Gabriel Mixtepec')," +
                "(378,'20','Oaxaca','106','Costa','4','Santos Reyes Nopala','202','San Juan Lachao')," +
                "(379,'20','Oaxaca','106','Costa','4','Santos Reyes Nopala','213','San Juan Quiahije')," +
                "(380,'20','Oaxaca','106','Costa','4','Santos Reyes Nopala','272','San Miguel Panixtlahuaca')," +
                "(381,'20','Oaxaca','106','Costa','4','Santos Reyes Nopala','314','San Pedro Juchatengo')," +
                "(382,'20','Oaxaca','106','Costa','4','Santos Reyes Nopala','364','Santa Catarina Juquila')," +
                "(383,'20','Oaxaca','106','Costa','4','Santos Reyes Nopala','433','Santa María Temaxcaltepec')," +
                "(384,'20','Oaxaca','106','Costa','4','Santos Reyes Nopala','497','Santiago Yaitepec')," +
                "(385,'20','Oaxaca','106','Costa','4','Santos Reyes Nopala','526','Santos Reyes Nopala')," +
                "(386,'20','Oaxaca','107','Istmo','1','Tapanatepec','25','Chahuites')," +
                "(387,'20','Oaxaca','107','Istmo','1','Tapanatepec','75','Reforma de Pineda')," +
                "(388,'20','Oaxaca','107','Istmo','1','Tapanatepec','143','San Francisco Ixhuatán')," +
                "(389,'20','Oaxaca','107','Istmo','1','Tapanatepec','327','San Pedro Tapanatepec')," +
                "(390,'20','Oaxaca','107','Istmo','1','Tapanatepec','525','Santo Domingo Zanatepec')," +
                "(391,'20','Oaxaca','107','Istmo','2','Niltepec','66','Santiago Niltepec')," +
                "(392,'20','Oaxaca','107','Istmo','2','Niltepec','130','San Dionisio del Mar')," +
                "(393,'20','Oaxaca','107','Istmo','2','Niltepec','141','San Francisco del Mar')," +
                "(394,'20','Oaxaca','107','Istmo','2','Niltepec','265','San Miguel Chimalapa')," +
                "(395,'20','Oaxaca','107','Istmo','2','Niltepec','505','Santo Domingo Ingenio')," +
                "(396,'20','Oaxaca','107','Istmo','3','Matías Romero','5','Asunción Ixtaltepec')," +
                "(397,'20','Oaxaca','107','Istmo','3','Matías Romero','10','El Barrio de la Soledad')," +
                "(398,'20','Oaxaca','107','Istmo','3','Matías Romero','57','Matías Romero Avendaño')," +
                "(399,'20','Oaxaca','107','Istmo','3','Matías Romero','198','San Juan Guichicovi')," +
                "(400,'20','Oaxaca','107','Istmo','3','Matías Romero','207','San Juan Mazatlán')," +
                "(401,'20','Oaxaca','107','Istmo','3','Matías Romero','407','Santa María Chimalapa')," +
                "(402,'20','Oaxaca','107','Istmo','3','Matías Romero','427','Santa María Petapa')," +
                "(403,'20','Oaxaca','107','Istmo','3','Matías Romero','513','Santo Domingo Petapa')," +
                "(404,'20','Oaxaca','107','Istmo','4','Juchitán','14','Ciudad Ixtepec')," +
                "(405,'20','Oaxaca','107','Istmo','4','Juchitán','30','El Espinal')," +
                "(406,'20','Oaxaca','107','Istmo','4','Juchitán','36','Guevea de Humboldt')," +
                "(407,'20','Oaxaca','107','Istmo','4','Juchitán','43','Heroica Ciudad de Juchitán de Zaragoza')," +
                "(408,'20','Oaxaca','107','Istmo','4','Juchitán','53','Magdalena Tlacotepec')," +
                "(409,'20','Oaxaca','107','Istmo','4','Juchitán','79','Salina Cruz')," +
                "(410,'20','Oaxaca','107','Istmo','4','Juchitán','124','San Blas Atempa')," +
                "(411,'20','Oaxaca','107','Istmo','4','Juchitán','248','San Mateo del Mar')," +
                "(412,'20','Oaxaca','107','Istmo','4','Juchitán','305','San Pedro Comitancillo')," +
                "(413,'20','Oaxaca','107','Istmo','4','Juchitán','307','San Pedro Huamelula')," +
                "(414,'20','Oaxaca','107','Istmo','4','Juchitán','308','San Pedro Huilotepec')," +
                "(415,'20','Oaxaca','107','Istmo','4','Juchitán','412','Santa María Guienagati')," +
                "(416,'20','Oaxaca','107','Istmo','4','Juchitán','418','Santa María Jalapa del Marqués')," +
                "(417,'20','Oaxaca','107','Istmo','4','Juchitán','421','Santa María Mixtequilla')," +
                "(418,'20','Oaxaca','107','Istmo','4','Juchitán','440','Santa María Totolapilla')," +
                "(419,'20','Oaxaca','107','Istmo','4','Juchitán','441','Santa María Xadani')," +
                "(420,'20','Oaxaca','107','Istmo','4','Juchitán','453','Santiago Astata')," +
                "(421,'20','Oaxaca','107','Istmo','4','Juchitán','465','Santiago Ixcuintepec')," +
                "(422,'20','Oaxaca','107','Istmo','4','Juchitán','470','Santiago Lachiguiri')," +
                "(423,'20','Oaxaca','107','Istmo','4','Juchitán','472','Santiago Laollaga')," +
                "(424,'20','Oaxaca','107','Istmo','4','Juchitán','508','Santo Domingo Chihuitán')," +
                "(425,'20','Oaxaca','107','Istmo','4','Juchitán','515','Santo Domingo Tehuantepec')," +
                "(426,'20','Oaxaca','107','Istmo','4','Juchitán','557','Unión Hidalgo')," +
                "(427,'20','Oaxaca','107','Istmo','5','Tequisistlán','8','Asunción Tlacolulita')," +
                "(428,'20','Oaxaca','107','Istmo','5','Tequisistlán','52','Magdalena Tequisistlán')," +
                "(429,'20','Oaxaca','107','Istmo','5','Tequisistlán','64','Nejapa de Madero')," +
                "(430,'20','Oaxaca','107','Istmo','5','Tequisistlán','74','Santa Catarina Quioquitani')," +
                "(431,'20','Oaxaca','107','Istmo','5','Tequisistlán','122','San Bartolo Yautepec')," +
                "(432,'20','Oaxaca','107','Istmo','5','Tequisistlán','125','San Carlos Yautepec')," +
                "(433,'20','Oaxaca','107','Istmo','5','Tequisistlán','204','San Juan Lajarcia')," +
                "(434,'20','Oaxaca','107','Istmo','5','Tequisistlán','282','San Miguel Tenango')," +
                "(435,'20','Oaxaca','107','Istmo','5','Tequisistlán','316','San Pedro Mártir Quiechapa')," +
                "(436,'20','Oaxaca','107','Istmo','5','Tequisistlán','357','Santa Ana Tavela')," +
                "(437,'20','Oaxaca','107','Istmo','5','Tequisistlán','361','Santa Catalina Quierí')," +
                "(438,'20','Oaxaca','107','Istmo','5','Tequisistlán','410','Santa María Ecatepec')," +
                "(439,'20','Oaxaca','107','Istmo','5','Tequisistlán','428','Santa María Quiegolani')," +
                "(440,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','1','Abejones')," +
                "(441,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','35','Guelatao de Juárez')," +
                "(442,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','42','Ixtlán de Juárez')," +
                "(443,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','62','Natividad')," +
                "(444,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','173','San Juan Atepec')," +
                "(445,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','191','San Juan Chicomezúchil')," +
                "(446,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','196','San Juan Evangelista Analco')," +
                "(447,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','214','San Juan Quiotepec')," +
                "(448,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','247','Capulálpam de Méndez')," +
                "(449,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','260','San Miguel Aloápam')," +
                "(450,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','262','San Miguel Amatlán')," +
                "(451,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','267','San Miguel del Río')," +
                "(452,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','288','San Miguel Yotao')," +
                "(453,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','296','San Pablo Macuiltianguis')," +
                "(454,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','335','San Pedro Yaneri')," +
                "(455,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','336','San Pedro Yólox')," +
                "(456,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','359','Santa Ana Yareni')," +
                "(457,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','363','Santa Catarina Ixtepeji')," +
                "(458,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','365','Santa Catarina Lachatao')," +
                "(459,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','419','Santa María Jaltianguis')," +
                "(460,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','443','Santa María Yavesía')," +
                "(461,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','458','Santiago Comaltepec')," +
                "(462,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','473','Santiago Laxopa')," +
                "(463,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','496','Santiago Xiacuí')," +
                "(464,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','504','Nuevo Zoquiápam')," +
                "(465,'20','Oaxaca','108','Sierra Juárez','1','Ixtlán','544','Teococuilco de Marcos Pérez')," +
                "(466,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','38','Villa Hidalgo')," +
                "(467,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','97','San Andrés Solaga')," +
                "(468,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','100','San Andrés Yaá')," +
                "(469,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','114','San Baltazar Yatzachi El Bajo')," +
                "(470,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','120','San Bartolomé Zoogocho')," +
                "(471,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','128','San Cristóbal Lachirioag')," +
                "(472,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','138','San Francisco Cajonos')," +
                "(473,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','156','San Ildefonso Villa Alta')," +
                "(474,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','201','San Juan Juquila Vijanos')," +
                "(475,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','216','San Juan Tabaá')," +
                "(476,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','222','San Juan Yaeé')," +
                "(477,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','223','San Juan Yatzona')," +
                "(478,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','246','San Mateo Cajonos')," +
                "(479,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','257','San Melchor Betaza')," +
                "(480,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','280','Villa Talea de Castro')," +
                "(481,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','299','San Pablo Yaganiza')," +
                "(482,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','303','San Pedro Cajonos')," +
                "(483,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','432','Santa María Temaxcalapa')," +
                "(484,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','442','Santa María Yalina')," +
                "(485,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','457','Santiago Camotlán')," +
                "(486,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','471','Santiago Lalopa')," +
                "(487,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','503','Santiago Zoochila')," +
                "(488,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','514','Santo Domingo Roayaga')," +
                "(489,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','522','Santo Domingo Xagacía')," +
                "(490,'20','Oaxaca','108','Sierra Juárez','2','Villa Alta','541','Tanetze de Zaragoza')," +
                "(491,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','3','Asunción Cacalotepec')," +
                "(492,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','31','Tamazulápam del Espíritu Santo')," +
                "(493,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','60','Mixistlán de La Reforma')," +
                "(494,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','200','San Juan Juquila Mixes')," +
                "(495,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','231','San Lucas Camotlán')," +
                "(496,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','275','San Miguel Quetzaltepec')," +
                "(497,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','323','San Pedro Ocotepec')," +
                "(498,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','337','San Pedro Y San Pablo Ayutla')," +
                "(499,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','394','Santa María Alotepec')," +
                "(500,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','435','Santa María Tepantlali')," +
                "(501,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','437','Santa María Tlahuitoltepec')," +
                "(502,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','454','Santiago Atitlán')," +
                "(503,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','465','Santiago Ixcuintepec')," +
                "(504,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','502','Santiago Zacatepec')," +
                "(505,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','517','Santo Domingo Tepuxtepec')," +
                "(506,'20','Oaxaca','108','Sierra Juárez','3','Ayutla/Mixe','554','Totontepec Villa de Morelos')," +
                "(507,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','109','San Antonio Nanahuatípam')," +
                "(508,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','142','San Francisco Huehuetlán')," +
                "(509,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','163','San Jerónimo Tecóatl')," +
                "(510,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','206','San Juan de Los Cués')," +
                "(511,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','244','San Martín Toxpalan')," +
                "(512,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','322','San Pedro Ocopetatillo')," +
                "(513,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','416','Santa María Ixcatlán')," +
                "(514,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','431','Santa María Tecomavaca')," +
                "(515,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','434','Santa María Teopoxco')," +
                "(516,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','490','Santiago Texcalcingo')," +
                "(517,'20','Oaxaca','109','Cañada','1','Teotitlán de Flores Magón','545','Teotitlán de Flores Magón')," +
                "(518,'20','Oaxaca','109','Cañada','2','Cuicatlán','19','Concepción Pápalo')," +
                "(519,'20','Oaxaca','109','Cañada','2','Cuicatlán','24','Cuyamecalco Villa de Zaragoza')," +
                "(520,'20','Oaxaca','109','Cañada','2','Cuicatlán','27','Chiquihuitlán de Benito Juárez')," +
                "(521,'20','Oaxaca','109','Cañada','2','Cuicatlán','98','San Andrés Teotilálpam')," +
                "(522,'20','Oaxaca','109','Cañada','2','Cuicatlán','139','San Francisco Chapulapa')," +
                "(523,'20','Oaxaca','109','Cañada','2','Cuicatlán','177','San Juan Bautista Cuicatlán')," +
                "(524,'20','Oaxaca','109','Cañada','2','Cuicatlán','182','San Juan Bautista Tlacoatzintepec')," +
                "(525,'20','Oaxaca','109','Cañada','2','Cuicatlán','220','San Juan Tepeuxila')," +
                "(526,'20','Oaxaca','109','Cañada','2','Cuicatlán','276','San Miguel Santa Flor')," +
                "(527,'20','Oaxaca','109','Cañada','2','Cuicatlán','311','San Pedro Jaltepetongo')," +
                "(528,'20','Oaxaca','109','Cañada','2','Cuicatlán','313','San Pedro Jocotipac')," +
                "(529,'20','Oaxaca','109','Cañada','2','Cuicatlán','326','San Pedro Sochiápam')," +
                "(530,'20','Oaxaca','109','Cañada','2','Cuicatlán','330','San Pedro Teutila')," +
                "(531,'20','Oaxaca','109','Cañada','2','Cuicatlán','355','Santa Ana Cuauhtémoc')," +
                "(532,'20','Oaxaca','109','Cañada','2','Cuicatlán','425','Santa María Pápalo')," +
                "(533,'20','Oaxaca','109','Cañada','2','Cuicatlán','436','Santa María Texcatitlán')," +
                "(534,'20','Oaxaca','109','Cañada','2','Cuicatlán','438','Santa María Tlalixtac')," +
                "(535,'20','Oaxaca','109','Cañada','2','Cuicatlán','478','Santiago Nacaltepec')," +
                "(536,'20','Oaxaca','109','Cañada','2','Cuicatlán','527','Santos Reyes Pápalo')," +
                "(537,'20','Oaxaca','109','Cañada','2','Cuicatlán','558','Valerio Trujano')," +
                "(538,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','29','Eloxochitlán de Flores Magón')," +
                "(539,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','40','Huautepec')," +
                "(540,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','41','Huautla de Jiménez')," +
                "(541,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','58','Mazatlán Villa de Flores')," +
                "(542,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','116','San Bartolomé Ayautla')," +
                "(543,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','171','San José Tenango')," +
                "(544,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','187','San Juan Coatzóspam')," +
                "(545,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','228','San Lorenzo Cuaunecuiltitla')," +
                "(546,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','234','San Lucas Zoquiápam')," +
                "(547,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','249','San Mateo Yoloxochitlán')," +
                "(548,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','354','Santa Ana Ateixtlahuaca')," +
                "(549,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','374','Santa Cruz Acatepec')," +
                "(550,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','396','Santa María La Asunción')," +
                "(551,'20','Oaxaca','109','Cañada','3','Huautla de Jiménez','406','Santa María Chilchotla')," +
                "(552,'20','Oaxaca','110','Tuxtepec','1','Tuxtepec','44','Loma Bonita')," +
                "(553,'20','Oaxaca','110','Tuxtepec','1','Tuxtepec','166','San José Chiltepec')," +
                "(554,'20','Oaxaca','110','Tuxtepec','1','Tuxtepec','184','San Juan Bautista Tuxtepec')," +
                "(555,'20','Oaxaca','110','Tuxtepec','1','Tuxtepec','417','Santa María Jacatepec')," +
                "(556,'20','Oaxaca','110','Tuxtepec','1','Tuxtepec','559','San Juan Bautista Valle Nacional')," +
                "(557,'20','Oaxaca','110','Tuxtepec','2','Ojitlán/San Lucas','134','San Felipe Jalapa de Díaz')," +
                "(558,'20','Oaxaca','110','Tuxtepec','2','Ojitlán/San Lucas','136','San Felipe Usila')," +
                "(559,'20','Oaxaca','110','Tuxtepec','2','Ojitlán/San Lucas','232','San Lucas Ojitlán')," +
                "(560,'20','Oaxaca','110','Tuxtepec','2','Ojitlán/San Lucas','309','San Pedro Ixcatlán')," +
                "(561,'20','Oaxaca','110','Tuxtepec','3','Temascal','2','Acatlán de Pérez Figueroa')," +
                "(562,'20','Oaxaca','110','Tuxtepec','3','Temascal','21','Cosolapa')," +
                "(563,'20','Oaxaca','110','Tuxtepec','3','Temascal','169','San José Independencia')," +
                "(564,'20','Oaxaca','110','Tuxtepec','3','Temascal','278','San Miguel Soyaltepec')," +
                "(565,'20','Oaxaca','110','Tuxtepec','4','San Juan del Río','9','Ayotzintepec')," +
                "(566,'20','Oaxaca','110','Tuxtepec','4','San Juan del Río','189','San Juan Comaltepec')," +
                "(567,'20','Oaxaca','110','Tuxtepec','4','San Juan del Río','205','San Juan Lalana')," +
                "(568,'20','Oaxaca','110','Tuxtepec','4','San Juan del Río','212','San Juan Petlapa')," +
                "(569,'20','Oaxaca','110','Tuxtepec','4','San Juan del Río','460','Santiago Choápam')," +
                "(570,'20','Oaxaca','110','Tuxtepec','4','San Juan del Río','468','Santiago Jocotepec')," +
                "(571,'20','Oaxaca','110','Tuxtepec','5','Cihualtepec','190','San Juan Cotzocón')," +
                "(572,'20','Oaxaca','110','Tuxtepec','5','Cihualtepec','498','Santiago Yaveo')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_PUEBLA + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_PUEBLA + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','8','Ahuazotepec')," +
                        "(2,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','49','Chiconcuautla')," +
                        "(3,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','57','Honey')," +
                        "(4,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','68','Hermenegildo Galeana')," +
                        "(5,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','71','Huauchinango')," +
                        "(6,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','89','Jopala')," +
                        "(7,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','91','Juan Galindo')," +
                        "(8,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','100','Naupan')," +
                        "(9,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','109','Pahuatlán')," +
                        "(10,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','123','San Felipe Tepatlán')," +
                        "(11,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','178','Tlacuilotepec')," +
                        "(12,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','183','Tlaola')," +
                        "(13,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','184','Tlapacoya')," +
                        "(14,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','187','Tlaxco')," +
                        "(15,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','197','Xicotepec')," +
                        "(16,'21','Puebla','111','Huauchinango','1','Xicotepec de Juárez','213','Zihuateutla')," +
                        "(17,'21','Puebla','111','Huauchinango','2','Villa Lázaro Cárdenas','64','Francisco Z. Mena')," +
                        "(18,'21','Puebla','111','Huauchinango','2','Villa Lázaro Cárdenas','86','Jalpan')," +
                        "(19,'21','Puebla','111','Huauchinango','2','Villa Lázaro Cárdenas','111','Pantepec')," +
                        "(20,'21','Puebla','111','Huauchinango','2','Villa Lázaro Cárdenas','194','Venustiano Carranza')," +
                        "(21,'21','Puebla','112','Zacatlán','1','Zacatlán','6','Ahuacatlán')," +
                        "(22,'21','Puebla','112','Zacatlán','1','Zacatlán','14','Amixtlán')," +
                        "(23,'21','Puebla','112','Zacatlán','1','Zacatlán','16','Aquixtla')," +
                        "(24,'21','Puebla','112','Zacatlán','1','Zacatlán','28','Camocuautla')," +
                        "(25,'21','Puebla','112','Zacatlán','1','Zacatlán','30','Coatepec')," +
                        "(26,'21','Puebla','112','Zacatlán','1','Zacatlán','39','Cuautempan')," +
                        "(27,'21','Puebla','112','Zacatlán','1','Zacatlán','53','Chignahuapan')," +
                        "(28,'21','Puebla','112','Zacatlán','1','Zacatlán','83','Ixtacamaxtitlán')," +
                        "(29,'21','Puebla','112','Zacatlán','1','Zacatlán','162','Tepango de Rodríguez')," +
                        "(30,'21','Puebla','112','Zacatlán','1','Zacatlán','167','Tepetzintla')," +
                        "(31,'21','Puebla','112','Zacatlán','1','Zacatlán','172','Tetela de Ocampo')," +
                        "(32,'21','Puebla','112','Zacatlán','1','Zacatlán','208','Zacatlán')," +
                        "(33,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','29','Caxhuacan')," +
                        "(34,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','43','Cuetzalan del Progreso')," +
                        "(35,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','72','Huehuetla')," +
                        "(36,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','77','Hueytlalpan')," +
                        "(37,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','78','Huitzilan de Serdán')," +
                        "(38,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','80','Atlequizayan')," +
                        "(39,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','84','Ixtepec')," +
                        "(40,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','88','Jonotla')," +
                        "(41,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','101','Nauzontla')," +
                        "(42,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','107','Olintla')," +
                        "(43,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','192','Tuzamapan de Galeana')," +
                        "(44,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','200','Xochiapulco')," +
                        "(45,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','202','Xochitlán de Vicente Suárez')," +
                        "(46,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','207','Zacapoaxtla')," +
                        "(47,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','210','Zapotitlán de Méndez')," +
                        "(48,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','215','Zongozotla')," +
                        "(49,'21','Puebla','113','Teziutlán','1','Zacapoaxtla','216','Zoquiapan')," +
                        "(50,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','2','Acateno')," +
                        "(51,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','17','Atempan')," +
                        "(52,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','25','Ayotoxco de Guerrero')," +
                        "(53,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','54','Chignautla')," +
                        "(54,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','75','Hueyapan')," +
                        "(55,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','76','Hueytamalco')," +
                        "(56,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','158','Tenampulco')," +
                        "(57,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','173','Teteles de Avila Castillo')," +
                        "(58,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','174','Teziutlán')," +
                        "(59,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','186','Tlatlauquitepec')," +
                        "(60,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','199','Xiutetelco')," +
                        "(61,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','204','Yaonáhuac')," +
                        "(62,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','211','Zaragoza')," +
                        "(63,'21','Puebla','113','Teziutlán','2','Tlatlauquitepec','212','Zautla')," +
                        "(64,'21','Puebla','114','Libres','1','Libres','44','Cuyoaco')," +
                        "(65,'21','Puebla','114','Libres','1','Libres','94','Libres')," +
                        "(66,'21','Puebla','114','Libres','1','Libres','104','Nopalucan')," +
                        "(67,'21','Puebla','114','Libres','1','Libres','105','Ocotepec')," +
                        "(68,'21','Puebla','114','Libres','1','Libres','108','Oriental')," +
                        "(69,'21','Puebla','114','Libres','1','Libres','117','Rafael Lara Grajales')," +
                        "(70,'21','Puebla','114','Libres','1','Libres','128','San José Chiapa')," +
                        "(71,'21','Puebla','114','Libres','1','Libres','170','Tepeyahualco')," +
                        "(72,'21','Puebla','114','Libres','2','Guadalupe Victoria','50','Chichiquila')," +
                        "(73,'21','Puebla','114','Libres','2','Guadalupe Victoria','58','Chilchotla')," +
                        "(74,'21','Puebla','114','Libres','2','Guadalupe Victoria','67','Guadalupe Victoria')," +
                        "(75,'21','Puebla','114','Libres','2','Guadalupe Victoria','93','Lafragua')," +
                        "(76,'21','Puebla','114','Libres','2','Guadalupe Victoria','116','Quimixtlán')," +
                        "(77,'21','Puebla','114','Libres','3','Ciudad Serdán','12','Aljojuca')," +
                        "(78,'21','Puebla','114','Libres','3','Ciudad Serdán','23','Atzitzintla')," +
                        "(79,'21','Puebla','114','Libres','3','Ciudad Serdán','45','Chalchicomula de Sesma')," +
                        "(80,'21','Puebla','114','Libres','3','Ciudad Serdán','63','Esperanza')," +
                        "(81,'21','Puebla','114','Libres','3','Ciudad Serdán','96','Mazapiltepec de Juárez')," +
                        "(82,'21','Puebla','114','Libres','3','Ciudad Serdán','99','Cañada Morelos')," +
                        "(83,'21','Puebla','114','Libres','3','Ciudad Serdán','130','San Juan Atenco')," +
                        "(84,'21','Puebla','114','Libres','3','Ciudad Serdán','137','San Nicolás Buenos Aires')," +
                        "(85,'21','Puebla','114','Libres','3','Ciudad Serdán','142','San Salvador El Seco')," +
                        "(86,'21','Puebla','114','Libres','3','Ciudad Serdán','152','Soltepec')," +
                        "(87,'21','Puebla','114','Libres','3','Ciudad Serdán','179','Tlachichuca')," +
                        "(88,'21','Puebla','115','Cholula','1','Atlixco','19','Atlixco')," +
                        "(89,'21','Puebla','115','Cholula','1','Atlixco','69','Huaquechula')," +
                        "(90,'21','Puebla','115','Cholula','1','Atlixco','106','Ocoyucan')," +
                        "(91,'21','Puebla','115','Cholula','1','Atlixco','125','San Gregorio Atzompa')," +
                        "(92,'21','Puebla','115','Cholula','1','Atlixco','148','Santa Isabel Cholula')," +
                        "(93,'21','Puebla','115','Cholula','1','Atlixco','175','Tianguismanalco')," +
                        "(94,'21','Puebla','115','Cholula','1','Atlixco','188','Tochimilco')," +
                        "(95,'21','Puebla','115','Cholula','2','Tepeaca','1','Acajete')," +
                        "(96,'21','Puebla','115','Cholula','2','Tepeaca','15','Amozoc')," +
                        "(97,'21','Puebla','115','Cholula','2','Tepeaca','40','Cuautinchán')," +
                        "(98,'21','Puebla','115','Cholula','2','Tepeaca','114','Puebla')," +
                        "(99,'21','Puebla','115','Cholula','2','Tepeaca','153','Tecali de Herrera')," +
                        "(100,'21','Puebla','115','Cholula','2','Tepeaca','163','Tepatlaxco de Hidalgo')," +
                        "(101,'21','Puebla','115','Cholula','2','Tepeaca','164','Tepeaca')," +
                        "(102,'21','Puebla','115','Cholula','2','Tepeaca','193','Tzicatlacoyan')," +
                        "(103,'21','Puebla','115','Cholula','3','Texmelucan','26','Calpan')," +
                        "(104,'21','Puebla','115','Cholula','3','Texmelucan','34','Coronango')," +
                        "(105,'21','Puebla','115','Cholula','3','Texmelucan','41','Cuautlancingo')," +
                        "(106,'21','Puebla','115','Cholula','3','Texmelucan','48','Chiautzingo')," +
                        "(107,'21','Puebla','115','Cholula','3','Texmelucan','60','Domingo Arenas')," +
                        "(108,'21','Puebla','115','Cholula','3','Texmelucan','74','Huejotzingo')," +
                        "(109,'21','Puebla','115','Cholula','3','Texmelucan','90','Juan C. Bonilla')," +
                        "(110,'21','Puebla','115','Cholula','3','Texmelucan','102','Nealtican')," +
                        "(111,'21','Puebla','115','Cholula','3','Texmelucan','119','San Andrés Cholula')," +
                        "(112,'21','Puebla','115','Cholula','3','Texmelucan','122','San Felipe Teotlalcingo')," +
                        "(113,'21','Puebla','115','Cholula','3','Texmelucan','126','San Jerónimo Tecuanipan')," +
                        "(114,'21','Puebla','115','Cholula','3','Texmelucan','132','San Martín Texmelucan')," +
                        "(115,'21','Puebla','115','Cholula','3','Texmelucan','134','San Matías Tlalancaleca')," +
                        "(116,'21','Puebla','115','Cholula','3','Texmelucan','136','San Miguel Xoxtla')," +
                        "(117,'21','Puebla','115','Cholula','3','Texmelucan','138','San Nicolás de Los Ranchos')," +
                        "(118,'21','Puebla','115','Cholula','3','Texmelucan','140','San Pedro Cholula')," +
                        "(119,'21','Puebla','115','Cholula','3','Texmelucan','143','San Salvador El Verde')," +
                        "(120,'21','Puebla','115','Cholula','3','Texmelucan','180','Tlahuapan')," +
                        "(121,'21','Puebla','115','Cholula','3','Texmelucan','181','Tlaltenango')," +
                        "(122,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','7','Ahuatlán')," +
                        "(123,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','21','Atzala')," +
                        "(124,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','31','Coatzingo')," +
                        "(125,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','51','Chietla')," +
                        "(126,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','62','Epatlán')," +
                        "(127,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','85','Izúcar de Matamoros')," +
                        "(128,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','121','San Diego La Mesa Tochimiltzingo')," +
                        "(129,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','133','San Martín Totoltepec')," +
                        "(130,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','150','Huehuetlán El Grande')," +
                        "(131,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','159','Teopantlán')," +
                        "(132,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','166','Tepeojuma')," +
                        "(133,'21','Puebla','116','Izúcar de Matamoros','1','Izúcar de Matamoros','201','Xochiltepec')," +
                        "(134,'21','Puebla','116','Izúcar de Matamoros','2','Huehuetlán El Chico','32','Cohetzala')," +
                        "(135,'21','Puebla','116','Izúcar de Matamoros','2','Huehuetlán El Chico','47','Chiautla')," +
                        "(136,'21','Puebla','116','Izúcar de Matamoros','2','Huehuetlán El Chico','73','Huehuetlán El Chico')," +
                        "(137,'21','Puebla','116','Izúcar de Matamoros','2','Huehuetlán El Chico','81','Ixcamilpa de Guerrero')," +
                        "(138,'21','Puebla','116','Izúcar de Matamoros','2','Huehuetlán El Chico','87','Jolalpan')," +
                        "(139,'21','Puebla','116','Izúcar de Matamoros','2','Huehuetlán El Chico','160','Teotlalco')," +
                        "(140,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','9','Ahuehuetitla')," +
                        "(141,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','11','Albino Zertuche')," +
                        "(142,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','24','Axutla')," +
                        "(143,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','42','Cuayuca de Andrade')," +
                        "(144,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','56','Chila de La Sal')," +
                        "(145,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','59','Chinantla')," +
                        "(146,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','113','Piaxtla')," +
                        "(147,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','155','Tecomatlán')," +
                        "(148,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','157','Tehuitzingo')," +
                        "(149,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','191','Tulcingo')," +
                        "(150,'21','Puebla','116','Izúcar de Matamoros','3','Tehuitzingo','198','Xicotlán')," +
                        "(151,'21','Puebla','116','Izúcar de Matamoros','4','Acatlán','3','Acatlán')," +
                        "(152,'21','Puebla','116','Izúcar de Matamoros','4','Acatlán','55','Chila')," +
                        "(153,'21','Puebla','116','Izúcar de Matamoros','4','Acatlán','66','Guadalupe')," +
                        "(154,'21','Puebla','116','Izúcar de Matamoros','4','Acatlán','112','Petlalcingo')," +
                        "(155,'21','Puebla','116','Izúcar de Matamoros','4','Acatlán','127','San Jerónimo Xayacatlán')," +
                        "(156,'21','Puebla','116','Izúcar de Matamoros','4','Acatlán','135','San Miguel Ixitlán')," +
                        "(157,'21','Puebla','116','Izúcar de Matamoros','4','Acatlán','139','San Pablo Anicano')," +
                        "(158,'21','Puebla','116','Izúcar de Matamoros','4','Acatlán','141','San Pedro Yeloixtlahuaca')," +
                        "(159,'21','Puebla','116','Izúcar de Matamoros','4','Acatlán','190','Totoltepec de Guerrero')," +
                        "(160,'21','Puebla','116','Izúcar de Matamoros','4','Acatlán','196','Xayacatlán de Bravo')," +
                        "(161,'21','Puebla','116','Izúcar de Matamoros','5','Tepexco','5','Acteopan')," +
                        "(162,'21','Puebla','116','Izúcar de Matamoros','5','Tepexco','22','Atzitzihuacán')," +
                        "(163,'21','Puebla','116','Izúcar de Matamoros','5','Tepexco','33','Cohuecan')," +
                        "(164,'21','Puebla','116','Izúcar de Matamoros','5','Tepexco','165','Tepemaxalco')," +
                        "(165,'21','Puebla','116','Izúcar de Matamoros','5','Tepexco','168','Tepexco')," +
                        "(166,'21','Puebla','116','Izúcar de Matamoros','5','Tepexco','176','Tilapa')," +
                        "(167,'21','Puebla','116','Izúcar de Matamoros','5','Tepexco','185','Tlapanalá')," +
                        "(168,'21','Puebla','117','Tecamachalco','1','Tecamachalco','20','Atoyatempan')," +
                        "(169,'21','Puebla','117','Tecamachalco','1','Tecamachalco','79','Huitziltepec')," +
                        "(170,'21','Puebla','117','Tecamachalco','1','Tecamachalco','154','Tecamachalco')," +
                        "(171,'21','Puebla','117','Tecamachalco','1','Tecamachalco','161','Tepanco de López')," +
                        "(172,'21','Puebla','117','Tecamachalco','1','Tecamachalco','171','Tepeyahualco de Cuauhtémoc')," +
                        "(173,'21','Puebla','117','Tecamachalco','1','Tecamachalco','177','Tlacotepec de Benito Juárez')," +
                        "(174,'21','Puebla','117','Tecamachalco','1','Tecamachalco','182','Tlanepantla')," +
                        "(175,'21','Puebla','117','Tecamachalco','1','Tecamachalco','189','Tochtepec')," +
                        "(176,'21','Puebla','117','Tecamachalco','1','Tecamachalco','203','Xochitlán Todos Santos')," +
                        "(177,'21','Puebla','117','Tecamachalco','1','Tecamachalco','205','Yehualtepec')," +
                        "(178,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','18','Atexcal')," +
                        "(179,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','37','Coyotepec')," +
                        "(180,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','52','Chigmecatitlán')," +
                        "(181,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','70','Huatlatlauca')," +
                        "(182,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','82','Ixcaquixtla')," +
                        "(183,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','92','Juan N. Méndez')," +
                        "(184,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','95','La Magdalena Tlatlauquitepec')," +
                        "(185,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','98','Molcaxac')," +
                        "(186,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','131','San Juan Atzompa')," +
                        "(187,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','146','Santa Catarina Tlaltempan')," +
                        "(188,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','147','Santa Inés Ahuatempan')," +
                        "(189,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','169','Tepexi de Rodríguez')," +
                        "(190,'21','Puebla','117','Tecamachalco','2','Tepexi de Rodríguez','206','Zacapala')," +
                        "(191,'21','Puebla','117','Tecamachalco','3','Quecholac','4','Acatzingo')," +
                        "(192,'21','Puebla','117','Tecamachalco','3','Quecholac','38','Cuapiaxtla de Madero')," +
                        "(193,'21','Puebla','117','Tecamachalco','3','Quecholac','65','General Felipe Ángeles')," +
                        "(194,'21','Puebla','117','Tecamachalco','3','Quecholac','97','Mixtla')," +
                        "(195,'21','Puebla','117','Tecamachalco','3','Quecholac','110','Palmar de Bravo')," +
                        "(196,'21','Puebla','117','Tecamachalco','3','Quecholac','115','Quecholac')," +
                        "(197,'21','Puebla','117','Tecamachalco','3','Quecholac','118','Los Reyes de Juárez')," +
                        "(198,'21','Puebla','117','Tecamachalco','3','Quecholac','144','San Salvador Huixcolotla')," +
                        "(199,'21','Puebla','117','Tecamachalco','3','Quecholac','151','Santo Tomás Hueyotlipan')," +
                        "(200,'21','Puebla','118','Tehuacán','1','San Lorenzo','27','Caltepec')," +
                        "(201,'21','Puebla','118','Tehuacán','1','San Lorenzo','46','Chapulco')," +
                        "(202,'21','Puebla','118','Tehuacán','1','San Lorenzo','149','Santiago Miahuatlán')," +
                        "(203,'21','Puebla','118','Tehuacán','1','San Lorenzo','156','Tehuacán')," +
                        "(204,'21','Puebla','118','Tehuacán','1','San Lorenzo','209','Zapotitlán')," +
                        "(205,'21','Puebla','118','Tehuacán','2','La Cañada Poblana','13','Altepexi')," +
                        "(206,'21','Puebla','118','Tehuacán','2','La Cañada Poblana','35','Coxcatlán')," +
                        "(207,'21','Puebla','118','Tehuacán','2','La Cañada Poblana','36','Coyomeapan')," +
                        "(208,'21','Puebla','118','Tehuacán','2','La Cañada Poblana','61','Eloxochitlán')," +
                        "(209,'21','Puebla','118','Tehuacán','2','La Cañada Poblana','124','San Gabriel Chilac')," +
                        "(210,'21','Puebla','118','Tehuacán','2','La Cañada Poblana','129','San José Miahuatlán')," +
                        "(211,'21','Puebla','118','Tehuacán','2','La Cañada Poblana','145','San Sebastián Tlacotepec')," +
                        "(212,'21','Puebla','118','Tehuacán','2','La Cañada Poblana','214','Zinacatepec')," +
                        "(213,'21','Puebla','118','Tehuacán','2','La Cañada Poblana','217','Zoquitlán')," +
                        "(214,'21','Puebla','118','Tehuacán','3','Sierra Negra','10','Ajalpan')," +
                        "(215,'21','Puebla','118','Tehuacán','3','Sierra Negra','103','Nicolás Bravo')," +
                        "(216,'21','Puebla','118','Tehuacán','3','Sierra Negra','120','San Antonio Cañada')," +
                        "(217,'21','Puebla','118','Tehuacán','3','Sierra Negra','195','Vicente Guerrero')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_QUERETARO + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_QUERETARO + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'22','Querétaro','119','Jalpan','1','La Lagunita','10','Landa de Matamoros')," +
                        "(2,'22','Querétaro','119','Jalpan','2','Purísima de Arista','3','Arroyo Seco')," +
                        "(3,'22','Querétaro','119','Jalpan','2','Purísima de Arista','9','Jalpan de Serra')," +
                        "(4,'22','Querétaro','119','Jalpan','3','Pinal de Amoles','2','Pinal de Amoles')," +
                        "(5,'22','Querétaro','120','Cadereyta','1','Cadereyta','4','Cadereyta de Montes')," +
                        "(6,'22','Querétaro','120','Cadereyta','1','Cadereyta','7','Ezequiel Montes')," +
                        "(7,'22','Querétaro','120','Cadereyta','2','Colón','5','Colón')," +
                        "(8,'22','Querétaro','120','Cadereyta','3','Tolimán','13','Peñamiller')," +
                        "(9,'22','Querétaro','120','Cadereyta','3','Tolimán','18','Tolimán')," +
                        "(10,'22','Querétaro','120','Cadereyta','4','San Joaquín','15','San Joaquín')," +
                        "(11,'22','Querétaro','121','San Juan del Río','1','San Juan del Río','16','San Juan del Río')," +
                        "(12,'22','Querétaro','121','San Juan del Río','1','San Juan del Río','17','Tequisquiapan')," +
                        "(13,'22','Querétaro','121','San Juan del Río','2','Pedro Escobedo','12','Pedro Escobedo')," +
                        "(14,'22','Querétaro','121','San Juan del Río','3','Amealco','1','Amealco de Bonfil')," +
                        "(15,'22','Querétaro','122','Querétaro','1','Villa Corregidora','6','Corregidora')," +
                        "(16,'22','Querétaro','122','Querétaro','1','Villa Corregidora','8','Huimilpan')," +
                        "(17,'22','Querétaro','122','Querétaro','1','Villa Corregidora','14','Querétaro')," +
                        "(18,'22','Querétaro','122','Querétaro','2','Villa del Marques','11','El Marqués')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_QUINTANAROO + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_QUINTANAROO + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'23','Quintana Roo','123','Chetumal','1','Álvaro Obregón','4','Othón P. Blanco')," +
                        "(2,'23','Quintana Roo','123','Chetumal','2','Bacalar','4','Othón P. Blanco')," +
                        "(3,'23','Quintana Roo','123','Chetumal','2','Bacalar','10','Bacalar')," +
                        "(4,'23','Quintana Roo','123','Chetumal','3','Nicolás Bravo','4','Othón P. Blanco')," +
                        "(5,'23','Quintana Roo','124','Felipe Carrillo Puerto','1','José María Morelos','6','José María Morelos')," +
                        "(6,'23','Quintana Roo','124','Felipe Carrillo Puerto','2','Felipe Carrillo Puerto','2','Felipe Carrillo Puerto')," +
                        "(7,'23','Quintana Roo','125','Cancún','1','Kantunilkín','7','Lázaro Cárdenas')," +
                        "(8,'23','Quintana Roo','125','Cancún','2','Playa del Carmen','1','Cozumel')," +
                        "(9,'23','Quintana Roo','125','Cancún','2','Playa del Carmen','3','Isla Mujeres')," +
                        "(10,'23','Quintana Roo','125','Cancún','2','Playa del Carmen','5','Benito Juárez')," +
                        "(11,'23','Quintana Roo','125','Cancún','2','Playa del Carmen','8','Solidaridad')," +
                        "(12,'23','Quintana Roo','125','Cancún','2','Playa del Carmen','9','Tulum')," +
                        "(13,'23','Quintana Roo','125','Cancún','2','Playa del Carmen','11','Puerto Morelos')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_SANLUIS + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_SANLUIS + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'24','San Luis Potosí','126','San Luis Potosí','1','Soledad Diez G.','4','Armadillo de Los Infante')," +
                        "(2,'24','San Luis Potosí','126','San Luis Potosí','1','Soledad Diez G.','9','Cerro de San Pedro')," +
                        "(3,'24','San Luis Potosí','126','San Luis Potosí','1','Soledad Diez G.','28','San Luis Potosí')," +
                        "(4,'24','San Luis Potosí','126','San Luis Potosí','1','Soledad Diez G.','35','Soledad de Graciano Sánchez')," +
                        "(5,'24','San Luis Potosí','126','San Luis Potosí','2','Ahualulco','1','Ahualulco')," +
                        "(6,'24','San Luis Potosí','126','San Luis Potosí','2','Ahualulco','21','Mexquitic de Carmona')," +
                        "(7,'24','San Luis Potosí','126','San Luis Potosí','3','Villa de Arista','22','Moctezuma')," +
                        "(8,'24','San Luis Potosí','126','San Luis Potosí','3','Villa de Arista','51','Villa Hidalgo')," +
                        "(9,'24','San Luis Potosí','126','San Luis Potosí','3','Villa de Arista','56','Villa de Arista')," +
                        "(10,'24','San Luis Potosí','126','San Luis Potosí','4','Villa de Arriaga','46','Villa de Arriaga')," +
                        "(11,'24','San Luis Potosí','126','San Luis Potosí','5','Villa de Reyes','32','Santa María del Río')," +
                        "(12,'24','San Luis Potosí','126','San Luis Potosí','5','Villa de Reyes','43','Tierra Nueva')," +
                        "(13,'24','San Luis Potosí','126','San Luis Potosí','5','Villa de Reyes','50','Villa de Reyes')," +
                        "(14,'24','San Luis Potosí','126','San Luis Potosí','5','Villa de Reyes','55','Zaragoza')," +
                        "(15,'24','San Luis Potosí','127','Salinas','1','Villa de Ramos','25','Salinas')," +
                        "(16,'24','San Luis Potosí','127','Salinas','1','Villa de Ramos','49','Villa de Ramos')," +
                        "(17,'24','San Luis Potosí','127','Salinas','2','Santo Domingo','33','Santo Domingo')," +
                        "(18,'24','San Luis Potosí','128','Matehuala','1','Cedral','6','Catorce')," +
                        "(19,'24','San Luis Potosí','128','Matehuala','1','Cedral','7','Cedral')," +
                        "(20,'24','San Luis Potosí','128','Matehuala','1','Cedral','44','Vanegas')," +
                        "(21,'24','San Luis Potosí','128','Matehuala','2','Charcas','15','Charcas')," +
                        "(22,'24','San Luis Potosí','128','Matehuala','2','Charcas','45','Venado')," +
                        "(23,'24','San Luis Potosí','128','Matehuala','3','Villa de Guadalupe','20','Matehuala')," +
                        "(24,'24','San Luis Potosí','128','Matehuala','3','Villa de Guadalupe','47','Villa de Guadalupe')," +
                        "(25,'24','San Luis Potosí','128','Matehuala','3','Villa de Guadalupe','48','Villa de La Paz')," +
                        "(26,'24','San Luis Potosí','129','Rioverde','1','Cárdenas','2','Alaquines')," +
                        "(27,'24','San Luis Potosí','129','Rioverde','1','Cárdenas','5','Cárdenas')," +
                        "(28,'24','San Luis Potosí','129','Rioverde','1','Cárdenas','19','Lagunillas')," +
                        "(29,'24','San Luis Potosí','129','Rioverde','1','Cárdenas','23','Rayón')," +
                        "(30,'24','San Luis Potosí','129','Rioverde','1','Cárdenas','24','Rioverde')," +
                        "(31,'24','San Luis Potosí','129','Rioverde','1','Cárdenas','31','Santa Catarina')," +
                        "(32,'24','San Luis Potosí','129','Rioverde','2','Ciudad del Maíz','10','Ciudad del Maíz')," +
                        "(33,'24','San Luis Potosí','129','Rioverde','3','Cerritos','8','Cerritos')," +
                        "(34,'24','San Luis Potosí','129','Rioverde','3','Cerritos','17','Guadalcázar')," +
                        "(35,'24','San Luis Potosí','129','Rioverde','3','Cerritos','52','Villa Juárez')," +
                        "(36,'24','San Luis Potosí','130','Ciudad Fernández','1','El Refugio','11','Ciudad Fernández')," +
                        "(37,'24','San Luis Potosí','130','Ciudad Fernández','1','El Refugio','24','Rioverde')," +
                        "(38,'24','San Luis Potosí','130','Ciudad Fernández','1','El Refugio','27','San Ciro de Acosta')," +
                        "(39,'24','San Luis Potosí','130','Ciudad Fernández','2','San Nicolás','11','Ciudad Fernández')," +
                        "(40,'24','San Luis Potosí','130','Ciudad Fernández','2','San Nicolás','24','Rioverde')," +
                        "(41,'24','San Luis Potosí','130','Ciudad Fernández','2','San Nicolás','30','San Nicolás Tolentino')," +
                        "(42,'24','San Luis Potosí','131','Ciudad Valles','1','Cd. Santos','3','Aquismón')," +
                        "(43,'24','San Luis Potosí','131','Ciudad Valles','1','Cd. Santos','12','Tancanhuitz')," +
                        "(44,'24','San Luis Potosí','131','Ciudad Valles','1','Cd. Santos','14','Coxcatlán')," +
                        "(45,'24','San Luis Potosí','131','Ciudad Valles','1','Cd. Santos','26','San Antonio')," +
                        "(46,'24','San Luis Potosí','131','Ciudad Valles','1','Cd. Santos','39','Tampamolón Corona')," +
                        "(47,'24','San Luis Potosí','131','Ciudad Valles','1','Cd. Santos','41','Tanlajás')," +
                        "(48,'24','San Luis Potosí','131','Ciudad Valles','1','Cd. Santos','42','Tanquián de Escobedo')," +
                        "(49,'24','San Luis Potosí','131','Ciudad Valles','2','Cd. Valles','13','Ciudad Valles')," +
                        "(50,'24','San Luis Potosí','131','Ciudad Valles','3','Tamasopo','10','Ciudad del Maíz')," +
                        "(51,'24','San Luis Potosí','131','Ciudad Valles','3','Tamasopo','36','Tamasopo')," +
                        "(52,'24','San Luis Potosí','131','Ciudad Valles','3','Tamasopo','58','El Naranjo')," +
                        "(53,'24','San Luis Potosí','131','Ciudad Valles','4','Tamazunchale','18','Huehuetlán')," +
                        "(54,'24','San Luis Potosí','131','Ciudad Valles','4','Tamazunchale','29','San Martín Chalchicuautla')," +
                        "(55,'24','San Luis Potosí','131','Ciudad Valles','4','Tamazunchale','37','Tamazunchale')," +
                        "(56,'24','San Luis Potosí','131','Ciudad Valles','4','Tamazunchale','38','Tampacán')," +
                        "(57,'24','San Luis Potosí','131','Ciudad Valles','4','Tamazunchale','53','Axtla de Terrazas')," +
                        "(58,'24','San Luis Potosí','131','Ciudad Valles','4','Tamazunchale','54','Xilitla')," +
                        "(59,'24','San Luis Potosí','131','Ciudad Valles','4','Tamazunchale','57','Matlapa')," +
                        "(60,'24','San Luis Potosí','132','Ebano','1','Pujal-Coy (1A. Fase)','16','Ebano')," +
                        "(61,'24','San Luis Potosí','132','Ebano','1','Pujal-Coy (1A. Fase)','30','San Nicolás Tolentino')," +
                        "(62,'24','San Luis Potosí','132','Ebano','1','Pujal-Coy (1A. Fase)','40','Tamuín')," +
                        "(63,'24','San Luis Potosí','132','Ebano','1','Pujal-Coy (1A. Fase)','42','Tanquián de Escobedo')," +
                        "(64,'24','San Luis Potosí','132','Ebano','2','Tamuín','16','Ebano')," +
                        "(65,'24','San Luis Potosí','132','Ebano','2','Tamuín','34','San Vicente Tancuayalab')," +
                        "(66,'24','San Luis Potosí','132','Ebano','2','Tamuín','40','Tamuín')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_SINALOA + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_SINALOA + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'25','Sinaloa','133','Los Mochis','1','Choix','7','Choix')," +
                        "(2,'25','Sinaloa','133','Los Mochis','2','El Fuerte','10','El Fuerte')," +
                        "(3,'25','Sinaloa','133','Los Mochis','3','El Carrizo','1','Ahome')," +
                        "(4,'25','Sinaloa','133','Los Mochis','3','El Carrizo','10','El Fuerte')," +
                        "(5,'25','Sinaloa','133','Los Mochis','4','San Blas','10','El Fuerte')," +
                        "(6,'25','Sinaloa','133','Los Mochis','5','Higueras de Zar','1','Ahome')," +
                        "(7,'25','Sinaloa','133','Los Mochis','5','Higueras de Zar','10','El Fuerte')," +
                        "(8,'25','Sinaloa','133','Los Mochis','6','Ahome','1','Ahome')," +
                        "(9,'25','Sinaloa','133','Los Mochis','7','Los Mochis','1','Ahome')," +
                        "(10,'25','Sinaloa','133','Los Mochis','7','Los Mochis','10','El Fuerte')," +
                        "(11,'25','Sinaloa','133','Los Mochis','8','Ruíz Cortinez','1','Ahome')," +
                        "(12,'25','Sinaloa','133','Los Mochis','8','Ruíz Cortinez','11','Guasave')," +
                        "(13,'25','Sinaloa','133','Los Mochis','8','Ruíz Cortinez','17','Sinaloa')," +
                        "(14,'25','Sinaloa','134','Guasave','1','Ocoroni','17','Sinaloa')," +
                        "(15,'25','Sinaloa','134','Guasave','2','Sinaloa de Leyva','17','Sinaloa')," +
                        "(16,'25','Sinaloa','134','Guasave','3','Bacubirito','17','Sinaloa')," +
                        "(17,'25','Sinaloa','134','Guasave','4','La Trinidad','11','Guasave')," +
                        "(18,'25','Sinaloa','134','Guasave','4','La Trinidad','17','Sinaloa')," +
                        "(19,'25','Sinaloa','134','Guasave','5','El Burrión','11','Guasave')," +
                        "(20,'25','Sinaloa','134','Guasave','5','El Burrión','17','Sinaloa')," +
                        "(21,'25','Sinaloa','134','Guasave','6','Petatlán','11','Guasave')," +
                        "(22,'25','Sinaloa','135','Guamúchil','2','Mocorito','13','Mocorito')," +
                        "(23,'25','Sinaloa','135','Guamúchil','3','Guamúchil','2','Angostura')," +
                        "(24,'25','Sinaloa','135','Guamúchil','3','Guamúchil','11','Guasave')," +
                        "(25,'25','Sinaloa','135','Guamúchil','3','Guamúchil','15','Salvador Alvarado')," +
                        "(26,'25','Sinaloa','135','Guamúchil','6','Angostura','2','Angostura')," +
                        "(27,'25','Sinaloa','135','Guamúchil','6','Angostura','13','Mocorito')," +
                        "(28,'25','Sinaloa','135','Guamúchil','6','Angostura','15','Salvador Alvarado')," +
                        "(29,'25','Sinaloa','135','Guamúchil','6','Angostura','18','Navolato')," +
                        "(30,'25','Sinaloa','136','Culiacán','1','Culiacán Altos','6','Culiacán')," +
                        "(31,'25','Sinaloa','136','Culiacán','2','El Tamarindo','6','Culiacán')," +
                        "(32,'25','Sinaloa','136','Culiacán','2','El Tamarindo','13','Mocorito')," +
                        "(33,'25','Sinaloa','136','Culiacán','2','El Tamarindo','18','Navolato')," +
                        "(34,'25','Sinaloa','136','Culiacán','3','Navolato','6','Culiacán')," +
                        "(35,'25','Sinaloa','136','Culiacán','3','Navolato','18','Navolato')," +
                        "(36,'25','Sinaloa','136','Culiacán','4','Culiacán','6','Culiacán')," +
                        "(37,'25','Sinaloa','136','Culiacán','4','Culiacán','18','Navolato')," +
                        "(38,'25','Sinaloa','136','Culiacán','5','El dorado','6','Culiacán')," +
                        "(39,'25','Sinaloa','136','Culiacán','6','Badiraguato','3','Badiraguato')," +
                        "(40,'25','Sinaloa','136','Culiacán','6','Badiraguato','13','Mocorito')," +
                        "(41,'25','Sinaloa','137','La Cruz','1','Pueblos Unidos','6','Culiacán')," +
                        "(42,'25','Sinaloa','137','La Cruz','2','Elota-Cosala','5','Cosalá')," +
                        "(43,'25','Sinaloa','137','La Cruz','2','Elota-Cosala','8','Elota')," +
                        "(44,'25','Sinaloa','137','La Cruz','3','Coyotitán','16','San Ignacio')," +
                        "(45,'25','Sinaloa','138','Mazatlán','1','Mazatlán','12','Mazatlán')," +
                        "(46,'25','Sinaloa','138','Mazatlán','2','Concordia','4','Concordia')," +
                        "(47,'25','Sinaloa','138','Mazatlán','3','El Rosario','14','Rosario')," +
                        "(48,'25','Sinaloa','138','Mazatlán','4','Escuinapa','9','Escuinapa')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_SONORA + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_SONORA + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'26','Sonora','139','Caborca','1','Sonoyta','48','Puerto Peñasco')," +
                        "(2,'26','Sonora','139','Caborca','1','Sonoyta','55','San Luis Río Colorado')," +
                        "(3,'26','Sonora','139','Caborca','1','Sonoyta','70','General Plutarco Elías Calles')," +
                        "(4,'26','Sonora','139','Caborca','2','Caborca','17','Caborca')," +
                        "(5,'26','Sonora','139','Caborca','2','Caborca','47','Pitiquito')," +
                        "(6,'26','Sonora','139','Caborca','3','Atil','4','Altar')," +
                        "(7,'26','Sonora','139','Caborca','3','Atil','7','Atil')," +
                        "(8,'26','Sonora','139','Caborca','3','Atil','46','Oquitoa')," +
                        "(9,'26','Sonora','139','Caborca','3','Atil','60','Sáric')," +
                        "(10,'26','Sonora','139','Caborca','3','Atil','65','Tubutama')," +
                        "(11,'26','Sonora','140','Magdalena','1','Magdalena','22','Cucurpe')," +
                        "(12,'26','Sonora','140','Magdalena','1','Magdalena','35','Imuris')," +
                        "(13,'26','Sonora','140','Magdalena','1','Magdalena','36','Magdalena')," +
                        "(14,'26','Sonora','140','Magdalena','2','Nogales','43','Nogales')," +
                        "(15,'26','Sonora','140','Magdalena','2','Nogales','59','Santa Cruz')," +
                        "(16,'26','Sonora','140','Magdalena','3','Santa Ana','16','Benjamín Hill')," +
                        "(17,'26','Sonora','140','Magdalena','3','Santa Ana','58','Santa Ana')," +
                        "(18,'26','Sonora','140','Magdalena','3','Santa Ana','64','Trincheras')," +
                        "(19,'26','Sonora','141','Agua Prieta','1','Agua Prieta','2','Agua Prieta')," +
                        "(20,'26','Sonora','141','Agua Prieta','1','Agua Prieta','27','Fronteras')," +
                        "(21,'26','Sonora','141','Agua Prieta','1','Agua Prieta','41','Nacozari de García')," +
                        "(22,'26','Sonora','141','Agua Prieta','2','Cananea','11','Bacoachi')," +
                        "(23,'26','Sonora','141','Agua Prieta','2','Cananea','19','Cananea')," +
                        "(24,'26','Sonora','141','Agua Prieta','2','Cananea','39','Naco')," +
                        "(25,'26','Sonora','142','Ures','1','Ures','45','Opodepe')," +
                        "(26,'26','Sonora','142','Ures','1','Ures','50','Rayón')," +
                        "(27,'26','Sonora','142','Ures','1','Ures','66','Ures')," +
                        "(28,'26','Sonora','142','Ures','2','Banámichi','1','Aconchi')," +
                        "(29,'26','Sonora','142','Ures','2','Banámichi','6','Arizpe')," +
                        "(30,'26','Sonora','142','Ures','2','Banámichi','13','Banámichi')," +
                        "(31,'26','Sonora','142','Ures','2','Banámichi','14','Baviácora')," +
                        "(32,'26','Sonora','142','Ures','2','Banámichi','34','Huépac')," +
                        "(33,'26','Sonora','142','Ures','2','Banámichi','53','San Felipe de Jesús')," +
                        "(34,'26','Sonora','143','Moctezuma','1','Moctezuma','23','Cumpas')," +
                        "(35,'26','Sonora','143','Moctezuma','1','Moctezuma','24','Divisaderos')," +
                        "(36,'26','Sonora','143','Moctezuma','1','Moctezuma','38','Moctezuma')," +
                        "(37,'26','Sonora','143','Moctezuma','1','Moctezuma','63','Tepache')," +
                        "(38,'26','Sonora','143','Moctezuma','2','Huásabas','28','Granados')," +
                        "(39,'26','Sonora','143','Moctezuma','2','Huásabas','32','Huásabas')," +
                        "(40,'26','Sonora','143','Moctezuma','2','Huásabas','67','Villa Hidalgo')," +
                        "(41,'26','Sonora','143','Moctezuma','3','Bacadéhuachi','8','Bacadéhuachi')," +
                        "(42,'26','Sonora','143','Moctezuma','3','Bacadéhuachi','40','Nácori Chico')," +
                        "(43,'26','Sonora','143','Moctezuma','4','Bavispe','10','Bacerac')," +
                        "(44,'26','Sonora','143','Moctezuma','4','Bavispe','15','Bavispe')," +
                        "(45,'26','Sonora','143','Moctezuma','4','Bavispe','31','Huachinera')," +
                        "(46,'26','Sonora','144','Hermosillo','1','Carbó','20','Carbó')," +
                        "(47,'26','Sonora','144','Hermosillo','1','Carbó','30','Hermosillo')," +
                        "(48,'26','Sonora','144','Hermosillo','1','Carbó','56','San Miguel de Horcasitas')," +
                        "(49,'26','Sonora','145','Mazatán','1','Villa Pesqueira','37','Mazatán')," +
                        "(50,'26','Sonora','145','Mazatán','1','Villa Pesqueira','57','San Pedro de La Cueva')," +
                        "(51,'26','Sonora','145','Mazatán','1','Villa Pesqueira','68','Villa Pesqueira')," +
                        "(52,'26','Sonora','145','Mazatán','2','La Colorada','21','La Colorada')," +
                        "(53,'26','Sonora','145','Mazatán','2','La Colorada','54','San Javier')," +
                        "(54,'26','Sonora','145','Mazatán','2','La Colorada','62','Suaqui Grande')," +
                        "(55,'26','Sonora','145','Mazatán','3','Soyopa','44','Onavas')," +
                        "(56,'26','Sonora','145','Mazatán','3','Soyopa','61','Soyopa')," +
                        "(57,'26','Sonora','146','Sahuaripa','1','Arivechi','5','Arivechi')," +
                        "(58,'26','Sonora','146','Sahuaripa','1','Arivechi','52','Sahuaripa')," +
                        "(59,'26','Sonora','146','Sahuaripa','2','Bacanora','9','Bacanora')," +
                        "(60,'26','Sonora','146','Sahuaripa','3','Yécora','69','Yécora')," +
                        "(61,'26','Sonora','147','Guaymas','1','Guaymas D.D.R.','25','Empalme')," +
                        "(62,'26','Sonora','147','Guaymas','1','Guaymas D.D.R.','29','Guaymas')," +
                        "(63,'26','Sonora','148','Cajeme','1','Cd. Obregón','12','Bácum')," +
                        "(64,'26','Sonora','148','Cajeme','1','Cd. Obregón','18','Cajeme')," +
                        "(65,'26','Sonora','148','Cajeme','1','Cd. Obregón','42','Navojoa')," +
                        "(66,'26','Sonora','148','Cajeme','2','Villa Juárez','18','Cajeme')," +
                        "(67,'26','Sonora','148','Cajeme','2','Villa Juárez','26','Etchojoa')," +
                        "(68,'26','Sonora','148','Cajeme','2','Villa Juárez','29','Guaymas')," +
                        "(69,'26','Sonora','148','Cajeme','2','Villa Juárez','42','Navojoa')," +
                        "(70,'26','Sonora','148','Cajeme','2','Villa Juárez','71','Benito Juárez')," +
                        "(71,'26','Sonora','148','Cajeme','3','Bácum','12','Bácum')," +
                        "(72,'26','Sonora','148','Cajeme','3','Bácum','18','Cajeme')," +
                        "(73,'26','Sonora','148','Cajeme','3','Bácum','29','Guaymas')," +
                        "(74,'26','Sonora','148','Cajeme','3','Bácum','72','San Ignacio Río Muerto')," +
                        "(75,'26','Sonora','148','Cajeme','4','Pueblo Yaqui','12','Bácum')," +
                        "(76,'26','Sonora','148','Cajeme','4','Pueblo Yaqui','18','Cajeme')," +
                        "(77,'26','Sonora','148','Cajeme','4','Pueblo Yaqui','29','Guaymas')," +
                        "(78,'26','Sonora','148','Cajeme','4','Pueblo Yaqui','72','San Ignacio Río Muerto')," +
                        "(79,'26','Sonora','148','Cajeme','5','Vicam','12','Bácum')," +
                        "(80,'26','Sonora','148','Cajeme','5','Vicam','18','Cajeme')," +
                        "(81,'26','Sonora','148','Cajeme','5','Vicam','29','Guaymas')," +
                        "(82,'26','Sonora','148','Cajeme','6','Rosario','49','Quiriego')," +
                        "(83,'26','Sonora','148','Cajeme','6','Rosario','51','Rosario')," +
                        "(84,'26','Sonora','149','Navojoa','1','Navojoa','26','Etchojoa')," +
                        "(85,'26','Sonora','149','Navojoa','1','Navojoa','33','Huatabampo')," +
                        "(86,'26','Sonora','149','Navojoa','1','Navojoa','42','Navojoa')," +
                        "(87,'26','Sonora','149','Navojoa','2','Etchojoa','26','Etchojoa')," +
                        "(88,'26','Sonora','149','Navojoa','2','Etchojoa','33','Huatabampo')," +
                        "(89,'26','Sonora','149','Navojoa','2','Etchojoa','42','Navojoa')," +
                        "(90,'26','Sonora','149','Navojoa','3','Huatabampo','3','Alamos')," +
                        "(91,'26','Sonora','149','Navojoa','3','Huatabampo','26','Etchojoa')," +
                        "(92,'26','Sonora','149','Navojoa','3','Huatabampo','33','Huatabampo')," +
                        "(93,'26','Sonora','149','Navojoa','3','Huatabampo','42','Navojoa')," +
                        "(94,'26','Sonora','149','Navojoa','4','Álamos','3','Alamos')," +
                        "(95,'26','Sonora','193','San Luis Río Colorado','1','San Luis Río Colorado','55','San Luis Río Colorado')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_TABASCO + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_TABASCO + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'27','Tabasco','150','Villahermosa','1','Teapa','16','Teapa')," +
                        "(2,'27','Tabasco','150','Villahermosa','2','Centro','4','Centro')," +
                        "(3,'27','Tabasco','150','Villahermosa','3','Centla','3','Centla')," +
                        "(4,'27','Tabasco','150','Villahermosa','4','Macuspana','12','Macuspana')," +
                        "(5,'27','Tabasco','150','Villahermosa','5','Jalapa','9','Jalapa')," +
                        "(6,'27','Tabasco','150','Villahermosa','6','Tacotalpa','15','Tacotalpa')," +
                        "(7,'27','Tabasco','151','Cárdenas','1','Huimanguillo','8','Huimanguillo')," +
                        "(8,'27','Tabasco','151','Cárdenas','2','Cárdenas','2','Cárdenas')," +
                        "(9,'27','Tabasco','151','Cárdenas','3','Comalcalco','5','Comalcalco')," +
                        "(10,'27','Tabasco','151','Cárdenas','4','Cunduacán','6','Cunduacán')," +
                        "(11,'27','Tabasco','151','Cárdenas','5','Jalpa de Méndez','10','Jalpa de Méndez')," +
                        "(12,'27','Tabasco','151','Cárdenas','6','Nacajuca','13','Nacajuca')," +
                        "(13,'27','Tabasco','151','Cárdenas','7','Paraíso','14','Paraíso')," +
                        "(14,'27','Tabasco','151','Cárdenas','8','Benito Juárez','2','Cárdenas')," +
                        "(15,'27','Tabasco','151','Cárdenas','9','Lic. Fco. Trujillo','8','Huimanguillo')," +
                        "(16,'27','Tabasco','153','Emiliano Zapata','1','Jonuta','11','Jonuta')," +
                        "(17,'27','Tabasco','153','Emiliano Zapata','2','Emiliano Zapata','7','Emiliano Zapata')," +
                        "(18,'27','Tabasco','153','Emiliano Zapata','3','Tenosique','17','Tenosique')," +
                        "(19,'27','Tabasco','153','Emiliano Zapata','4','Balancán','1','Balancán')," +
                        "(20,'27','Tabasco','153','Emiliano Zapata','5','Villa Quetzalcóatl','1','Balancán')," +
                        "(21,'27','Tabasco','153','Emiliano Zapata','6','Sur 18','1','Balancán')," +
                        "(22,'27','Tabasco','153','Emiliano Zapata','6','Sur 18','17','Tenosique')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_TAMAULIPAS + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_TAMAULIPAS + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'28','Tamaulipas','155','Laredo','1','Nuevo Laredo','27','Nuevo Laredo')," +
                        "(2,'28','Tamaulipas','155','Laredo','2','Guerrero','14','Guerrero')," +
                        "(3,'28','Tamaulipas','156','Díaz Ordaz','1','Miguel Alemán','7','Camargo')," +
                        "(4,'28','Tamaulipas','156','Díaz Ordaz','1','Miguel Alemán','24','Mier')," +
                        "(5,'28','Tamaulipas','156','Díaz Ordaz','1','Miguel Alemán','25','Miguel Alemán')," +
                        "(6,'28','Tamaulipas','156','Díaz Ordaz','2','Díaz Ordaz','7','Camargo')," +
                        "(7,'28','Tamaulipas','156','Díaz Ordaz','2','Díaz Ordaz','15','Gustavo Díaz Ordaz')," +
                        "(8,'28','Tamaulipas','156','Díaz Ordaz','2','Díaz Ordaz','32','Reynosa')," +
                        "(9,'28','Tamaulipas','156','Díaz Ordaz','3','Reynosa','32','Reynosa')," +
                        "(10,'28','Tamaulipas','156','Díaz Ordaz','4','Río Bravo','32','Reynosa')," +
                        "(11,'28','Tamaulipas','156','Díaz Ordaz','4','Río Bravo','33','Río Bravo')," +
                        "(12,'28','Tamaulipas','157','Control','1','Control','22','Matamoros')," +
                        "(13,'28','Tamaulipas','157','Control','1','Control','33','Río Bravo')," +
                        "(14,'28','Tamaulipas','157','Control','2','Matamoros','22','Matamoros')," +
                        "(15,'28','Tamaulipas','157','Control','3','Valle Hermoso','22','Matamoros')," +
                        "(16,'28','Tamaulipas','157','Control','3','Valle Hermoso','33','Río Bravo')," +
                        "(17,'28','Tamaulipas','157','Control','3','Valle Hermoso','40','Valle Hermoso')," +
                        "(18,'28','Tamaulipas','157','Control','4','Santa Apolonia','33','Río Bravo')," +
                        "(19,'28','Tamaulipas','157','Control','4','Santa Apolonia','40','Valle Hermoso')," +
                        "(20,'28','Tamaulipas','157','Control','5','Brecha 120/Rio Bravo','33','Río Bravo')," +
                        "(21,'28','Tamaulipas','157','Control','5','Brecha 120/Rio Bravo','40','Valle Hermoso')," +
                        "(22,'28','Tamaulipas','158','San Fernando','1','San Fernando','10','Cruillas')," +
                        "(23,'28','Tamaulipas','158','San Fernando','1','San Fernando','35','San Fernando')," +
                        "(24,'28','Tamaulipas','158','San Fernando','2','San Germán','35','San Fernando')," +
                        "(25,'28','Tamaulipas','158','San Fernando','3','Gonzalez Villarreal','23','Méndez')," +
                        "(26,'28','Tamaulipas','158','San Fernando','3','Gonzalez Villarreal','35','San Fernando')," +
                        "(27,'28','Tamaulipas','158','San Fernando','4','Méndez','5','Burgos')," +
                        "(28,'28','Tamaulipas','158','San Fernando','4','Méndez','23','Méndez')," +
                        "(29,'28','Tamaulipas','159','Abasolo','1','Abasolo','1','Abasolo')," +
                        "(30,'28','Tamaulipas','159','Abasolo','1','Abasolo','18','Jiménez')," +
                        "(31,'28','Tamaulipas','159','Abasolo','1','Abasolo','37','Soto La Marina')," +
                        "(32,'28','Tamaulipas','159','Abasolo','2','Lavaderos','37','Soto La Marina')," +
                        "(33,'28','Tamaulipas','159','Abasolo','3','Soto La Marina','37','Soto La Marina')," +
                        "(34,'28','Tamaulipas','159','Abasolo','4','Jiménez','18','Jiménez')," +
                        "(35,'28','Tamaulipas','160','Victoria','1','Hidalgo','16','Hidalgo')," +
                        "(36,'28','Tamaulipas','160','Victoria','1','Hidalgo','20','Mainero')," +
                        "(37,'28','Tamaulipas','160','Victoria','1','Hidalgo','42','Villagrán')," +
                        "(38,'28','Tamaulipas','160','Victoria','2','San Carlos','34','San Carlos')," +
                        "(39,'28','Tamaulipas','160','Victoria','2','San Carlos','36','San Nicolás')," +
                        "(40,'28','Tamaulipas','160','Victoria','3','Victoria','13','Güémez')," +
                        "(41,'28','Tamaulipas','160','Victoria','3','Victoria','41','Victoria')," +
                        "(42,'28','Tamaulipas','160','Victoria','4','Llera','19','Llera')," +
                        "(43,'28','Tamaulipas','160','Victoria','5','Casas','8','Casas')," +
                        "(44,'28','Tamaulipas','160','Victoria','6','Padilla','30','Padilla')," +
                        "(45,'28','Tamaulipas','161','Jaumave','1','Jaumave','17','Jaumave')," +
                        "(46,'28','Tamaulipas','161','Jaumave','1','Jaumave','26','Miquihuana')," +
                        "(47,'28','Tamaulipas','161','Jaumave','1','Jaumave','31','Palmillas')," +
                        "(48,'28','Tamaulipas','161','Jaumave','2','Tula','6','Bustamante')," +
                        "(49,'28','Tamaulipas','161','Jaumave','2','Tula','39','Tula')," +
                        "(50,'28','Tamaulipas','162','Mante','1','Mante','4','Antiguo Morelos')," +
                        "(51,'28','Tamaulipas','162','Mante','1','Mante','21','El Mante')," +
                        "(52,'28','Tamaulipas','162','Mante','1','Mante','28','Nuevo Morelos')," +
                        "(53,'28','Tamaulipas','162','Mante','2','Xicoténcatl','11','Gómez Farías')," +
                        "(54,'28','Tamaulipas','162','Mante','2','Xicoténcatl','43','Xicoténcatl')," +
                        "(55,'28','Tamaulipas','162','Mante','3','Ocampo','29','Ocampo')," +
                        "(56,'28','Tamaulipas','162','Mante','3','Ocampo','43','Xicoténcatl')," +
                        "(57,'28','Tamaulipas','162','Mante','4','Animas','12','González')," +
                        "(58,'28','Tamaulipas','162','Mante','4','Animas','21','El Mante')," +
                        "(59,'28','Tamaulipas','163','González','1','Aldama','2','Aldama')," +
                        "(60,'28','Tamaulipas','163','González','2','González','12','González')," +
                        "(61,'28','Tamaulipas','163','González','3','Altamira','3','Altamira')," +
                        "(62,'28','Tamaulipas','163','González','3','Altamira','9','Ciudad Madero')," +
                        "(63,'28','Tamaulipas','163','González','3','Altamira','38','Tampico')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_TLAXCALA + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_TLAXCALA + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','1','Amaxac de Guerrero')," +
                        "(2,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','2','Apetatitlán de Antonio Carvajal')," +
                        "(3,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','9','Cuaxomulco')," +
                        "(4,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','10','Chiautempan')," +
                        "(5,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','18','Contla de Juan Cuamatzi')," +
                        "(6,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','26','Santa Cruz Tlaxcala')," +
                        "(7,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','28','Teolocholco')," +
                        "(8,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','40','Xaltocan')," +
                        "(9,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','43','Yauhquemehcan')," +
                        "(10,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','48','La Magdalena Tlaltelulco')," +
                        "(11,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','50','San Francisco Tetlanohcan')," +
                        "(12,'29','Tlaxcala','164','Tlaxcala','1','Aguanaja','55','San Lucas Tecopilco')," +
                        "(13,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','17','Mazatecochco de José María Morelos')," +
                        "(14,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','22','Acuamanala de Miguel Hidalgo')," +
                        "(15,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','25','San Pablo del Monte')," +
                        "(16,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','27','Tenancingo')," +
                        "(17,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','29','Tepeyanco')," +
                        "(18,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','41','Papalotla de Xicohténcatl')," +
                        "(19,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','42','Xicohtzinco')," +
                        "(20,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','44','Zacatelco')," +
                        "(21,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','53','San Juan Huactzinco')," +
                        "(22,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','54','San Lorenzo Axocomanitla')," +
                        "(23,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','58','Santa Catarina Ayometla')," +
                        "(24,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','59','Santa Cruz Quilehtla')," +
                        "(25,'29','Tlaxcala','164','Tlaxcala','2','Zacatelco','60','Santa Isabel Xiloxoxtla')," +
                        "(26,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','15','Ixtacuixtla de Mariano Matamoros')," +
                        "(27,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','19','Tepetitla de Lardizábal')," +
                        "(28,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','23','Natívitas')," +
                        "(29,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','24','Panotla')," +
                        "(30,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','32','Tetlatlahuca')," +
                        "(31,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','33','Tlaxcala')," +
                        "(32,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','36','Totolac')," +
                        "(33,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','49','San Damián Texóloc')," +
                        "(34,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','51','San Jerónimo Zacualpan')," +
                        "(35,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','56','Santa Ana Nopalucan')," +
                        "(36,'29','Tlaxcala','164','Tlaxcala','3','Nativitas/Ixtacuixtla','57','Santa Apolonia Teacalco')," +
                        "(37,'29','Tlaxcala','165','Calpulalpan','1','Calpulalpan','6','Calpulalpan')," +
                        "(38,'29','Tlaxcala','165','Calpulalpan','1','Calpulalpan','20','Sanctórum de Lázaro Cárdenas')," +
                        "(39,'29','Tlaxcala','165','Calpulalpan','1','Calpulalpan','21','Nanacamilpa de Mariano Arista')," +
                        "(40,'29','Tlaxcala','165','Calpulalpan','1','Calpulalpan','45','Benito Juárez')," +
                        "(41,'29','Tlaxcala','165','Calpulalpan','2','Hueyotlipan','12','Españita')," +
                        "(42,'29','Tlaxcala','165','Calpulalpan','2','Hueyotlipan','14','Hueyotlipan')," +
                        "(43,'29','Tlaxcala','165','Calpulalpan','3','Apizaco','5','Apizaco')," +
                        "(44,'29','Tlaxcala','165','Calpulalpan','3','Apizaco','11','Muñoz de Domingo Arenas')," +
                        "(45,'29','Tlaxcala','165','Calpulalpan','3','Apizaco','31','Tetla de La Solidaridad')," +
                        "(46,'29','Tlaxcala','165','Calpulalpan','4','Tlaxco','3','Atlangatepec')," +
                        "(47,'29','Tlaxcala','165','Calpulalpan','4','Tlaxco','34','Tlaxco')," +
                        "(48,'29','Tlaxcala','166','Huamantla','1','Huamantla','13','Huamantla')," +
                        "(49,'29','Tlaxcala','166','Huamantla','1','Huamantla','16','Ixtenco')," +
                        "(50,'29','Tlaxcala','166','Huamantla','1','Huamantla','37','Ziltlaltépec de Trinidad Sánchez Santos')," +
                        "(51,'29','Tlaxcala','166','Huamantla','2','Cuapiaxtla','4','Atltzayanca')," +
                        "(52,'29','Tlaxcala','166','Huamantla','2','Cuapiaxtla','7','El Carmen Tequexquitla')," +
                        "(53,'29','Tlaxcala','166','Huamantla','2','Cuapiaxtla','8','Cuapiaxtla')," +
                        "(54,'29','Tlaxcala','166','Huamantla','3','Teometitlán/Velazco','30','Terrenate')," +
                        "(55,'29','Tlaxcala','166','Huamantla','3','Teometitlán/Velazco','35','Tocatlán')," +
                        "(56,'29','Tlaxcala','166','Huamantla','3','Teometitlán/Velazco','38','Tzompantepec')," +
                        "(57,'29','Tlaxcala','166','Huamantla','3','Teometitlán/Velazco','39','Xaloztoc')," +
                        "(58,'29','Tlaxcala','166','Huamantla','3','Teometitlán/Velazco','46','Emiliano Zapata')," +
                        "(59,'29','Tlaxcala','166','Huamantla','3','Teometitlán/Velazco','47','Lázaro Cárdenas')," +
                        "(60,'29','Tlaxcala','166','Huamantla','3','Teometitlán/Velazco','52','San José Teacalco')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_VERACRUZ + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_VERACRUZ + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'30','Veracruz','167','Huayacocotla','1','Huayacocotla','72','Huayacocotla')," +
                        "(2,'30','Veracruz','167','Huayacocotla','1','Huayacocotla','76','Ilamatlán')," +
                        "(3,'30','Veracruz','167','Huayacocotla','1','Huayacocotla','170','Texcatepec')," +
                        "(4,'30','Veracruz','167','Huayacocotla','1','Huayacocotla','198','Zacualpan')," +
                        "(5,'30','Veracruz','167','Huayacocotla','1','Huayacocotla','202','Zontecomatlán de López Y Fuentes')," +
                        "(6,'30','Veracruz','167','Huayacocotla','2','Ixhuatlán de Madero','83','Ixhuatlán de Madero')," +
                        "(7,'30','Veracruz','167','Huayacocotla','2','Ixhuatlán de Madero','180','Tlachichilco')," +
                        "(8,'30','Veracruz','168','Tuxpan','1','Tuxpan','151','Tamiahua')," +
                        "(9,'30','Veracruz','168','Tuxpan','1','Tuxpan','189','Tuxpan')," +
                        "(10,'30','Veracruz','168','Tuxpan','2','Álamo Temapache','34','Cerro Azul')," +
                        "(11,'30','Veracruz','168','Tuxpan','2','Álamo Temapache','160','Álamo Temapache')," +
                        "(12,'30','Veracruz','168','Tuxpan','2','Álamo Temapache','167','Tepetzintla')," +
                        "(13,'30','Veracruz','168','Tuxpan','3','Tihuatlán','33','Cazones de Herrera')," +
                        "(14,'30','Veracruz','168','Tuxpan','3','Tihuatlán','40','Coatzintla')," +
                        "(15,'30','Veracruz','168','Tuxpan','3','Tihuatlán','131','Poza Rica de Hidalgo')," +
                        "(16,'30','Veracruz','168','Tuxpan','3','Tihuatlán','157','Castillo de Teayo')," +
                        "(17,'30','Veracruz','168','Tuxpan','3','Tihuatlán','175','Tihuatlán')," +
                        "(18,'30','Veracruz','169','Martínez de la Torre','1','Martínez de La Torre','23','Atzalan')," +
                        "(19,'30','Veracruz','169','Martínez de la Torre','1','Martínez de La Torre','102','Martínez de La Torre')," +
                        "(20,'30','Veracruz','169','Martínez de la Torre','1','Martínez de La Torre','183','Tlapacoyan')," +
                        "(21,'30','Veracruz','169','Martínez de la Torre','1','Martínez de La Torre','211','San Rafael')," +
                        "(22,'30','Veracruz','169','Martínez de la Torre','2','Papantla','69','Gutiérrez Zamora')," +
                        "(23,'30','Veracruz','169','Martínez de la Torre','2','Papantla','124','Papantla')," +
                        "(24,'30','Veracruz','169','Martínez de la Torre','2','Papantla','158','Tecolutla')," +
                        "(25,'30','Veracruz','169','Martínez de la Torre','3','Entabladero/Espinal','37','Coahuitlán')," +
                        "(26,'30','Veracruz','169','Martínez de la Torre','3','Entabladero/Espinal','50','Coxquihui')," +
                        "(27,'30','Veracruz','169','Martínez de la Torre','3','Entabladero/Espinal','51','Coyutla')," +
                        "(28,'30','Veracruz','169','Martínez de la Torre','3','Entabladero/Espinal','64','Chumatlán')," +
                        "(29,'30','Veracruz','169','Martínez de la Torre','3','Entabladero/Espinal','66','Espinal')," +
                        "(30,'30','Veracruz','169','Martínez de la Torre','3','Entabladero/Espinal','67','Filomeno Mata')," +
                        "(31,'30','Veracruz','169','Martínez de la Torre','3','Entabladero/Espinal','103','Mecatlán')," +
                        "(32,'30','Veracruz','169','Martínez de la Torre','3','Entabladero/Espinal','203','Zozocolco de Hidalgo')," +
                        "(33,'30','Veracruz','169','Martínez de la Torre','4','Misantla','42','Colipa')," +
                        "(34,'30','Veracruz','169','Martínez de la Torre','4','Misantla','95','Juchique de Ferrer')," +
                        "(35,'30','Veracruz','169','Martínez de la Torre','4','Misantla','109','Misantla')," +
                        "(36,'30','Veracruz','169','Martínez de la Torre','4','Misantla','163','Tenochtitlán')," +
                        "(37,'30','Veracruz','169','Martínez de la Torre','4','Misantla','197','Yecuatla')," +
                        "(38,'30','Veracruz','169','Martínez de la Torre','5','Vega de La Torre','114','Nautla')," +
                        "(39,'30','Veracruz','169','Martínez de la Torre','5','Vega de La Torre','192','Vega de Alatorre')," +
                        "(40,'30','Veracruz','170','Coatepec','1','Coatepec','17','Apazapan')," +
                        "(41,'30','Veracruz','170','Coatepec','1','Coatepec','38','Coatepec')," +
                        "(42,'30','Veracruz','170','Coatepec','1','Coatepec','46','Cosautlán de Carvajal')," +
                        "(43,'30','Veracruz','170','Coatepec','1','Coatepec','65','Emiliano Zapata')," +
                        "(44,'30','Veracruz','170','Coatepec','1','Coatepec','79','Ixhuacán de Los Reyes')," +
                        "(45,'30','Veracruz','170','Coatepec','1','Coatepec','87','Xalapa')," +
                        "(46,'30','Veracruz','170','Coatepec','1','Coatepec','88','Jalcomulco')," +
                        "(47,'30','Veracruz','170','Coatepec','1','Coatepec','92','Xico')," +
                        "(48,'30','Veracruz','170','Coatepec','1','Coatepec','164','Teocelo')," +
                        "(49,'30','Veracruz','170','Coatepec','1','Coatepec','182','Tlalnelhuayocan')," +
                        "(50,'30','Veracruz','170','Coatepec','2','Perote','10','Altotonga')," +
                        "(51,'30','Veracruz','170','Coatepec','2','Perote','25','Ayahualulco')," +
                        "(52,'30','Veracruz','170','Coatepec','2','Perote','46','Cosautlán de Carvajal')," +
                        "(53,'30','Veracruz','170','Coatepec','2','Perote','79','Ixhuacán de Los Reyes')," +
                        "(54,'30','Veracruz','170','Coatepec','2','Perote','86','Jalacingo')," +
                        "(55,'30','Veracruz','170','Coatepec','2','Perote','107','Las Minas')," +
                        "(56,'30','Veracruz','170','Coatepec','2','Perote','128','Perote')," +
                        "(57,'30','Veracruz','170','Coatepec','2','Perote','132','Las Vigas de Ramírez')," +
                        "(58,'30','Veracruz','170','Coatepec','2','Perote','156','Tatatila')," +
                        "(59,'30','Veracruz','170','Coatepec','2','Perote','194','Villa Aldama')," +
                        "(60,'30','Veracruz','170','Coatepec','3','Naolinco','1','Acajete')," +
                        "(61,'30','Veracruz','170','Coatepec','3','Naolinco','2','Acatlán')," +
                        "(62,'30','Veracruz','170','Coatepec','3','Naolinco','26','Banderilla')," +
                        "(63,'30','Veracruz','170','Coatepec','3','Naolinco','36','Coacoatzintla')," +
                        "(64,'30','Veracruz','170','Coatepec','3','Naolinco','57','Chiconquiaco')," +
                        "(65,'30','Veracruz','170','Coatepec','3','Naolinco','93','Jilotepec')," +
                        "(66,'30','Veracruz','170','Coatepec','3','Naolinco','96','Landero Y Coss')," +
                        "(67,'30','Veracruz','170','Coatepec','3','Naolinco','106','Miahuatlán')," +
                        "(68,'30','Veracruz','170','Coatepec','3','Naolinco','112','Naolinco')," +
                        "(69,'30','Veracruz','170','Coatepec','3','Naolinco','132','Las Vigas de Ramírez')," +
                        "(70,'30','Veracruz','170','Coatepec','3','Naolinco','136','Rafael Lucio')," +
                        "(71,'30','Veracruz','170','Coatepec','3','Naolinco','166','Tepetlán')," +
                        "(72,'30','Veracruz','170','Coatepec','3','Naolinco','177','Tlacolulan')," +
                        "(73,'30','Veracruz','170','Coatepec','3','Naolinco','187','Tonayán')," +
                        "(74,'30','Veracruz','171','Fortín','1','Fortín','14','Amatlán de Los Reyes')," +
                        "(75,'30','Veracruz','171','Fortín','1','Fortín','41','Coetzala')," +
                        "(76,'30','Veracruz','171','Fortín','1','Fortín','44','Córdoba')," +
                        "(77,'30','Veracruz','171','Fortín','1','Fortín','62','Chocamán')," +
                        "(78,'30','Veracruz','171','Fortín','1','Fortín','68','Fortín')," +
                        "(79,'30','Veracruz','171','Fortín','1','Fortín','85','Ixtaczoquitlán')," +
                        "(80,'30','Veracruz','171','Fortín','1','Fortín','113','Naranjal')," +
                        "(81,'30','Veracruz','171','Fortín','1','Fortín','135','Rafael Delgado')," +
                        "(82,'30','Veracruz','171','Fortín','1','Fortín','185','Tlilapan')," +
                        "(83,'30','Veracruz','171','Fortín','2','Tezonapa','52','Cuichapa')," +
                        "(84,'30','Veracruz','171','Fortín','2','Tezonapa','117','Omealca')," +
                        "(85,'30','Veracruz','171','Fortín','2','Tezonapa','173','Tezonapa')," +
                        "(86,'30','Veracruz','171','Fortín','3','Atoyac','21','Atoyac')," +
                        "(87,'30','Veracruz','171','Fortín','3','Atoyac','31','Carrillo Puerto')," +
                        "(88,'30','Veracruz','171','Fortín','3','Atoyac','53','Cuitláhuac')," +
                        "(89,'30','Veracruz','171','Fortín','3','Atoyac','125','Paso del Macho')," +
                        "(90,'30','Veracruz','171','Fortín','3','Atoyac','165','Tepatlaxco')," +
                        "(91,'30','Veracruz','171','Fortín','3','Atoyac','196','Yanga')," +
                        "(92,'30','Veracruz','171','Fortín','4','Zongolica','19','Astacinga')," +
                        "(93,'30','Veracruz','171','Fortín','4','Zongolica','20','Atlahuilco')," +
                        "(94,'30','Veracruz','171','Fortín','4','Zongolica','98','Magdalena')," +
                        "(95,'30','Veracruz','171','Fortín','4','Zongolica','110','Mixtla de Altamirano')," +
                        "(96,'30','Veracruz','171','Fortín','4','Zongolica','137','Los Reyes')," +
                        "(97,'30','Veracruz','171','Fortín','4','Zongolica','140','San Andrés Tenejapan')," +
                        "(98,'30','Veracruz','171','Fortín','4','Zongolica','159','Tehuipango')," +
                        "(99,'30','Veracruz','171','Fortín','4','Zongolica','168','Tequila')," +
                        "(100,'30','Veracruz','171','Fortín','4','Zongolica','171','Texhuacán')," +
                        "(101,'30','Veracruz','171','Fortín','4','Zongolica','184','Tlaquilpa')," +
                        "(102,'30','Veracruz','171','Fortín','4','Zongolica','201','Zongolica')," +
                        "(103,'30','Veracruz','171','Fortín','5','Acultzingo','6','Acultzingo')," +
                        "(104,'30','Veracruz','171','Fortín','5','Acultzingo','18','Aquila')," +
                        "(105,'30','Veracruz','171','Fortín','5','Acultzingo','22','Atzacan')," +
                        "(106,'30','Veracruz','171','Fortín','5','Acultzingo','30','Camerino Z. Mendoza')," +
                        "(107,'30','Veracruz','171','Fortín','5','Acultzingo','74','Huiloapan de Cuauhtémoc')," +
                        "(108,'30','Veracruz','171','Fortín','5','Acultzingo','81','Ixhuatlancillo')," +
                        "(109,'30','Veracruz','171','Fortín','5','Acultzingo','99','Maltrata')," +
                        "(110,'30','Veracruz','171','Fortín','5','Acultzingo','101','Mariano Escobedo')," +
                        "(111,'30','Veracruz','171','Fortín','5','Acultzingo','115','Nogales')," +
                        "(112,'30','Veracruz','171','Fortín','5','Acultzingo','118','Orizaba')," +
                        "(113,'30','Veracruz','171','Fortín','5','Acultzingo','127','La Perla')," +
                        "(114,'30','Veracruz','171','Fortín','5','Acultzingo','138','Río Blanco')," +
                        "(115,'30','Veracruz','171','Fortín','5','Acultzingo','147','Soledad Atzompa')," +
                        "(116,'30','Veracruz','171','Fortín','5','Acultzingo','195','Xoxocotla')," +
                        "(117,'30','Veracruz','171','Fortín','6','Huatusco','8','Alpatláhuac')," +
                        "(118,'30','Veracruz','171','Fortín','6','Huatusco','24','Tlaltetela')," +
                        "(119,'30','Veracruz','171','Fortín','6','Huatusco','29','Calcahualco')," +
                        "(120,'30','Veracruz','171','Fortín','6','Huatusco','43','Comapa')," +
                        "(121,'30','Veracruz','171','Fortín','6','Huatusco','47','Coscomatepec')," +
                        "(122,'30','Veracruz','171','Fortín','6','Huatusco','71','Huatusco')," +
                        "(123,'30','Veracruz','171','Fortín','6','Huatusco','80','Ixhuatlán del Café')," +
                        "(124,'30','Veracruz','171','Fortín','6','Huatusco','146','Sochiapa')," +
                        "(125,'30','Veracruz','171','Fortín','6','Huatusco','162','Tenampa')," +
                        "(126,'30','Veracruz','171','Fortín','6','Huatusco','179','Tlacotepec de Mejía')," +
                        "(127,'30','Veracruz','171','Fortín','6','Huatusco','186','Tomatlán')," +
                        "(128,'30','Veracruz','171','Fortín','6','Huatusco','188','Totutla')," +
                        "(129,'30','Veracruz','171','Fortín','6','Huatusco','200','Zentla')," +
                        "(130,'30','Veracruz','172','La Antigua','1','Paso de Ovejas','16','La Antigua')," +
                        "(131,'30','Veracruz','172','La Antigua','1','Paso de Ovejas','126','Paso de Ovejas')," +
                        "(132,'30','Veracruz','172','La Antigua','1','Paso de Ovejas','134','Puente Nacional')," +
                        "(133,'30','Veracruz','172','La Antigua','2','Actopan','4','Actopan')," +
                        "(134,'30','Veracruz','172','La Antigua','2','Actopan','9','Alto Lucero de Gutiérrez Barrios')," +
                        "(135,'30','Veracruz','172','La Antigua','2','Actopan','191','Ursulo Galván')," +
                        "(136,'30','Veracruz','173','Veracruz','1','Veracruz','11','Alvarado')," +
                        "(137,'30','Veracruz','173','Veracruz','1','Veracruz','28','Boca del Río')," +
                        "(138,'30','Veracruz','173','Veracruz','1','Veracruz','90','Jamapa')," +
                        "(139,'30','Veracruz','173','Veracruz','1','Veracruz','100','Manlio Fabio Altamirano')," +
                        "(140,'30','Veracruz','173','Veracruz','1','Veracruz','105','Medellín')," +
                        "(141,'30','Veracruz','173','Veracruz','1','Veracruz','193','Veracruz')," +
                        "(142,'30','Veracruz','173','Veracruz','2','Soledad de Doblado','7','Camarón de Tejeda')," +
                        "(143,'30','Veracruz','173','Veracruz','2','Soledad de Doblado','49','Cotaxtla')," +
                        "(144,'30','Veracruz','173','Veracruz','2','Soledad de Doblado','148','Soledad de Doblado')," +
                        "(145,'30','Veracruz','173','Veracruz','3','Piedras Negras','75','Ignacio de La Llave')," +
                        "(146,'30','Veracruz','173','Veracruz','3','Piedras Negras','174','Tierra Blanca')," +
                        "(147,'30','Veracruz','173','Veracruz','3','Piedras Negras','181','Tlalixcoyan')," +
                        "(148,'30','Veracruz','174','Ciudad Alemán','1','Cd. Alemán','45','Cosamaloapan de Carpio')," +
                        "(149,'30','Veracruz','174','Ciudad Alemán','1','Cd. Alemán','54','Chacaltianguis')," +
                        "(150,'30','Veracruz','174','Ciudad Alemán','1','Cd. Alemán','119','Otatitlán')," +
                        "(151,'30','Veracruz','174','Ciudad Alemán','1','Cd. Alemán','176','Tlacojalpan')," +
                        "(152,'30','Veracruz','174','Ciudad Alemán','1','Cd. Alemán','190','Tuxtilla')," +
                        "(153,'30','Veracruz','174','Ciudad Alemán','1','Cd. Alemán','207','Tres Valles')," +
                        "(154,'30','Veracruz','174','Ciudad Alemán','1','Cd. Alemán','208','Carlos A. Carrillo')," +
                        "(155,'30','Veracruz','174','Ciudad Alemán','2','Tierra Blanca','174','Tierra Blanca')," +
                        "(156,'30','Veracruz','174','Ciudad Alemán','3','Tlacotalpan','5','Acula')," +
                        "(157,'30','Veracruz','174','Ciudad Alemán','3','Tlacotalpan','12','Amatitlán')," +
                        "(158,'30','Veracruz','174','Ciudad Alemán','3','Tlacotalpan','84','Ixmatlahuacan')," +
                        "(159,'30','Veracruz','174','Ciudad Alemán','3','Tlacotalpan','178','Tlacotalpan')," +
                        "(160,'30','Veracruz','175','San Andrés Tuxtla','1','San Andrés Tuxtla','32','Catemaco')," +
                        "(161,'30','Veracruz','175','San Andrés Tuxtla','1','San Andrés Tuxtla','130','Playa Vicente')," +
                        "(162,'30','Veracruz','175','San Andrés Tuxtla','1','San Andrés Tuxtla','141','San Andrés Tuxtla')," +
                        "(163,'30','Veracruz','175','San Andrés Tuxtla','1','San Andrés Tuxtla','143','Santiago Tuxtla')," +
                        "(164,'30','Veracruz','175','San Andrés Tuxtla','2','Lerdo de Tejada','15','Angel R. Cabada')," +
                        "(165,'30','Veracruz','175','San Andrés Tuxtla','2','Lerdo de Tejada','97','Lerdo de Tejada')," +
                        "(166,'30','Veracruz','175','San Andrés Tuxtla','2','Lerdo de Tejada','139','Saltabarranca')," +
                        "(167,'30','Veracruz','175','San Andrés Tuxtla','3','Isla','77','Isla')," +
                        "(168,'30','Veracruz','175','San Andrés Tuxtla','3','Isla','94','Juan Rodríguez Clara')," +
                        "(169,'30','Veracruz','175','San Andrés Tuxtla','3','Isla','169','José Azueta')," +
                        "(170,'30','Veracruz','175','San Andrés Tuxtla','4','Playa Vicente','130','Playa Vicente')," +
                        "(171,'30','Veracruz','175','San Andrés Tuxtla','4','Playa Vicente','212','Santiago Sochiapan')," +
                        "(172,'30','Veracruz','176','Jáltipan','1','Jáltipan','59','Chinameca')," +
                        "(173,'30','Veracruz','176','Jáltipan','1','Jáltipan','89','Jáltipan')," +
                        "(174,'30','Veracruz','176','Jáltipan','1','Jáltipan','120','Oteapan')," +
                        "(175,'30','Veracruz','176','Jáltipan','1','Jáltipan','145','Soconusco')," +
                        "(176,'30','Veracruz','176','Jáltipan','1','Jáltipan','172','Texistepec')," +
                        "(177,'30','Veracruz','176','Jáltipan','2','Soteapan','104','Mecayapan')," +
                        "(178,'30','Veracruz','176','Jáltipan','2','Soteapan','122','Pajapan')," +
                        "(179,'30','Veracruz','176','Jáltipan','2','Soteapan','149','Soteapan')," +
                        "(180,'30','Veracruz','176','Jáltipan','2','Soteapan','210','Tatahuicapan de Juárez')," +
                        "(181,'30','Veracruz','176','Jáltipan','3','Acayucan','3','Acayucan')," +
                        "(182,'30','Veracruz','176','Jáltipan','3','Acayucan','73','Hueyapan de Ocampo')," +
                        "(183,'30','Veracruz','176','Jáltipan','3','Acayucan','116','Oluta')," +
                        "(184,'30','Veracruz','176','Jáltipan','3','Acayucan','142','San Juan Evangelista')," +
                        "(185,'30','Veracruz','176','Jáltipan','3','Acayucan','144','Sayula de Alemán')," +
                        "(186,'30','Veracruz','176','Jáltipan','4','Nuevo Morelos','91','Jesús Carranza')," +
                        "(187,'30','Veracruz','177','Choapas','1','Las Choapas','61','Las Choapas')," +
                        "(188,'30','Veracruz','177','Choapas','2','Minatitlán','48','Cosoleacaque')," +
                        "(189,'30','Veracruz','177','Choapas','2','Minatitlán','70','Hidalgotitlán')," +
                        "(190,'30','Veracruz','177','Choapas','2','Minatitlán','108','Minatitlán')," +
                        "(191,'30','Veracruz','177','Choapas','2','Minatitlán','199','Zaragoza')," +
                        "(192,'30','Veracruz','177','Choapas','3','Coatzacoalcos','39','Coatzacoalcos')," +
                        "(193,'30','Veracruz','177','Choapas','3','Coatzacoalcos','82','Ixhuatlán del Sureste')," +
                        "(194,'30','Veracruz','177','Choapas','3','Coatzacoalcos','111','Moloacán')," +
                        "(195,'30','Veracruz','177','Choapas','3','Coatzacoalcos','204','Agua Dulce')," +
                        "(196,'30','Veracruz','177','Choapas','3','Coatzacoalcos','206','Nanchital de Lázaro Cárdenas del Río')," +
                        "(197,'30','Veracruz','177','Choapas','4','Uxpanapan','61','Las Choapas')," +
                        "(198,'30','Veracruz','177','Choapas','4','Uxpanapan','70','Hidalgotitlán')," +
                        "(199,'30','Veracruz','177','Choapas','4','Uxpanapan','91','Jesús Carranza')," +
                        "(200,'30','Veracruz','177','Choapas','4','Uxpanapan','108','Minatitlán')," +
                        "(201,'30','Veracruz','177','Choapas','4','Uxpanapan','209','Uxpanapa')," +
                        "(202,'30','Veracruz','178','Pánuco','1','Chicontepec','27','Benito Juárez')," +
                        "(203,'30','Veracruz','178','Pánuco','1','Chicontepec','58','Chicontepec')," +
                        "(204,'30','Veracruz','178','Pánuco','2','Tantoyuca','55','Chalma')," +
                        "(205,'30','Veracruz','178','Pánuco','2','Tantoyuca','56','Chiconamel')," +
                        "(206,'30','Veracruz','178','Pánuco','2','Tantoyuca','78','Ixcatepec')," +
                        "(207,'30','Veracruz','178','Pánuco','2','Tantoyuca','129','Platón Sánchez')," +
                        "(208,'30','Veracruz','178','Pánuco','2','Tantoyuca','155','Tantoyuca')," +
                        "(209,'30','Veracruz','178','Pánuco','3','Tampico El Alto','133','Pueblo Viejo')," +
                        "(210,'30','Veracruz','178','Pánuco','3','Tampico El Alto','152','Tampico Alto')," +
                        "(211,'30','Veracruz','178','Pánuco','4','Ozuluama','121','Ozuluama de Mascareñas')," +
                        "(212,'30','Veracruz','178','Pánuco','5','Naranjos','13','Naranjos Amatlán')," +
                        "(213,'30','Veracruz','178','Pánuco','5','Naranjos','35','Citlaltépetl')," +
                        "(214,'30','Veracruz','178','Pánuco','5','Naranjos','60','Chinampa de Gorostiza')," +
                        "(215,'30','Veracruz','178','Pánuco','5','Naranjos','63','Chontla')," +
                        "(216,'30','Veracruz','178','Pánuco','5','Naranjos','150','Tamalín')," +
                        "(217,'30','Veracruz','178','Pánuco','5','Naranjos','153','Tancoco')," +
                        "(218,'30','Veracruz','178','Pánuco','5','Naranjos','154','Tantima')," +
                        "(219,'30','Veracruz','178','Pánuco','6','Pánuco','123','Pánuco')," +
                        "(220,'30','Veracruz','178','Pánuco','7','El Higo','161','Tempoal')," +
                        "(221,'30','Veracruz','178','Pánuco','7','El Higo','205','El Higo')," +
                        "(222,'30','Veracruz','178','Pánuco','8','Chicayán','121','Ozuluama de Mascareñas')," +
                        "(223,'30','Veracruz','178','Pánuco','8','Chicayán','123','Pánuco')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_YUCATAN + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_YUCATAN + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                        "(1,'31','Yucatán','179','Mérida','1','Izamal','5','Bokobá')," +
                        "(2,'31','Yucatán','179','Mérida','1','Izamal','7','Cacalchén')," +
                        "(3,'31','Yucatán','179','Mérida','1','Izamal','35','Hoctún')," +
                        "(4,'31','Yucatán','179','Mérida','1','Izamal','40','Izamal')," +
                        "(5,'31','Yucatán','179','Mérida','1','Izamal','42','Kantunil')," +
                        "(6,'31','Yucatán','179','Mérida','1','Izamal','71','Sudzal')," +
                        "(7,'31','Yucatán','179','Mérida','1','Izamal','74','Tahmek')," +
                        "(8,'31','Yucatán','179','Mérida','1','Izamal','77','Tekal de Venegas')," +
                        "(9,'31','Yucatán','179','Mérida','1','Izamal','78','Tekantó')," +
                        "(10,'31','Yucatán','179','Mérida','1','Izamal','86','Tepakán')," +
                        "(11,'31','Yucatán','179','Mérida','1','Izamal','88','Teya')," +
                        "(12,'31','Yucatán','179','Mérida','1','Izamal','103','Xocchel')," +
                        "(13,'31','Yucatán','179','Mérida','2','Acanceh','2','Acanceh')," +
                        "(14,'31','Yucatán','179','Mérida','2','Acanceh','15','Cuzamá')," +
                        "(15,'31','Yucatán','179','Mérida','2','Acanceh','34','Hocabá')," +
                        "(16,'31','Yucatán','179','Mérida','2','Acanceh','36','Homún')," +
                        "(17,'31','Yucatán','179','Mérida','2','Acanceh','37','Huhí')," +
                        "(18,'31','Yucatán','179','Mérida','2','Acanceh','64','Sanahcat')," +
                        "(19,'31','Yucatán','179','Mérida','2','Acanceh','67','Seyé')," +
                        "(20,'31','Yucatán','179','Mérida','2','Acanceh','76','Tecoh')," +
                        "(21,'31','Yucatán','179','Mérida','2','Acanceh','80','Tekit')," +
                        "(22,'31','Yucatán','179','Mérida','2','Acanceh','90','Timucuy')," +
                        "(23,'31','Yucatán','179','Mérida','3','Dzidzantún','9','Cansahcab')," +
                        "(24,'31','Yucatán','179','Mérida','3','Dzidzantún','27','Dzidzantún')," +
                        "(25,'31','Yucatán','179','Mérida','3','Dzidzantún','28','Dzilam de Bravo')," +
                        "(26,'31','Yucatán','179','Mérida','3','Dzidzantún','29','Dzilam González')," +
                        "(27,'31','Yucatán','179','Mérida','3','Dzidzantún','31','Dzoncauich')," +
                        "(28,'31','Yucatán','179','Mérida','3','Dzidzantún','72','Suma')," +
                        "(29,'31','Yucatán','179','Mérida','3','Dzidzantún','84','Temax')," +
                        "(30,'31','Yucatán','179','Mérida','3','Dzidzantún','106','Yobaín')," +
                        "(31,'31','Yucatán','179','Mérida','4','Motul','4','Baca')," +
                        "(32,'31','Yucatán','179','Mérida','4','Motul','13','Conkal')," +
                        "(33,'31','Yucatán','179','Mérida','4','Motul','20','Chicxulub Pueblo')," +
                        "(34,'31','Yucatán','179','Mérida','4','Motul','26','Dzemul')," +
                        "(35,'31','Yucatán','179','Mérida','4','Motul','39','Ixil')," +
                        "(36,'31','Yucatán','179','Mérida','4','Motul','51','Mocochá')," +
                        "(37,'31','Yucatán','179','Mérida','4','Motul','52','Motul')," +
                        "(38,'31','Yucatán','179','Mérida','4','Motul','54','Muxupip')," +
                        "(39,'31','Yucatán','179','Mérida','4','Motul','68','Sinanché')," +
                        "(40,'31','Yucatán','179','Mérida','4','Motul','82','Telchac Pueblo')," +
                        "(41,'31','Yucatán','179','Mérida','4','Motul','83','Telchac Puerto')," +
                        "(42,'31','Yucatán','179','Mérida','4','Motul','93','Tixkokob')," +
                        "(43,'31','Yucatán','179','Mérida','4','Motul','95','Tixpéhual')," +
                        "(44,'31','Yucatán','179','Mérida','4','Motul','105','Yaxkukul')," +
                        "(45,'31','Yucatán','179','Mérida','5','Maxcanú','33','Halachó')," +
                        "(46,'31','Yucatán','179','Mérida','5','Maxcanú','45','Kopomá')," +
                        "(47,'31','Yucatán','179','Mérida','5','Maxcanú','48','Maxcanú')," +
                        "(48,'31','Yucatán','179','Mérida','5','Maxcanú','55','Opichén')," +
                        "(49,'31','Yucatán','179','Mérida','6','Umán','1','Abalá')," +
                        "(50,'31','Yucatán','179','Mérida','6','Umán','23','Chocholá')," +
                        "(51,'31','Yucatán','179','Mérida','6','Umán','41','Kanasín')," +
                        "(52,'31','Yucatán','179','Mérida','6','Umán','50','Mérida')," +
                        "(53,'31','Yucatán','179','Mérida','6','Umán','59','Progreso')," +
                        "(54,'31','Yucatán','179','Mérida','6','Umán','101','Umán')," +
                        "(55,'31','Yucatán','179','Mérida','7','Hunucmá','11','Celestún')," +
                        "(56,'31','Yucatán','179','Mérida','7','Hunucmá','38','Hunucmá')," +
                        "(57,'31','Yucatán','179','Mérida','7','Hunucmá','44','Kinchil')," +
                        "(58,'31','Yucatán','179','Mérida','7','Hunucmá','63','Samahil')," +
                        "(59,'31','Yucatán','179','Mérida','7','Hunucmá','87','Tetiz')," +
                        "(60,'31','Yucatán','179','Mérida','7','Hunucmá','100','Ucú')," +
                        "(61,'31','Yucatán','180','Ticul','1','Muna','53','Muna')," +
                        "(62,'31','Yucatán','180','Ticul','1','Muna','66','Santa Elena')," +
                        "(63,'31','Yucatán','180','Ticul','2','Oxkutzcab','3','Akil')," +
                        "(64,'31','Yucatán','180','Ticul','2','Oxkutzcab','18','Chapab')," +
                        "(65,'31','Yucatán','180','Ticul','2','Oxkutzcab','24','Chumayel')," +
                        "(66,'31','Yucatán','180','Ticul','2','Oxkutzcab','25','Dzán')," +
                        "(67,'31','Yucatán','180','Ticul','2','Oxkutzcab','46','Mama')," +
                        "(68,'31','Yucatán','180','Ticul','2','Oxkutzcab','47','Maní')," +
                        "(69,'31','Yucatán','180','Ticul','2','Oxkutzcab','56','Oxkutzcab')," +
                        "(70,'31','Yucatán','180','Ticul','2','Oxkutzcab','62','Sacalum')," +
                        "(71,'31','Yucatán','180','Ticul','2','Oxkutzcab','75','Teabo')," +
                        "(72,'31','Yucatán','180','Ticul','2','Oxkutzcab','89','Ticul')," +
                        "(73,'31','Yucatán','180','Ticul','3','Tekax','79','Tekax')," +
                        "(74,'31','Yucatán','180','Ticul','4','Tzucacab','16','Chacsinkín')," +
                        "(75,'31','Yucatán','180','Ticul','4','Tzucacab','58','Peto')," +
                        "(76,'31','Yucatán','180','Ticul','4','Tzucacab','73','Tahdziú')," +
                        "(77,'31','Yucatán','180','Ticul','4','Tzucacab','94','Tixmehuac')," +
                        "(78,'31','Yucatán','180','Ticul','4','Tzucacab','98','Tzucacab')," +
                        "(79,'31','Yucatán','181','Tizimín','1','Sucilá','6','Buctzotz')," +
                        "(80,'31','Yucatán','181','Tizimín','1','Sucilá','57','Panabá')," +
                        "(81,'31','Yucatán','181','Tizimín','1','Sucilá','61','Río Lagartos')," +
                        "(82,'31','Yucatán','181','Tizimín','1','Sucilá','65','San Felipe')," +
                        "(83,'31','Yucatán','181','Tizimín','1','Sucilá','70','Sucilá')," +
                        "(84,'31','Yucatán','181','Tizimín','2','Espita','12','Cenotillo')," +
                        "(85,'31','Yucatán','181','Tizimín','2','Espita','30','Dzitás')," +
                        "(86,'31','Yucatán','181','Tizimín','2','Espita','32','Espita')," +
                        "(87,'31','Yucatán','181','Tizimín','2','Espita','60','Quintana Roo')," +
                        "(88,'31','Yucatán','181','Tizimín','2','Espita','97','Tunkás')," +
                        "(89,'31','Yucatán','181','Tizimín','3','Tizimín','8','Calotmul')," +
                        "(90,'31','Yucatán','181','Tizimín','3','Tizimín','85','Temozón')," +
                        "(91,'31','Yucatán','181','Tizimín','3','Tizimín','96','Tizimín')," +
                        "(92,'31','Yucatán','182','Valladolid','1','Chichimilá','19','Chemax')," +
                        "(93,'31','Yucatán','182','Valladolid','1','Chichimilá','21','Chichimilá')," +
                        "(94,'31','Yucatán','182','Valladolid','1','Chichimilá','92','Tixcacalcupul')," +
                        "(95,'31','Yucatán','182','Valladolid','1','Chichimilá','102','Valladolid')," +
                        "(96,'31','Yucatán','182','Valladolid','2','Kaua','14','Cuncunul')," +
                        "(97,'31','Yucatán','182','Valladolid','2','Kaua','17','Chankom')," +
                        "(98,'31','Yucatán','182','Valladolid','2','Kaua','22','Chikindzonot')," +
                        "(99,'31','Yucatán','182','Valladolid','2','Kaua','43','Kaua')," +
                        "(100,'31','Yucatán','182','Valladolid','2','Kaua','81','Tekom')," +
                        "(101,'31','Yucatán','182','Valladolid','2','Kaua','91','Tinum')," +
                        "(102,'31','Yucatán','182','Valladolid','2','Kaua','99','Uayma')," +
                        "(103,'31','Yucatán','182','Valladolid','3','Sotuta','10','Cantamayec')," +
                        "(104,'31','Yucatán','182','Valladolid','3','Sotuta','49','Mayapán')," +
                        "(105,'31','Yucatán','182','Valladolid','3','Sotuta','69','Sotuta')," +
                        "(106,'31','Yucatán','182','Valladolid','3','Sotuta','104','Yaxcabá')");
                sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_ZACATECAS + "(" +
                        "id INTEGER PRIMARY KEY NOT NULL," +
                        "Iddelegacion TEXT NOT NULL," +
                        "Nomdelegacion TEXT NOT NULL," +
                        "Idddr TEXT NOT NULL," +
                        "Nomddr TEXT NOT NULL," +
                        "Idcader TEXT NOT NULL," +
                        "Nomcader TEXT NOT NULL," +
                        "Idmunicipio TEXT NOT NULL," +
                        "Nommunicipio TEXT NOT NULL)");
        sqLiteDatabase.execSQL("INSERT INTO " +TABLE_ZACATECAS + " (id, Iddelegacion, Nomdelegacion, Idddr, Nomddr, Idcader, Nomcader, Idmunicipio, Nommunicipio) VALUES" +
                "(1,'32','Zacatecas','183','Fresnillo','1','Valparaíso','49','Valparaíso')," +
                "(2,'32','Zacatecas','183','Fresnillo','2','Fresnillo','6','Cañitas de Felipe Pescador')," +
                "(3,'32','Zacatecas','183','Fresnillo','2','Fresnillo','10','Fresnillo')," +
                "(4,'32','Zacatecas','184','Río Grande','1','Miguel Auza','14','General Francisco R. Murguía')," +
                "(5,'32','Zacatecas','184','Río Grande','1','Miguel Auza','22','Juan Aldama')," +
                "(6,'32','Zacatecas','184','Río Grande','1','Miguel Auza','29','Miguel Auza')," +
                "(7,'32','Zacatecas','184','Río Grande','1','Miguel Auza','39','Río Grande')," +
                "(8,'32','Zacatecas','184','Río Grande','2','Sombrerete','9','Chalchihuites')," +
                "(9,'32','Zacatecas','184','Río Grande','2','Sombrerete','21','Jiménez del Teul')," +
                "(10,'32','Zacatecas','184','Río Grande','2','Sombrerete','40','Sain Alto')," +
                "(11,'32','Zacatecas','184','Río Grande','2','Sombrerete','42','Sombrerete')," +
                "(12,'32','Zacatecas','185','Ojo Caliente','1','Pinos','16','General Pánfilo Natera')," +
                "(13,'32','Zacatecas','185','Ojo Caliente','1','Pinos','38','Pinos')," +
                "(14,'32','Zacatecas','185','Ojo Caliente','1','Pinos','53','Villa González Ortega')," +
                "(15,'32','Zacatecas','185','Ojo Caliente','1','Pinos','54','Villa Hidalgo')," +
                "(16,'32','Zacatecas','185','Ojo Caliente','2','Loreto','8','Cuauhtémoc')," +
                "(17,'32','Zacatecas','185','Ojo Caliente','2','Loreto','12','Genaro Codina')," +
                "(18,'32','Zacatecas','185','Ojo Caliente','2','Loreto','24','Loreto')," +
                "(19,'32','Zacatecas','185','Ojo Caliente','2','Loreto','25','Luis Moya')," +
                "(20,'32','Zacatecas','185','Ojo Caliente','2','Loreto','35','Noria de Ángeles')," +
                "(21,'32','Zacatecas','185','Ojo Caliente','2','Loreto','36','Ojocaliente')," +
                "(22,'32','Zacatecas','185','Ojo Caliente','2','Loreto','52','Villa García')," +
                "(23,'32','Zacatecas','186','Tlaltenango','1','Tepechitlán','3','Atolinga')," +
                "(24,'32','Zacatecas','186','Tlaltenango','1','Tepechitlán','4','Benito Juárez')," +
                "(25,'32','Zacatecas','186','Tlaltenango','1','Tepechitlán','11','Trinidad García de La Cadena')," +
                "(26,'32','Zacatecas','186','Tlaltenango','1','Tepechitlán','30','Momax')," +
                "(27,'32','Zacatecas','186','Tlaltenango','1','Tepechitlán','45','Tepechitlán')," +
                "(28,'32','Zacatecas','186','Tlaltenango','1','Tepechitlán','47','Teúl de González Ortega')," +
                "(29,'32','Zacatecas','186','Tlaltenango','1','Tepechitlán','48','Tlaltenango de Sánchez Román')," +
                "(30,'32','Zacatecas','186','Tlaltenango','1','Tepechitlán','58','Santa María de La Paz')," +
                "(31,'32','Zacatecas','187','Jerez','1','Villa Nueva','15','El Plateado de Joaquín Amaro')," +
                "(32,'32','Zacatecas','187','Jerez','1','Villa Nueva','20','Jerez')," +
                "(33,'32','Zacatecas','187','Jerez','1','Villa Nueva','31','Monte Escobedo')," +
                "(34,'32','Zacatecas','187','Jerez','1','Villa Nueva','43','Susticacán')," +
                "(35,'32','Zacatecas','187','Jerez','1','Villa Nueva','46','Tepetongo')," +
                "(36,'32','Zacatecas','187','Jerez','1','Villa Nueva','55','Villanueva')," +
                "(37,'32','Zacatecas','188','Concepción del Oro','1','Mazapil','7','Concepción del Oro')," +
                "(38,'32','Zacatecas','188','Concepción del Oro','1','Mazapil','26','Mazapil')," +
                "(39,'32','Zacatecas','188','Concepción del Oro','1','Mazapil','27','Melchor Ocampo')," +
                "(40,'32','Zacatecas','188','Concepción del Oro','1','Mazapil','41','El Salvador')," +
                "(41,'32','Zacatecas','189','Zacatecas','1','Calera','5','Calera')," +
                "(42,'32','Zacatecas','189','Zacatecas','1','Calera','13','General Enrique Estrada')," +
                "(43,'32','Zacatecas','189','Zacatecas','1','Calera','17','Guadalupe')," +
                "(44,'32','Zacatecas','189','Zacatecas','1','Calera','32','Morelos')," +
                "(45,'32','Zacatecas','189','Zacatecas','1','Calera','50','Vetagrande')," +
                "(46,'32','Zacatecas','189','Zacatecas','1','Calera','56','Zacatecas')," +
                "(47,'32','Zacatecas','189','Zacatecas','1','Calera','57','Trancoso')," +
                "(48,'32','Zacatecas','189','Zacatecas','2','Villa de Cos','37','Pánuco')," +
                "(49,'32','Zacatecas','189','Zacatecas','2','Villa de Cos','51','Villa de Cos')," +
                "(50,'32','Zacatecas','190','Jalpa','1','Nochistlán','2','Apulco')," +
                "(51,'32','Zacatecas','190','Jalpa','1','Nochistlán','34','Nochistlán de Mejía')," +
                "(52,'32','Zacatecas','190','Jalpa','2','Juchipila','23','Juchipila')," +
                "(53,'32','Zacatecas','190','Jalpa','2','Juchipila','28','Mezquital del Oro')," +
                "(54,'32','Zacatecas','190','Jalpa','2','Juchipila','33','Moyahua de Estrada')," +
                "(55,'32','Zacatecas','190','Jalpa','3','Tabasco','18','Huanusco')," +
                "(56,'32','Zacatecas','190','Jalpa','3','Tabasco','44','Tabasco')," +
                "(57,'32','Zacatecas','190','Jalpa','3','Tabasco','55','Villanueva')," +
                "(58,'32','Zacatecas','190','Jalpa','4','Jalpa','1','Apozol')," +
                "(59,'32','Zacatecas','190','Jalpa','4','Jalpa','19','Jalpa')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_ESTADOS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_AGUASCALIENTES);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_BC);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_BCS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_CAMPECHE);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_CHIAPAS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_CHIHUAHUA);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_CDMX);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_COAHUILA);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_COLIMA);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_DURANGO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_GUANAJUATO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_GUERRERO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_HIDALGO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_JALISCO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_MEXICO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_MICHOACAN);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_MORELOS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAYARIT);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NL);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_OAXACA);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_PUEBLA);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_QUERETARO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_QUINTANAROO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_SANLUIS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_SINALOA);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_SONORA);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_TABASCO);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_TAMAULIPAS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_TLAXCALA);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_VERACRUZ);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_YUCATAN);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_ZACATECAS);
        onCreate(sqLiteDatabase);
    }
}