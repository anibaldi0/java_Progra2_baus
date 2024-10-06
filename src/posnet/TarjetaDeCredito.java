
package posnet;

public class TarjetaDeCredito {
    
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;
    
    public TarjetaDeCredito(String entidadBancaria, String numeroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera){
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    public void descontarSaldo(double montoFinal) {
        
        if(montoFinal > saldo){
            throw new IllegalArgumentException("Saldo insuficiente"); 
        }
        
        saldo -= montoFinal;
    }

    Persona getTitular() {
        return titular; 
    }

    double getSaldo() {
        
        return saldo; 
    }
    
}
