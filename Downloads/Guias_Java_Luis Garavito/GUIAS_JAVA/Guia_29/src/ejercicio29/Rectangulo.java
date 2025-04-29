/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

/**
 *
 * @author Luis Garavito
 */
public class Rectangulo {
    
    // Propiedades
    double Base;
    double Altura;

    // Constructor
    public Rectangulo() {
        Base = 100;
        Altura = 50;
    }

    // Métodos set

    // Método setBase
    public void setBase(double b) {
        Base = b;
    }

    // Método setAltura
    public void setAltura(double a) {
        Altura = a;
    }

    // Métodos get

    // Método getBase
    public double getBase() {
        return Base;
    }

    // Método getAltura
    public double getAltura() {
        return Altura;
    }

    // Método getArea
    public double getArea() {
        return Base * Altura;
    }

    // Método getPerimetro
    public double getPerimetro() {
        return 2 * (Base + Altura);
    }

    // Otros métodos

    // Método Cuadrar
    public void Cuadrar() {
        Altura = Base;
    }
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();

        System.out.println("Base inicial: " + r.getBase());
        System.out.println("Altura inicial: " + r.getAltura());
        System.out.println("Área: " + r.getArea());
        System.out.println("Perímetro: " + r.getPerimetro());

        r.setBase(60);
        r.Cuadrar();

        System.out.println("\nDespués de cuadrar:");
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Área: " + r.getArea());
        System.out.println("Perímetro: " + r.getPerimetro());
   }
}
