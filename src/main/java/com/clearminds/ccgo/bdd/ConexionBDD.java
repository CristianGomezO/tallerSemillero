package com.clearminds.ccgo.bdd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {
	
	public static String leerPropiedad(String nombrePropiedad){
		Properties propiedades = new Properties();
		String valorPropiedad = "";
		try {
			propiedades.load(new FileInputStream("C:/Users/USER/Desktop/tallerSemillero/src/main/java/com/clearminds/ccgo/middleware/conexion.properties"));
			valorPropiedad = propiedades.getProperty(nombrePropiedad);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return valorPropiedad;
	}
}
