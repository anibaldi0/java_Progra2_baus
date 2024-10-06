package compumundo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Sucursal> sucursales;

    public Empresa() {
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    // A) Método para listar dispositivos de todas las sucursales
    public void listarDispositivos() {
        for (Sucursal sucursal : sucursales) {
            System.out.println("Dispositivos en " + sucursal.getNombre() + ":");
            sucursal.listarDispositivos();
        }
    }

    // B) Método para devolver dispositivos por tipo en todas las sucursales
    public List<Dispositivo> dispositivosPorTipo(TipoDispositivo tipo) {
        List<Dispositivo> resultado = new ArrayList<>();
        for (Sucursal sucursal : sucursales) {
            resultado.addAll(sucursal.dispositivosPorTipo(tipo));
        }
        return resultado;
    }

    // C) Método para borrar dispositivo por ID en todas las sucursales
    public void borrarDispositivo(String id) {
        for (Sucursal sucursal : sucursales) {
            sucursal.borrarDispositivo(id);
        }
    }

    // D) Método para devolver el porcentaje de dispositivos por tipo en una sucursal específica
    public double[] porcDispositivosPorTipo(String nombreSucursal) {
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getNombre().equals(nombreSucursal)) {
                return sucursal.porcDispositivosPorTipo();
            }
        }
        return new double[]{0, 0, 0}; // Retornar 0% si no se encuentra la sucursal
    }
}

