package excepciones;

public class Operacion {
	
	public double dividir(int a, int b) throws MiExcepcion
	{
		if(b==0) 
		{
			throw new MiExcepcion();
		}
		return a/b;
	}

}
