import org.pp2.Dispositivo;
import org.pp2.DriverClimatizador;

public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo("id1", "Aire Cocina", "Samsung v3");
        if (!new SamsungDriverClimatizadorFactory().isCompatible(dispositivo)) throw new RuntimeException("Dispositivo No Compatible");
        DriverClimatizador driverClimatizador = new SamsungDriverClimatizadorFactory().create();
        driverClimatizador.establecerTemperatura(dispositivo, 21);
    }
}