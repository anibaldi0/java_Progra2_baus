/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

abstract class Animal {
    private String nombre;
    private int edad;
    
    Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    abstract void hacerSonido();
    
    void mostrarInfo(){
        String tipoAnimal = this.getClass().getSimpleName();
        System.out.println("El nombre del " + tipoAnimal + " es " + 
                nombre + " y su edad es " + edad + " anos");
    }
}
