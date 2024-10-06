
package concesionario;

public class Moto extends Vehiculo {
    private boolean lingaPuesta;
    
    public Moto(String marca, String modelo, String patente, boolean lingaPuesta){
        super(marca, modelo, patente);
        this.lingaPuesta = lingaPuesta;
    }
    
}
