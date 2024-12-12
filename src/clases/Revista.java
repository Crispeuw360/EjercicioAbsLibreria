package clases;

public class Revista extends Publicacion {

	private int numero;
	
	public Revista(String c,String t,int a,int n)
	{
		super(c,t,a);
		this.numero=n;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Revista [numero=" + numero + "]";
	}
	
	public void mostrar() 
	{
		System.out.println(this.toString());
	}

}
