package com.mlocek.shoppinglistmaker.recipes;

import com.mlocek.shoppinglistmaker.ingredients.Ingredient;
import com.mlocek.shoppinglistmaker.ingredients.IngredientGroupsEnum;
import com.mlocek.shoppinglistmaker.ingredients.IngredientList;
import com.mlocek.shoppinglistmaker.ingredients.IngredientsEnum;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeSetList {

    private String name;
    private Date creationDate;
    private List<RecipeSet> recipesList;
    private List<Ingredient> ingredients;
    private int days;
    private int people;
    private List<IngredientList> sortedIngredients;


    public RecipeSetList(Date creationDate, List<RecipeSet> recipesList, int days, int people, String name) {
        this.creationDate = creationDate;
        this.recipesList = recipesList;
        this.days = days;
        this.people = people;
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.sortedIngredients = new ArrayList<>();
        createIngredientList();
        sortIngredients();
            }

    public void sortIngredients() {
        ArrayList<IngredientList> sorted = new ArrayList<>();
        for (IngredientGroupsEnum en: IngredientGroupsEnum.values()) {
            List<Ingredient> temp = new ArrayList<>();
            for (Ingredient ingredient: ingredients) {
                if (ingredient.getGroup() == en.getText()) {
                    temp.add(ingredient);
                }
            }
            if (!temp.isEmpty()) {
                sorted.add(new IngredientList(temp, en));
            }
        }

        this.sortedIngredients = sorted;
    }


    private void createIngredientList() {
        HashMap<IngredientsEnum, Integer> ingredientsMap = getIngredientsAndWeight(recipesList, days * people);

        for (Map.Entry<IngredientsEnum, Integer> entry: ingredientsMap.entrySet()) {
            Ingredient ingredient = new Ingredient(entry.getKey().getText(), entry.getValue(), entry.getKey().getGroup());
            ingredients.add(ingredient);
        }
    }

    private HashMap<IngredientsEnum, Integer> getIngredientsAndWeight(List<RecipeSet> recipeSets, int multiplier) {
        HashMap<IngredientsEnum, Integer> sum = new HashMap<>();
        for (RecipeSet recipeSet: recipeSets) {
            HashMap<IngredientsEnum, Integer> recipeMap = recipeSet.calculateSumOfIngredients(multiplier);
            for (Map.Entry<IngredientsEnum, Integer> entry: recipeMap.entrySet()) {
                if (sum.containsKey(entry.getKey())) {
                    Integer newValue = sum.get(entry.getKey()) + entry.getValue();
                    sum.put(entry.getKey(), newValue);
                } else {
                    sum.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return sum;
    }


    public int getItemsChecked() {
        int i = 0;
        for (Ingredient ingredient: ingredients) {
            if (ingredient.isChecked()) {
                i++;
            }
        }
        return i;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public List<RecipeSet> getRecipesList() {
        return recipesList;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public List<IngredientList> getSortedIngredients() {
        return sortedIngredients;
    }

    public void setSortedIngredients(List<IngredientList> sortedIngredients) {
        this.sortedIngredients = sortedIngredients;
    }
}

