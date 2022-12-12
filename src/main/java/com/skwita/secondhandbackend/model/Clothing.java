package com.skwita.secondhandbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clothing {

    public Clothing(Category category,
                    State state,
                    String brand,
                    float price,
                    String color,
                    Season season,
                    String material) {
                        this.category = category;
                        this.state = state;
                        this.brand = brand;
                        this.price = price;
                        this.color = color;
                        this.season = season;
                        this.material = material;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Category category;

    private State state;

    private String brand;

    private float price;

    private String color;

    private Season season;

    private String material;
}