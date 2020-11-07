package com.example.propaganda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnSobreProg = (Button) findViewById(R.id.btnSobre);

        btnSobreProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Sobre.class);
                startActivity(it);
            }
        });

        Button btnTelProg = (Button) findViewById(R.id.btnTelefone);

        btnTelProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Telefone.class);
                startActivity(it);
            }
        });

    }
}