/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseCoche;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class PruebaCoche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese la marca del coche: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del coche: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese la velocidad máxima del coche: ");
        int velocidadMaxima;
        while (!scanner.hasNextInt()) { // Validación de número entero
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.next(); // Descartar entrada inválida
        }
        velocidadMaxima = scanner.nextInt();

        // Crear un objeto Coche con los datos ingresados
        Coche miCoche = new Coche(marca, modelo, velocidadMaxima);

        // Mostrar la información del coche
        System.out.println("\nInformación del Coche:");
        miCoche.mostrarInformacion();

        // Preguntar si quiere acelerar
        System.out.print("\nIngrese la cantidad de km/h para acelerar: ");
        int incremento;
        while (!scanner.hasNextInt()) { // Validación de número entero
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.next();
        }
        incremento = scanner.nextInt();

        // Acelerar el coche
        miCoche.acelerar(incremento);

        // Mostrar la información actualizada
        System.out.println("\nInformación actualizada del Coche:");
        miCoche.mostrarInformacion();

        scanner.close();
    }
}