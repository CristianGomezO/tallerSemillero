package com.clearmindsccgo.bdd.test;

import com.clearminds.ccgo.bdd.ConexionBDD;

public class TestPropiedades {

	public static void main(String[] args) {
		ConexionBDD conexionBDD = new ConexionBDD();
		
		String valor = conexionBDD.leerPropiedad("propiedad1");
		System.out.println(valor);
		
		valor = conexionBDD.leerPropiedad("xx");
		System.out.println(valor);

	}

}
