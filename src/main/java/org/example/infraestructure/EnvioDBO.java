package org.example.infraestructure;

import jakarta.persistence.*;
import lombok.Data;
import org.example.domain.GestionEnvios;

@Entity
@Table(name="Envios")
@Data
public class EnvioDBO {

    public EnvioDBO(){}

    public EnvioDBO (String nombreEnvio){
        this.nombreEnvio = nombreEnvio;
    }

    public EnvioDBO(String nombreEnvio, double valorEnvio, String estadoEnvio, String tipoEnvio){
    this.nombreEnvio = nombreEnvio;
    this.valorEnvio = valorEnvio;
    this.estadoEnvio = estadoEnvio;
    this.tipoEnvio = tipoEnvio;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_envio;

    private String nombreEnvio;

    private double valorEnvio;

    private String estadoEnvio;

    private String tipoEnvio;

    private double peso;

    public static EnvioDBO fromDomain(GestionEnvios envio){
        return new EnvioDBO(envio.getNombreEnvio(),envio.getValorEnvio(),envio.getEstadoEnvio(), envio.getTipoEnvio());
    }

    public GestionEnvios toDomain() {
        return new GestionEnvios(nombreEnvio, valorEnvio, estadoEnvio, tipoEnvio, peso);
    }

}
