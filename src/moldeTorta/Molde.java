public class Molde {
    private double ancho;
    private double largo;
    private double alto;
    private double radio;
    private boolean esRedondo;

    // Constructor para moldes rectangulares
    public Molde(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        this.esRedondo = false;
    }

    // Constructor para moldes redondos (ingresando diámetro)
    public Molde(double diametro, double alto) {
        this.radio = diametro / 2;
        this.alto = alto;
        this.esRedondo = true;
    }

    // Método para calcular el volumen
    public double calcularVolumen() {
        if (esRedondo) {
            return Math.PI * Math.pow(radio, 2) * alto;
        } else {
            return this.ancho * this.largo * this.alto;
        }
    }

    // Método para calcular el área de la base (rectangular o circular)
    public double calcularAreaBase() {
        if (esRedondo) {
            return Math.PI * Math.pow(radio, 2); // Área de un círculo
        } else {
            return this.ancho * this.largo; // Área de un rectángulo
        }
    }

    public double getAlto() {
        return this.alto;
    }
}
