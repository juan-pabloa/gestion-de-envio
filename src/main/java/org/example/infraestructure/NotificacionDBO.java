package org.example.infraestructure;

import jakarta.persistence.*;
import lombok.Data;
import org.example.domain.Notificacion;

import java.time.LocalDateTime;

@Entity
@Table(name = "notificacion")
@Data
public class NotificacionDBO {

    public NotificacionDBO() {}

    public NotificacionDBO(String tipoNotificacion, LocalDateTime fechaNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
        this.fechaNotificacion = fechaNotificacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNotificacion;

    private String tipoNotificacion;

    private LocalDateTime fechaNotificacion;

    public static NotificacionDBO fromDomain(Notificacion notificacion) {
        return new NotificacionDBO(notificacion.getTipoNotificacion(),notificacion.getFechaNotificacion());
    }

}
