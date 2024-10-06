/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author nibalink-pc
 */
public class Gato extends Animal{
    private Tamano tamano;
    private boolean estaCastrado;
    
    Gato(String nombre, int edad, Tamano tamano, boolean estaCastrado){
        super(nombre, edad);
        this.tamano = tamano;
        this.estaCastrado = estaCastrado;
    }
    
    //@override
    void hacerSonido(){
        System.out.println("Miau...");
    }
    
    //@override
    void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("de tamano " + tamano + ", Esta castrado?: " + (estaCastrado ? "Si" : "No"));
    }
}
