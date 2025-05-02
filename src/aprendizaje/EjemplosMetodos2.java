package aprendizaje;

public class EjemplosMetodos2 {

    static void Mensaje(String cTexto, String cTexto2) {
        System.out.println(cTexto);
        System.err.println(cTexto2);
    }

    static int Sumar(int Valor1, int Valor2) {
        return Valor1 + Valor2;
    }

    public static void main(String[] args) {
        // Mensaje("Hola Mundo desde un método no estático", "Este es un ejemplo de un
        // método no estático en Java.");
        System.out.println("La suma de los valores es: " + Sumar(45, 5));
    }
}
