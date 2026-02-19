package org.example.infraestructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.domain.GestionEnvios;

@AllArgsConstructor
@Data
@Getter
@Setter
public class EnvioDTO {

    private String nombreEnvio;

    private String tipoEnvio;

    private double peso;

    private String tipoNotificacion;


    public GestionEnvios toDomain(){
        return new GestionEnvios(nombreEnvio, tipoEnvio, peso);
    }

}
