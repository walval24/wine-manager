package com.example.winemanager.persistence.repositories;

import com.example.winemanager.persistence.entities.CellarZone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CellarZoneRepository extends JpaRepository <CellarZone, Long> {
}
