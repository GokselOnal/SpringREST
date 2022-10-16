package com.restapi.musicstore.entities;

import javax.persistence.*;

@Entity
@Table(name="winds_table")
public class WindsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pid")
    private Long id;
    @Column(name="tune")
    private String tunning;
    @Column(name="wt")
    private double weight;
    @Column(name="material")
    private String materialKeys;

    public WindsEntity() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTunning() {
        return tunning;
    }

    public void setTunning(String tunning) {
        this.tunning = tunning;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterialKeys() {
        return materialKeys;
    }

    public void setMaterialKeys(String materialKeys) {
        this.materialKeys = materialKeys;
    }

    @Override
    public String toString() {
        return "WindsEntity{" +
                "id=" + id +
                ", tunning='" + tunning + '\'' +
                ", weight=" + weight +
                ", materialKeys='" + materialKeys + '\'' +
                '}';
    }
}
