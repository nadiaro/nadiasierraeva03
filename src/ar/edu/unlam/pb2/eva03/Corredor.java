package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {
	
	private String nombre;
	private Integer cantidadDeKilometrosEntrenados;
	
	public Corredor(Integer numeroDeSocio, String nombre,
			Integer cantidadDeKilometrosEntrenados) {
		super(numeroDeSocio);
		this.nombre = nombre;
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
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
	 * @return the cantidadDeKilometrosEntrenados
	 */
	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}

	/**
	 * @param cantidadDeKilometrosEntrenados the cantidadDeKilometrosEntrenados to set
	 */
	public void setCantidadDeKilometrosEntrenados(
			Integer cantidadDeKilometrosEntrenados) {
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}

	@Override
	public Integer getDistanciaPreferida() {
		return this.getDistanciaPreferida();
	}
	
	

}
