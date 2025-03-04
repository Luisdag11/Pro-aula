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

//  Interfaz para conducción
interface Conducible {
    void conducir();
}

//  Interfaz para transporte de mercancías
interface Transportador {
    void cargarMercancia(double peso);
}

//  Clase Coche que solo implementa Conducible
class Coche implements Conducible {
    private String modelo;

    public Coche(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void conducir() {
        System.out.println(" Conduciendo el coche " + modelo + "...");
    }
}

//  Clase Camion que implementa Conducible y Transportador
class Camion implements Conducible, Transportador {
    private String modelo;
    private double capacidadMaxima;

    public Camion(String modelo, double capacidadMaxima) {
        this.modelo = modelo;
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public void conducir() {
        System.out.println(" Conduciendo el camión " + modelo + "...");
    }

    @Override
    public void cargarMercancia(double peso) {
        if (peso <= capacidadMaxima) {
            System.out.println(" Cargando " + peso + " kg en el camión " + modelo + "...");
        } else {
            System.out.println(" No se puede cargar, excede la capacidad máxima de " + capacidadMaxima + " kg.");
        }
    }
}

//  Clase de prueba para interactuar con el sistema
public class PruebaVehiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coche coche = new Coche("Toyota Corolla");
        Camion camion = new Camion("Volvo FH", 10000);

        while (true) {
            System.out.println("\nMenú de Gestión de Vehículos:");
            System.out.println("1. Conducir coche");
            System.out.println("2. Conducir camión");
            System.out.println("3. Cargar mercancía en camión");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 4) {
                System.out.println(" Saliendo del sistema...");
                break;
            }

            switch (opcion) {
                case 1:
                    coche.conducir();
                    break;
                case 2:
                    camion.conducir();
                    break;
                case 3:
                    System.out.print("Ingrese el peso de la mercancía a cargar (kg): ");
                    double peso = scanner.nextDouble();
                    camion.cargarMercancia(peso);
                    break;
                default:
                    System.out.println(" Opción inválida. Inténtelo de nuevo.");
            }
        }

        scanner.close();
    }
}

