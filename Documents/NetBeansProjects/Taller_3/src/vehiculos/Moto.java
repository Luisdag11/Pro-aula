/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Moto extends Vehiculo { // Hereda de Vehiculo
    public Moto(String tipo) {
        super(tipo); // Llama al constructor de Vehiculo
    }

    public void mostrarInfoMoto() { // Método específico de Moto
        System.out.println("Esta es una moto de tipo: " + tipo);
    }
}