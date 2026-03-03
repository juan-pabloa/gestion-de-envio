package org.example.infrastructure.drivenadapters;

import org.example.infrastructure.NotificacionDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotificacionRepository extends JpaRepository<NotificacionDBO, Integer> {
}
