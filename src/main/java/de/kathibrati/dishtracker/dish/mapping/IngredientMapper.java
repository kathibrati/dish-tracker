package de.kathibrati.dishtracker.dish.mapping;

import de.kathibrati.dishtracker.dish.model.entity.Ingredient;
import de.kathibrati.dishtracker.dish.model.resource.IngredientResource;

public class IngredientMapper {
    public static IngredientResource toIngredientResource(Ingredient ingredient) {
        return new IngredientResource(
                ingredient.getId(),
                ingredient.getName(),
                ingredient.getAmount(),
                ingredient.getUnit(),
                ingredient.getCaloriesPerUnit()
        );
    }
}
