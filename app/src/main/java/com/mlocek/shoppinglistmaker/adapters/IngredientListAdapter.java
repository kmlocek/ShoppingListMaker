package com.mlocek.shoppinglistmaker.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.mlocek.shoppinglistmaker.IngredientListActivity;
import com.mlocek.shoppinglistmaker.R;
import com.mlocek.shoppinglistmaker.ingredients.Ingredient;
import com.mlocek.shoppinglistmaker.ingredients.IngredientList;

import java.util.List;

public class IngredientListAdapter extends BaseExpandableListAdapter  {
    private List<IngredientList> ingredientLists;
    public LayoutInflater inflater;
    public IngredientListActivity activity;
    private List<Ingredient> ingredientsNotSorted;

    public IngredientListAdapter(Activity act, List<IngredientList> ingredientLists, List<Ingredient> ingredientsNotSorted ) {
        activity = (IngredientListActivity) act;
        this.ingredientLists = ingredientLists;
        inflater = act.getLayoutInflater();
        this.ingredientsNotSorted = ingredientsNotSorted;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return ingredientLists.get(groupPosition).getIngredients().get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(final int groupPosition, final int ingredientPosition,
                             boolean isLastChild, View convertView, final ViewGroup parent) {

        final Ingredient ingredient = (Ingredient) getChild(groupPosition, ingredientPosition);

        convertView = inflater.inflate(R.layout.ingredient_list_item, parent, false);


        final View finalView = convertView;
        final TextView ingredientName = (TextView) convertView.findViewById(R.id.ingredient_name);
        ingredientName.setText(ingredient.getIngredientName());
        final TextView ingredientWeight = (TextView) convertView.findViewById(R.id.ingredient_weight);
        String weight = String.valueOf(ingredient.getIngredientWeight()) + " g";
        ingredientWeight.setText(weight);
        boolean isChecked = ingredient.isChecked();
        final CheckBox checkBox = (CheckBox) convertView.findViewById(R.id.ingredient_checkbox);
        checkBox.setChecked(isChecked);

        if (isChecked){
            ingredientName.setTextColor(Color.GRAY);
            ingredientWeight.setTextColor(Color.GRAY);
        }

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!checkBox.isChecked()){
                    ingredient.setChecked(false);
                    ingredientName.setTextColor(Color.BLACK);
                    ingredientWeight.setTextColor(Color.BLACK);
                } else if (checkBox.isChecked()){
                    ingredient.setChecked(true);
                    ingredientName.setTextColor(Color.GRAY);
                    ingredientWeight.setTextColor(Color.GRAY);
                }

                int index = ingredientsNotSorted.indexOf(ingredient);
                ingredientsNotSorted.set(index, ingredient);
                activity.updateIngredientList(ingredientsNotSorted, ingredient, groupPosition, ingredientPosition);
            }
        });

        return convertView;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.ingredient_list_group_item, null);
        }
        final IngredientList ingrList = (IngredientList) getGroup(groupPosition);

        TextView groupName = (TextView) convertView.findViewById(R.id.ingredientGroup);
        groupName.setText(ingrList.getGroupsEnum().getText());
        setItemsChecked(groupPosition, convertView);


        return convertView;
    }

    public void setItemsChecked(int groupPosition, View convertView) {
        IngredientList ingredientList = (IngredientList) getGroup(groupPosition);
        List<Ingredient> list = ingredientList.getIngredients();
        int i = 0;
        for(Ingredient ingredient : list){
            if (ingredient.isChecked()){
                i++;
            }
        }
        TextView itemCheckedCount = (TextView) convertView.findViewById(R.id.groupIngredientCount);
        String itemsChecked = i + "/" + list.size();
        itemCheckedCount.setText(itemsChecked);
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return ingredientLists.get(groupPosition).getIngredients().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return ingredientLists.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return ingredientLists.size();
    }

    @Override
    public void onGroupCollapsed(int groupPosition) {
        super.onGroupCollapsed(groupPosition);
    }

    @Override
    public void onGroupExpanded(int groupPosition) {
        super.onGroupExpanded(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
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

