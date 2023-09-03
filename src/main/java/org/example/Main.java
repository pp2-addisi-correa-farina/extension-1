package org.example;

import org.pp2.Dispositivo;
import org.pp2.IntegracionClimatizador;

public class Main {
    public static void main(String[] args) {

        IntegracionClimatizador integracionClimatizador = new SamsungIntegracionClimatizador();
        integracionClimatizador.establecerTemperatura(new Dispositivo("id1", "Aire Cocina", "Samsung v3"), 21);
    }
}