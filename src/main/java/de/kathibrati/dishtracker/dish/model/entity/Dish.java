package de.kathibrati.dishtracker.dish.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "dish")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int servings;


    @OneToMany(mappedBy = "dish", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingredient> ingredients;

    public int getTotalCalories() {
        return ingredients.stream()
                .mapToInt(ingredient -> ingredient.getCaloriesPerUnit() * ingredient.getAmount())
                .sum();
    }
}
