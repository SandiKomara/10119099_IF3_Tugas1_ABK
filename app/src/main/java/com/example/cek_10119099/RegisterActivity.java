package com.example.cek_10119099;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Sandi Komara (10119099)-IF3
//Tanggal : 23-04-2022

public class RegisterActivity extends AppCompatActivity{
        private Button btnRegis;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        // inisialisasi view
        View decorView = getWindow().getDecorView();
        // Hide ActionBar
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }
        btnRegis = findViewById(R.id.btnRegis);
        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
