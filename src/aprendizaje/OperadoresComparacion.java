package aprendizaje;

public class OperadoresComparacion {
    public static void main(String[] args) {
        // Operadores de comparación
        int a = 5, b = 10;
        boolean resultado;

        // Mayor que
        resultado = a > b;
        System.out.println("a > b: " + resultado); // false

        // Menor que
        resultado = a < b;
        System.out.println("a < b: " + resultado); // true

        // Mayor o igual que
        resultado = a >= b;
        System.out.println("a >= b: " + resultado); // false

        // Menor o igual que
        resultado = a <= b;
        System.out.println("a <= b: " + resultado); // true

        // Igual que
        resultado = a == b;
        System.out.println("a == b: " + resultado); // false

        // Diferente de
        resultado = a != b;
        System.out.println("a != b: " + resultado); // true
    }
}
