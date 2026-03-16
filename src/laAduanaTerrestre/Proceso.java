package laAduanaTerrestre;
import java.util.ArrayList;



//primero necesito la lista la recorro y despues entro el atributo pasaporte y ahi verifico 
//esto sera la entidad de control 
public class Proceso {
	private ArrayList<Alienigena> listaAlienigenas;

	public Proceso(ArrayList<Alienigena> listaAlienigenas) {
		super();
		this.listaAlienigenas = new ArrayList<>();
	}
	public void AgregarAlien(Alienigena a) {
		listaAlienigenas.add(a);
	}
	public ArrayList<Alienigena> getListaAlienigenas() {
		return listaAlienigenas;
	}
	// hice la lista de alienigenas 
	// ya la puedo reocrrer como yo queera
	// necesito saber dos cosas si es de mentiras el pasaporte
	//u y  si el alien es peligroso para los ciudadanos de la tierra
	public ArrayList<Alienigena> EsAutentico() {
		// que lo hace falso o que lo hace autentico
		ArrayList<Alienigena> pasaportesFalsos= new ArrayList<>();
		for(Alienigena a : listaAlienigenas) {
			String codigo = a.getCodigoPasaporte();
			char ultimaletra = a.getCodigoPasaporte().charAt(codigo.length()-1);
			
			//que neesito saber aca necesito si el numero
			// sabemos que si el numero es mayor a 6 es falso el pasaporte
			if (codigo.length() > 6 || ultimaletra == '0' ) {
				pasaportesFalsos.add(a);
   			}
		}

		return pasaportesFalsos;	
	}
	public ArrayList<Alienigena> EsPeligro() {
		ArrayList<Alienigena> listaPeligrosos = new ArrayList<>();
		for (Alienigena a: listaAlienigenas) {
			tipoAlienigena clasificacion = a.getClasificacion();
			double radiacion = a.getNivelRadiacion();
			int cantTentaculos = a.getCantidadtentaculos();
			if (clasificacion == tipoAlienigena.FUEGO || cantTentaculos > 4 || radiacion > 50.5 ){
				listaPeligrosos.add(a);
			}
		}
		// como indetifico que es peligroso 
		// si tiene mas de 4 tentaculos es peligro 
		// y si es mejor 
		return listaPeligrosos;
		}
		
		
	
	
	

	
	
/**
	public boolean espeligroso(Alienigena alien)
	{
	
		// el alien es peligroso si el nivel de radiacion es mayor a 50.5 y tiene mas de 6 tentaculos
		if (alien.getNivelRadiacion() > 50.5 || alien.isCantidadtentaculos()> 6){
			return true;
		}
		else if(pasaporte == null || pasaporte.length() < 5) {
            System.out.println("Pasaporte inválido. Deportado.");
            return; ) {
			
		}
		
		else {
			return false;
		}
	}
		//si el pasaporte es falso 
	
	// que me van a traer de 
	//recibo uno a la vez por lo que o recibo un lista = una lista
	public boolean pasaporteVeridico(Alienigena alien) 
	{
		
		String codigo = alien.getCodigoPasaporte();
		// no lo podria hacer a fuera el codio antes de entrar a el for 
		
		for alien in alien.getCodigoPasaporte(){
			
		}
	}
**/
	

	}
