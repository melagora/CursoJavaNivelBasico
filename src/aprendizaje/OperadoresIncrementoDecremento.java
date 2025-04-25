package aprendizaje;

public class OperadoresIncrementoDecremento {
    public static void main(String[] args) {
        // Operadores de incremento y decremento
        int a = 5;
        int b = 10;

        // Incremento
        a++; // a = a + 1
        System.out.println("Incremento: " + a); // 6

        // Decremento
        b--; // b = b - 1
        System.out.println("Decremento: " + b); // 9

        // Incremento y decremento en expresiones

        int c = ++a; // Pre-incremento
        System.out.println("Pre-incremento: " + c); // 7

        int d = --b; // Pre-decremento
        System.out.println("Pre-decremento: " + d); // 8

        int e = a++; // Post-incremento
        System.out.println("Post-incremento: " + e); // 7 (valor antes del incremento)
        System.out.println("Valor de a después del post-incremento: " + a); // 8

        int f = b--; // Post-decremento
        System.out.println("Post-decremento: " + f); // 8 (valor antes del decremento)
        System.out.println("Valor de b después del post-decremento: " + b); // 7
    }
}
