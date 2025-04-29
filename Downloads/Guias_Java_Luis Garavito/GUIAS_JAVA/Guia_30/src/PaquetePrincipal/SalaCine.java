/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaquetePrincipal;

/**
 *
 * @author Luis Garavito
 */
public class SalaCine {

    int Aforo;
    int Ocupadas;
    String Pelicula;
    double Entrada;

    public SalaCine() {
        Aforo = 100;
        Ocupadas = 0;
        Pelicula = "";
        Entrada = 5.0;
    }

    public void setAforo(int Aforo) {
        this.Aforo = Aforo;
    }

    public void setOcupadas(int Ocupadas) {
        this.Ocupadas = Ocupadas;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public void setEntrada(double Entrada) {
        this.Entrada = Entrada;
    }

    public void setLibres(int lib) {
        int ocu;
        ocu = Aforo - lib;
        Ocupadas = ocu;
    }

    //metodos get
    public int getAforo() {
        return Aforo;
    }

    public int getOcupadas() {
        return Ocupadas;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public double getEntrada() {
        return Entrada;
    }

    public int getLibres() {
        int lib;
        lib = Aforo - Ocupadas;
        return lib;
    }

    public double getPorcentaje() {
        double por;
        por = (double) Ocupadas / (double) Aforo * 100.0;
        return por;
    }

    public double getIngresos() {
        double ingre;
        ingre = Ocupadas * Entrada;
        return ingre;
    }

    //Métodos de orden
    //Método Vaciar
    public void Vaciar() {
        Ocupadas = 0;
        Pelicula = "";
    }

    //Método entraUno
    public void entraUno() {
        Ocupadas++;
    }

}
