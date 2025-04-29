package ejercicio28;

public class Rectangulo {

    private double base;
    private double altura;

    // Constructor por defecto
    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }

    // Métodos set
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos get
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        // Crear el objeto suelo
        Rectangulo suelo = new Rectangulo();

        // Asignar base y altura
        suelo.setBase(30);
        suelo.setAltura(50);

        // Obtener área y perímetro
        double area = suelo.getArea();
        double peri = suelo.getPerimetro();

        // Mostrar resultados
        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + peri);
    }
}

    

