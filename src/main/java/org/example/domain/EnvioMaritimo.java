package org.example.domain;

public class EnvioMaritimo implements TipoEnvio{

    double peso;


    @Override
    public double calcularEnvio(double peso) {
        if (peso<=0){
            System.out.println("peso invalido");
        }else {
           return peso*1.5;
        }
        return 0;
    }
}
