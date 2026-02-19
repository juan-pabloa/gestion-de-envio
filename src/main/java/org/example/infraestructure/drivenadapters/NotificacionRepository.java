package org.example.infraestructure.drivenadapters;

import org.example.domain.Notificacion;
import org.example.domain.gateway.IRegistrarNotificacionGateway;
import org.example.infraestructure.NotificacionDBO;

public class NotificacionRepository implements IRegistrarNotificacionGateway {

    private INotificacionRepository repository;

    public NotificacionRepository(INotificacionRepository repository) {
    this.repository = repository;
    }

    @Override
    public void guardarNotificacion(Notificacion notificacion) {
     repository.save(NotificacionDBO.fromDomain(notificacion));
    }
}
