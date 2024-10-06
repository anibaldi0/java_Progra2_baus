
package cartas;

public class Carta {
    
    private boolean visible; //un booleano se inicializa en false x defecto
    
    public void voltear(){
        visible = !visible;
    }
    
    public void mostrar(){
        if(visible){
            System.out.println("Valor de la carta");
        }else{
            System.out.println("**##**##**");
        }
    }
    
}
