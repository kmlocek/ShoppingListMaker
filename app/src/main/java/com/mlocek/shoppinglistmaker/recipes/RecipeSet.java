package com.mlocek.shoppinglistmaker.recipes;


import com.mlocek.shoppinglistmaker.ingredients.IngredientsEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeSet {

    private String recipeName;
    private String firstDishName;
    private String secondDishName;
    private String thirdDishName;
    private String fourthDishName;
    private String fifthDishName;


    private HashMap<IngredientsEnum, Integer> firstDishIngredients;
    private HashMap<IngredientsEnum, Integer> secondDishIngredients;
    private HashMap<IngredientsEnum, Integer> thirdDishIngredients;
    private HashMap<IngredientsEnum, Integer> fourthDishIngredients;
    private HashMap<IngredientsEnum, Integer> fifthDishIngredients;

    private List<HashMap<IngredientsEnum, Integer>> dishIngredientList;
    private List<String> listOfDishes;

    private Boolean isChecked;



    public RecipeSet(String recipeName, String firstDishName, String secondDishName, String thirdDishName, String fourthDishName, String fifthDishName,
                     HashMap<IngredientsEnum, Integer> firstDishIngredients, HashMap<IngredientsEnum, Integer> secondDishIngredients,
                     HashMap<IngredientsEnum, Integer> thirdDishIngredients, HashMap<IngredientsEnum, Integer> fourthDishIngredients,
                     HashMap<IngredientsEnum, Integer> fifthDishIngredients) {
        this.recipeName = recipeName;
        this.firstDishName = firstDishName;
        this.secondDishName = secondDishName;
        this.thirdDishName = thirdDishName;
        this.fourthDishName = fourthDishName;
        this.fifthDishName = fifthDishName;
        this.dishIngredientList = new ArrayList<>();
        this.firstDishIngredients = firstDishIngredients;
        this.secondDishIngredients = secondDishIngredients;
        this.thirdDishIngredients = thirdDishIngredients;
        this.fourthDishIngredients = fourthDishIngredients;
        this.fifthDishIngredients = fifthDishIngredients;
        dishIngredientList.add(firstDishIngredients);
        dishIngredientList.add(secondDishIngredients);
        dishIngredientList.add(thirdDishIngredients);
        dishIngredientList.add(fourthDishIngredients);
        dishIngredientList.add(fifthDishIngredients);
        this.listOfDishes = new ArrayList<>();
        listOfDishes.add(firstDishName);
        listOfDishes.add(secondDishName);
        listOfDishes.add(thirdDishName);
        listOfDishes.add(fourthDishName);
        listOfDishes.add(fifthDishName);
        isChecked = false;
    }

    public HashMap<IngredientsEnum, Integer> calculateSumOfIngredients(int multiplier) {
        HashMap<IngredientsEnum, Integer> sum = new HashMap<>();
        for (HashMap<IngredientsEnum, Integer> map : dishIngredientList) {
            for (Map.Entry<IngredientsEnum, Integer> entry : map.entrySet()) {
                if (sum.containsKey(entry.getKey())) {
                    Integer newValue = sum.get(entry.getKey()) + entry.getValue()*multiplier;
                    sum.put(entry.getKey(), newValue);
                } else {
                    sum.put(entry.getKey(), entry.getValue()*multiplier);
                }
            }
        }
        return sum;
    }




    public void setDishIngredientList(List<HashMap<IngredientsEnum, Integer>> dishIngredientList) {
        this.dishIngredientList = dishIngredientList;
    }

    public List<String> getListOfDishes() {
        return listOfDishes;
    }

    public void setListOfDishes(List<String> listOfDishes) {
        this.listOfDishes = listOfDishes;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getFirstDishName() {
        return firstDishName;
    }

    public void setFirstDishName(String firstDishName) {
        this.firstDishName = firstDishName;
    }

    public String getSecondDishName() {
        return secondDishName;
    }

    public void setSecondDishName(String secondDishName) {
        this.secondDishName = secondDishName;
    }

    public String getThirdDishName() {
        return thirdDishName;
    }

    public void setThirdDishName(String thirdDishName) {
        this.thirdDishName = thirdDishName;
    }

    public String getFourthDishName() {
        return fourthDishName;
    }

    public void setFourthDishName(String fourthDishName) {
        this.fourthDishName = fourthDishName;
    }

    public String getFifthDishName() {
        return fifthDishName;
    }

    public void setFifthDishName(String fifthDishName) {
        this.fifthDishName = fifthDishName;
    }

    public HashMap<IngredientsEnum, Integer> getFirstDishIngredients() {
        return firstDishIngredients;
    }

    public void setFirstDishIngredients(HashMap<IngredientsEnum, Integer> firstDishIngredients) {
        this.firstDishIngredients = firstDishIngredients;
    }

    public HashMap<IngredientsEnum, Integer> getSecondDishIngredients() {
        return secondDishIngredients;
    }

    public void setSecondDishIngredients(HashMap<IngredientsEnum, Integer> secondDishIngredients) {
        this.secondDishIngredients = secondDishIngredients;
    }

    public HashMap<IngredientsEnum, Integer> getThirdDishIngredients() {
        return thirdDishIngredients;
    }

    public void setThirdDishIngredients(HashMap<IngredientsEnum, Integer> thirdDishIngredients) {
        this.thirdDishIngredients = thirdDishIngredients;
    }

    public HashMap<IngredientsEnum, Integer> getFourthDishIngredients() {
        return fourthDishIngredients;
    }

    public void setFourthDishIngredients(HashMap<IngredientsEnum, Integer> fourthDishIngredients) {
        this.fourthDishIngredients = fourthDishIngredients;
    }

    public HashMap<IngredientsEnum, Integer> getFifthDishIngredients() {
        return fifthDishIngredients;
    }

    public void setFifthDishIngredients(HashMap<IngredientsEnum, Integer> fifthDishIngredients) {
        this.fifthDishIngredients = fifthDishIngredients;
    }

    public List<HashMap<IngredientsEnum, Integer>> getDishIngredientList() {
        return dishIngredientList;
    }

    public Boolean getChecked() {
        return isChecked;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
    }
}
