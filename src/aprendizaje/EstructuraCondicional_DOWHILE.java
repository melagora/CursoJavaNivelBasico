package aprendizaje;

public class EstructuraCondicional_DOWHILE {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("El valor de i es: " + i);
            i++;
        } while (i < 10);
        // El bucle do-while garantiza que el bloque de código se ejecute al menos una
        // vez, incluso si la condición es falsa desde el principio.
    }
}
