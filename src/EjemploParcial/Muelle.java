package EjemploParcial;

public class Muelle implements IMantenible {
	
	private Integer idMuelle;
	private Double longitud;
	private String estado;
	
	private AbstractBarco barco;
	
	public Muelle(Double longi) 
	{
		idMuelle=1;
		longitud= longi;
		estado= "DISPONIBLE";
		
	}
	
	public void asignarBarco(AbstractBarco barcop) 
	{
		barco= barcop;
		estado= "NO DISPONIBLE";
	}
	

	@Override
	public void iniciarMantenimiento() {
		barco= null;
		estado= "NO DISPONIBLE";
		
	}

	@Override
	public void finalizarMantenimiento()
	{
		estado= "DISPONIBLE";
	}

	public Integer getIdMuelle() {
		return idMuelle;
	}

	public Double getLongitud() {
		return longitud;
	}

	public String getEstado() {
		return estado;
	}
	
	

}
