package com.ecommerce.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table (name = "manhwa")
public class Manhwa {
    @Column (nullable = false)
    private String Name;

    public Manhwa(String name) {
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}

