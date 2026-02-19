package EjemploParcial;

import java.util.*;

public abstract class AbstractBarco implements IMantenible
{
	private ArrayList<Tripulante> listaTripulantes;
	private int idBarco;
	private String nombre;
	private Double tonelaje;
	private Map<Integer,Carga> mapaCargas;
	
	
	public AbstractBarco(int idBarco, String nombre, Double tonelaje) {
		this.idBarco = idBarco;
		this.nombre = nombre;
		this.tonelaje = tonelaje;
		listaTripulantes= new ArrayList<Tripulante>();
		mapaCargas= new HashMap<Integer,Carga>();
	}
	public int getIdBarco() {
		return idBarco;
	}
	public String getNombre() {
		return nombre;
	}
	public Double getTonelaje() {
		return tonelaje;
	}
	
	
	
	
	

}
