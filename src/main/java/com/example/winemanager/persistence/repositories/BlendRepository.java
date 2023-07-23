package com.example.winemanager.persistence.repositories;

import com.example.winemanager.persistence.entities.Blend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlendRepository extends JpaRepository <Blend, Long> {
}
