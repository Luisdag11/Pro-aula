/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseCoche;

/**
 *
 * @author Luis Daniel Garavito
 */
public class Coche {
    // Propiedades privadas
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    // Constructor
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVelocidadMaxima(velocidadMaxima);
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Error: La marca no puede estar vacía.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Error: El modelo no puede estar vacío.");
        }
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("Error: La velocidad máxima debe ser mayor a 0.");
        }
    }

    // Método para acelerar el coche
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("El coche ha acelerado. Nueva velocidad máxima: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("Error: El incremento de velocidad debe ser positivo.");
        }
    }

    // Método para mostrar la información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}