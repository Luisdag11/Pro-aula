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

public class PruebaAve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos del Ave
        System.out.print("Ingrese la especie del ave: ");
        String especie = scanner.nextLine();

        // Crear objeto Ave
        Ave ave = new Ave(especie);

        // Mostrar información y ejecutar métodos de las interfaces
        System.out.println("\nDetalles del Ave:");
        ave.mostrarInformacion();
        ave.volar();
        ave.cantar();

        scanner.close();
    }
}