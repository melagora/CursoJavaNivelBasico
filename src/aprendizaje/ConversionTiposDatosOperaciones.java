package aprendizaje;

import java.util.Scanner;

public class ConversionTiposDatosOperaciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String porcentaje = "0.10";

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);

        Double resultadoDouble = Double.valueOf(resultado);
        Double porcentajeDouble = Double.valueOf(porcentaje);
        Double total = resultadoDouble * porcentajeDouble;
        System.out.println("El resultado de la suma * porcentaje (0.10): " + (total + resultadoDouble));
        System.out.println("El resultado de la suma * porcentaje (0.10): " + (resultadoDouble.doubleValue()));
        System.out.println("El resultado de la suma * porcentaje (0.10): " + (total.doubleValue()));

        scanner.close();
    }

}
