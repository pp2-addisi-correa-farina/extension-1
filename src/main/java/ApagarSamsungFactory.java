import org.pp2.ComandoDispositivo;
import org.pp2.ComandoDispositivoFactory;
import org.pp2.Dispositivo;

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
