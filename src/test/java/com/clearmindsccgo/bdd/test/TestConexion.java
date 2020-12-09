package com.clearmindsccgo.bdd.test;

import java.sql.Connection;

import com.clearminds.ccgo.bdd.ConexionBDD;
import com.clearminds.ccgo.excepciones.BDDException;

public class TestConexion {
	public static void main(String[] args) {
		try {
			Connection conexion = ConexionBDD.obtenerConexion();
			
			if(conexion != null){
				System.out.println("Conexion exitosa");
			}
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}