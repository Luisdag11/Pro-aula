/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        // Crear objeto Persona
        Persona persona = new Persona(nombre);

        // Llamar métodos
        persona.hablar();
        persona.trabajar();

        scanner.close(); // Cerrar scanner
    }
}
