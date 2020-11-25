package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista{
	
	private String nombre;
	private String estilo;
	
	public Ciclista(Integer numeroDeSocio, String nombre, String estilo) {
		super(numeroDeSocio);
		this.nombre=nombre;
		this.estilo=estilo;
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
	 * @return the estilo
	 */
	public String getEstilo() {
		return estilo;
	}

	/**
	 * @param estilo the estilo to set
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return this.getTipoDeBicicleta();
	}
	
	

}
