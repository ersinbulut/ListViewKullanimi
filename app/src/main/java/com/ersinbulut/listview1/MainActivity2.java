package com.ersinbulut.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
    ListView listView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /*Diğer aktivity den gelen değer karşılanır*/
        Intent gelenIntent =getIntent();
        int index = gelenIntent.getIntExtra("position",0);
        /**/

        listView2 = findViewById(R.id.listView2);
        ArrayAdapter<String> arrayAdapter2 =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Depo.ilceler[index]);
        listView2.setAdapter(arrayAdapter2);
    }
}