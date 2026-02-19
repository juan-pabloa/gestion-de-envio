package org.example.infraestructure.drivenadapters;

import org.example.infraestructure.EnvioDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnviosRepository extends JpaRepository <EnvioDBO,Integer> {

    public EnvioDBO findByNombreEnvio (String nombreEnvio);
}
