package com.example.winemanager.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

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
    private Double price;

    @Column (name = "alcohol", nullable = false)
    private Double alcohol;

    @Column (name = "is_gone", nullable = false, columnDefinition = "BOOLEAN NOT NULL DEFAULT false")
    private boolean isGone;

    @ManyToOne
    @JoinColumn (name = "wine_maker", nullable = false)
    private WineMaker wineMaker;

    @ManyToOne
    @JoinColumn (name = "doc", nullable = false)
    private Doc doc;

    @ManyToOne
    @JoinColumn (name = "region", nullable = false)
    private Region region;

    @ManyToOne
    @JoinColumn (name = "cellar_zone", nullable = false)
    private CellarZone cellarZone;
    @ManyToMany(mappedBy = "bottles")
    private List<Blend> blends;

    public Bottle(long id, String name, Integer vintageYear, Double price, Double alcohol, boolean isGone, WineMaker wineMaker, Doc doc, Region region, CellarZone cellarZone, List<Blend> blends) {
        this.id = id;
        this.name = name;
        this.vintageYear = vintageYear;
        this.price = price;
        this.alcohol = alcohol;
        this.isGone = isGone;
        this.wineMaker = wineMaker;
        this.doc = doc;
        this.region = region;
        this.cellarZone = cellarZone;
        this.blends = blends;
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

    public Integer getVintageYear() {
        return vintageYear;
    }

    public void setVintageYear(Integer vintageYear) {
        this.vintageYear = vintageYear;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Double alcohol) {
        this.alcohol = alcohol;
    }

    public boolean isGone() {
        return isGone;
    }

    public void setGone(boolean gone) {
        isGone = gone;
    }

    public WineMaker getWineMaker() {
        return wineMaker;
    }

    public void setWineMaker(WineMaker wineMaker) {
        this.wineMaker = wineMaker;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public CellarZone getCellarZone() {
        return cellarZone;
    }

    public void setCellarZone(CellarZone cellarZone) {
        this.cellarZone = cellarZone;
    }

    public List<Blend> getBlends() {
        return blends;
    }

    public void setBlends(List<Blend> blends) {
        this.blends = blends;
    }

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }
}
