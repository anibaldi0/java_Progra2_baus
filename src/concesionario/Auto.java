
package concesionario;

public class Auto extends Vehiculo{
    private boolean tieneGPS;
    
    public Auto(String marca, String modelo, String patente, boolean tieneGPS){
        super(marca, modelo, patente);
        this.tieneGPS = tieneGPS;
    }
  
    
    public void cargarRuta(){
        System.out.println("Cargando ruta en el GPS...");
    }
    
    public void agregarGPS(){
        
    }
}
