package com.mlocek.shoppinglistmaker.ingredients;


import java.util.Objects;

public class Ingredient {

    private String ingredientName;
    private int ingredientWeight;
    private boolean checked;
    private String group;

    public Ingredient(String ingredientName, int ingredientWeight, String group) {
        this.ingredientName = ingredientName;
        this.ingredientWeight = ingredientWeight;
        this.checked = false;
        this.group = group;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public int getIngredientWeight() {
        return ingredientWeight;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(ingredientName, that.ingredientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientName);
    }
}
