package de.kathibrati.dishtracker.dish.model.resource;

import jakarta.annotation.Resource;
import lombok.Getter;
import lombok.Setter;

@Resource
@Getter
@Setter
public class DishResource {
    private Long id;
    private String name;
    private int servings;
    private int totalCalories;

    public DishResource (Long id, String name, int servings, int totalCalories) {
        this.id = id;
        this.name = name;
        this.servings = servings;
        this.totalCalories = totalCalories;

    }

}
