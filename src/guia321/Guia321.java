/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia321;

/**
 *
 * @author nibalink-pc
 */
public class Guia321 {
    public static void main(String[] args) {
        // Crear un rectángulo con valores de ancho y alto
        Rectangulo rectangulo = new Rectangulo(7, 17);

        // Mostrar el área del rectángulo
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());

        // Mostrar el perímetro del rectángulo
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());

        // Verificar si el rectángulo es un cuadrado
        if (rectangulo.esCuadrado()) {
            System.out.println("El rectangulo es un cuadrado.");
        } else {
            System.out.println("El rectangulo no es un cuadrado.");
        }
    }
}

