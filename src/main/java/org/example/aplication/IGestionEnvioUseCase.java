package org.example.aplication;

import org.example.domain.GestionEnvios;

public interface IGestionEnvioUseCase {

    String registrarEnvio(GestionEnvios envio);

    double calcularEnvio(double peso, String tipoEnvio);

    void notificarEnvio();


}
