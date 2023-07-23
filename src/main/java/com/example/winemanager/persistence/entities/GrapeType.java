package com.example.winemanager.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table ( name = "grape_types")
public class GrapeType {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private long id;

    @Column ( name = "name", nullable = false)
    private String name;

}
