/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_1.base;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Estudiante desconocido";
        this.edad = 18;
        this.curso = "Curso no asignado";
    }

    // Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Curso no asignado"; // Curso por defecto
    }

    // Constructor con todos los parámetros
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llamada al constructor de 2 parámetros
        this.curso = curso;
    }

    // Método toString()
    @Override
    public String toString() {
        return "🎓 Estudiante: " + nombre + "\nEdad: " + edad + "\nCurso: " + curso;
    }
}
