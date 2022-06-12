package com.example.androidresproject;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_type);

        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("menu_id");

        Menu drink = Menu.menus[id];

        ImageView image = (ImageView)findViewById(R.id.typeImage);
        image.setImageResource(drink.getImageID());

        TextView txtName= (TextView)findViewById(R.id.typeName);
        TextView txtDesc= (TextView)findViewById(R.id.txtDesc);

        txtName.setText(drink.getName());
       // txtDesc.setText(drink.getDescription());
    }


}