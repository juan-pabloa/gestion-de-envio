package org.example.domain;

public class EnvioTerrestre implements TipoEnvio{

        double peso;

    @Override
    public double calcularEnvio(double peso) {
        if (peso<=0){
            System.out.println("peso invalido");
        }else {
            return peso*2;
        }
        return 0;
    }
}
