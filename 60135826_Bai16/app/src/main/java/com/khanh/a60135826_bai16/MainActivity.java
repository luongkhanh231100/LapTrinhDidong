package com.khanh.a60135826_bai16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ListView lvName;
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] app_name = getResources().getStringArray(R.array.Name);
        lvName = (ListView) findViewById(R.id.lv);
        tvName = (TextView) findViewById(R.id.tv);

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,app_name

        );
        lvName.setAdapter(adapter);
        //
        lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tvName.setText("Position: "+i+ "; Value=" +app_name[i]);
            }
        });
    }
}