package org.example.domain.gateway;

import org.example.domain.GestionEnvios;

import java.util.List;

public interface IGestionEnvioGateway {


    GestionEnvios registrarEnvio (GestionEnvios envio);

    List<GestionEnvios> actualizarEnvio (String nombreEnvio, String nombreNuevo);
}
