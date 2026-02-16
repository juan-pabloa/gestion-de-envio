package org.example.infraestructure.drivenadapters;

import org.example.domain.GestionEnvios;
import org.example.domain.gateway.IGestionEnvioGateway;
import org.example.infraestructure.EnvioDBO;


public class EnviosRepository implements IGestionEnvioGateway {

    private IEnviosRepository repository;

    public EnviosRepository (IEnviosRepository repository){
      this.repository= repository;
    }

    @Override
    public String registrarEnvio(GestionEnvios envio) {
        repository.save(EnvioDBO.fromDomain(envio));
        return "Guardado Exitoso";
    }
}
