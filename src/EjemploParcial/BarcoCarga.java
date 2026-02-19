package EjemploParcial;

public class BarcoCarga extends AbstractBarco {
		
	private Integer numeroContenedores;
	
	

	public BarcoCarga(int idBarco, String nombre, Double tonelaje, Integer numeroContenedores) {
		super(idBarco, nombre, tonelaje);
		this.numeroContenedores = numeroContenedores;
	}

	public Integer getNumeroContenedores() {
		return numeroContenedores;
	}

	@Override
	public void iniciarMantenimiento() {
		numeroContenedores=0;
	}

	@Override
	public void finalizarMantenimiento() {
		numeroContenedores=5;
	}

}
