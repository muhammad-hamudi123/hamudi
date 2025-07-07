package com.example.mysimpelapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnBiodata, btnPendidikan, btnAktivitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBiodata = findViewById(R.id.btnBiodata);
        btnPendidikan = findViewById(R.id.btnPendidikan);
        btnAktivitas = findViewById(R.id.btnAktivitas);

        btnBiodata.setOnClickListener(v -> startActivity(new Intent(this, BiodataActivity.class)));
        btnPendidikan.setOnClickListener(v -> startActivity(new Intent(this, PendidikanActivity.class)));
        btnAktivitas.setOnClickListener(v -> startActivity(new Intent(this, AktivitasActivity.class)));
    }
}
