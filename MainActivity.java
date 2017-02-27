package com.example.akpinar.hspmkns;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akpinar.hspmkns.R;


public class MainActivity extends AppCompatActivity {
    EditText etSayi1,etSayi2;
    TextView tvSonuc;
    Double s1,s2,sonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSayi1=(EditText) findViewById(R.id.etSayi1);
        etSayi2=(EditText) findViewById(R.id.etSayi2);
        tvSonuc=(TextView) findViewById(R.id.tvSonuc);
    }

    public void Carp(View view) {
        s1=Double.parseDouble(etSayi1.getText().toString());
        s2=Double.parseDouble(etSayi2.getText().toString());
        sonuc=s1*s2;
        tvSonuc.setText(" "+sonuc);
    }

    public void Cikar(View view){
        s1=Double.parseDouble(etSayi1.getText().toString());
        s2=Double.parseDouble(etSayi2.getText().toString());
        sonuc=s1-s2;
        tvSonuc.setText(" "+sonuc);
}

    public void Böl(View view) {
        s1=Double.parseDouble(etSayi1.getText().toString());
        s2=Double.parseDouble(etSayi2.getText().toString());
        if(s2.equals(0.0))
        {
            Toast.makeText(this, "0 değerine bölünemez", Toast.LENGTH_SHORT).show();
            tvSonuc.setText(" SONUÇ ");
        }
        else
        {
            sonuc=s1/s2;
            tvSonuc.setText(" "+sonuc);
        }
    }

    public void Topla(View view) {
        s1=Double.parseDouble(etSayi1.getText().toString());
        s2=Double.parseDouble(etSayi2.getText().toString());
        sonuc=s1+s2;
        tvSonuc.setText(" "+sonuc);
    }

    public void Mod(View view) {
        s1=Double.parseDouble(etSayi1.getText().toString());
        s2=Double.parseDouble(etSayi2.getText().toString());
        if(s2.equals(0.0))
        {
            Toast.makeText(this, "0 değeri girilemez", Toast.LENGTH_SHORT).show();
            tvSonuc.setText(" SONUÇ ");
        }
        else
        {
            sonuc=s1%s2;
            tvSonuc.setText(" "+sonuc);
        }
    }
}
