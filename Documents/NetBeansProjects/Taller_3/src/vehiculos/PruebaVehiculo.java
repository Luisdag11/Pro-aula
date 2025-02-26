/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author Luis Daniel Garavito
 */
import vehiculos.Moto; // Se importa Moto porque es pública

public class PruebaVehiculo {
    public static void main(String[] args) {
        // Crear una instancia de Moto
        Moto moto1 = new Moto("Deportiva");

        // Acceder a métodos públicos
        moto1.mostrarInfo(); // De Vehiculo
        moto1.mostrarInfoMoto(); // De Moto
    }
}