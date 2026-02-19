package org.example.domain;

import org.example.domain.exception.EnvioException;

public class EnvioTerrestre implements TipoEnvio{

        double peso;

    @Override
    public String soporta() {
        return "Terrestre";
    }

    @Override
    public double calcularEnvio(double peso) {
        if (peso<=0){
            throw new EnvioException("peso invalido");
        }else {
            return peso*2;
        }
    }
}
