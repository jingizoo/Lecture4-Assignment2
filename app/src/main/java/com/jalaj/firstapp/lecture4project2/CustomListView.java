package com.jalaj.firstapp.lecture4project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.jalaj.firstapp.lecture4project2.adapter.StudentAdapter;

import java.util.ArrayList;
import java.util.List;

public class CustomListView extends AppCompatActivity {



    ListView lView;
    ArrayList<Student> aList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_custom);

        lView = (ListView)findViewById(R.id.studentListView);
        aList = new ArrayList<>();
        aList.add(new Student("Gopal","+919945642303"));
        aList.add(new Student("Ram","+919945642303"));
        aList.add(new Student("Abdullah","+919945642303"));

        StudentAdapter studentAdapter = new StudentAdapter(aList, this);
        lView.setAdapter(studentAdapter);

    }
}
