package EjemploCarro;

public class Motor {
	
	private double capacidadGasolina;
	
	private String cilindraje;
	
	public Motor(double capacidadP,String cilindrajeP) 
	{
		this.capacidadGasolina= capacidadP;
		cilindraje= cilindrajeP;
	}

	public double getCapacidadGasolina() {
		return capacidadGasolina;
	}

	public void setCapacidadGasolina(double capacidadGasolina) {
		this.capacidadGasolina = capacidadGasolina;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	

}
