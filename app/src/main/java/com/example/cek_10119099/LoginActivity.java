package com.example.cek_10119099;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Sandi Komara (10119099)-IF3
//Tanggal : 23-04-2022

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private Button btn_regis;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        View decorView = getWindow().getDecorView();

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }
        btnLogin = findViewById(R.id.btn_Login);
        btn_regis = findViewById(R.id.btn_regis);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
