package laAduanaTerrestre;
//import java.util.*;
import java.util.HashMap;

public class Especie {
	private static HashMap<String, String> dedondesoy ;
	static {
		dedondesoy= new HashMap<>();
		dedondesoy.put("Sangheili", "Planeta Sanghelios");//elites
		dedondesoy.put("Unggoy", "Planeta Balaho");//los grunts
		dedondesoy.put("kig-Yal", "Eayn");//son los jackals
		dedondesoy.put("Mgalekgolo", "Luna Te");//son los hunters
		dedondesoy.put("San'Shyuum", "Planeta Janjur Qom");// los jerarcas
		dedondesoy.put("Humano", "Reach");//remember reach
		dedondesoy.put("Yanme'e", "Planeta Palamok"); //los insectos raros
		dedondesoy.put("Jiralhanae", "Doisac");//los brutes
		dedondesoy.put("Huragok ", "Halo 2"); //los ingenieros
		dedondesoy.put("Desconocido", null);//se puede eliminar
	}
	
	//si no aprece
	//String nombre = a.getNombreEspecie();
	//comparamos aca la especie 
	//return dedondesoy.get(nombre);
	//y si no aparece que hago ? 
	
	public static String getPlaneta(String nombre){
		//primero verificar si existe
		boolean valor = dedondesoy.containsKey(nombre);
		if (valor == false) {
			return "Planeta Desconocido";
		}
		//existe entonces damela 
		else {
			String damelugarnata = dedondesoy.get(nombre);
			return damelugarnata;
		}
		
		
		
	}
	
	

}
