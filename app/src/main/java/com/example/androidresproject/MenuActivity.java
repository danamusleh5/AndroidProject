package com.example.androidresproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_type);
        ArrayAdapter<Menu> listAdapter = new ArrayAdapter<Menu>(this,
                android.R.layout.simple_list_item_1,
                Menu.menus);

        ListView listView = (ListView)findViewById(R.id.menus_list);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(MenuActivity.this,
                        TypeActivity.class);
                intent.putExtra("menu_id", (int)id);
                startActivity(intent);

            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}