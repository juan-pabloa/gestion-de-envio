package org.example.infraestructure;

import jakarta.persistence.*;
import lombok.Data;
import org.example.domain.GestionEnvios;
import org.example.domain.Notificacion;

@Entity
@Table(name="Envios")
@Data
public class EnvioDBO {

    public EnvioDBO() {}

    public EnvioDBO(String nombreEnvio, double valorEnvio, String estadoEnvio, String tipoEnvio, double peso){
    this.nombreEnvio = nombreEnvio;
    this.valorEnvio = valorEnvio;
    this.estadoEnvio = estadoEnvio;
    this.tipoEnvio = tipoEnvio;
    this.peso = peso;
    this.notificacion = new NotificacionDBO(notificacion.getTipoNotificacion(),notificacion.getFechaNotificacion());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_envio;

    private String nombreEnvio;

    private double valorEnvio;

    private String estadoEnvio;

    private String tipoEnvio;

    private double peso;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idNotificacion")
    private NotificacionDBO notificacion;

    public static EnvioDBO fromDomain(GestionEnvios envio){
        return new EnvioDBO(envio.getNombreEnvio(),envio.getValorEnvio(),envio.getEstadoEnvio(), envio.getTipoEnvio(),envio.getPeso());
    }


}
