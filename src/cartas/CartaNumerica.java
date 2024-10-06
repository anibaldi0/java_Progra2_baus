
package cartas;

public class CartaNumerica extends CartaPalo{
    
    public static final int MIN_VALUE = 2;
    public static final int MAX_VALUE = 10;
    
    private int numero;
    
    public  CartaNumerica(int numero, Palo palo){
        super(palo);
        validarNumero(numero);
        this.numero = numero;
    }
    
    private void validarNumero(int numero){
        if(numero < CartaNumerica.MIN_VALUE || numero > CartaNumerica.MAX_VALUE){
            throw new IllegalArgumentException();
        }
    }
}
