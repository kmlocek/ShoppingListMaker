package com.mlocek.shoppinglistmaker;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.mlocek.shoppinglistmaker.adapters.CreateListExpandableListAdapter;
import com.mlocek.shoppinglistmaker.datasource.AppData;
import com.mlocek.shoppinglistmaker.datasource.entities.TinyDB;
import com.mlocek.shoppinglistmaker.recipes.RecipeSet;
import com.mlocek.shoppinglistmaker.recipes.RecipeSetList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreateShoppingListActivity extends AppCompatActivity {

    List<RecipeSet> recipeSets;
    private Spinner daysSpinner;
    private Spinner peopleSpinner;
    private ExpandableListView expandableListView;
    private CreateListExpandableListAdapter expandableListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.recipeSets = AppData.getInstance().getRecipes();
        setContentView(R.layout.create_list_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Implemented by activity
            }
        });

        createExpandableListView();

        this.daysSpinner = createSpinner(R.id.daysSpinner);
        this.peopleSpinner = createSpinner(R.id.peopleSpinner);

        Button createListButton = findViewById(R.id.createListButton);
        createListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (createShoppingList()){
                startActivity(new Intent(CreateShoppingListActivity.this, MainActivity.class));
           } else {
                    Toast.makeText(CreateShoppingListActivity.this, R.string.nothing_checked, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    protected void onPostResume() {
        cleanCheckedState();
        super.onPostResume();
    }

    private void cleanCheckedState(){
        for(RecipeSet recipeSet: recipeSets){
            recipeSet.setChecked(false);
        }
        expandableListAdapter.notifyDataSetChanged();
    }

    private void createExpandableListView(){
        this.expandableListView = (ExpandableListView) findViewById(R.id.createListView);
        this.expandableListAdapter = new CreateListExpandableListAdapter(this, recipeSets);
        expandableListView.setAdapter(expandableListAdapter);
    }

    private boolean createShoppingList(){
        List<RecipeSet> checkedRecipes = expandableListAdapter.getCheckedRecipes();
        if (!checkedRecipes.isEmpty()) {
            TinyDB tinyDB = new TinyDB(CreateShoppingListActivity.this);
            ArrayList<RecipeSetList> shoppingLists = tinyDB.getListObject("shoppingLists", RecipeSetList.class);

            int days = Integer.valueOf(daysSpinner.getSelectedItem().toString());
            int people = Integer.valueOf(peopleSpinner.getSelectedItem().toString());
            StringBuilder sb = new StringBuilder();

            for (RecipeSet recipeSet: checkedRecipes) {
                sb.append(recipeSet.getRecipeName() + ", ");
            }
            sb.setLength(sb.length() - 2);

            RecipeSetList recipeSetList = new RecipeSetList(new Date(), checkedRecipes, days, people, sb.toString());

            shoppingLists.add(recipeSetList);
            tinyDB.putListObject("shoppingLists", shoppingLists);
            return true;
        }
        return false;
    }

    private Spinner createSpinner(int id){
        Spinner spinner = (Spinner)findViewById(id);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, android.R.id.text1);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
        spinnerAdapter.add("1");
        spinnerAdapter.add("2");
        spinnerAdapter.add("3");
        spinnerAdapter.add("4");
        spinnerAdapter.add("5");


        spinnerAdapter.notifyDataSetChanged();
        spinner.setSelection(0);
        String text = spinner.getSelectedItem().toString();

        return spinner;
    }

    @Override
    public void onBackPressed() {
        finish();
        startActivityForResult(new Intent(this, MainActivity.class),1);

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
