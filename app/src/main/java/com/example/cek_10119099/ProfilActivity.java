package com.example.cek_10119099;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//Sandi Komara (10119099)-IF3
//Tanggal : 23-04-2022

public class ProfilActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil_activity);

        // inisialisasi view
        View decorView = getWindow().getDecorView();
        // Hide ActionBar
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }
    }
}
