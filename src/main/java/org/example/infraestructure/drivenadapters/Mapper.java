package org.example.infraestructure.drivenadapters;

import org.example.domain.GestionEnvios;
import org.example.infraestructure.EnvioDBO;

public class Mapper {

    public static GestionEnvios toDomain(EnvioDBO envioDBO){
       return new GestionEnvios(envioDBO.getNombreEnvio(),envioDBO.getValorEnvio(),envioDBO.getEstadoEnvio(), envioDBO.getTipoEnvio(),envioDBO.getPeso());
    }
}
