/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Luis Daniel Garavito
 */
import java.util.Scanner;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    // Método para ingresar datos de la moto
    public static Moto crearMotoDesdeConsola() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca de la moto: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese la cilindrada de la moto: ");
        int cilindrada = scanner.nextInt();

        return new Moto("Moto", marca, cilindrada);
    }

    public void mostrarInformacion() {
        System.out.println("Moto de marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}