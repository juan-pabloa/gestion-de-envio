package org.example.domain;

public class EnvioAereo implements TipoEnvio{

    double peso;

    @Override
    public double calcularEnvio(double peso) {
        if (peso<=0){
            System.out.println("peso invalido");
        }else {
            return peso*3;
        }
        return 0;
    }
}
