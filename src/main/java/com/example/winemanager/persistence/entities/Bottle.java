package com.example.winemanager.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="bottles")
public class Bottle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "name", nullable = false)
    private String name;

    @Column(name = "vintage_year", nullable = false )
    private Integer vintageYear;

    @Column (name = "price", nullable = true)
    private double price;

    @Column (name = "alcohol", nullable = false)
    private double alcohol;

    @Column (name = "is_gone", nullable = false, columnDefinition = "BOOLEAN NOT NULL DEFAULT false")
    private boolean isGone;

    @ManyToOne
    @Column (name = "wine_maker", nullable = false)
    private WineMaker wineMaker;

    @ManyToOne
    @Column (name = "region", nullable = false)
    private Region region;

    @ManyToOne
    @Column (name = "cellar_zone", nullable = false)
    private CellarZone cellarZone;



}
