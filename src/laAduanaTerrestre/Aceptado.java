package laAduanaTerrestre;
import java.util.Random;
//import java.util.random.*;
public class Aceptado extends DestinoFinal{
	private int numeroVisa;
	private String regalo;

	public Aceptado() {
		super();
		Random r = new Random();
		this.numeroVisa = 100_000+ r.nextInt(900_000);
		this.regalo = "Globos y Tiramisu";
	}
	@Override
	public String reubicar() {
		// TODO Auto-generated method stub
		return "El majestuaoso Planeta Tierra";
	}
	
	public String getRegalo() {
		return regalo;
		
	}

	public int getNumeroVisa() {
		return numeroVisa;
	}

	

}
