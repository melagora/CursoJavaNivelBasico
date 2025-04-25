package aprendizaje;

import java.util.Scanner;

public class DatosPorConsola {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Ingrese su nombre: ");
        // String nombre = scanner.nextLine();

        // System.out.print("Ingrese su apellido: ");
        // String apellido = scanner.nextLine();

        // System.out.print("Ingrese su edad: ");
        // int edad = scanner.nextInt();

        // String mensajeCompleto = "Su nombre es: " + nombre + " " + apellido + " con "
        // + edad + " años de edad.";
        // System.out.println(mensajeCompleto);

        // scanner.close();

        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese el dato a capturar: ");
        String Datos = Entrada.nextLine();
        System.out.println("Los datos son: " + Datos);

        Entrada.close();

    }
}
