package com.example.customized_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student("Amna","2","se19",R.drawable.a));
        arraylist.add(new Student("Arshia","3","se19",R.drawable.b));
        arraylist.add(new Student("Arooj","4","se19",R.drawable.c));
        arraylist.add(new Student("Ahmed","5","se19",R.drawable.d));

        ArrayAdapter list = new ArrayAdapter(this,0,arraylist);
        listview.setAdapter(list);

    }
}