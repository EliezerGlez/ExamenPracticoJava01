package examen.practico.java_01.ejercicio_02;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        Scanner scanner = new Scanner(System.in);

        // Leer dos números
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        // Mostrar los números leídos
        System.out.println("\n============================");
        System.out.println("Números ingresados: " + num1 + " y " + num2);
        System.out.println("============================\n");

        // Realizar operaciones y mostrar resultados
        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        double division = 0.0;

        try {
            if ((num2 != 0) && (num1 != 0)) {
                division = num1 / num2;
            } else {
                throw new ArithmeticException("¡No se puede dividir por cero!");
            }

            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Producto: " + producto);
            System.out.println("División: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Leer un array de 10 números enteros
        int[] numeros = new int[10];

        System.out.println("\n============================");
        System.out.println("Ingresa 10 números enteros:");
        System.out.println("============================\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el contenido del array
        System.out.println("\n====================");
        System.out.println("Contenido del array:");
        System.out.println("====================");

        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        scanner.close();
    }
}

