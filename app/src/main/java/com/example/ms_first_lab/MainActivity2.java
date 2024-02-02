package com.example.ms_first_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {

    String groupMates[] = {"Kuanysh","Dastan", "Meirambek"};

    ListView listView;

    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), groupMates);
        listView.setAdapter(customBaseAdapter);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
             finish();
            }
        } );

    }
}