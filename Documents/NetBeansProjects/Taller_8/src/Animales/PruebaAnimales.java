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
public class PruebaAnimales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos del Pez
        System.out.print("Ingrese la especie del pez: ");
        String especie = scanner.nextLine();

        System.out.print("Ingrese el tipo de agua (dulce/salada): ");
        String tipoDeAgua = scanner.nextLine();

        // Crear objeto Pez
        Pez pez = new Pez(especie, tipoDeAgua);

        // Mostrar detalles
        System.out.println("\nDetalles del Pez:");
        pez.mostrarDetalles();

        scanner.close();
    }
}