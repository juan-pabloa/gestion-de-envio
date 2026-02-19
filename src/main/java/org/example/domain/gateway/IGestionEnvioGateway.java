package org.example.domain.gateway;

import org.example.domain.GestionEnvios;

public interface IGestionEnvioGateway {


    GestionEnvios registrarEnvio (GestionEnvios envio);

    GestionEnvios actualizarEnvio (String nombreEnvio);
}
