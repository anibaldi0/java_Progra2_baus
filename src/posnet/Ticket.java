
package posnet;

public class Ticket {
    
    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;
    private int cantCuotas;
    
    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota, int cantCuotas){
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
        this.cantCuotas = cantCuotas;
    }
    
    @Override
    public String toString(){
        return "Ticket: \n" + 
                "Titular: " + nombreApellido + "\n" +
                "Monto Total a Pagar: $ " + String.format("%.2f", montoTotal) + "\n" +
                "Cantidad de cuotas: " + cantCuotas + "\n" +
                "Monto por cuota: $ " + String.format("%.2f", montoPorCuota);
    }
    
}
