
public class Main
{
	
	String estudiante = "Pepito";
	
	static int  nota = 5;
	
	static double nota2 = 4;
	
	static String [] nombres = {"Manuel","Felipe"};
	
	public static double sumar( int a, double b) 
	{
		double c = a + b;
		
		return c;
	}
	
	public static int sumaruno(int a) 
	{
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumar(nota,nota2));
		
		System.out.println(sumaruno(3));
		
		for(String item:nombres) 
		{
			System.out.println(item);
		}

	}
		
	
	}
