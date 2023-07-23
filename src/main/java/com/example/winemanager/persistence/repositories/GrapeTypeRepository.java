package com.example.winemanager.persistence.repositories;


import com.example.winemanager.persistence.entities.GrapeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrapeTypeRepository extends JpaRepository<GrapeType, Long> {
}
