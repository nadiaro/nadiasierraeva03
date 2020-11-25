package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador{
	
	private String nombre;
	private String apellido;
	private String estiloFavorito;
	

	public Nadador(Integer numeroDeSocio, String nombre, String apellido) {
		super(numeroDeSocio);
		this.nombre=nombre;
		this.apellido=apellido;
		this.estiloFavorito=this.getEstiloPreferido();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nadador [nombre=" + nombre + ", apellido="
				+ apellido + "]";
	}

	@Override
	public String getEstiloPreferido() {
		return this.estiloFavorito;
	}
	
	
}
