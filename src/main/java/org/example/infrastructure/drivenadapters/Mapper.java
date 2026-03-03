package org.example.infrastructure.drivenadapters;

import org.example.domain.GestionEnvios;
import org.example.infrastructure.EnvioDBO;

public class Mapper {

    public static GestionEnvios toDomain(EnvioDBO envioDBO){
       return new GestionEnvios(envioDBO.getNombreEnvio(),envioDBO.getValorEnvio(),envioDBO.getEstadoEnvio(), envioDBO.getTipoEnvio(),envioDBO.getPeso());
    }
}
