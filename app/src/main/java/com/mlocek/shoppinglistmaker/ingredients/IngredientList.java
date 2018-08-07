package com.mlocek.shoppinglistmaker.ingredients;

import java.io.Serializable;
import java.util.List;


public class IngredientList implements Serializable {

    private List<Ingredient> ingredients;
    private IngredientGroupsEnum groupsEnum;

    public IngredientList(List<Ingredient> ingredients, IngredientGroupsEnum groupsEnum) {
        this.groupsEnum = groupsEnum;
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public IngredientGroupsEnum getGroupsEnum() {
        return groupsEnum;
    }

    public void setGroupsEnum(IngredientGroupsEnum groupsEnum) {
        this.groupsEnum = groupsEnum;
    }
}
