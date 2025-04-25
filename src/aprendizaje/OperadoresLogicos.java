package aprendizaje;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores lógicos
        boolean a = true, b = false;
        boolean resultado;

        // AND lógico (&&)
        resultado = a && b;
        System.out.println("a && b: " + resultado); // false

        // OR lógico (||)
        resultado = a || b;
        System.out.println("a || b: " + resultado); // true

        // NOT lógico (!)
        resultado = !a;
        System.out.println("!a: " + resultado); // false

        // XOR lógico (^)
        resultado = a ^ b;
        System.out.println("a ^ b: " + resultado); // true
    }
}
