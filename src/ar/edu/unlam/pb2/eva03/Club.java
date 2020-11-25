package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	private TipoDeEvento tipoDeEvento;
	
	
	public Club(String nombre) {
		super();
		this.nombre = nombre;
		this.socios = new TreeSet<Deportista>();
		this.competencias = new HashMap<String, Evento>();
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
	 * @return the socios
	 */
	public Set<Deportista> getSocios() {
		return socios;
	}


	/**
	 * @param socios the socios to set
	 */
	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}


	/**
	 * @return the competencias
	 */
	public Map<String, Evento> getCompetencias() {
		return competencias;
	}


	/**
	 * @param competencias the competencias to set
	 */
	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}


	public void agregarDeportista(Deportista nuevo) {

		socios.add(nuevo);
	}


	public void crearEvento(TipoDeEvento tipoDeEvento,
			String nombreEvento) throws NoEstaPreparado {
		for(Deportista d: socios){
			if(d instanceof Nadador){
				Evento nuevo= new Evento(tipoDeEvento, nombreEvento);
			}else{
				throw new NoEstaPreparado ("No esta habilitado");
			}
		}
	}


	public Boolean inscribirEnEvento(TipoDeEvento tipoDeEvento, Deportista nuevo) {
		
		
		return null;

	}
	
	
}
