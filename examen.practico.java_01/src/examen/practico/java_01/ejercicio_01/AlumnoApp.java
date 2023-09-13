package examen.practico.java_01.ejercicio_01;

import java.util.ArrayList;


public class AlumnoApp {

	public static ArrayList<Alumno> arrayDeAlumnos = new ArrayList<Alumno>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Alumno alu_AAA = new Alumno("A", "AAA", 20);
		Alumno alu_BBB = new Alumno("B", "BBB", 21);
		Alumno alu_CCC = new Alumno("C", "CCC", 21);
		Alumno alu_DDD = new Alumno("D", "DDD", 21);
		Alumno alu_EEE = new Alumno("E", "EEE", 21);
		Alumno alu_FFF = new Alumno("F", "FFF", 21);
		Alumno alu_GGG = new Alumno("G", "GGG", 21);
		Alumno alu_HHH = new Alumno("H", "HHH", 21);
		Alumno alu_III = new Alumno("I", "III", 21);
		Alumno alu_JJJ = new Alumno("J", "JJJ", 21);
		

		arrayDeAlumnos.add(alu_AAA);
		arrayDeAlumnos.add(alu_BBB);
		arrayDeAlumnos.add(alu_CCC);
		arrayDeAlumnos.add(alu_DDD);
		arrayDeAlumnos.add(alu_EEE);
		arrayDeAlumnos.add(alu_FFF);
		arrayDeAlumnos.add(alu_GGG);
		arrayDeAlumnos.add(alu_HHH);
		arrayDeAlumnos.add(alu_III);
		arrayDeAlumnos.add(alu_JJJ);
		
		

		// Alumnos
		System.out.println("Alumnos");
		System.out.println("=======");
		for (Alumno alumno : arrayDeAlumnos) {
			System.out.println("Nombre: " + alu_AAA.getNombre() + ", Apellido: " + alu_AAA.getApellidos());
		}
		

	}

}
