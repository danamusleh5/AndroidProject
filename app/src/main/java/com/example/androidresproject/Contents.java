package com.example.androidresproject;

import android.widget.Button;

public class Contents {

    private String name;
        private int imageID;

        public static final com.example.androidresproject.Contents[] contents = {
                new com.example.androidresproject.Contents("Our Menu", R.drawable.menu),
                new com.example.androidresproject.Contents("Reservation ", R.drawable.reservation2),
                new com.example.androidresproject.Contents("Order", R.drawable.order),
                new com.example.androidresproject.Contents("About Us", R.drawable.place),
                new com.example.androidresproject.Contents("Our Location", R.drawable.location),
                new com.example.androidresproject.Contents("Log In", R.drawable.login),



        };
        private Contents(String name, int imageID){
            this.name = name;
            this.imageID = imageID;
        }
        public String getName(){return name;}
        public int getImageID(){return imageID;}

    }



