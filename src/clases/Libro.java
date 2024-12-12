package clases;

public class Libro extends Publicacion {

	private int numPagina;

	public Libro(String c,String t,int a,int n)
	{
		super(c,t,a);
		this.numPagina=n;
	}	
	
	public int getNumPagina() {
		return numPagina;
	}

	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}
	@Override
	public String toString() {
		return "Libro [numPagina=" + numPagina + "]";
	}

	public void mostrar() 
	{
		System.out.println(this.toString());		
	}
	
	
}
