package aprendizaje;

import aprendizaje.EjemplosClases;

public class Tarea {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Melvin";
        persona1.edad = 27;

        Persona.saludar("Melvin González"); // Llamar al método estático saludar de la clase Persona
    }
}
