package com.khanh.a60135826_bai18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView LvName;
    ArrayList<String> arrayCourse;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        LvName =(ListView) findViewById(R.id.lvName);
        arrayCourse =new ArrayList<>();
        arrayCourse.add("bao");
        arrayCourse.add("bin");
        arrayCourse.add("beo");
        arrayCourse.add("bo");

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayCourse
        );

        LvName.setAdapter(adapter);
        //
        LvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv.setText("Position: "+i+ "; Value=" +arrayCourse.get(i));
            }
        });

    }
}