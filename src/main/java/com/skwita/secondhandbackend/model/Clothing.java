package com.skwita.secondhandbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Category is mandatory")
    private Category category;
    
    @NotBlank(message = "State is mandatory")
    private State state;

    @NotBlank(message = "Brand is mandatory")
    private String brand;

    private float price;

    @NotBlank(message = "Color is mandatory")
    private String color;

    @NotBlank(message = "Season is mandatory")
    private Season season;

    @NotBlank(message = "Material is mandatory")
    private String material;
}