/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PruebaVehiculo;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

// Clase base Vehiculo
class Vehiculo {
    protected String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clase derivada Coche
class Coche extends Vehiculo {
    private String marca;

    public Coche(String tipo, String marca) {
        super(tipo);
        this.marca = marca;
    }

    @Override
    public void mover() {
        System.out.println("El coche de marca " + marca + " está circulando por la carretera.");
    }
}

// Clase derivada Bicicleta
class Bicicleta extends Vehiculo {
    private int numeroMarchas;

    public Bicicleta(String tipo, int numeroMarchas) {
        super(tipo);
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta con " + numeroMarchas + " marchas está siendo pedaleada.");
    }
}

// Clase de prueba
public class PruebaVehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de vehículo (coche/bicicleta): ");
        String tipo = scanner.nextLine();

        Vehiculo miVehiculo;

        if (tipo.equalsIgnoreCase("coche")) {
            System.out.println("Ingrese la marca del coche: ");
            String marca = scanner.nextLine();
            miVehiculo = new Coche(tipo, marca);
        } else if (tipo.equalsIgnoreCase("bicicleta")) {
            System.out.println("Ingrese el número de marchas de la bicicleta: ");
            int marchas = scanner.nextInt();
            miVehiculo = new Bicicleta(tipo, marchas);
        } else {
            System.out.println("Tipo de vehículo no válido. Se creará un vehículo genérico.");
            miVehiculo = new Vehiculo("Desconocido");
        }

        // Llamada al método polimórfico
        miVehiculo.mover();
        scanner.close();
    }
}
