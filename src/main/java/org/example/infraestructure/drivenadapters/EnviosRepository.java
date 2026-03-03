package org.example.infraestructure.drivenadapters;

import jakarta.transaction.Transactional;
import org.example.domain.GestionEnvios;
import org.example.domain.exception.EnvioException;
import org.example.domain.gateway.IGestionEnvioGateway;
import org.example.infraestructure.EnvioDBO;

import java.util.List;
import java.util.Optional;


public class EnviosRepository implements IGestionEnvioGateway {

    private IEnviosRepository repository;

    public EnviosRepository (IEnviosRepository repository){
      this.repository = repository;
    }

    @Override
    public GestionEnvios registrarEnvio(GestionEnvios envio) {
        return Mapper.toDomain(repository.save(EnvioDBO.fromDomain(envio)));
    }


    public List<GestionEnvios> actualizarEnvio(String nombreEnvio, String nombreNuevo){
        List <EnvioDBO> gestionEnvios = repository.findByNombreEnvio(nombreEnvio);
        if(gestionEnvios.isEmpty()) {
            throw new EnvioException("Nombre de Envio No Encontrado");
        }
        gestionEnvios.stream().forEach(e -> e.setNombreEnvio(nombreNuevo));

        return gestionEnvios.stream().map(Mapper::toDomain).toList();
    }


}
