package main;
import java.util.ArrayList;
import java.util.HashMap;

import clases.*;
import utilidades.Utilidades;

public class MainAbsLibreria {
	public static int mostrarMenu() 
	{
		System.out.println("0. Salir ");
		System.out.println("1. Mostrar el Catalogo ");
		System.out.println("2. Alquilar Algo ");
		System.out.println("3. Mostrar todos Los Socios");
		System.out.println("4. Añadir libro o revista");
		System.out.println("5. Mostrar publicaciones que el socio tiene alquiladas");
		return Utilidades.leerInt();
	}

	public static void mostrarCatalogo(ListaSocios s)
	{
		for(Socio socio : s.getMap().values())
		{
			ArrayList<Publicacion> publicaciones = socio.getaPublicacion();

			for(Publicacion p : publicaciones)
			{
				if(p instanceof Libro)
				{
					Libro libro = (Libro) p;
					System.out.println(p.toString());
				}else if(p instanceof Revista)
				{
					Revista revista = (Revista) p;
					System.out.println(p.toString());
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dni,nombre,apellido;
		int edad;

		int op=-1;

		ListaSocios s = new ListaSocios(new HashMap<String,Socio>());
		s.fillData();

		System.out.println("Bienvenido a la libreria digital ");

		System.out.println("introduce el dni");
		dni = Utilidades.introducirCadena();
		if (!s.getMap().containsKey(dni)) 
		{
			System.out.println(" no existe este socio");
			System.out.println("");

			System.out.println("Introduce tus datos, Nombre: ");
			nombre = Utilidades.introducirCadena();

			System.out.println("Apellido:"); 
			apellido =Utilidades.introducirCadena();

			System.out.println("Edad: ");
			edad = Utilidades.leerInt();

			ArrayList<Publicacion> publicaciones1 = new ArrayList<>();

			Socio s1 =new Socio(dni,nombre,apellido,edad,publicaciones1);

			s.agregarSocio(s1.getDni(), s1);
		}

		do {
			switch(op=mostrarMenu()) 
			{
			case 0:
				System.out.println("Agur!");
				break;

			case 1:
				mostrarCatalogo(s);
				break;
			case 2:
				//introducirPublicacion(a, teclado);


				break;
			case 3:

				//	mostrarLibrosGalardo(a, teclado);


				break;
			case 4:
				//	mostrarProfesores(a);

				break;
			case 5:

				break;
			default:
				System.out.println("Esa op no esta");
			}
		}while(op!=0);


	}

}
