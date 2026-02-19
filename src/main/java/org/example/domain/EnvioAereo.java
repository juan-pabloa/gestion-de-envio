package org.example.domain;

import org.example.domain.exception.EnvioException;

public class EnvioAereo implements TipoEnvio{

    double peso;

    @Override
    public String soporta() {
        return "Aereo";
    }

    @Override
    public double calcularEnvio(double peso) {
        if (peso<=0){
            throw new EnvioException("peso invalido");
        }
            return peso*3;

    }
}
