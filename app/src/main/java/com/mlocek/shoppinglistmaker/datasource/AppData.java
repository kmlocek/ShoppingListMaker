package com.mlocek.shoppinglistmaker.datasource;
import com.mlocek.shoppinglistmaker.ingredients.IngredientsEnum;
import com.mlocek.shoppinglistmaker.recipes.RecipeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppData {

    private List<RecipeSet> recipes;
    private static AppData INSTANCE = null;

    protected AppData() {
        createListOfRecipes();
    }

    public static AppData getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new AppData();
        }
        return INSTANCE;
    }

    private void createListOfRecipes(){
        List<RecipeSet> list = new ArrayList<>();
        list.add(createSet1());
        list.add(createSet2());
        list.add(createSet3());
        list.add(createSet4());
        list.add(createSet5());
        list.add(createSet6());
        list.add(createSet7());
        list.add(createSet8());
        list.add(createSet9());
        list.add(createSet10());
        list.add(createSet11());
        list.add(createSet12());
        list.add(createSet13());
        list.add(createSet14());
        list.add(createSet15());
        this.recipes = list;
    }

    public List<RecipeSet> getRecipes() {
        return recipes;
    }

    private RecipeSet createSet1() {
        String setName = "Zestaw 1";

        String firstDishName = "Owisanka z jogurtem, bananem, malinami i migdałami";
        String secondDishName ="Kanapka z pastą twarożkową z pomidarami koktajlowymi";
        String thirdDishName = "Risotto z kurczakiem cukinią i cebulą";
        String fourthDishName = "Koktajl orzechowo-bananowy z nektarynką";
        String fifthDishName = "Pełnoziarniste naleśniki ze szpinakiem";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.OATMEAL, 50);
        firstDishIngredients.put(IngredientsEnum.BANANA, 170);
        firstDishIngredients.put(IngredientsEnum.RASPBERRIES, 80);
        firstDishIngredients.put(IngredientsEnum.ALMONDS, 17);
        firstDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 100);
        
        
        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 110);
        secondDishIngredients.put(IngredientsEnum.COTTAGE_CHEESE_THIN, 70);
        secondDishIngredients.put(IngredientsEnum.CHERRY_TOMATOES, 110);
        secondDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 20);
        secondDishIngredients.put(IngredientsEnum.LETTUCE, 14);
        secondDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 2);
        
        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.CHICKEN_FILLET, 160);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 13);
        thirdDishIngredients.put(IngredientsEnum.BROWN_RICE, 90);
        thirdDishIngredients.put(IngredientsEnum.COURGETTE, 250);
        thirdDishIngredients.put(IngredientsEnum.PARSLEY_LEAVES, 25);
        thirdDishIngredients.put(IngredientsEnum.ONION, 40);
        thirdDishIngredients.put(IngredientsEnum.SPINACH, 25);
        
        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.CASHEW_NUT, 15);
        fourthDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 120);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 120);
        fourthDishIngredients.put(IngredientsEnum.NECTARINE, 100);

        
        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.WHEAT_FLOUR_1850, 50);
        fifthDishIngredients.put(IngredientsEnum.EGG, 12);
        fifthDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 50);
        fifthDishIngredients.put(IngredientsEnum.COTTAGE_CHEESE_THIN, 40);
        fifthDishIngredients.put(IngredientsEnum.NUTMEG, 1);
        fifthDishIngredients.put(IngredientsEnum.OLIVE_OIL, 6);
        fifthDishIngredients.put(IngredientsEnum.SPINACH, 50);
        fifthDishIngredients.put(IngredientsEnum.MILK_2, 40);
        fifthDishIngredients.put(IngredientsEnum.GARLIC, 5);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet2() {
        String setName = "Zestaw 2";

        String firstDishName = "Jajecznica z tuńczykiem, pomidorami i szczypiorkiem";
        String secondDishName ="Kanapki z masłem orzechowym i bananem";
        String thirdDishName = "Kaszotto z kurczakiem, burakiem i cebulą";
        String fourthDishName = "Shake z rukolą, gruszką i bananem";
        String fifthDishName = "Sałatka z kuskusem, mozzarellą, szpinakiem i pomidorkami koktajlowymi";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.EGG, 120);
        firstDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 80);
        firstDishIngredients.put(IngredientsEnum.TUNA, 90);
        firstDishIngredients.put(IngredientsEnum.BUTTER, 7);
        firstDishIngredients.put(IngredientsEnum.CHERRY_TOMATOES, 100);
        firstDishIngredients.put(IngredientsEnum.CHIVE, 5);
        firstDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 2);


        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 70);
        secondDishIngredients.put(IngredientsEnum.PEANUT_BUTTER, 25);
        secondDishIngredients.put(IngredientsEnum.BANANA, 50);
        secondDishIngredients.put(IngredientsEnum.CINNAMON, 1);


        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.CHICKEN_FILLET, 150);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 13);
        thirdDishIngredients.put(IngredientsEnum.BUCKWHEAT, 90);
        thirdDishIngredients.put(IngredientsEnum.BEETROOT, 130);
        thirdDishIngredients.put(IngredientsEnum.PARSLEY_LEAVES, 25);
        thirdDishIngredients.put(IngredientsEnum.ONION, 35);
        thirdDishIngredients.put(IngredientsEnum.CHARD, 25);

        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.RUKOLA, 40);
        fourthDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 140);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 120);
        fourthDishIngredients.put(IngredientsEnum.PEAR, 120);
        fourthDishIngredients.put(IngredientsEnum.ALMONDS, 10);


        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.COUS_COUS, 45);
        fifthDishIngredients.put(IngredientsEnum.MOZARELLA_CHEESE, 40);
        fifthDishIngredients.put(IngredientsEnum.OLIVE_OIL, 5);
        fifthDishIngredients.put(IngredientsEnum.SPINACH, 30);
        fifthDishIngredients.put(IngredientsEnum.CHERRY_TOMATOES, 80);
        fifthDishIngredients.put(IngredientsEnum.GARLIC, 4);
        fifthDishIngredients.put(IngredientsEnum.VINEGAR_BALSAMIC, 2);
        fifthDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 2);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet3() {
        String setName = "Zestaw 3";

        String firstDishName = "Owsianka z truskawkami, żurawiną i orzechami włoskimi";
        String secondDishName ="Kanapka z pastą twarożkową z papryką";
        String thirdDishName = "Warzywny gulasz z brązowym ryżem";
        String fourthDishName = "Koktajl kokosowo-bananowy";
        String fifthDishName = "Serek wiejski z rzodkiewką, szczypiorkiem i pomidorkami koktajlowymi oraz pieczywem";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.OATMEAL, 60);
        firstDishIngredients.put(IngredientsEnum.ITALIAN_NUTS, 25);
        firstDishIngredients.put(IngredientsEnum.DRIED_CRANBERRY, 25);
        firstDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 120);
        firstDishIngredients.put(IngredientsEnum.STRAWBERRIES, 95);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 110);
        secondDishIngredients.put(IngredientsEnum.COTTAGE_CHEESE_THIN, 70);
        secondDishIngredients.put(IngredientsEnum.RED_PAPRICA, 85);
        secondDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 19);
        secondDishIngredients.put(IngredientsEnum.LETTUCE, 14);
        secondDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 2);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.BROWN_RICE, 75);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 15);
        thirdDishIngredients.put(IngredientsEnum.RED_LENTIL, 35);
        thirdDishIngredients.put(IngredientsEnum.TOMATO, 375);
        thirdDishIngredients.put(IngredientsEnum.SWEET_POTATO, 75);
        thirdDishIngredients.put(IngredientsEnum.ONION, 90);
        thirdDishIngredients.put(IngredientsEnum.GREEN_PEAS, 45);
        thirdDishIngredients.put(IngredientsEnum.CARROT, 50);
        thirdDishIngredients.put(IngredientsEnum.CELERY_LEAVES, 75);
        thirdDishIngredients.put(IngredientsEnum.NUTMEG, 1);
        thirdDishIngredients.put(IngredientsEnum.PARSLEY_LEAVES, 9);
        thirdDishIngredients.put(IngredientsEnum.GARLIC, 7);


        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.PINEAPPLE_JUICE, 230);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 140);
        fourthDishIngredients.put(IngredientsEnum.COCONUT_MILK, 35);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.COTTAGE_CHEESE_GRAINY, 150);
        fifthDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 80);
        fifthDishIngredients.put(IngredientsEnum.CHERRY_TOMATOES, 130);
        fifthDishIngredients.put(IngredientsEnum.RADISH, 45);
        fifthDishIngredients.put(IngredientsEnum.CHIVE, 10);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet4() {
        String setName = "Zestaw 4";

        String firstDishName = "Cynamonowa owsianka z gruszką i orzechami włoskimi";
        String secondDishName ="Kanapki z jajkiem i pomidorem";
        String thirdDishName = "Łosoś z ryżem basmati i warzywami na patelnię";
        String fourthDishName = "Zielony koktajl z botwinką i bananem";
        String fifthDishName = "Kakaowe naleśniki pełnoziarniste z bananem, cynamonem i orzechami";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.OATMEAL, 60);
        firstDishIngredients.put(IngredientsEnum.ITALIAN_NUTS, 25);
        firstDishIngredients.put(IngredientsEnum.PEAR, 230);
        firstDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 120);
        firstDishIngredients.put(IngredientsEnum.CINNAMON, 1);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 110);
        secondDishIngredients.put(IngredientsEnum.BUTTER, 11);
        secondDishIngredients.put(IngredientsEnum.TOMATO, 90);
        secondDishIngredients.put(IngredientsEnum.EGG, 45);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.BASMATI_RICE, 95);
        thirdDishIngredients.put(IngredientsEnum.SALOMON_FILLET, 140);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 15);
        thirdDishIngredients.put(IngredientsEnum.VEGETABLES_MIX, 210);

        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.ORANGE_JUICE, 230);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 190);
        fourthDishIngredients.put(IngredientsEnum.LEN_SEEDS, 7);
        fourthDishIngredients.put(IngredientsEnum.DRIED_GINGER, 2);
        fourthDishIngredients.put(IngredientsEnum.CHARD, 100);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.WHEAT_FLOUR_1850, 35);
        fifthDishIngredients.put(IngredientsEnum.BANANA, 85);
        fifthDishIngredients.put(IngredientsEnum.HONEY, 11);
        fifthDishIngredients.put(IngredientsEnum.EGG, 8);
        fifthDishIngredients.put(IngredientsEnum.ITALIAN_NUTS, 11);
        fifthDishIngredients.put(IngredientsEnum.COCOA, 7);
        fifthDishIngredients.put(IngredientsEnum.OLIVE_OIL, 5);
        fifthDishIngredients.put(IngredientsEnum.MILK_2, 25);
        fifthDishIngredients.put(IngredientsEnum.CINNAMON, 1);


        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet5() {
        String setName = "Zestaw 5";

        String firstDishName = "Jajecznica z suszonymi pomidorami i tymiankiem";
        String secondDishName ="Kanapki z masłem orzechowym i bananem";
        String thirdDishName = "Makaron pełnoziarnisty z indykiem, brokułami i mozzarellą";
        String fourthDishName = "Koktajl bananowo-kokosowy z cynamonem";
        String fifthDishName = "Naleśniki z szynką, szpinakiem i papryką";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.EGG, 130);
        firstDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 85);
        firstDishIngredients.put(IngredientsEnum.DRIED_TOMATOES, 35);
        firstDishIngredients.put(IngredientsEnum.BUTTER, 5);
        firstDishIngredients.put(IngredientsEnum.THYME, 3);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 70);
        secondDishIngredients.put(IngredientsEnum.PEANUT_BUTTER, 25);
        secondDishIngredients.put(IngredientsEnum.BANANA, 50);
        secondDishIngredients.put(IngredientsEnum.CINNAMON, 1);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.WHOLE_GRAIN_PASTA, 75);
        thirdDishIngredients.put(IngredientsEnum.MOZARELLA_CHEESE, 80);
        thirdDishIngredients.put(IngredientsEnum.TURKEY_FILLET, 120);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 10);
        thirdDishIngredients.put(IngredientsEnum.BROCCOLI, 160);
        thirdDishIngredients.put(IngredientsEnum.BASIL_LEAVES, 21);
        thirdDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 2);


        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.COCONUT_MILK, 55);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 250);
        fourthDishIngredients.put(IngredientsEnum.LEMON, 80);
        fourthDishIngredients.put(IngredientsEnum.CINNAMON, 1);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.WHEAT_FLOUR_1850, 55);
        fifthDishIngredients.put(IngredientsEnum.EGG, 12);
        fifthDishIngredients.put(IngredientsEnum.OLIVE_OIL, 12);
        fifthDishIngredients.put(IngredientsEnum.WATER, 75);
        fifthDishIngredients.put(IngredientsEnum.HAM, 25);
        fifthDishIngredients.put(IngredientsEnum.RED_PAPRICA, 75);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet6() {
        String setName = "Zestaw 6";

        String firstDishName = "Owsianka z jabłkiem, cynamonem i orzechami włoskimi";
        String secondDishName ="Kanapki z szynką, jajkiem, rukolą oraz ogórkiem kiszonym";
        String thirdDishName = "Kurczak z kaszą jęczmienną i mieszanką warzyw z kalafiorem, brokułami i marchwią";
        String fourthDishName = "Shake ze szpinakiem, jabłkiem i ananasem";
        String fifthDishName = "Sałatka z makaronem pełnoziarnistym, czerwoną fasolą, oliwkami, kukurydzą i pestkami dyni";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.OATMEAL, 65);
        firstDishIngredients.put(IngredientsEnum.APPLE, 230);
        firstDishIngredients.put(IngredientsEnum.ITALIAN_NUTS, 25);
        firstDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 130);
        firstDishIngredients.put(IngredientsEnum.CINNAMON, 1);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 100);
        secondDishIngredients.put(IngredientsEnum.EGG, 60);
        secondDishIngredients.put(IngredientsEnum.HAM, 50);
        secondDishIngredients.put(IngredientsEnum.PICKLE, 50);
        secondDishIngredients.put(IngredientsEnum.RUKOLA, 12);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.BARLEY, 90);
        thirdDishIngredients.put(IngredientsEnum.CHICKEN_FILLET, 140);
        thirdDishIngredients.put(IngredientsEnum.VEGETABLES_CALAFIOR_BROCC_MIX, 200);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 16);
        thirdDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 1);


        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 200);
        fourthDishIngredients.put(IngredientsEnum.SPINACH, 55);
        fourthDishIngredients.put(IngredientsEnum.APPLE, 110);
        fourthDishIngredients.put(IngredientsEnum.OATMEAL, 14);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.RED_BEAN, 45);
        fifthDishIngredients.put(IngredientsEnum.OLIVES, 25);
        fifthDishIngredients.put(IngredientsEnum.OLIVE_OIL, 5);
        fifthDishIngredients.put(IngredientsEnum.CANNED_CORN, 30);
        fifthDishIngredients.put(IngredientsEnum.WHOLE_GRAIN_PASTA, 50);
        fifthDishIngredients.put(IngredientsEnum.RUKOLA, 14);
        fifthDishIngredients.put(IngredientsEnum.LEMON, 5);
        fifthDishIngredients.put(IngredientsEnum.PUMPKIN_SEEDS, 5);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet7() {
        String setName = "Zestaw 7";

        String firstDishName = "Owsianka z bananem, kiwi i orzechami laskowymi";
        String secondDishName ="Kanapki z łososiem, sałatą i czerwoną papryką";
        String thirdDishName = "Warzywny gulasz z kaszą gryczaną";
        String fourthDishName = "Koktajl z bananem i mango";
        String fifthDishName = "Słodki twarożek z płatkami jaglanymi i bakaliami";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.OATMEAL, 50);
        firstDishIngredients.put(IngredientsEnum.BANANA, 180);
        firstDishIngredients.put(IngredientsEnum.HAZELNUTS, 23);
        firstDishIngredients.put(IngredientsEnum.KIWI, 95);
        firstDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 100);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 95);
        secondDishIngredients.put(IngredientsEnum.SMOKED_SALOM, 45);
        secondDishIngredients.put(IngredientsEnum.LEN_SEEDS, 7);
        secondDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 17);
        secondDishIngredients.put(IngredientsEnum.RED_PAPRICA, 35);
        secondDishIngredients.put(IngredientsEnum.LETTUCE, 17);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.BUCKWHEAT, 75);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 15);
        thirdDishIngredients.put(IngredientsEnum.RED_LENTIL, 35);
        thirdDishIngredients.put(IngredientsEnum.TOMATO, 375);
        thirdDishIngredients.put(IngredientsEnum.SWEET_POTATO, 75);
        thirdDishIngredients.put(IngredientsEnum.ONION, 90);
        thirdDishIngredients.put(IngredientsEnum.GREEN_PEAS, 45);
        thirdDishIngredients.put(IngredientsEnum.CARROT, 80);
        thirdDishIngredients.put(IngredientsEnum.CELERY_LEAVES, 75);
        thirdDishIngredients.put(IngredientsEnum.NUTMEG, 1);
        thirdDishIngredients.put(IngredientsEnum.PARSLEY_LEAVES, 9);
        thirdDishIngredients.put(IngredientsEnum.GARLIC, 7);


        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.MILK_2, 250);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 120);
        fourthDishIngredients.put(IngredientsEnum.MANGO, 150);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.COTTAGE_CHEESE_GRAINY, 150);
        fifthDishIngredients.put(IngredientsEnum.MILLET_FLAKES, 18);
        fifthDishIngredients.put(IngredientsEnum.MILK_2, 65);
        fifthDishIngredients.put(IngredientsEnum.RAISINS, 13);
        fifthDishIngredients.put(IngredientsEnum.ALMONDS, 9);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet8() {
        String setName = "Zestaw 8";

        String firstDishName = "Jajecznica z ogórkiem";
        String secondDishName ="Kanapki z kozim serem, rukolą, orzechami włoskimi i gruszką";
        String thirdDishName = "Ryż basmati z makrelą, suszonymi pomidorami, fetą i roszponką";
        String fourthDishName = "Shake z selerem, ananasem i bananem";
        String fifthDishName = "Pełnoziarniste naleśniki z masłem orzechowym, brzoskwiniami i cynamonem";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.EGG, 160);
        firstDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 100);
        firstDishIngredients.put(IngredientsEnum.OLIVE_OIL, 6);
        firstDishIngredients.put(IngredientsEnum.GREEN_CUCUMBER, 80);
        firstDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 1);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 100);
        secondDishIngredients.put(IngredientsEnum.SOFT_GOAT_CHEESE, 25);
        secondDishIngredients.put(IngredientsEnum.PEAR, 85);
        secondDishIngredients.put(IngredientsEnum.ITALIAN_NUTS, 10);
        secondDishIngredients.put(IngredientsEnum.RUKOLA, 12);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.BASMATI_RICE, 65);
        thirdDishIngredients.put(IngredientsEnum.DRIED_TOMATOES, 50);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 13);
        thirdDishIngredients.put(IngredientsEnum.SMOKED_MACKEREL, 60);
        thirdDishIngredients.put(IngredientsEnum.FETA_CHEESE, 35);
        thirdDishIngredients.put(IngredientsEnum.VEGETABLES_ITALIAN_MIX, 140);
        thirdDishIngredients.put(IngredientsEnum.GARLIC, 5);
        thirdDishIngredients.put(IngredientsEnum.LAMB_LETTUCE, 25);

        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 160);
        fourthDishIngredients.put(IngredientsEnum.CELERY_ROOT, 90);
        fourthDishIngredients.put(IngredientsEnum.PINEAPPLE, 90);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 130);
        fourthDishIngredients.put(IngredientsEnum.ALMONDS, 11);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.WHEAT_FLOUR_1850, 35);
        fifthDishIngredients.put(IngredientsEnum.PEANUT_BUTTER, 15);
        fifthDishIngredients.put(IngredientsEnum.EGG, 9);
        fifthDishIngredients.put(IngredientsEnum.PEACH, 120);
        fifthDishIngredients.put(IngredientsEnum.OLIVE_OIL, 6);
        fifthDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 35);
        fifthDishIngredients.put(IngredientsEnum.CINNAMON, 1);
        fifthDishIngredients.put(IngredientsEnum.MILK_2, 30);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet9() {
        String setName = "Zestaw 9";

        String firstDishName = "Owsianka z jogurtem, wiśniami i migdałami";
        String secondDishName ="Kanapki z masłem orzechowym i kiwi";
        String thirdDishName = "Grillowana pierś z kurczaka z ziemniakami i papryką";
        String fourthDishName = "Koktajl z kiwi, bananów i pomarańczy";
        String fifthDishName = "Pełnoziarniste naleśniki z pastą z awokado i sera białego";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.OATMEAL, 60);
        firstDishIngredients.put(IngredientsEnum.ALMONDS, 25);
        firstDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 120);
        firstDishIngredients.put(IngredientsEnum.CHERRIES, 95);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 70);
        secondDishIngredients.put(IngredientsEnum.PEANUT_BUTTER, 25);
        secondDishIngredients.put(IngredientsEnum.KIWI, 55);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.POTATOES, 400);
        thirdDishIngredients.put(IngredientsEnum.CHICKEN_FILLET, 160);
        thirdDishIngredients.put(IngredientsEnum.RED_PAPRICA, 190);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 13);
        thirdDishIngredients.put(IngredientsEnum.GREEN_PAPRICA, 65);
        thirdDishIngredients.put(IngredientsEnum.DILL, 65);
        thirdDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 2);

        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 160);
        fourthDishIngredients.put(IngredientsEnum.CELERY_ROOT, 90);
        fourthDishIngredients.put(IngredientsEnum.PINEAPPLE, 90);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 130);
        fourthDishIngredients.put(IngredientsEnum.ALMONDS, 11);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.WHEAT_FLOUR_1850, 50);
        fifthDishIngredients.put(IngredientsEnum.MILK_2, 30);
        fifthDishIngredients.put(IngredientsEnum.WATER, 30);
        fifthDishIngredients.put(IngredientsEnum.OLIVE_OIL, 5);
        fifthDishIngredients.put(IngredientsEnum.AVOCADO, 55);
        fifthDishIngredients.put(IngredientsEnum.COTTAGE_CHEESE_THIN, 65);
        fifthDishIngredients.put(IngredientsEnum.BASIL_LEAVES, 11);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet10() {
        String setName = "Zestaw 10";

        String firstDishName = "Jajecznica z cukinią i papryką";
        String secondDishName ="Kanapki z masłem orzechowym i żurawiną";
        String thirdDishName = "Makaron z kurczakiem, bazylią i pomidorkami koktajlowymi";
        String fourthDishName = "Shake z natką pietruszki, kiwi i bananem";
        String fifthDishName = "Sałatka z kuskusem, mozzarellą, szpinakiem i pomidorkami koktajlowymi";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.EGG, 140);
        firstDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 90);
        firstDishIngredients.put(IngredientsEnum.OLIVE_OIL, 8);
        firstDishIngredients.put(IngredientsEnum.RED_PAPRICA, 110);
        firstDishIngredients.put(IngredientsEnum.COURGETTE, 140);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 65);
        secondDishIngredients.put(IngredientsEnum.PEANUT_BUTTER, 25);
        secondDishIngredients.put(IngredientsEnum.DRIED_CRANBERRY, 17);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.CHICKEN_FILLET, 130);
        thirdDishIngredients.put(IngredientsEnum.WHOLE_GRAIN_PASTA, 80);
        thirdDishIngredients.put(IngredientsEnum.BASIL_LEAVES, 23);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 11);
        thirdDishIngredients.put(IngredientsEnum.SUNFLOWER_SEEDS, 11);
        thirdDishIngredients.put(IngredientsEnum.PARMESAN_CHEESE, 11);
        thirdDishIngredients.put(IngredientsEnum.ITALIAN_NUTS, 11);
        thirdDishIngredients.put(IngredientsEnum.CHERRY_TOMATOES, 90);

        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 190);
        fourthDishIngredients.put(IngredientsEnum.PARSLEY_LEAVES, 25);
        fourthDishIngredients.put(IngredientsEnum.KIWI, 110);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 160);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.COUS_COUS, 45);
        fifthDishIngredients.put(IngredientsEnum.MOZARELLA_CHEESE, 40);
        fifthDishIngredients.put(IngredientsEnum.OLIVE_OIL, 5);
        fifthDishIngredients.put(IngredientsEnum.SPINACH, 30);
        fifthDishIngredients.put(IngredientsEnum.CHERRY_TOMATOES, 80);
        fifthDishIngredients.put(IngredientsEnum.GARLIC, 4);
        fifthDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 2);
        fifthDishIngredients.put(IngredientsEnum.VINEGAR_BALSAMIC, 2);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet11() {
        String setName = "Zestaw 11";

        String firstDishName = "Owsianka z bananem, cynamonem i orzechami laskowymi";
        String secondDishName ="Kanapka z pastą twarożkową z pomidorkami koktajlowymi";
        String thirdDishName = "Warzywny gulasz z kaszą jęczmienną";
        String fourthDishName = "Koktajl z jabłkiem i mango";
        String fifthDishName = "Sałatka z serkiem wiejskim, rukolą, suszonymi pomidorami i sezamem";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.OATMEAL, 65);
        firstDishIngredients.put(IngredientsEnum.BANANA, 210);
        firstDishIngredients.put(IngredientsEnum.HAZELNUTS, 25);
        firstDishIngredients.put(IngredientsEnum.CINNAMON, 1);
        firstDishIngredients.put(IngredientsEnum.MILK_2, 65);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 110);
        secondDishIngredients.put(IngredientsEnum.COTTAGE_CHEESE_THIN, 70);
        secondDishIngredients.put(IngredientsEnum.CHERRY_TOMATOES, 110);
        secondDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 20);
        secondDishIngredients.put(IngredientsEnum.LETTUCE, 14);
        secondDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 2);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.BARLEY, 70);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 14);
        thirdDishIngredients.put(IngredientsEnum.RED_LENTIL, 35);
        thirdDishIngredients.put(IngredientsEnum.TOMATO, 325);
        thirdDishIngredients.put(IngredientsEnum.SWEET_POTATO, 75);
        thirdDishIngredients.put(IngredientsEnum.ONION, 85);
        thirdDishIngredients.put(IngredientsEnum.GREEN_PEAS, 45);
        thirdDishIngredients.put(IngredientsEnum.CARROT, 65);
        thirdDishIngredients.put(IngredientsEnum.CELERY_LEAVES, 70);
        thirdDishIngredients.put(IngredientsEnum.CURRY, 1);
        thirdDishIngredients.put(IngredientsEnum.PARSLEY_LEAVES, 9);
        thirdDishIngredients.put(IngredientsEnum.GARLIC, 7);

        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.MILK_2, 250);
        fourthDishIngredients.put(IngredientsEnum.MANGO, 150);
        fourthDishIngredients.put(IngredientsEnum.APPLE, 200);


        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.DRIED_TOMATOES, 35);
        fifthDishIngredients.put(IngredientsEnum.COTTAGE_CHEESE_GRAINY, 95);
        fifthDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 30);
        fifthDishIngredients.put(IngredientsEnum.SESAME_SEEDS, 6);
        fifthDishIngredients.put(IngredientsEnum.RUKOLA, 65);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet12() {
        String setName = "Zestaw 12";

        String firstDishName = "Owsianka z bananem, żurawiną i makiem";
        String secondDishName ="Kanapki z szynką, rukolą i ogórkiem kiszonym";
        String thirdDishName = "Makaron pełnoziarnisty z łososiem i szpinakiem";
        String fourthDishName = "Shake z selerem, ananasem i bananem";
        String fifthDishName = "Naleśniki kawowe z truskawkami";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.OATMEAL, 45);
        firstDishIngredients.put(IngredientsEnum.BLUE_POPPY, 25);
        firstDishIngredients.put(IngredientsEnum.BANANA, 150);
        firstDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 90);
        firstDishIngredients.put(IngredientsEnum.DRIED_CRANBERRY, 15);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 95);
        secondDishIngredients.put(IngredientsEnum.HAM, 45);
        secondDishIngredients.put(IngredientsEnum.BUTTER, 12);
        secondDishIngredients.put(IngredientsEnum.PICKLE, 45);
        secondDishIngredients.put(IngredientsEnum.RUKOLA, 12);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.WHOLE_GRAIN_PASTA, 85);
        thirdDishIngredients.put(IngredientsEnum.SALOMON_FILLET, 110);
        thirdDishIngredients.put(IngredientsEnum.COTTAGE_CHEESE_THIN, 110);
        thirdDishIngredients.put(IngredientsEnum.RAPESEED_OIL, 9);
        thirdDishIngredients.put(IngredientsEnum.ONION, 110);
        thirdDishIngredients.put(IngredientsEnum.SPINACH, 35);
        thirdDishIngredients.put(IngredientsEnum.GARLIC, 12);
        thirdDishIngredients.put(IngredientsEnum.PARSLEY_LEAVES, 22);

        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 160);
        fourthDishIngredients.put(IngredientsEnum.CELERY_ROOT, 90);
        fourthDishIngredients.put(IngredientsEnum.PINEAPPLE, 90);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 130);
        fourthDishIngredients.put(IngredientsEnum.ALMONDS, 11);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.WHEAT_FLOUR_1850, 55);
        fifthDishIngredients.put(IngredientsEnum.EGG, 13);
        fifthDishIngredients.put(IngredientsEnum.OLIVE_OIL, 13);
        fifthDishIngredients.put(IngredientsEnum.INSTANT_COFFE, 3);
        fifthDishIngredients.put(IngredientsEnum.WATER, 75);
        fifthDishIngredients.put(IngredientsEnum.STRAWBERRIES, 75);
        fifthDishIngredients.put(IngredientsEnum.COCOA, 3);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet13() {
        String setName = "Zestaw 13";

        String firstDishName = "Jajecznica z pomidorami i szczypiorkiem";
        String secondDishName ="Kanapki z szynką, chrzanem i ogórkiem";
        String thirdDishName = "Kurczak po meksykańsku z ryżem basmati";
        String fourthDishName = "Koktajl jabłkowo-bananowy";
        String fifthDishName = "Naleśniki z kurczakiem, brokułami i pieczarkami";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.EGG, 150);
        firstDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 100);
        firstDishIngredients.put(IngredientsEnum.BUTTER, 6);
        firstDishIngredients.put(IngredientsEnum.POTATOES, 210);
        firstDishIngredients.put(IngredientsEnum.CHIVE, 12);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 95);
        secondDishIngredients.put(IngredientsEnum.BUTTER, 11);
        secondDishIngredients.put(IngredientsEnum.HAM, 45);
        secondDishIngredients.put(IngredientsEnum.PICKLE, 45);
        secondDishIngredients.put(IngredientsEnum.HORSERADISH, 11);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.CHICKEN_FILLET, 120);
        thirdDishIngredients.put(IngredientsEnum.BASMATI_RICE, 85);
        thirdDishIngredients.put(IngredientsEnum.VEGETABLES_MEXICAN_MIX, 190);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 12);
        thirdDishIngredients.put(IngredientsEnum.CHILI, 1);
        thirdDishIngredients.put(IngredientsEnum.LEMON, 10);

        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.BANANA, 140);
        fourthDishIngredients.put(IngredientsEnum.MILK_2, 140);
        fourthDishIngredients.put(IngredientsEnum.APPLE, 140);
        fourthDishIngredients.put(IngredientsEnum.ALMONDS, 7);
        fourthDishIngredients.put(IngredientsEnum.OATMEAL, 7);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.WHEAT_FLOUR_1850, 50);
        fifthDishIngredients.put(IngredientsEnum.EGG, 12);
        fifthDishIngredients.put(IngredientsEnum.OLIVE_OIL, 12);
        fifthDishIngredients.put(IngredientsEnum.WATER, 70);
        fifthDishIngredients.put(IngredientsEnum.CHICKEN_FILLET, 30);
        fifthDishIngredients.put(IngredientsEnum.BROCCOLI, 60);
        fifthDishIngredients.put(IngredientsEnum.MUSHROOM, 70);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet14() {
        String setName = "Zestaw 14";

        String firstDishName = "Owsianka z bananem, grejpfrutem i orzechami laskowymi";
        String secondDishName ="Kanapki z szynką, awokado, pomidorem i koperkiem";
        String thirdDishName = "Kurczak po meksykańsku z kaszą jaglaną";
        String fourthDishName = "Zielony koktajl z botwinką i bananem";
        String fifthDishName = "Sałatka z kaszą jaglaną, brokułami, fetą, migdałami i sosem chrzanowym";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.OATMEAL, 50);
        firstDishIngredients.put(IngredientsEnum.HAZELNUTS, 35);
        firstDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 120);
        firstDishIngredients.put(IngredientsEnum.BANANA, 100);
        firstDishIngredients.put(IngredientsEnum.GRAPEFRUIT, 170);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 100);
        secondDishIngredients.put(IngredientsEnum.HAM, 50);
        secondDishIngredients.put(IngredientsEnum.AVOCADO, 50);
        secondDishIngredients.put(IngredientsEnum.TOMATO, 45);
        secondDishIngredients.put(IngredientsEnum.DILL, 10);
        secondDishIngredients.put(IngredientsEnum.LETTUCE, 18);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.MILLET, 85);
        thirdDishIngredients.put(IngredientsEnum.CHICKEN_FILLET, 120);
        thirdDishIngredients.put(IngredientsEnum.VEGETABLES_MEXICAN_MIX, 180);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 12);
        thirdDishIngredients.put(IngredientsEnum.CHILI, 1);
        thirdDishIngredients.put(IngredientsEnum.LEMON, 10);

        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.ORANGE_JUICE, 230);
        fourthDishIngredients.put(IngredientsEnum.LEN_SEEDS, 7);
        fourthDishIngredients.put(IngredientsEnum.CHARD, 100);
        fourthDishIngredients.put(IngredientsEnum.BANANA, 190);
        fourthDishIngredients.put(IngredientsEnum.DRIED_GINGER, 2);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.MILLET, 40);
        fifthDishIngredients.put(IngredientsEnum.FETA_CHEESE, 40);
        fifthDishIngredients.put(IngredientsEnum.ALMONDS, 11);
        fifthDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 70);
        fifthDishIngredients.put(IngredientsEnum.BROCCOLI, 50);
        fifthDishIngredients.put(IngredientsEnum.HORSERADISH, 7);
        fifthDishIngredients.put(IngredientsEnum.DILL, 5);
        fifthDishIngredients.put(IngredientsEnum.LEMON, 3);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    private RecipeSet createSet15() {
        String setName = "Zestaw 15";

        String firstDishName = "Owsianka z ananasem, żurawiną i migdałami";
        String secondDishName = "Kanapki z masłem orzechowym i gruszką";
        String thirdDishName = "Kasza jaglana z jarmużem i czerwoną fasolą";
        String fourthDishName = "Koktajl z jabłkiem, miodem i cynamonem";
        String fifthDishName = "Twarożek z czerwoną papryką, pestkami dyni i kiełkami lucerny";

        HashMap<IngredientsEnum, Integer> firstDishIngredients = new HashMap<>();
        firstDishIngredients.put(IngredientsEnum.OATMEAL, 50);
        firstDishIngredients.put(IngredientsEnum.ALMONDS, 21);
        firstDishIngredients.put(IngredientsEnum.DRIED_CRANBERRY, 23);
        firstDishIngredients.put(IngredientsEnum.NATURAL_YOGURT_2, 100);
        firstDishIngredients.put(IngredientsEnum.PINEAPPLE, 180);

        HashMap<IngredientsEnum, Integer> secondDishIngredients = new HashMap<>();
        secondDishIngredients.put(IngredientsEnum.GRAHAM_BREAD, 70);
        secondDishIngredients.put(IngredientsEnum.PEANUT_BUTTER, 25);
        secondDishIngredients.put(IngredientsEnum.PEAR, 100);

        HashMap<IngredientsEnum, Integer> thirdDishIngredients = new HashMap<>();
        thirdDishIngredients.put(IngredientsEnum.MILLET, 130);
        thirdDishIngredients.put(IngredientsEnum.OLIVE_OIL, 12);
        thirdDishIngredients.put(IngredientsEnum.RED_BEAN, 95);
        thirdDishIngredients.put(IngredientsEnum.BLUE_POPPY, 6);
        thirdDishIngredients.put(IngredientsEnum.KALE, 70);
        thirdDishIngredients.put(IngredientsEnum.PORE, 120);
        thirdDishIngredients.put(IngredientsEnum.PARSLEY_LEAVES, 14);
        thirdDishIngredients.put(IngredientsEnum.LEMON, 3);
        thirdDishIngredients.put(IngredientsEnum.PROVENCE_HERBS, 1);

        HashMap<IngredientsEnum, Integer> fourthDishIngredients = new HashMap<>();
        fourthDishIngredients.put(IngredientsEnum.MILK_2, 230);
        fourthDishIngredients.put(IngredientsEnum.APPLE, 325);
        fourthDishIngredients.put(IngredientsEnum.HONEY, 11);
        fourthDishIngredients.put(IngredientsEnum.CINNAMON, 1);

        HashMap<IngredientsEnum, Integer> fifthDishIngredients = new HashMap<>();
        fifthDishIngredients.put(IngredientsEnum.COTTAGE_CHEESE_GRAINY, 120);
        fifthDishIngredients.put(IngredientsEnum.FETA_CHEESE, 65);
        fifthDishIngredients.put(IngredientsEnum.RED_PAPRICA, 50);
        fifthDishIngredients.put(IngredientsEnum.PUMPKIN_SEEDS, 8);
        fifthDishIngredients.put(IngredientsEnum.LUCER_GROUNDS, 21);

        RecipeSet set = new RecipeSet(setName, firstDishName, secondDishName, thirdDishName, fourthDishName, fifthDishName, firstDishIngredients, secondDishIngredients, thirdDishIngredients, fourthDishIngredients, fifthDishIngredients);
        return set;
    }
    }

