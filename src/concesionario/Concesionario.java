
package concesionario;

import java.util.ArrayList;

public class Concesionario {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;
    
    public Concesionario (String nombre){
        this.nombre = nombre;
        vehiculos = new ArrayList<Vehiculo>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public void listarVehiculos(){
        if(vehiculos.isEmpty()){
            System.out.println("No hay autos en la concesionaria");
        }else{
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println("Marca: " + vehiculo.marca + ", Modelo: " + 
                vehiculo.modelo + ", Patente: " + vehiculo.patente);
            }
        }
        
    }
}
