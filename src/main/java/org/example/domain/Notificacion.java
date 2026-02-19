package org.example.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Notificacion {

    String tipoNotificacion;
    LocalDateTime fechaNotificacion;
}
