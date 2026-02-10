package EjemploCarro;

import java.util.ArrayList;

public class Carro 
{
	private Motor motor;

	private String color;
	
	private Double kilometraje;
	
	
	

	private Puerta[] puertas;
	
	private ArrayList<Llanta> llantas;
	
	private ArrayList<Luz> luces;
	
	
	
	
	
	
	
	public static int numeroCarros=0;
	
	public Carro(String color,double capacidadP,String cilindrajeP) 
	{
		this.color= color;
		motor= new Motor(capacidadP,cilindrajeP);
		
	}
	
	public Carro(String color,Motor motorP) 
	{
		this.color= color;
		motor= motorP;
		
	}
	
	
	public Carro(String color, String motor, int asientos) 
	{
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Motor getMotor() {
		return motor;
	}


	
}
