/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Luis Daniel Garavito
 */

public class PruebaAcceso {
    
    public static void main(String[] args) {
        
        Moto miMoto = Moto.crearMotoDesdeConsola();
        System.out.println("\nDatos de la moto ingresados:");
        miMoto.mostrarInformacion();
    }
}