package com.example.cek_10119099;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Sandi Komara (10119099)-IF3
//Tanggal : 23-04-2022

public class MainActivity extends AppCompatActivity {
    private Button btn_logout;
    private Button btn_profil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }

        btn_profil = findViewById(R.id.btn_profil);
        btn_logout = findViewById(R.id.btn_logout);

        btn_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}