package com.restapi.musicstore.entities;

import javax.persistence.*;

@Entity
@Table(name="strings_table")
public class StringsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pid")
    private Long id;
    @Column(name="color")
    private String color;
    @Column(name="is_acoustic")
    private boolean acoustic;
    @Column(name = "num_string")
    private int stringNumbers;

    public StringsEntity() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAcoustic() {
        return acoustic;
    }

    public void setAcoustic(boolean acoustic) {
        this.acoustic = acoustic;
    }

    public int getStringNumbers() {
        return stringNumbers;
    }

    public void setStringNumbers(int stringNumbers) {
        this.stringNumbers = stringNumbers;
    }

    @Override
    public String toString() {
        return "StringsEntity{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", acoustic=" + acoustic +
                ", stringNumbers=" + stringNumbers +
                '}';
    }
}

