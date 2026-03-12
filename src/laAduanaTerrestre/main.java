package laAduanaTerrestre;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Crear los procesados o Alienigenas
		//Alienigena organismo1 = new Alienigena("Tulaste.e", "Grung",tipoAlienigena.HUMANOIDE,"AW8828", 2, 0,2.1);
		Alienigena organismo2 = new Alienigena("Inquisidor","Sangheili",tipoAlienigena.HUMANOIDE,"AX2422", 2,0,1.2);
		//Alienigena organismo3 = new Alienigena("Jerome","Hummano",tipoAlienigena.HUMANO,"AW1107",1,0,0.23);
		//Alienigena organismo4 = new Alienigena("Alice", "Transformers", tipoAlienigena.CIBERBORD,"PU3425",0,0,2.1);
		//Alienigena organismo5 = new Alienigena("Calamardo","Pulpo",tipoAlienigena.ACUATICO,"CU1278",1,6,1.2);
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el nombre: ");
		String nombre = sc.nextLine();

		System.out.println("Ingresa el nombre de la especie: ");
		String especie = sc.nextLine();

		System.out.println("Ingresa el tipo (FUEGO, ACUATICO, GASEOSO, CIBERBORD, HUMANOIDE, HUMANO): ");
		String tipoStr = sc.nextLine();
		tipoAlienigena tipo = tipoAlienigena.valueOf(tipoStr);

		System.out.println("Ingresa el código de pasaporte: ");
		String pasaporte = sc.nextLine();

		System.out.println("Ingresa las fases lunares: ");
		int lunas = sc.nextInt();

		System.out.println("Ingresa la cantidad de tentáculos: ");
		int tentaculos = sc.nextInt();
		sc.nextLine();

		System.out.println("Ingresa el nivel de radiación: (CON COMA)");
		double radiacion = sc.nextDouble();
		sc.nextLine();

		Alienigena a = new Alienigena(nombre, especie, tipo, pasaporte, lunas, tentaculos, radiacion);
		
		Proceso p1 = new Proceso(a);
		Impuesto c1 = new Impuesto(organismo2);
			if (!p1.EsAutentico()) {
		        Deportado d = new Deportado(tipoTransporte.Phantom, a.getNombreEspecie());
		        System.out.println(a.getNombre() + " deportado a: " + d.reubicar());
		        
			}else if (p1.EsPeligroso()) {
				//crear detencion 
				Detencion det = new Detencion(a.getClasificacion());
		        System.out.println(a.getNombre() + " detenido en: " + det.reubicar());

			}
			else {
				
				Aceptado ac = new Aceptado();
		        System.out.println(a.getNombre() + " aceptado. Visa: " + ac.getNumeroVisa());
		        System.out.println("Impuesto: " + c1.impuestoTipo());
				// crear aceptado
			}
		}
	}
	/**
	main va a crear alienigena 
	main va a crear proceso 
	si en el metodo EsAuntentico
	este crea deportado o detencion o acentado depende del caso 
	**/
	
	


