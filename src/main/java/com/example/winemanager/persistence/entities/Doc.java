package com.example.winemanager.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "docs")
public class Doc {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column ( name = "name")
    private String name;

    @OneToMany (mappedBy = "doc")
    private List<Bottle> bottles;

    public Doc(long id, String name, List<Bottle> bottles) {
        this.id = id;
        this.name = name;
        this.bottles = bottles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bottle> getBottles() {
        return bottles;
    }

    public void setBottles(List<Bottle> bottles) {
        this.bottles = bottles;
    }
}
