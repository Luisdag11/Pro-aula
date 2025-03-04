/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mantenimiento;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

//  Interfaz para Reparaciones
interface Reparacion {
    void reparar();
}

// Interfaz para Limpieza
interface Limpieza {
    void limpiar();
}

//  Clase Coche que necesita reparación y limpieza
class Coche implements Reparacion, Limpieza {
    @Override
    public void reparar() {
        System.out.println(" El coche está siendo reparado.");
    }

    @Override
    public void limpiar() {
        System.out.println(" El coche está siendo limpiado.");
    }
}

// Clase Casa que solo necesita limpieza
class Casa implements Limpieza {
    @Override
    public void limpiar() {
        System.out.println(" La casa está siendo limpiada.");
    }
}

//  Clase principal para probar el sistema
public class PruebaMantenimiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Seleccionar tipo de objeto
        System.out.println("Seleccione el objeto a mantener:");
        System.out.println("1. Coche (Reparación y Limpieza)");
        System.out.println("2. Casa (Solo Limpieza)");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            Coche coche = new Coche();
            System.out.println("\nMenú de Mantenimiento:");
            System.out.println("1. Reparar coche");
            System.out.println("2. Limpiar coche");
            System.out.print("Seleccione una opción: ");
            int eleccion = scanner.nextInt();
            if (eleccion == 1) {
                coche.reparar();
            } else if (eleccion == 2) {
                coche.limpiar();
            } else {
                System.out.println(" Opción inválida.");
            }
        } else if (opcion == 2) {
            Casa casa = new Casa();
            casa.limpiar();
        } else {
            System.out.println(" Opción inválida.");
        }

        scanner.close();
    }
}
