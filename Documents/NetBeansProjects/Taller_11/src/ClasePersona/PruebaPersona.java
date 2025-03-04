/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasePersona;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

// Clase base Persona
class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse() {
        System.out.println("Soy una persona.");
    }
}

// Clase Estudiante que hereda de Persona
class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y soy estudiante de " + carrera + ".");
    }
}

// Clase Profesor que hereda de Persona
class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y enseño " + materia + ".");
    }
}

// Clase de prueba
public class PruebaPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos para Estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEst = scanner.nextLine();
        System.out.print("Ingrese la carrera del estudiante: ");
        String carrera = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEst, carrera);

        // Ingreso de datos para Profesor
        System.out.print("\nIngrese el nombre del profesor: ");
        String nombreProf = scanner.nextLine();
        System.out.print("Ingrese la materia del profesor: ");
        String materia = scanner.nextLine();
        Profesor profesor = new Profesor(nombreProf, materia);

        // Mostrar presentaciones (polimorfismo)
        System.out.println("\nPresentaciones:");
        estudiante.presentarse();
        profesor.presentarse();

        scanner.close();
    }
}
