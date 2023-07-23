package com.example.winemanager.persistence.repositories;


import com.example.winemanager.persistence.entities.WineMaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WineMakerRepository extends JpaRepository<WineMaker, Long> {
}
