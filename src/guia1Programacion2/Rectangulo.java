/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1Programacion2;

/**
 *
 * @author nibalink-pc
 */
public class Rectangulo {
    private double ancho;
    private double alto;
    
    public Rectangulo (double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double calcularAreaRect (){
        return alto * ancho;
    }
    public double calcularPerimetroRect (){
        return alto * 2 + ancho * 2;
    }
    public boolean esCuadrado (){
        return alto == ancho;
    }
    public double getAlto(){
        return alto;
    }
    public double getAncho(){
        return ancho;
    }
}
