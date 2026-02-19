package EjemploParcial;

public class Tripulante 
{
	private int idTripulante;
	private String nombre;
	private String rol;
	
	
	
	public Tripulante(int idTripulante, String nombre) {
		this.idTripulante = idTripulante;
		this.nombre = nombre;
		this.rol="Pasajero";
		
	}
	public int getIdTripulante() {
		return idTripulante;
	}
	public String getRol() {
		return rol;
	}
	
	
	

}
