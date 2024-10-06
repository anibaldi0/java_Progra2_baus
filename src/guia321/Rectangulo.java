
package guia321;

public class Rectangulo {
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para calcular el área
    public double calcularArea() {
        return ancho * alto;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    // Método para verificar si es un cuadrado
    public boolean esCuadrado() {
        return ancho == alto;
    }

    // Getters
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
}

