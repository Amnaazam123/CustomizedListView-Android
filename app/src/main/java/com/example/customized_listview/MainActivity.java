package com.example.customized_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(new Student("Ali", "Alpha", "1", R.drawable.a));
        studentArrayList.add(new Student("Saad", "Beta", "2", R.drawable.b));
        studentArrayList.add(new Student("Aila", "Alpha", "5", R.drawable.c));
        studentArrayList.add(new Student("Aiman", "Beta", "6", R.drawable.d));
        MyAdapter adapter = new MyAdapter(this, studentArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
}