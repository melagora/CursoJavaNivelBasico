package aprendizaje;

public class Vectores {
    public static void main(String[] args) {
        // Definición de un vector (arreglo) de enteros
        int[] numeros = new int[5]; // Crea un vector de 5 elementos

        // Asignación de valores al vector
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Imprimir los valores del vector
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
        }
    }
}
