package Herencia;

public class MedioTransporte extends AbstractMedioTransporte implements ITransportePrivado {
	
	private String matricula;
	
	private String modelo;
	
	private String motor;
	
	private Double velocidad;
	
	
	public MedioTransporte(String matricula, String modelo, String motor, Double velocidad) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.motor = motor;
		this.velocidad = velocidad;
	}


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad*5;
	}
	
	public void acelerar() 
	{
		setVelocidad(30.2);
	}
	
	
	

	@Override
	public String toString() {
		return "MedioTransporte [matricula=" + matricula + ", modelo=" + modelo + ", motor=" + motor + ", velocidad="
				+ velocidad + "]";
	}


	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		
		
	}


	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		
	}
	
	


}
