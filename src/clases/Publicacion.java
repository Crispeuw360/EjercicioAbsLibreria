package clases;

public abstract class Publicacion {

	protected String codigo;
	protected String titulo;
	protected int año;
	
	public Publicacion(String c,String t,int a)
	{
		this.codigo=c;
		this.titulo=t;
		this.año=a;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}
	
	public abstract void mostrar();
}
