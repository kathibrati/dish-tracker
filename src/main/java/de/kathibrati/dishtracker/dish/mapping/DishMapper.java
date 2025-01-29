package de.kathibrati.dishtracker.dish.mapping;

import de.kathibrati.dishtracker.dish.model.entity.Dish;
import de.kathibrati.dishtracker.dish.model.resource.DishResource;

import java.util.List;

public class DishMapper {

    public static DishResource toDishResource(Dish dish) {
        int totalCalories = dish.getIngredients().stream()
                .mapToInt(ingredient -> ingredient.getCaloriesPerUnit() * ingredient.getAmount())
                .sum();

        return new DishResource(
                dish.getId(),
                dish.getName(),
                dish.getServings(),
                totalCalories
        );
    }

    public static List<DishResource> toResourceList(List<Dish> dishes) {
        return dishes.stream().map(DishMapper::toDishResource).toList();
    }
}
