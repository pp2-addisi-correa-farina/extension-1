import org.pp2.Dispositivo;
import org.pp2.DriverClimatizador;

public class SamsungDriverClimatizador implements DriverClimatizador {
    @Override
    public void establecerTemperatura(Dispositivo dispositivo, int temperatura) {
        System.out.printf("Integración SAMSUNG: Estableciendo temperatura del dispositivo llamado \"%s\" modelo \"%s\" a %s grados%n",
                dispositivo.getNombre(), dispositivo.getModelo(), temperatura);
    }
}
