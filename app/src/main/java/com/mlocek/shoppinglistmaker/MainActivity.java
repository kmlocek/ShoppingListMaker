package com.mlocek.shoppinglistmaker;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.mlocek.shoppinglistmaker.adapters.MainListAdapter;
import com.mlocek.shoppinglistmaker.datasource.entities.TinyDB;
import com.mlocek.shoppinglistmaker.recipes.RecipeSet;
import com.mlocek.shoppinglistmaker.recipes.RecipeSetList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private ArrayList<RecipeSetList> shoppingLists;

    private ListView shoppingListView;
    private MainListAdapter mainListAdapter;
    TinyDB tinyDB;
    Toast exitToast;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        tinyDB = new TinyDB(this);
        createShoppingList();

        FloatingActionButton fab = findViewById(R.id.new_shopping_list_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CreateShoppingListActivity.class));

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.main_drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        exitToast = Toast.makeText(this, R.string.press_back_again, Toast.LENGTH_SHORT);

    }

    private void createShoppingList(){
        try {
            this.shoppingLists = tinyDB.getListObject("shoppingLists", RecipeSetList.class);
        } catch (Exception e) {
            this.shoppingLists = new ArrayList<>();
            tinyDB.putListObject("shoppingLists", shoppingLists);
        }

        this.shoppingListView = findViewById(R.id.shoppingListView);
        this.mainListAdapter = new MainListAdapter(this, shoppingLists);
        shoppingListView.setAdapter(mainListAdapter);
    }

    private void clearTheList(){
        tinyDB.putListObject("shoppingLists", new ArrayList<RecipeSet>());
        createShoppingList();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            mainListAdapter.notifyDataSetChanged();
        }
    }



    public void deleteConfirmationDialog(final int position){
        new AlertDialog.Builder(this)
                .setTitle(R.string.remove_title)
                .setMessage(R.string.remove_list_row_content)
                .setIcon(R.drawable.ic_error_primary_dark_24dp)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        removeItem(position);
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void clearTheListDialog(){
        new AlertDialog.Builder(this)
                .setTitle(R.string.remove_title)
                .setMessage(R.string.clear_the_list_content)
                .setIcon(R.drawable.ic_error_primary_dark_24dp)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        clearTheList();
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void removeItem(int position){
        TinyDB tinyDB = new TinyDB(this);
        ArrayList<RecipeSetList> shoppingLists = tinyDB.getListObject("shoppingLists", RecipeSetList.class);
        shoppingLists.remove(position);
        tinyDB.putListObject("shoppingLists", shoppingLists);
        createShoppingList();
    }

    public void openIngredientList(int position){
        Intent intent = new Intent(MainActivity.this, IngredientListActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.main_drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (exitToast.getView().isShown()) {
            moveTaskToBack(true);
        } else {
            exitToast.show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.clear_lists) {
            clearTheListDialog();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_manage) {
            // Handle the camera action
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.main_drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
