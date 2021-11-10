package fr.polytech.CovidAlert.repositories;

import fr.polytech.CovidAlert.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository
        extends JpaRepository<Location,Long> {}