/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compumundo;

public class Dispositivo {
    private String id;
    private double precio;
    private TipoDispositivo tipo;

    public Dispositivo(String id, double precio, TipoDispositivo tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoDispositivo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Precio: $" + precio + ", Tipo: " + tipo;
    }
}


