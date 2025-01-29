package de.kathibrati.dishtracker.dish.model.resource;


import jakarta.annotation.Resource;

@Resource
public class IngredientResource {

    private Long id;
    private String name;
    private int amount;
    private String unit;
    private int caloriesPerUnit;

    public IngredientResource(Long id, String name, int amount, String unit, int caloriesPerUnit) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.caloriesPerUnit = caloriesPerUnit;
    }

}
