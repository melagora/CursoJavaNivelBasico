package aprendizaje;

import java.util.Scanner;

public class EstrusturaCondicional_SWITCH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 5: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Has ingresado el número uno.");
                break;
            case 2:
                System.out.println("Has ingresado el número dos.");
                break;
            case 3:
                System.out.println("Has ingresado el número tres.");
                break;
            case 4:
                System.out.println("Has ingresado el número cuatro.");
                break;
            case 5:
                System.out.println("Has ingresado el número cinco.");
                break;
            default:
                System.out.println("Número no válido. Debe estar entre 1 y 5.");
                break;
        }

        scanner.close();
    }
}
