package EjemploParcial;

public class Empleado {
	
	private int idEmpleado;
	private String nombre;
	private String pais;
	private int edad;
	
	
	
	public Empleado(int idEmpleado, String nombre, String pais, int edad) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public String getPais() {
		return pais;
	}
	public int getEdad() {
		return edad;
	}
	
	
	

}
