package org.example.aplication;

import org.example.domain.GestionEnvios;
import org.example.domain.Notificacion;

public interface IGestionEnvioUseCase {

    GestionEnvios registrarEnvio(GestionEnvios envio, String tipoNotificacion);

    double calcularEnvio(double peso, String tipoEnvio);

    Notificacion notificarEnvio(String tipoNotificacion);

    GestionEnvios actualizarEnvio(String nombreEnvio);


}
