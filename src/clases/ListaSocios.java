package clases;

import java.util.ArrayList;
import java.util.HashMap;

import utilidades.Utilidades;

public class ListaSocios {

	private HashMap<String,Socio> map;
	
	
	public ListaSocios(HashMap<String,Socio> m)
	{
		this.map= m;
	}


	public HashMap<String, Socio> getMap() {
		return map;
	}


	public void setMap(HashMap<String, Socio> map) {
		this.map = map;
	}


	@Override
	public String toString() {
		return "ListaSocios [map=" + map + "]";
	}
	
	public void fillData()
	{
		ArrayList<Publicacion> publicaciones1 = new ArrayList<>();
        publicaciones1.add(new Libro("001", "El Quijote",1605,200));
        publicaciones1.add(new Revista("R001", "National Geographic", 2023, 150));

        ArrayList<Publicacion> publicaciones2 = new ArrayList<>();
        publicaciones2.add(new Libro("002", "Cien años de soledad", 1967, 300));
        publicaciones2.add(new Revista("R002", "Science", 2022, 128));

        map.put("12345678A", new Socio("12345678A", "Juan", "Pérez", 35, publicaciones1));
        map.put("87654321B", new Socio("87654321B", "María", "García", 28, publicaciones2));
	}
	
	public boolean esSocio(String dni)
	{
		return map.containsKey(dni);
	}
	
	public void hacerSocio()
	{
		String dni;
		String nombre;
		String apellido;
		String opcion;
		String codigo;
		String titulo;
		int numero;
		int numPaginas;
		int año;
		int edad;
		boolean correcto =false;
		ArrayList<Publicacion> a = new ArrayList<>();
		
		System.out.println("Escribe el dni: ");
		dni = Utilidades.introducirCadena();
		
		System.out.println("Escribe el Nombre: ");
		nombre = Utilidades.introducirCadena();
		
		System.out.println("Escribe el apellido: ");
		apellido = Utilidades.introducirCadena();
		
		System.out.println("Escribe la edad: ");
		edad = Utilidades.leerInt();
		
		System.out.println("Escribe el codigo: ");
		codigo = Utilidades.introducirCadena();
		
		System.out.println("Escribe el titulo: ");
		titulo = Utilidades.introducirCadena();
		
		System.out.println("Escribe el año: ");
		año = Utilidades.leerInt();
		
		System.out.println("Es un Libro o Revista: ");
		opcion = Utilidades.introducirCadena();
		
		do {
			if (opcion.equalsIgnoreCase("libro")) 
			{
				System.out.println("Escribe el numero de paginas: ");
				numPaginas = Utilidades.leerInt();
				a.add(new Libro(codigo, titulo, año, numPaginas));
				correcto=true;
			} else if (opcion.equalsIgnoreCase("revista")) 
			{
				System.out.println("Escribe el numero de revista: ");
				numero = Utilidades.leerInt();
				a.add(new Revista(codigo, titulo, año, numero));
				correcto=true;
			}else 
			{
				System.out.println("Elige una opcion correcta");
			} 
		} while (!correcto);
		
		Socio socio = new Socio(dni,nombre,apellido,edad,a);
		map.put(dni, socio);
	}
	public int posicionSocio(String dni)
	{
		ArrayList<Socio> a = new ArrayList<Socio>(this.map.values());
		
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).getDni().equalsIgnoreCase(dni))
			{
				return i;
			}
		}
		return -1;
	}
	public void agregarSocio(String dni, Socio socio) {
	    if (!map.containsKey(dni)) {
	        map.put(dni, socio);
	        System.out.println("Socio agregado con éxito.");
	    } else {
	        System.out.println("Ya existe un socio con este DNI.");
	    }
	}
	
	
}
