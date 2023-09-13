package examen.practico.java_01.ejercicio_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibrosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        ArrayList<Libro> listaLibros = new ArrayList<>();
        
        
        // Se crean los objetos Libro
        Libro libro1 = new Libro("11", "AAATítulo222", "Autor11", "Categoría11", 1995, 20.0);
        Libro libro2 = new Libro("22", "CCCTítulo22", "Autora22", "Categoría22", 1996, 25.0);
        Libro libro3 = new Libro("33", "EEETítulo3", "Autor33", "Categoría33", 1997, 30.0);
        Libro libro4 = new Libro("44", "AAATítulo111", "Autor44", "Categoría44", 1998, 18.0);
        Libro libro5 = new Libro("55", "HHHHTítulo55", "Autor55", "Categoría55", 1995, 18.5);

        // Se agregan los objetos Libro a la lista
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        listaLibros.add(libro4);
        listaLibros.add(libro5);

        

        boolean salir = false;

        while (!salir) {
            try {
                System.out.println("\n===== Menú: =====");
                System.out.println("=================");
                System.out.println("1. Cargar libro");
                System.out.println("2. Listar libros");
                System.out.println("3. Libro con mayor precio");
                System.out.println("4. Libros disponibles por categoría");
                System.out.println("5. Ordenar libros por título");
                System.out.println("6. Salir");
                System.out.println("======================");
                System.out.println("Seleccione una opción:");
                System.out.println("======================");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el salto de línea

                switch (opcion) {
                    case 1:
                        // Cargar libro
                        System.out.print("ISBN: ");
                        String isbn = scanner.nextLine();
                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();
                        System.out.print("Categoría: ");
                        String categoria = scanner.nextLine();
                        System.out.print("Año: ");
                        int anyo = scanner.nextInt();
                        System.out.print("Precio: ");
                        double precio = scanner.nextDouble();

                        Libro libro = new Libro(isbn, titulo, autor, categoria, anyo, precio);
                        listaLibros.add(libro);
                        break;

                    case 2:
                        // Listar libros
                        if (!listaLibros.isEmpty()) {
                            for (Libro l : listaLibros) {
                            	System.out.println("\n---------------");
                                System.out.println(l.toString());
                                System.out.println("---------------");
                            }
                        } else {
                        	System.out.println("\n==============================");
                            System.out.println("La lista de libros está vacía.");
                            System.out.println("==============================\n");
                        }
                        break;

                    case 3:
                        // Libro con mayor precio
                    	// Collections.max() | Método que nos devuelve el elemento máximo de la colección.
                    	
                        if (!listaLibros.isEmpty()) {
                            Libro libroMasCaro = Collections.max(listaLibros, (l1, l2) -> Double.compare(l1.getPrecio(), l2.getPrecio()));
                            System.out.println("=========================");
                            System.out.println("Libro con mayor precio:\n=========================\n" + libroMasCaro.toString() + "\n=========================\n");
                        } else {
                        	System.out.println("\n=========================");
                            System.out.println("No hay libros en la lista.");
                            System.out.println("=========================\n");
                        }
                        break;

                    case 4:
                        // Libros disponibles por categoría
                        System.out.print("Ingrese la categoría: ");
                        String categoriaBuscada = scanner.nextLine();
                        int cantidadLibros = 0;

                        for (Libro l : listaLibros) {
                            if (l.getCategoria().equalsIgnoreCase(categoriaBuscada)) {
                                cantidadLibros++;
                            }
                        }

                        System.out.println("\n==================================");
                        System.out.println("Cantidad de libros en la categoría '" + categoriaBuscada + "': " + cantidadLibros);
                        System.out.println("==================================\n");
                        break;

                    case 5:
                        // Ordenar libros por título
                        if (!listaLibros.isEmpty()) {
                            Collections.sort(listaLibros, (l1, l2) -> l1.getTitulo().compareToIgnoreCase(l2.getTitulo()));
                            System.out.println("\n============================");
                            System.out.println("Libros ordenados por título:");
                            System.out.println("============================\n");
                            for (Libro libroOrdenado : listaLibros) {
                                System.out.println(libroOrdenado);
                                System.out.println("---------------");
                            }
                        } else {
                        	System.out.println("\n========================");
                            System.out.println("No hay libros en la lista.");
                            System.out.println("========================\n");
                        }
                        break;

                    case 6:
                        salir = true;
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            } catch (InputMismatchException e) {
                // Captura la excepción si se ingresa un tipo de dato incorrecto
            	System.out.println("\n======================================");
                System.out.println("Error: Debe ingresar un número entero.");
                System.out.println("======================================\n");
                scanner.nextLine(); // Limpia el búfer de entrada
            }
        }

        scanner.close();

	}

}
