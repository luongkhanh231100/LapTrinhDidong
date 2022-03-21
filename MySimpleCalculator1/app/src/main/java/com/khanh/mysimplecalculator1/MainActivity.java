package com.khanh.mysimplecalculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Khai báo sẵn các đối tượng sẽ làm việc
    EditText editSoA, editSoB;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }
    void TimWidget(){
        editSoA = (EditText)findViewById(R.id.edSoA);
        editSoB = (EditText)findViewById(R.id.edSoB);
        textViewKetQua = (TextView)findViewById(R.id.tvKetQua);
        nutCong = (Button)findViewById(R.id.btCong);
        nutTru = (Button)findViewById(R.id.btTru);
        nutNhan = (Button)findViewById(R.id.btNhan);
        nutChia = (Button)findViewById(R.id.btChia);
    }

    //ham xu ly
    public void XuLyCong(View v) {
        //lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //
        int tong = a + b;
        //chuyen tong thanh chuoi
        String chuoiTong = String.valueOf(tong);
        //
        textViewKetQua.setText("KQ : " + chuoiTong);
    }

    public void XuLyTru(View v) {
        //lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //
        int tong = a - b;
        //chuyen tong thanh chuoi
        String chuoiTru = String.valueOf(tong);
        //
        textViewKetQua.setText("KQ : " + chuoiTru);
    }


    public void XuLyNhan(View v) {
        //lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //
        int nhan = a * b;
        //chuyen tong thanh chuoi
        String chuoiNhan = String.valueOf(nhan);
        //
        textViewKetQua.setText("KQ la : " + chuoiNhan);
    }


    public void XuLyChia(View v) {
        //lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //
        int chia = a / b;
        //chuyen tong thanh chuoi
        String chuoiChia = String.valueOf(chia);
        //
        textViewKetQua.setText("KQ : " + chuoiChia);
    }

}