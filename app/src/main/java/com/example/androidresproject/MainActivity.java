package com.example.androidresproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recycler = findViewById(R.id.restaurant_recycler);
        String[] captions = new String[Contents.contents.length];
        int[] ids = new int[Contents.contents.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = Contents.contents[i].getName();
            ids[i] = Contents.contents[i].getImageID();
        }
        GridLayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recycler.setLayoutManager(mLayoutManager);
//        recycler.setLayoutManager(new GridLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);


    }


//    CardView card_view = (CardView) findViewById(R.id.card_view);
//
//          card_view.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
//        }
//    });
//


}
