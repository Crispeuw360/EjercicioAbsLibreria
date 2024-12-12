package main;
import java.util.HashMap;

import clases.*;
import utilidades.Utilidades;

public class MainAbsLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dni,nombre,apellido;
		int edad;
		
		
		ListaSocios s = new ListaSocios(new HashMap<String,Socio>());
		s.fillData();

		System.out.println("Bienvenido a la libreria digital ");
		
		System.out.println("introduce el dni");
		dni = Utilidades.introducirCadena();
		if (!s.getMap().containsKey(dni)) 
		{
			System.out.println(" no existe este socio");
			System.out.println("");
		}
		
		
		
		
	}

}
