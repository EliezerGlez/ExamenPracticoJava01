package examen.practico.java_01.ejercicio_01;

public class Alumno {
	private String nombre, apellidos;
	private int edad;
	
	
	public Alumno(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno: Nombre = " + nombre + ", Apellidos = " + apellidos + ", edad = " + edad + "\n";
	}
	
	
	
	

}
