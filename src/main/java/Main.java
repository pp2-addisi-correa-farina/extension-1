import org.pp2.Dispositivo;
import org.pp2.DriverClimatizador;
import org.pp2.comando.Interprete;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        // FIXME: Esto está mal
        DriverClimatizador driverClimatizador = new SamsungDriverClimatizador();
        Map<String, BiConsumer<DriverClimatizador, Dispositivo>> nombreComandoEjecutorMap = new HashMap<>();
        nombreComandoEjecutorMap.put("ENCENDER", DriverClimatizador::encender);
        nombreComandoEjecutorMap.put("ENFRIAR", DriverClimatizador::enfriar);

        Dispositivo dispositivo = new Dispositivo("id1", "Aire Cocina", "Samsung v3", new Interprete(driverClimatizador, nombreComandoEjecutorMap));
        dispositivo.ejecutar("ENCENDER");
    }
}