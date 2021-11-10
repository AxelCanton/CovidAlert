package fr.polytech.CovidAlert.repositories;

import fr.polytech.CovidAlert.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User,Long> { }