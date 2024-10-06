
package cartas;

import java.util.ArrayList;

public class Mazo {
    
    private ArrayList<Carta> cartas;
    
    public Mazo(){
        cartas = new ArrayList<>();
        generarCartas();
        
        System.out.println();
        
    }
    
    private void generarCartas(){
        generarComodines();
        generarCartasNumericas();
        generarCartasFigura();
    }
    
    private void generarComodines(){
        
        cartas.add(new Comodin(true));  // Comodín coloreado
        cartas.add(new Comodin(false)); // Comodín sin color
        
    }
    
    private void generarCartasNumericas(){

        for (Palo palo : Palo.values()) {
            for (int numero = CartaNumerica.MIN_VALUE; numero <= CartaNumerica.MAX_VALUE; numero++) {
                cartas.add(new CartaNumerica(numero, palo));
            }
        }
        
    }
    
    private void generarCartasFigura(){
        
        char[] figuras = {'A', 'J', 'Q', 'K'};
        
        for(Palo palo : Palo.values()){
            for(char figura : figuras){
                cartas.add(new CartaFigura(figura, palo));
            }
        }
        
    }
    
    public void mostrarCartas(){
        
        for(Carta carta : cartas){
            System.out.println(carta);
        }
        
    }
    
}
