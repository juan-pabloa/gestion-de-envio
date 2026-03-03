package org.example.infraestructure.drivenadapters;

import org.example.infraestructure.EnvioDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEnviosRepository extends JpaRepository <EnvioDBO,Integer> {

    public List<EnvioDBO> findByNombreEnvio (String nombreEnvio);
}
