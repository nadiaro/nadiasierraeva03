package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Triatleta extends Deportista{

	private TipoDeBicicleta tipoDeBicicleta;
	private String apellido;
	private String estilo;
	Integer distanciapreferida;


	public Triatleta(Integer numeroDeSocio, String apellido, String estilo, TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio);
		this.apellido=apellido;
		this.estilo=estilo;
		this.tipoDeBicicleta=tipoDeBicicleta;
	}

	/**
	 * @return the tipoDeBicicleta
	 */
	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	/**
	 * @param tipoDeBicicleta the tipoDeBicicleta to set
	 */
	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
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

	public Integer getDistanciaPreferida() {
		return this.getDistanciaPreferida();
	}

	
	
	

}
