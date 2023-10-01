import org.interfaces.ComandoDispositivo;

public class ApagarSamsung implements ComandoDispositivo {
    @Override
    public void ejecutar() {
        System.out.println("Integración SAMSUNG: Apagando el dispositivo");
    }

    @Override
    public String getNombreComando() {
        return "APAGAR";
    }
}
