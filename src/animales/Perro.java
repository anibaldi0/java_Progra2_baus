/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;
import animales.Tamano;

public class Perro extends Animal{
    private String raza;
    private Tamano tamano;
    private String color;
        
    Perro(String nombre, int edad, String raza, Tamano tamano, String color){
        super(nombre, edad);
        this.raza = raza;
        this.tamano = tamano;
        this.color = color;
    }
    
    //@override
    void hacerSonido(){
        System.out.println("Guau...");
    }
    
    //@override
    void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("de raza " + raza + ", de tamano " + tamano + " y color " + color);
    }
    
}
