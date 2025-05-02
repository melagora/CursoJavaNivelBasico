package aprendizaje;

class Persona {
    String nombre;
    int edad;

    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + ", es una persona.");
    }

}

public class EjemplosClases {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Crear un objeto de la clase Persona

        persona1.nombre = "Juan"; // Asignar un valor al atributo nombre
        persona1.edad = 25; // Asignar un valor al atributo edad

        System.out.println("Nombre: " + persona1.nombre); // Imprimir el valor del atributo nombre
        System.out.println("Edad: " + persona1.edad); // Imprimir el valor del atributo edad
        Persona.saludar(persona1.nombre); // Llamar al método estático saludar de la clase Persona
    }
}
