/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaCoche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ¿ Cuantos coches desea crear? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea pendiente

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("\nIngrese la marca del coche " + i + ": ");
            String marca = scanner.nextLine();
            
            System.out.print("Ingrese el modelo del coche " + i + ": ");
            String modelo = scanner.nextLine();

            Coche coche = new Coche(marca, modelo);
            coche.mostrarInfo();
        }

        // Mostrar cuántos coches se han creado en total
        Coche.mostrarTotalCoches();

        scanner.close();
    }
}
