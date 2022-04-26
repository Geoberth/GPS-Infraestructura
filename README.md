# GPS-Infraestructura
Aplicación para Infraestructura

Dispositivos bajos recfursos:

°En los archivos BD (ex: EngordaBD.java) moverla funcion mostrarFotos():
	
	En la linea cambiar el LIMIT de 5 a 3: 
		Cursor filas = bd.rawQuery("SELECT DISTINCT * FROM " + Engorda_bd.TABLA_BD + " WHERE " + Engorda_bd.COLUMN_BANDERA + " = 1 AND " + Engorda_bd.COLUMN_BANDERAFOTOS + " = 0 ORDER BY " + Engorda_bd.COLUMN_FOLIO + " LIMIT 5", null);
		
°En el manifest despues del <application:

	Agregar:
		android:hardwareAccelerated="false"
		android:largeHeap="true"
	
