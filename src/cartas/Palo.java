
package cartas;

public enum Palo {
    CORAZON(Color.ROJO),
    DIAMANTE(Color.ROJO),
    TREBOL(Color.NEGRO),
    PIQUE(Color.NEGRO);
        
        private Color color;
        private Palo(Color color){
            this.color = color;
        }
    
}
