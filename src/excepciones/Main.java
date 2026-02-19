package excepciones;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacion op= new Operacion();
		try {
		op.dividir(1,2);
		}
		catch(MiExcepcion e) 
		{
			e.getStackTrace();
		}
		finally 
		{
			System.out.println("Acá termina");
		}
	}

}
