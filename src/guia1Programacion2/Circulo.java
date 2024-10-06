/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1Programacion2;

/**
 *
 * @author nibalink-pc
 */
public class Circulo {
    private double radio;
    
    public Circulo (double radio){
        this.radio = radio;
    }
    
    public double calcularAreaCirculo(){
        return Math.PI * (radio * radio);
    }
    
    public double calcularCircunferencia (){
        return 2 * Math.PI * radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
}

