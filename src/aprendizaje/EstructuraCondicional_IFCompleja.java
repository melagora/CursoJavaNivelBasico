package aprendizaje;

import java.util.Scanner;

public class EstructuraCondicional_IFCompleja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("Edad no válida.");
        } else if (edad == 0) {
            System.out.println("Ingrese los meses de nacido: ");
            int meses = scanner.nextInt();
            if (meses < 0) {
                System.out.println("Meses no válidos.");
            } else if (meses == 0) {
                System.out.println("Eres un recién nacido.");
            } else if (meses < 12) {
                System.out.println("Eres un bebé de " + meses + " meses.");
            } else if (meses >= 12 && meses < 24) {
                System.out.println("Eres un niño pequeño de 1 año.");
            } else if (meses >= 24 && meses < 36) {
                System.out.println("Eres un niño pequeño de 2 años.");
            } else if (meses >= 36 && meses < 48) {
                System.out.println("Eres un niño pequeño de 3 años.");
            } else {
                System.out.println("Eres un niño grande");

            }
        } else if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad < 65) {
            System.out.println("Eres adulto.");
        } else {
            System.out.println("Eres adulto mayor.");

        }
    }
}
