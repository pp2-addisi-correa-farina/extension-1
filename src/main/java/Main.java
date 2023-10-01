import org.interfaces.ComandoDispositivo;
import org.interfaces.Dispositivo;

public class Main {
    public static void main(String[] args) {
        ComandoDispositivo comandoDispositivo = new ApagarSamsung();
        Dispositivo dispositivo = new Dispositivo("id1", "Samsung v3", "Aire Cocina") {
            @Override
            public void ejecutar(String comando) {
                comandoDispositivo.ejecutar();
            }
        };
        dispositivo.ejecutar("ENCENDER");
    }
}