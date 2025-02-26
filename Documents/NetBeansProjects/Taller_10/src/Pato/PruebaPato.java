/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pato;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaPato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre del pato
        System.out.println("Ingrese el nombre del pato:");
        String nombrePato = scanner.nextLine();

        // Crear una instancia de Pato
        Pato miPato = new Pato(nombrePato);

        // Invocar métodos
        miPato.volar();
        miPato.nadar();

        scanner.close();
    }
}
