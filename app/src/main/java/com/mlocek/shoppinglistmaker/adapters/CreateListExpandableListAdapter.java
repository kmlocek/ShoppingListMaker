package com.mlocek.shoppinglistmaker.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.mlocek.shoppinglistmaker.R;
import com.mlocek.shoppinglistmaker.recipes.RecipeSet;

import java.util.ArrayList;
import java.util.List;

public class CreateListExpandableListAdapter extends BaseExpandableListAdapter {
    private final List<RecipeSet> recipeSets;
    public LayoutInflater inflater;
    public Activity activity;
    private List<RecipeSet> checkedRecipes;

    public CreateListExpandableListAdapter(Activity act, List<RecipeSet> recipeSets) {
        activity = act;
        this.recipeSets = recipeSets;
        inflater = act.getLayoutInflater();
        this.checkedRecipes = new ArrayList<>();
    }

    @Override
    public Object getChild(int recipePosition, int dishPosition) {
        return recipeSets.get(recipePosition).getListOfDishes().get(dishPosition);
    }

    @Override
    public long getChildId(int recipePosition, int dishPosition) {
        return dishPosition;
    }

    @Override
    public View getChildView(int recipePosition, final int dishPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        final String dish = (String) getChild(recipePosition, dishPosition);
        TextView text = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.create_list_child_item, null);
        }
        text = (TextView) convertView.findViewById(R.id.dishItem);
        text.setText(dishPosition+1 + ". " + dish);

        return convertView;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.create_list_item, null);
        final RecipeSet recipeSet = (RecipeSet) getGroup(groupPosition);
        TextView textView = (TextView) convertView.findViewById(R.id.recipe_name);
        final CheckBox checkBox = (CheckBox) convertView.findViewById(R.id.createListCheckbox);
        checkBox.setChecked(recipeSet.getChecked());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                int index = recipeSets.indexOf(recipeSet);
                if (!checkBox.isChecked()){
                    recipeSet.setChecked(false);
                    checkedRecipes.remove(recipeSet);
                } else if (checkBox.isChecked()){
                    checkedRecipes.add(recipeSet);
                    recipeSet.setChecked(true);
                }
            }
        });

        textView.setText(recipeSet.getRecipeName());
        return convertView;
    }

    public List<RecipeSet> getCheckedRecipes() {
        return checkedRecipes;

    }

    @Override
    public int getChildrenCount(int recipePosition) {
        return recipeSets.get(recipePosition).getDishIngredientList().size();
    }

    @Override
    public Object getGroup(int recipePosition) {
        return recipeSets.get(recipePosition);
    }

    @Override
    public int getGroupCount() {
        return recipeSets.size();
    }

    @Override
    public void onGroupCollapsed(int recipePosition) {
        super.onGroupCollapsed(recipePosition);
    }

    @Override
    public void onGroupExpanded(int recipePosition) {
        super.onGroupExpanded(recipePosition);
    }

    @Override
    public long getGroupId(int recipePosition) {
        return recipePosition;
    }


    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}

