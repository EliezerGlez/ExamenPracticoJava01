package examen.practico.java_01.ejercicio_03;

public class ControlArrays {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        int[] numeros = {1, 524, 423, 825, 1524, 324, 899, 975, 775, 657};

        int maxNumero = numeros[0]; // Suponemos que el primer número es el máximo inicialmente
        int posicionMax = 0; // La posición del máximo inicialmente es 0

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maxNumero) {
                maxNumero = numeros[i];
                posicionMax = i;
            }
        }

        System.out.println("El número más alto es " + maxNumero + " y se encuentra en la posición " + posicionMax + " del array.");
    }



}
