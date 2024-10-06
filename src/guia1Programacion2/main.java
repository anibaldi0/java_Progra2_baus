
package guia1Programacion2;

public class main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo (10, 10);
        Circulo circulo = new Circulo (10);
        
        System.out.printf("El Area del rectangulo es: %.2f\n", rectangulo.calcularAreaRect());
        
        System.out.printf("El perimetro del rectangulo es: %.2f\n", rectangulo.calcularPerimetroRect());
        
        if (rectangulo.esCuadrado()){
            System.out.println("Es un cuadrado");
        } else {
            System.out.println("No es un cuadrado");
        }
        
        System.out.printf("El area del circulo es: %.2f\n", circulo.calcularAreaCirculo());
        
        System.out.printf("La circunferencia del circulo es: %.2f\n", circulo.calcularCircunferencia());
        
    }
}
