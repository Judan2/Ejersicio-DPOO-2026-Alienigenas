package Herencia;


public class Carro extends MedioTransporte {
	
	private boolean deportivo;
	
	public void acelerarCarro() 
	{
		setVelocidad(1.0);
	}
	
	
	
	public Carro(String matricula, String modelo, String motor, Double velocidad,boolean deportivop) 
	{
		super(matricula,modelo,motor,velocidad);
		deportivo= deportivop;
	}
	
	
	
	public boolean isDeportivo() {
		return deportivo;
	}



	@Override
	public String toString() {
		return "Carro [deportivo=" + deportivo + ", isDeportivo()=" + isDeportivo() + ", getMatricula()="
				+ getMatricula() + ", getModelo()=" + getModelo() + ", getMotor()=" + getMotor() + ", getVelocidad()="
				+ getVelocidad() + ", toString()=" + super.toString() + ", datAtributo1()=" + datAtributo1()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	


	

}
