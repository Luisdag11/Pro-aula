/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2.base;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Estudiante {
     private String nombre;
    private int edad;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método estático correcto
    public static void mostrarMensaje() {
        System.out.println("Este es un mensaje general sobre los estudiantes.");
    }

    // Método no estático que puede acceder a this
    public void mostrarEstudiante() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        // Llamada correcta a un método estático
        Estudiante.mostrarMensaje();

        // Crear un objeto para llamar a un método NO estático
        Estudiante estudiante1 = new Estudiante("Carlos", 21);
        estudiante1.mostrarEstudiante();
    }
}
