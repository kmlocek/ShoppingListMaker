package com.mlocek.shoppinglistmaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;


import com.mlocek.shoppinglistmaker.adapters.IngredientListAdapter;
import com.mlocek.shoppinglistmaker.datasource.entities.TinyDB;
import com.mlocek.shoppinglistmaker.ingredients.Ingredient;
import com.mlocek.shoppinglistmaker.ingredients.IngredientList;
import com.mlocek.shoppinglistmaker.recipes.RecipeSetList;

import java.util.ArrayList;
import java.util.List;

public class IngredientListActivity extends AppCompatActivity {

    IngredientListAdapter ingredientListAdapter;
    ExpandableListView ingredientListView;
    List<Ingredient> ingredients;
    List<IngredientList> sortedIngredients;
    TinyDB tinyDB;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredient_list_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Implemented by activity
            }
        });
        this.tinyDB = new TinyDB(this);

        this.position = getIntent().getIntExtra("position", 0);
        createIngredientList(position);
        this.ingredientListAdapter = new IngredientListAdapter(this, sortedIngredients, ingredients);
        this.ingredientListView = (ExpandableListView) findViewById(R.id.ingredientListViewExpandable);
        ingredientListView.setAdapter(ingredientListAdapter);
        expandGroups();

    }

    public void updateIngredientList(List<Ingredient> ingredients, Ingredient ingredient, int groupPosition, int ingredientPosition) {
        ArrayList<RecipeSetList> recipeSetLists = tinyDB.getListObject("shoppingLists", RecipeSetList.class);
        RecipeSetList recipeSetList = recipeSetLists.get(position);
        recipeSetList.setIngredients(ingredients);
        recipeSetList.getSortedIngredients().get(groupPosition).getIngredients().set(ingredientPosition, ingredient);
        recipeSetLists.set(position, recipeSetList);

        tinyDB.putListObject("shoppingLists", recipeSetLists);
        ingredientListAdapter.notifyDataSetChanged();

    }

    private void expandGroups(){
        for (int i = 0; i < ingredientListAdapter.getGroupCount(); i++)
            ingredientListView.expandGroup(i);
    }

    private void createIngredientList(int position) {
        this.ingredients = tinyDB.getListObject("shoppingLists", RecipeSetList.class).get(position).getIngredients();
        this.sortedIngredients = tinyDB.getListObject("shoppingLists", RecipeSetList.class).get(position).getSortedIngredients();

    }

    @Override
    public void onBackPressed() {
        startActivityForResult(new Intent(this, MainActivity.class), 1);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.clear_lists) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
