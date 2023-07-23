package com.example.winemanager.persistence.repositories;

import com.example.winemanager.persistence.entities.Doc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepository extends JpaRepository <Doc, Long> {
}
