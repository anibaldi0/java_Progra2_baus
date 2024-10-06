/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

import java.util.ArrayList;
import java.util.List;
import animales.Tamano;

public class TestAnimal {
    public static void main(String[] args) {
        
        List<Animal> listaAnimales = new ArrayList<>();
        
        listaAnimales.add(new Perro("Lucas", 3, "Ladrador ", Tamano.GRANDE, "Negro"));
        listaAnimales.add(new Perro("Pipin", 1, "Salchicha", Tamano.MEDIANO, "Blanco"));
        listaAnimales.add(new Gato("Samuel", 5, Tamano.GRANDE, true));
        listaAnimales.add(new Gato("Liliana", 5, Tamano.MEDIANO, true));
        
        for(Animal animal : listaAnimales){
            animal.mostrarInfo();
            animal.hacerSonido();
            System.out.println();
        }
    }
}
