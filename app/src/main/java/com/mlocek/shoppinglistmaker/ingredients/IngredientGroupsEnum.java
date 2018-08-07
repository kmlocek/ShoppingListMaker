package com.mlocek.shoppinglistmaker.ingredients;

public enum IngredientGroupsEnum {
    MEAT("Mięso"),
    FROZEN_PRODUCTS("Mrożonki"),
    DAIRY_PRODUCTS("Nabiał"),
    DRINKS("Napoje"),
    SEEDS_AND_NUTS("Nasiona i orzechy"),
    FRUITS("Owoce"),
    BREAD("Pieczywo"),
    PRESERVES("Przetwory"),
    SPICES("Przyprawy"),
    LEGUMES("Strączkowe"),
    SWEETS("Słodycze"),
    FAT_PRODUCTS("Tłuszcze"),
    VEGETABLES("Warzywa"),
    CEREAL_PRODUCTS("Zbożowe"),
    FISH("Ryby"),
    OTHER("Pozostałe");

    private final String text;


    IngredientGroupsEnum(String ingredient) {
        this.text = ingredient;
    }

    public String getText() {
        return text;
    }
}
