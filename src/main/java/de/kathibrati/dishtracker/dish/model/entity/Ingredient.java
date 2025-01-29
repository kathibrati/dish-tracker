package de.kathibrati.dishtracker.dish.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int amount;
    private String unit;
    private int caloriesPerUnit;


    @ManyToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;

}