
package posnet;

public class Posnet {
    
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_DE_CUOTAS = 1;
    public static final int MAX_DE_CUOTAS = 6;
    
    public Ticket generarPago(TarjetaDeCredito tarjeta, double montoAPagar, int cantCuotas){
        
        if(cantCuotas < Posnet.MIN_DE_CUOTAS || cantCuotas > Posnet.MAX_DE_CUOTAS){
            throw new IllegalArgumentException("Numero de cuotas incorrecto");
        }
        
        double recargo = (cantCuotas > 1) ? RECARGO_POR_CUOTA * (cantCuotas - 1) : 0;
        double montoFinal = montoAPagar = montoAPagar + (montoAPagar * recargo);
        
        if(tarjeta.getSaldo() < montoFinal){
            System.out.println("Saldo insuficiente");
            return null;
        }
        
        double montoPorCuota = montoFinal / cantCuotas;
        
        tarjeta.descontarSaldo(montoFinal);
        
        return new Ticket(tarjeta.getTitular().getNombreCompleto(), montoFinal, montoPorCuota, cantCuotas);
        
    }
    
}
