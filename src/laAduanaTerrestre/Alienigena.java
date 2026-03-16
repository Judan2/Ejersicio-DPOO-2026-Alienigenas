package laAduanaTerrestre;

public class Alienigena 
{
	private String nombre;
	private String nombreEspecie;
	private tipoAlienigena clasificacion;
	private String codigoPasaporte; 
	private int fasesLunaresPlaneta; 
	private int cantidadtentaculos;
	private double nivelRadiacion;
	//contructror
	public Alienigena(String nombre, String nombreEspecie, tipoAlienigena clasificacion, String codigoPasaporte,
			int fasesLunaresPlaneta, int cantidadtentaculos, double nivelRadiacion) {
		super();
		this.nombre = nombre;
		this.nombreEspecie = nombreEspecie;
		this.clasificacion = clasificacion;
		this.codigoPasaporte = codigoPasaporte;
		this.fasesLunaresPlaneta = fasesLunaresPlaneta;
		this.cantidadtentaculos = cantidadtentaculos;
		this.nivelRadiacion = nivelRadiacion;
	}
	//getter
	public String getNombre() {
		return nombre;
	}// no es necesario nombre
	
	public String getNombreEspecie() {
		return nombreEspecie;
	}
	public tipoAlienigena getClasificacion() {
		return clasificacion;
	}
	public String getCodigoPasaporte() {
		return codigoPasaporte;
	}
	public int getFasesLunaresPlaneta() {
		return fasesLunaresPlaneta;
	}
	public int getCantidadtentaculos() {
		return cantidadtentaculos;
	}
		
	// implementado 
	public boolean tieneTentaculos() //si o no 
	{
		if (this.cantidadtentaculos == 0)
			return false;
		
			else {
				return true;
			}	
	}
	
	public double getNivelRadiacion() {
		return nivelRadiacion;
	}
	//
	

}
