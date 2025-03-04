/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseTransporte;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

//  Clase base Transporte
abstract class Transporte {
    protected int velocidad;

    public Transporte(int velocidadInicial) {
        this.velocidad = velocidadInicial;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidad += incremento;
            System.out.println(" Velocidad aumentada. Nueva velocidad: " + velocidad + " km/h");
        } else {
            System.out.println(" Incremento inválido.");
        }
    }

    public abstract void frenar(int decremento); // Método abstracto

    public int getVelocidad() {
        return velocidad;
    }
}

// Clase Bicicleta (Extiende Transporte)
class Bicicleta extends Transporte {
    public Bicicleta(int velocidadInicial) {
        super(velocidadInicial);
    }

    @Override
    public void frenar(int decremento) {
        if (decremento > 0 && velocidad >= decremento) {
            velocidad -= decremento;
            System.out.println(" Bicicleta frenó. Nueva velocidad: " + velocidad + " km/h");
        } else {
            System.out.println(" No se puede frenar más de lo permitido.");
        }
    }
}

//  Clase Coche (Extiende Transporte)
class Coche extends Transporte {
    private int combustible; // En litros

    public Coche(int velocidadInicial, int combustibleInicial) {
        super(velocidadInicial);
        this.combustible = combustibleInicial;
    }

    @Override
    public void frenar(int decremento) {
        if (decremento > 0 && velocidad >= decremento) {
            velocidad -= decremento;
            System.out.println(" Coche frenó. Nueva velocidad: " + velocidad + " km/h");
        } else {
            System.out.println(" No se puede frenar más de lo permitido.");
        }
    }

    public void recargarCombustible(int litros) {
        if (litros > 0) {
            combustible += litros;
            System.out.println(" Combustible recargado. Nivel actual: " + combustible + " litros.");
        } else {
            System.out.println(" Cantidad inválida.");
        }
    }
}

//  Clase principal para probar el sistema
public class PruebaTransporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Seleccionar tipo de transporte
        System.out.println("Seleccione el tipo de transporte:");
        System.out.println("1. Bicicleta");
        System.out.println("2. Coche");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        Transporte transporte = null;

        if (opcion == 1) {
            transporte = new Bicicleta(10);
        } else if (opcion == 2) {
            System.out.print("Ingrese nivel inicial de combustible: ");
            int combustible = scanner.nextInt();
            transporte = new Coche(20, combustible);
        } else {
            System.out.println(" Opción inválida.");
            return;
        }

        //  Menú de operaciones
        int eleccion;
        do {
            System.out.println("\nMenú de Transporte:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frenar");
            if (transporte instanceof Coche) {
                System.out.println("3. Recargar combustible");
            }
            System.out.println("4. Consultar velocidad");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.print("Ingrese incremento de velocidad: ");
                    int incremento = scanner.nextInt();
                    transporte.acelerar(incremento);
                    break;
                case 2:
                    System.out.print("Ingrese decremento de velocidad: ");
                    int decremento = scanner.nextInt();
                    transporte.frenar(decremento);
                    break;
                case 3:
                    if (transporte instanceof Coche) {
                        System.out.print("Ingrese cantidad de combustible: ");
                        int litros = scanner.nextInt();
                        ((Coche) transporte).recargarCombustible(litros);
                    } else {
                        System.out.println(" Opción no válida para una bicicleta.");
                    }
                    break;
                case 4:
                    System.out.println(" Velocidad actual: " + transporte.getVelocidad() + " km/h");
                    break;
                case 5:
                    System.out.println(" Saliendo del sistema.");
                    break;
                default:
                    System.out.println(" Opción inválida.");
            }
        } while (eleccion != 5);

        scanner.close();
    }
}

