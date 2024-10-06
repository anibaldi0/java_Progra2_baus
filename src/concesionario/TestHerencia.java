/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author nibalink-pc
 */
public class TestHerencia {
    public static void main(String[] args) {
        
        Concesionario concesionario = new Concesionario("Autos Locos");
        
        Vehiculo auto1 = new Auto("Ford", "Ka", "123AAA", true);
        Vehiculo auto2 = new Auto("Peugeot", "504", "345LKJ", false);
        Vehiculo moto1 = new Moto("Zanella", "Pocket", "234BBB", true);
        Vehiculo moto2 = new Moto("Rouser", "NS200", "654LLB", true);
        
        concesionario.agregarVehiculo(auto1);
        concesionario.agregarVehiculo(auto2);
        concesionario.agregarVehiculo(moto2);
        concesionario.agregarVehiculo(moto1);
        
        concesionario.listarVehiculos();
        
    }
}
