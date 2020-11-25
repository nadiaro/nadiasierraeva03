package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Deportista {
	
	private Integer numeroDeSocio;
	private TipoDeEvento tipoDeEvento;

	public Deportista(Integer numeroDeSocio) {
		super();
		this.numeroDeSocio = numeroDeSocio;
		this.tipoDeEvento=tipoDeEvento;
	}

	/**
	 * @return the numeroDeSocio
	 */
	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	/**
	 * @param numeroDeSocio the numeroDeSocio to set
	 */
	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	/**
	 * @return the tipoDeEvento
	 */
	public TipoDeEvento getTipoDeEvento() {
		return tipoDeEvento;
	}

	/**
	 * @param tipoDeEvento the tipoDeEvento to set
	 */
	public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}
	
	
	

}
