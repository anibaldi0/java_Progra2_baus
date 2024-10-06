
package posnet;

public class TestPrincipal {

    public static void main(String[] args) {
        
        Persona titular = new Persona("Pepe", "Lozano", "123456", "011-1234-6789", "pepelozano@jimail.com");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("Banco Franchute", "1234-5678-9012", 10700.0, titular, EntidadFinanciera.CASTERMARD);
        Posnet posnet = new Posnet();
        
        double montoAPagar = 10000.0;
        int cantCuotas = 3;
        
        try {
            Ticket ticket = posnet.generarPago(tarjeta, montoAPagar, cantCuotas);
            
            if (ticket != null) {
                System.out.println(ticket);
            } else {
                System.out.println("No se realizo el pago");
            }
            
        } catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            
        }
         
    }
    
}
