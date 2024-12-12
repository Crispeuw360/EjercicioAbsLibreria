package clases;

import java.util.ArrayList;

public class Catalogo {

	private ArrayList<Publicacion> lista;
	
	public Catalogo(ArrayList<Publicacion> lista)
	{
		this.lista=lista;
	}
	public ArrayList<Publicacion> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Publicacion> lista) {
		this.lista = lista;
	}
	@Override
	public String toString() 
	{
		return "Catalogo [lista=" + lista + "]";
	}
	
	
	public void fillData() 
	{
        lista.add(new Libro("001", "El Quijote", 1605, 150));
        lista.add(new Libro("002", "Cien años de soledad", 1967, 300));
        lista.add(new Libro("003", "1984", 1949, 200));
    
        lista.add(new Revista("R001", "National Geographic", 2023, 150));
        lista.add(new Revista("R002", "Science", 2022, 128));
        lista.add(new Revista("R003", "TIME", 2023, 2023));
    }
	
	public int posicionPublicacion(String codigo)
	{
		for (int i = 0; i < lista.size(); i++) {
	        if (lista.get(i).getCodigo().equals(codigo)) {
	            return i; 
	        }
	    }
	    return -1;
	}

	
}
