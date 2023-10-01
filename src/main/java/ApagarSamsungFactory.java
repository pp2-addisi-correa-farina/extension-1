import org.interfaces.ComandoDispositivo;
import org.interfaces.ComandoDispositivoFactory;
import org.interfaces.Dispositivo;

public class ApagarSamsungFactory implements ComandoDispositivoFactory {
    @Override
    public boolean isCompatible(Dispositivo dispositivo) {
        return dispositivo.getModelo().contains("Samsung");
    }

    @Override
    public ComandoDispositivo create() {
        return new ApagarSamsung();
    }
}
