import org.pp2.Dispositivo;
import org.pp2.DriverClimatizador;
import org.pp2.DriverClimatizadorFactory;

public class SamsungDriverClimatizadorFactory implements DriverClimatizadorFactory {
    @Override
    public boolean isCompatible(Dispositivo dispositivo) {
        return dispositivo.getModelo().contains("Samsung");
    }

    @Override
    public DriverClimatizador create() {
        return new SamsungDriverClimatizador();
    }
}
