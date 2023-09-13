package examen.practico.java_01.ejercicio_05;

public class Estudiante extends Persona{
	private String codigo;
	
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String direccion, int edad, String codigo) {
		super();
		this.codigo = codigo;
	}	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Estudiante [codigo=" + codigo + "]";
	}

	

	
	

}
