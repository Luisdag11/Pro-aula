/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaPez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos del Pez
        System.out.print("Ingrese la especie del pez: ");
        String especie = scanner.nextLine();

        // Crear objeto Pez
        Pez pez = new Pez(especie);

        // Mostrar información y ejecutar métodos de las interfaces
        System.out.println("\nDetalles del Pez:");
        pez.mostrarInformacion();
        pez.nadar();
        pez.respirar();

        scanner.close();
    }
}
