/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author Luis Daniel Garavito
 */

public class Vehiculo { // Ahora es pública
    protected String tipo; // Ahora es protected para que Moto pueda acceder

    public Vehiculo(String tipo) { // Constructor público
        this.tipo = tipo;
    }

    public void mostrarInfo() { // Método público
        System.out.println("Tipo de vehículo: " + tipo);
    }
}
