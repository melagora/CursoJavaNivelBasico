package aprendizaje;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; // Definición de una matriz de 3x3

        // Asignación de valores a la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = i + j; // Ejemplo de asignación, puedes cambiarlo según tus necesidades
            }
        }

        // Imprimir la matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}
