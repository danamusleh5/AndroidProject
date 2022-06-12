package com.example.androidresproject;

import android.widget.Button;

public class Menu {
    private String name;
    private int imageID;

    public static final Menu[] menus = {
            new Menu("Drinks", R.drawable.drinks),
            new Menu("Dishes", R.drawable.dishes),
            new Menu("Sweets", R.drawable.sweets),
            new Menu("Cold Drinks", R.drawable.cold_drinks),
            new Menu("Coffee Drinks", R.drawable.coffee_drinks),
            new Menu("Fresh Juices", R.drawable.fresh_drinks),


    };
    private Menu(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

}
