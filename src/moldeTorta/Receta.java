public class Receta {
    private double harina;
    private int huevos;
    private double azucar;

    // Se estima que la densidad de la mezcla en función de los ingredientes es 1g/cm³
    private final double densidadMasa = 1.0; 

    public Receta(double harina, int huevos, double azucar) {
        this.harina = harina;
        this.huevos = huevos;
        this.azucar = azucar;
    }

    // Método para ajustar cantidades según la proporción de volúmenes
    public Receta ajustarPorMolde(Molde moldeOriginal, Molde moldeNuevo) {
        double volumenOriginal = moldeOriginal.calcularVolumen();
        double volumenNuevo = moldeNuevo.calcularVolumen();
        double proporcion = volumenNuevo / volumenOriginal;

        return new Receta(
            this.harina * proporcion,
            (int) Math.round(this.huevos * proporcion),
            this.azucar * proporcion
        );
    }

    // Método para calcular el volumen total de la masa en cm³ (asumiendo 1g = 1cm³ de masa)
    public double calcularVolumenMasa() {
        double pesoTotalGramos = (this.harina * 1000) + (this.huevos * 50) + (this.azucar * 1000);
        return pesoTotalGramos / densidadMasa;  // Se asume que 1g de masa ocupa 1cm³
    }

    // Método para calcular la altura que ocuparía la masa en un molde dado
    public double calcularAlturaOcupada(Molde molde) {
        double volumenMasa = calcularVolumenMasa();
        double areaBase = molde.calcularAreaBase();
        return volumenMasa / areaBase; // Altura = volumen / área de la base
    }

    public void mostrarReceta() {
        System.out.println("Harina: " + harina + " kg");
        System.out.println("Huevos: " + huevos);
        System.out.println("Azúcar: " + azucar + " kg");
    }
}
