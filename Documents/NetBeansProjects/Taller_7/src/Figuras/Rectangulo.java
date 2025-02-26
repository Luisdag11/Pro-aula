/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor para inicializar base y altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea()
    @Override
    public double calcularArea() {
        return base * altura;
    }
}