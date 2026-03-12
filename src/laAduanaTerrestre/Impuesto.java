package laAduanaTerrestre;
//import java.util.HashMap;
//import java.util.ArrayList;
//quedo tan hermoso 
public class Impuesto 
{
	//private ArrayList<Alienigena> listaAlienigenas;
	//protected HashMap<Alienigena,Double> mapaImpuestos ;
	private Alienigena alien;
	public static int IMPUESTO_TENTACULO = 100 ;
	public static double IMPUESTO_AGUA= 10.02;
	public static double IMPUESTO_FUEGO= 50.5;
	public static double IMPUESTO_CIBERNETICO= 0.5;
	public static double IMPUESTO_GASEOSO = 15.25;
	
	
	
	
	public Impuesto( Alienigena alien) {
		super();
	this.alien = alien;
		
	}
	



	public double impuestoTipo() {
		
		
		tipoAlienigena clase = alien.getClasificacion();	
		double lunas = alien.getFasesLunaresPlaneta();
		double impuesto = 0.0;//se inicializa aca 
		double radiacion = alien.getNivelRadiacion();
		int tentaculos = alien.getCantidadtentaculos();
		
		if (clase == tipoAlienigena.FUEGO) {
			impuesto+= lunas* IMPUESTO_FUEGO;
		}
		if(clase == tipoAlienigena.ACUATICO) {
			impuesto+= lunas*Impuesto.IMPUESTO_AGUA;
		}
		if (tentaculos > 3) {
			impuesto+= Impuesto.IMPUESTO_TENTACULO;
			
		}//radiacion 
		if (radiacion > 25.25) {
			impuesto+= 125.2;	
		}
		if (clase==tipoAlienigena.CIBERBORD) {
			impuesto+= Impuesto.IMPUESTO_CIBERNETICO;
		}
		if (clase==tipoAlienigena.GASEOSO) {
			impuesto+= Impuesto.IMPUESTO_GASEOSO;
		}
		if (clase == tipoAlienigena.HUMANOIDE || clase == tipoAlienigena.HUMANO) {
		    impuesto += lunas * 5.0;
		}
		// falta el alien cuantico que no paga impuestos 
		
		
		
		// como harmo el hash
		//return 0.0;
		
		return impuesto;
	}
	
	
	
	
	

}

/**
 * 
 * 
 * public CalculoImpuestos(ArrayList<Alienigena> listaAlienigenas, HashMap<Alienigena, Double> mapaImpuestos) {
		super();
		this.listaAlienigenas = new ArrayList<>();
		this.mapaImpuestos = new HashMap<>();
	}
	public void AgregarAlien(Alienigena a) {
		listaAlienigenas.add(a);
	}
	public ArrayList<Alienigena> getListaAlienigenas() {
		return listaAlienigenas;
	}



	public HashMap<Alienigena, Double> impuestoTipo() {
		
		for (Alienigena a: listaAlienigenas ) {
		tipoAlienigena clase = a.getClasificacion();	
		double lunas = a.getFasesLunaresPlaneta();
		double impuesto = 0.0;
		double radiacion = a.getNivelRadiacion();
		int tentaculos = a.getCantidadtentaculos();
		
		if (clase == tipoAlienigena.FUEGO) {
			impuesto+= lunas* IMPUESTO_FUEGO;
		}
		if(clase == tipoAlienigena.ACUATICO) {
			impuesto+= lunas*CalculoImpuestos.IMPUESTO_AGUA;
		}
		if (tentaculos > 3) {
			impuesto+= CalculoImpuestos.IMPUESTO_TENTACULO;
			
		}//radiacion 
		if (radiacion > 25.25) {
			impuesto+= 125.2;	
		}
		// falta el alien cuantico que no paga impuestos 
		mapaImpuestos.put(a, impuesto);
		
		}
		// como harmo el hash
		//return 0.0;
		
		return mapaImpuestos;
	}
	
 **/
