import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos del molde original
        System.out.println("¿Es el molde original redondo? (s/n): ");
        boolean esRedondoOriginal = scanner.next().equalsIgnoreCase("s");

        Molde moldeOriginal;
        if (esRedondoOriginal) {
            System.out.println("Ingrese el diámetro del molde original (cm): ");
            double diametro = scanner.nextDouble();
            System.out.println("Ingrese la altura del molde original (cm): ");
            double alto = scanner.nextDouble();
            moldeOriginal = new Molde(diametro, alto);
        } else {
            System.out.println("Ingrese el ancho del molde original (cm): ");
            double ancho = scanner.nextDouble();
            System.out.println("Ingrese el largo del molde original (cm): ");
            double largo = scanner.nextDouble();
            System.out.println("Ingrese la altura del molde original (cm): ");
            double alto = scanner.nextDouble();
            moldeOriginal = new Molde(ancho, largo, alto);
        }

        // Ingresar datos del molde nuevo
        System.out.println("¿Es el nuevo molde redondo? (s/n): ");
        boolean esRedondoNuevo = scanner.next().equalsIgnoreCase("s");

        Molde moldeNuevo;
        if (esRedondoNuevo) {
            System.out.println("Ingrese el diámetro del nuevo molde (cm): ");
            double diametro = scanner.nextDouble();
            System.out.println("Ingrese la altura del nuevo molde (cm): ");
            double alto = scanner.nextDouble();
            moldeNuevo = new Molde(diametro, alto);
        } else {
            System.out.println("Ingrese el ancho del nuevo molde (cm): ");
            double ancho = scanner.nextDouble();
            System.out.println("Ingrese el largo del nuevo molde (cm): ");
            double largo = scanner.nextDouble();
            System.out.println("Ingrese la altura del nuevo molde (cm): ");
            double alto = scanner.nextDouble();
            moldeNuevo = new Molde(ancho, largo, alto);
        }

        // Ingresar ingredientes de la receta original
        System.out.println("Ingrese la cantidad de harina de la receta original (kg): ");
        double harina = scanner.nextDouble();
        System.out.println("Ingrese la cantidad de huevos de la receta original: ");
        int huevos = scanner.nextInt();
        System.out.println("Ingrese la cantidad de azúcar de la receta original (kg): ");
        double azucar = scanner.nextDouble();

        Receta recetaOriginal = new Receta(harina, huevos, azucar);

        // Ajustar receta según el nuevo molde
        Receta recetaAjustada = recetaOriginal.ajustarPorMolde(moldeOriginal, moldeNuevo);

        // Mostrar la receta ajustada
        System.out.println("\nReceta ajustada:");
        recetaAjustada.mostrarReceta();

        // Verificar si hay espacio suficiente en el molde para que la masa crezca
        double alturaOcupada = recetaAjustada.calcularAlturaOcupada(moldeNuevo);
        double espacioLibre = moldeNuevo.getAlto() - alturaOcupada;
        if (espacioLibre >= 2) { // Consideramos que la masa necesita 2 cm de leudado
            System.out.println("\nHay espacio suficiente para que la masa crezca. Altura ocupada: " + alturaOcupada + " cm.");
        } else {
            System.out.println("\nAtención: No hay suficiente espacio para que la masa crezca. Altura ocupada: " + alturaOcupada + " cm. Espacio libre: " + espacioLibre + " cm.");
        }
    }
}
