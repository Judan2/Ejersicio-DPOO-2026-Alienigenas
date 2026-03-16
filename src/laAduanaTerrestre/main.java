package laAduanaTerrestre;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Crear los procesados o Alienigenas
		Alienigena organismo1 = new Alienigena("Tulaste.e", "Grung",tipoAlienigena.HUMANOIDE,"AW8828", 2, 0,2.1);
		Alienigena organismo2 = new Alienigena("Inquisidor","Sangheili",tipoAlienigena.HUMANOIDE,"AX2422", 2,0,1.2);
		Alienigena organismo3 = new Alienigena("Jerome","Hummano",tipoAlienigena.HUMANO,"AW1107",1,0,0.23);
		Alienigena organismo4 = new Alienigena("Alice", "Transformers", tipoAlienigena.CIBERBORD,"PU3425",0,0,2.1);
		Alienigena organismo5 = new Alienigena("Calamardo","Pulpo",tipoAlienigena.ACUATICO,"CU1278",1,6,1.2);
		System.out.println(organismo1.getCodigoPasaporte());
		System.out.println(organismo4.getFasesLunaresPlaneta());
	}
	
	
}

