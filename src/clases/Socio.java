package clases;

import java.util.ArrayList;

public class Socio {

	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<Publicacion> aPublicacion;
	
	public Socio(String d,String n,String a,int e,ArrayList<Publicacion> p)
	{
		this.dni=d;
		this.nombre=n;
		this.apellido=a;
		this.edad=e;
		this.aPublicacion=p;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Publicacion> getaPublicacion() {
		return aPublicacion;
	}

	public void setaPublicacion(ArrayList<Publicacion> aPublicacion) {
		this.aPublicacion = aPublicacion;
	}

	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", aPublicacion=" + aPublicacion + "]";
	}
	
	public void print()
	{
		System.out.println(this.toString());
	}
	
	public void añadirPublicacion(Publicacion p)
	{
		if(p!=null)
		{
			aPublicacion.add(p);		
		}else
		{
			System.out.println("No se puede añadir una publicacion nula");
		}
	}
}
