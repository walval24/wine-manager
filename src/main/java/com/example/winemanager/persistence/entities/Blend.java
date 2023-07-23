package com.example.winemanager.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "blend")
public class Blend {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    @JoinTable(
            name = "blend_grape_type",
            joinColumns = @JoinColumn(name = "blend_id"),
            inverseJoinColumns = @JoinColumn(name = "grape_type_id")
    )
    private List<GrapeType> grapeTypes;

    @ManyToMany
    @JoinTable(
            name = "bottle_blend",
            joinColumns = @JoinColumn(name = "blend_id"),
            inverseJoinColumns = @JoinColumn(name = "bottle_id")
    )
    private List<Bottle> bottles;

    public Blend(long id, List<GrapeType> grapeTypes, List<Bottle> bottles) {
        this.id = id;
        this.grapeTypes = grapeTypes;
        this.bottles = bottles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<GrapeType> getGrapeTypes() {
        return grapeTypes;
    }

    public void setGrapeTypes(List<GrapeType> grapeTypes) {
        this.grapeTypes = grapeTypes;
    }

    public List<Bottle> getBottles() {
        return bottles;
    }

    public void setBottles(List<Bottle> bottles) {
        this.bottles = bottles;
    }
}
