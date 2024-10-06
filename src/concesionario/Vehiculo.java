/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author nibalink-pc
 */
abstract class Vehiculo {
     String marca;
     String modelo;
     String patente;
    
    public Vehiculo(String marca, String modelo, String patente){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }
    
    public void acelerar(){
        System.out.println("El vehiculo esta acelerando");
    }
    
    public void frenar(){
        System.out.println("El vehiculo esta frenado");
    }
    
    public void arrancar(){
        System.out.println("El vehiculo arranco");
    }
}
