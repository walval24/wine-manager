package com.example.winemanager.persistence.repositories;

import com.example.winemanager.persistence.entities.Bottle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BottleRepository extends JpaRepository<Bottle, Long> {
}
