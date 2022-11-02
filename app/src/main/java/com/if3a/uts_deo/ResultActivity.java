package com.if3a.uts_deo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView tvNoPendaftar, tvNama, tvPndftr, confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvNoPendaftar = findViewById(R.id.tv_noPendaftar);
        tvNama = findViewById(R.id.tv_nama);
        tvPndftr = findViewById(R.id.tv_jalurPendaftaran);
        Intent intent = getIntent();
        tvNoPendaftar.setText(intent.getStringExtra("varNoPendaftar"));
        tvNama.setText(intent.getStringExtra("varNama"));
        tvPndftr.setText(intent.getStringExtra("varPndftr"));

    }
}