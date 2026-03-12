package laAduanaTerrestre;

public class Detencion extends DestinoFinal {
	private String tipoCelda;
	

	public Detencion( tipoAlienigena tipo) {
		super();
		switch(tipo) {
	    case FUEGO:
	        this.tipoCelda= "Celda de Contención Termica";
	        break;
	    case ACUATICO:
	        this.tipoCelda = "Tanque de Agua Salada";
	        break;
	    case CIBERBORD:
	        this.tipoCelda = "Jaula de Faraday";
	        break;
	    case GASEOSO:
	    	this.tipoCelda= "Camara de Presion";
	    	break;
	    case HUMANOIDE:
	    	this.tipoCelda="Celda Standar Grande";
	    	break;
	    case HUMANO:
	    	this.tipoCelda ="Celda Standar";
	    	break;
	    	
	    default:
	        this.tipoCelda = "Celda Estándar";
	        break;
		}
	}
	


	@Override
	public String reubicar() {
		// TODO Auto-generated method stub
		return this.tipoCelda;
	}

}
