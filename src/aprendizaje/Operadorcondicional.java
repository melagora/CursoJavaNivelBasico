package aprendizaje;

public class Operadorcondicional {
    public static void main(String[] args) {
        // Operador condicional (ternario)
        int a = 5;
        int b = 10;

        // Usando el operador ternario para asignar un valor basado en una condición
        String resultado = (a > b) ? "a es mayor que b" : "a no es mayor que b";
        System.out.println(resultado); // a no es mayor que b

        // Ejemplo de uso en una expresión
        int maximo = (a > b) ? a : b;
        System.out.println("El valor máximo es: " + maximo); // 10
    }
}
