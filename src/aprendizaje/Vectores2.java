package aprendizaje;

import java.util.Scanner;

public class Vectores2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nNotas = 0;

        System.out.print("Ingrese la cantidad de notas: ");
        nNotas = scanner.nextInt();

        int[] Notas = new int[nNotas]; // Definición de un vector para almacenar las notas

        for (int i = 0; i < nNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            Notas[i] = scanner.nextInt(); // Asignación de valores al vector

        }
        System.out.println("Las notas ingresadas son: ");
        for (int i = 0; i < nNotas; i++) {
            System.out.println("Nota " + (i + 1) + ": " + Notas[i]); // Imprimir los valores del vector
        }

        scanner.close(); // Cerrar el escáner para evitar fugas de recursos
    }
}
