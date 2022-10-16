package com.restapi.musicstore.entities;

import javax.persistence.*;

@Entity
@Table(name="keys_table")
public class KeysEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pid")
    private Long id;
    @Column(name = "num_key")
    private int keyNumber;

    public KeysEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(int keyNumber) {
        this.keyNumber = keyNumber;
    }

    @Override
    public String toString() {
        return "KeysEntity{" +
                "id=" + id +
                ", keyNumber=" + keyNumber +
                '}';
    }
}
