package laAduanaTerrestre;

import java.util.ArrayList;

public class GestorInmigracion {
	private ArrayList<Alienigena> listaAlienigena;

    public GestorInmigracion(ArrayList<Alienigena> listaAlienigena) {
		super();
		this.listaAlienigena = new ArrayList<>();
	
    //tengo una lista que hago con ella 
		
	public ArrayList procesar{	
	    for (Alienigena a: listaAlienigena){
	    	if (a.getCodigoPasaporte().length()) < 6{
	    		return false
	    		    	
	    	}
	    		
	    }
	}
    

    }



	// Método "Dios" que hace absolutamente todo
    public void procesarInmigrante(String nombre, String especie, String pasaporte, int fasesLunaresPlaneta, boolean tieneTentaculos, int nivelRadiacion) {
        System.out.println("Iniciando procesamiento de: " + nombre);
        

        // 1. Validación de pasaporte
        if (pasaporte == null || pasaporte.length() < 5) {
            System.out.println("Pasaporte inválido. Deportado.");
            return;
        }
//en impuesto el de agua paga 50.5 , el de fuego paga 
        double impuesto = 0.0;
        String tipoCelda = "";

        // 2. Lógica de negocio mezclada (Cálculo de impuestos y asignación de celdas)
        if (especie.equals("AlienFuego")) {
            if (pasaporte.startsWith("FGO-")) {
                impuesto = fasesLunaresPlaneta * 50.5; // 
                tipoCelda = "Celda de Contención de Plomo Térmico";
            } else {
                System.out.println("Pasaporte falso para especie de Fuego. Detenido.");
                return;
            }
        } 
        else if (especie.equals("AlienAcuatico")) {
            if (tieneTentaculos) {
                impuesto = fasesLunaresPlaneta * 10.0 + 100; // Recargo por peligro de tentáculos
            } else {
                impuesto = fasesLunaresPlaneta * 10.0;
            }
            tipoCelda = "Tanque de Agua Salada Presurizada";
        } 
        else if (especie.equals("AlienCuantico")) {
            if (nivelRadiacion > 9000) {
                System.out.println("Nivel de radiación peligroso. Deportado a la Dimensión X.");
                return;
            }
            // Los seres cuánticos no pagan impuestos porque existen en múltiples estados financieros a la vez
            impuesto = 0.0; 
            tipoCelda = "Caja de Schrödinger";
        } 
        else {
            System.out.println("Especie desconocida. Cuarentena obligatoria.");
            tipoCelda = "Cuarentena Estándar Nivel 1";
            impuesto = 500.0; // Multa por especie no registrada
        }

        // 3. Impresión de resultados
        System.out.println("Inmigrante procesado exitosamente.");
        System.out.println("Impuesto a pagar: " + impuesto + " Créditos Galácticos");
        System.out.println("Asignado a: " + tipoCelda);
        System.out.println("--------------------------------------------------");
    }
}