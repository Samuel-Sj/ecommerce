package com.ecommerce.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table (name = "manhwa")
public class Manhwa {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column (nullable = false)
    private String Name;



    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}

