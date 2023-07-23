package com.example.winemanager.persistence.repositories;


import com.example.winemanager.persistence.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
}
