
package cartas;

public class CartaFigura extends CartaPalo{
    
    public static char[] LETRAS = {'A', 'Q', 'J', 'K'};
    private char letra;
    
    public CartaFigura(char letra, Palo palo){
        super(palo);
        validarLetra(letra);
        this.letra = letra;
        
    }
    
    private void validarLetra(char letra){
        boolean letraValida = false;
        for(char letraPermitida : LETRAS){
            if(letra == letraPermitida){
                letraValida = true;
                break;
            }
        }
        
        if(!letraValida){
            throw new IllegalArgumentException("Letra invalida");
        }
    }
    
}
