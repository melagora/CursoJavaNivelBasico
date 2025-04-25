package aprendizaje;

public class ConversionTiposDatos {
    public static void main(String[] args) {
        // Conversion de String a int
        String numeroString = "123";
        int numeroInt = Integer.parseInt(numeroString);
        System.out.println("El número entero es: " + numeroInt);

        // Conversion de String a double
        String decimalString = "123.45";
        double numeroDouble = Double.parseDouble(decimalString);
        System.out.println("El número decimal es: " + numeroDouble);

        // Conversion de int a String
        int numeroEntero = 456;
        String numeroComoString = Integer.toString(numeroEntero);
        System.out.println("El número como cadena es: " + numeroComoString);

        // Conversion de double a String
        double numeroDecimal = 789.01;
        String decimalComoString = Double.toString(numeroDecimal);
        System.out.println("El número decimal como cadena es: " + decimalComoString);

    }
}
