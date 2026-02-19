package org.example.infraestructure.drivenadapters;

import org.example.infraestructure.NotificacionDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotificacionRepository extends JpaRepository<NotificacionDBO, Integer> {
}
