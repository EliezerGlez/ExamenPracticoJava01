package examen.practico.java_01.ejercicio_05;

public class Persona {
	protected String nombre, direccion;
	protected int edad;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String direccion, int edad) {		
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean mayorEdad() {
		return true;		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + "]";
	}
	
	
	

}
