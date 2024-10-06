package compumundo;

public class TestCompumundo {
    public static void main(String[] args) {
        // Crear dispositivos
        Dispositivo d1 = new Dispositivo("A1", 500, TipoDispositivo.TELEFONO);
        Dispositivo d2 = new Dispositivo("B2", 1200, TipoDispositivo.COMPUTADORA);
        Dispositivo d3 = new Dispositivo("C3", 700, TipoDispositivo.TABLET);

        // Crear sucursales
        Sucursal sucursal1 = new Sucursal("Sucursal 1");
        Sucursal sucursal2 = new Sucursal("Sucursal 2");

        // Agregar dispositivos a las sucursales
        sucursal1.agregarDispositivo(d1);
        sucursal1.agregarDispositivo(d2);
        sucursal2.agregarDispositivo(d3);

        // Crear empresa y agregar sucursales
        Empresa empresa = new Empresa();
        empresa.agregarSucursal(sucursal1);
        empresa.agregarSucursal(sucursal2);

        // A) Listar dispositivos
        System.out.println("Listado de dispositivos:");
        empresa.listarDispositivos();

        // B) Dispositivos por tipo (COMPUTADORA)
        System.out.println("\nDispositivos tipo COMPUTADORA:");
        for (Dispositivo dispositivo : empresa.dispositivosPorTipo(TipoDispositivo.COMPUTADORA)) {
            System.out.println(dispositivo);
        }

        // C) Borrar dispositivo (A1)
        System.out.println("\nBorrar dispositivo con ID A1:");
        empresa.borrarDispositivo("A1");
        empresa.listarDispositivos();

        // D) Porcentaje de dispositivos por tipo en Sucursal 1
        System.out.println("\nPorcentajes de dispositivos por tipo en Sucursal 1:");
        double[] porcentajes = empresa.porcDispositivosPorTipo("Sucursal 1");
        System.out.println("Teléfonos: " + porcentajes[0] + "%, Computadoras: " + porcentajes[1] + "%, Tablets: " + porcentajes[2] + "%");
    }
}

