/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del coche
        System.out.print("Ingrese la marca del coche: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese la velocidad máxima del coche (km/h): ");
        int velocidadMaxima = scanner.nextInt();

        System.out.print("Ingrese el número de puertas del coche: ");
        int numeroDePuertas = scanner.nextInt();

        // Crear objeto Coche con los datos ingresados
        Coche coche = new Coche(marca, velocidadMaxima, numeroDePuertas);

        // Mostrar información del coche
        System.out.println("\nInformación del Coche:");
        coche.mostrarInformacion();

        scanner.close();
    }
}
