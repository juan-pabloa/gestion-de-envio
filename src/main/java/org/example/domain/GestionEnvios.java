package org.example.domain;

import lombok.Data;

@Data
public class GestionEnvios {

    public GestionEnvios() {
    }

    public GestionEnvios(String nombreEnvio, double valorEnvio, String estadoEnvio, String tipoEnvio, double peso){
        this.nombreEnvio = nombreEnvio;
        this.valorEnvio = valorEnvio;
        this.estadoEnvio = estadoEnvio;
        this.tipoEnvio = tipoEnvio;
        this.peso = peso;
    }

    public GestionEnvios(String nombreEnvio, String tipoEnvio, double peso){
        this.nombreEnvio = nombreEnvio;
        this.tipoEnvio = tipoEnvio;
        this.peso = peso;
    }

    String nombreEnvio;
    double valorEnvio;
    String estadoEnvio;
    String tipoEnvio;
    double peso;
    Notificacion notificacion;
}
