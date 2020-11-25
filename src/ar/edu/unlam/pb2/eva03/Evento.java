package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private String nombre;
	private Map<Integer, Deportista> participantes;
	
	
	public Evento(TipoDeEvento tipo, String nombre) {
		super();
		this.tipo = tipo;
		this.nombre=nombre;
		this.participantes = new HashMap<Integer, Deportista>();
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
	 * @return the tipo
	 */
	public TipoDeEvento getTipo() {
		return tipo;
	}


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}


	/**
	 * @return the participantes
	 */
	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}


	/**
	 * @param participantes the participantes to set
	 */
	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}
	
	
	
}
