package Herencia;

public abstract class AbstractMedioTransporte implements ITransportePrivado {
	
	private String atributo1;
	
	public String datAtributo1() 
	{
		return atributo1;
	}
	
	public abstract void arrancar();

}
