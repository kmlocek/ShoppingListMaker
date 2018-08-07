package com.mlocek.shoppinglistmaker.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.mlocek.shoppinglistmaker.MainActivity;
import com.mlocek.shoppinglistmaker.R;
import com.mlocek.shoppinglistmaker.recipes.RecipeSetList;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public class MainListAdapter extends ArrayAdapter<RecipeSetList> {

    MainActivity mainActivity;

    public MainListAdapter(@NonNull Context context, List<RecipeSetList> shoppingLists) {
        super(context, 0,  shoppingLists);
        this.mainActivity = (MainActivity) context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        final RecipeSetList recipeSetList = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.main_list_item, parent, false);
        }

        TextView daysText = (TextView) convertView.findViewById(R.id.daysOnTheList);
        daysText.setText(String.valueOf(recipeSetList.getDays()));

        TextView peopleText = (TextView) convertView.findViewById(R.id.peopleOnTheList);
        peopleText.setText(String.valueOf(recipeSetList.getPeople()));

        TextView nameText = (TextView) convertView.findViewById(R.id.listName);
        nameText.setText(recipeSetList.getName());

        TextView dateText = (TextView) convertView.findViewById(R.id.dateText);
        dateText.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.ENGLISH).format(recipeSetList.getCreationDate()));

        TextView itemCount = (TextView) convertView.findViewById(R.id.itemCount);
        String itemCountText = recipeSetList.getItemsChecked() + "/" + recipeSetList.getIngredients().size();
        itemCount.setText(itemCountText);

        Button deleteButton = (Button) convertView.findViewById(R.id.deleteButton);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.deleteConfirmationDialog(position);
            }
        });

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.openIngredientList(position);
            }
        });
        return convertView;
    }


}
