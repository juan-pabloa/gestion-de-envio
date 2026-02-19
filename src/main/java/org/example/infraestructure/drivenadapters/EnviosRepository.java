package org.example.infraestructure.drivenadapters;

import org.example.domain.GestionEnvios;
import org.example.domain.gateway.IGestionEnvioGateway;
import org.example.infraestructure.EnvioDBO;


public class EnviosRepository implements IGestionEnvioGateway {

    private IEnviosRepository repository;

    public EnviosRepository (IEnviosRepository repository){
      this.repository = repository;
    }

    @Override
    public GestionEnvios registrarEnvio(GestionEnvios envio) {
        return Mapper.toDomain(repository.save(EnvioDBO.fromDomain(envio)));
    }

    public GestionEnvios actualizarEnvio(String nombreEnvio){
        GestionEnvios gestionEnvios = Mapper.toDomain(repository.findByNombreEnvio(nombreEnvio));
        gestionEnvios.setNombreEnvio(nombreEnvio);
        return gestionEnvios;
    }


}
