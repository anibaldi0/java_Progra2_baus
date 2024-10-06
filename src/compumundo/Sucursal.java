
package compumundo;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private List<Dispositivo> dispositivos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.dispositivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void listarDispositivos() {
        for (Dispositivo dispositivo : dispositivos) {
            System.out.println(dispositivo);
        }
    }

    public List<Dispositivo> dispositivosPorTipo(TipoDispositivo tipo) {
        List<Dispositivo> resultado = new ArrayList<>();
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getTipo() == tipo) {
                resultado.add(dispositivo);
            }
        }
        return resultado;
    }

    public void borrarDispositivo(String id) {
        dispositivos.removeIf(dispositivo -> dispositivo.getId().equals(id));
    }

    public double[] porcDispositivosPorTipo() {
        int total = dispositivos.size();
        int[] conteo = new int[3];

        for (Dispositivo dispositivo : dispositivos) {
            switch (dispositivo.getTipo()) {
                case TELEFONO -> conteo[0]++;
                case COMPUTADORA -> conteo[1]++;
                case TABLET -> conteo[2]++;
            }
        }

        return new double[]{
            (conteo[0] * 100.0) / total,
            (conteo[1] * 100.0) / total,
            (conteo[2] * 100.0) / total
        };
    }
}
