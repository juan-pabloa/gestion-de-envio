package org.example.application;

import org.example.domain.Constantes;

public class ObtenerConstanteUseCase implements IObtenerConstanteUseCase {

    @Override
    public String obtenerConstante(String nombre) {
        switch (nombre.toUpperCase()) {
            case "AEREO":
                return Constantes.AEREO;
            case "MARITIMO":
                return Constantes.MARITIMO;
            case "TERRESTRE":
                return Constantes.TERRESTRE;
            case "REMOTO":
                return Constantes.REMOTO;
            default:
                return null;
        }
    }

}
