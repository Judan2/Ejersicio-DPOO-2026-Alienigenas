package laAduanaTerrestre;
//import java.util.HashMap;
public class Deportado extends DestinoFinal{
	private tipoTransporte metodo;
	private String nombreEspecie;
	
	//como recibe el nombreEspecie
	public Deportado(tipoTransporte metodo, String nombreEspecie) {
		super();
		this.metodo = metodo;
		this.nombreEspecie= nombreEspecie;
	}

	@Override
	public String reubicar() {
		// TODO Auto-generated method stub
		return Especie.getPlaneta(nombreEspecie);//esto es el planeta 
		
	}
	public tipoTransporte comolollevo(){
		String planeta= Especie.getPlaneta(nombreEspecie);
		
		if (planeta.equals("Planeta Sanghelios")) {
			return tipoTransporte.Carrier; //elites disidentes
		}
		if (planeta.equals("Planeta Balaho")){
			return tipoTransporte.Phantom;
		}
		if (planeta.equals("Eayn")){
			return tipoTransporte.Raven;
		}
		if (planeta.equals("Luna Te")) {//los gusanos
			return tipoTransporte.Phantom_Clase_DSC;
		}
		if (planeta.equals("Planeta Janjur Qom")) {//los jerarcas
			return tipoTransporte.Forerunner_Dreadnought;
		}
		if (planeta.equals("Reach")) {//humanos
			return tipoTransporte.Nave_Espacial_Delta;
		}
		if (planeta.equals("Planeta Palamok")) {//bichos
			return tipoTransporte.Ket_pattern_Battlecruiser;
		}
		if (planeta.equals("Doisac")) {//brutes
			return tipoTransporte.Phantom;
		}
		if (planeta.equals("Halo 2")){//los ingenieros
			return tipoTransporte.Phantom;
		}
		if (planeta.equals("Desconocido")){
			return tipoTransporte.Destuctor_alta_contencion;
		}
		
		return tipoTransporte.Destuctor_alta_contencion;
	}
	
	

}
