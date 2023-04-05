package com.example.mvmpkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvmpkullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private TextView textView;

private ActivityMainBinding tasarim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       tasarim= DataBindingUtil.setContentView(this,R.layout.activity_main);
  tasarim.textView.setText("0");
         tasarim.button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String alinan = tasarim.edit1.getText().toString();
                 String alinan1 = tasarim.edit2.getText().toString();
                 int sayi = Integer.parseInt(alinan);
                 int sayi1 = Integer.parseInt(alinan1);
                 int toplam=sayi+sayi1;
                 textView.setText(String.valueOf(toplam));
             }
         });
        tasarim.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alinan = tasarim.edit1.getText().toString();
                String alinan1 = tasarim.edit2.getText().toString();
                int sayi = Integer.parseInt(alinan);
                int sayi1 = Integer.parseInt(alinan1);
                int carp=sayi*sayi1;
                textView.setText(String.valueOf(carp));
            }
        });


    }
}