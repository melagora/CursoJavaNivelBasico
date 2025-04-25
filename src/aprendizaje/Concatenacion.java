package aprendizaje;

public class Concatenacion {
    public static void main(String[] args) {
        String nombre = "Juan";
        String apellido = "Pérez";
        String nombreCompleto = nombre + " " + apellido;

        System.out.println("Nombre completo: " + nombreCompleto);

        int edad = 24;
        String mensajeCompleto = nombre + " " + apellido + " con " + edad + " años de edad";
        System.out.println(mensajeCompleto);
    }
}
