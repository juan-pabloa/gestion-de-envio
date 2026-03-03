package org.example.aplication;

import org.example.domain.GestionEnvios;
import org.example.domain.Notificacion;

import java.util.List;
import java.util.Optional;

public interface IGestionEnvioUseCase {

    GestionEnvios registrarEnvio(GestionEnvios envio, String tipoNotificacion);

    double calcularEnvio(double peso, String tipoEnvio);

    Notificacion notificarEnvio(String tipoNotificacion);

    List<GestionEnvios> actualizarEnvio(String nombreEnvio, String nombreNuevo);


}
