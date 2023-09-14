import org.pp2.Dispositivo;
import org.pp2.DriverClimatizador;

public class SamsungDriverClimatizador implements DriverClimatizador {
    @Override
    public void enfriar(Dispositivo dispositivo) {
        System.out.printf("Integración SAMSUNG: Configurando dispositivo llamado \"%s\" modelo \"%s\" en modo enfriar.",
                dispositivo.getNombre(), dispositivo.getModelo());
    }

    @Override
    public void encender(Dispositivo dispositivo) {
        System.out.printf("Integración SAMSUNG: Encendiendo dispositivo llamado \"%s\" modelo \"%s\" ",
                dispositivo.getNombre(), dispositivo.getModelo());
    }
}
