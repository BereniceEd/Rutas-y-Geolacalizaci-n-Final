package com.example.mapasprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MenuInicial extends AppCompatActivity {
   EditText la, lo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);
        la = findViewById(R.id.editText8);
        lo = findViewById(R.id.editText5);
    }
    public void aceptar(View view){
        double latitud =Double.parseDouble(la.getText().toString());
     Variables.latitud =latitud;
     Variables.longitud = Double.parseDouble(lo.getText().toString());
        Intent intent= new Intent(MenuInicial.this, MapsActivity.class);
        startActivity(intent);

    }
}
