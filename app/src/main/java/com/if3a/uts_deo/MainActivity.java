package com.if3a.uts_deo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNoPendaftar, etNama;
    private Spinner spPendftr;
    private CheckBox chConfirm;
    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNoPendaftar = findViewById(R.id.et_no_pendaftar);
        etNama = findViewById(R.id.et_nama);
        spPendftr = findViewById(R.id.sp_Pendaftar);
        chConfirm = findViewById(R.id.ch_Confirm);

        btnDaftar = findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NoPendaftar, Nama, Pendaftar, confirm;
                int selctedID;

                NoPendaftar= etNoPendaftar.getText().toString();
                Nama = etNama.getText().toString();
                Pendaftar = spPendftr.getSelectedItem().toString();
                confirm = chConfirm.getText().toString();

                if (NoPendaftar.trim().equals("")){
                    etNoPendaftar.setError("No Pendaftar Tidak Boleh Kosong");
                }
                else if(Nama.trim().equals("")){
                    etNama.setError("Nama Tidak Boleh Kosong");
                }
                else if(Pendaftar.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Jalur Pendaftaran Belum Dipilih", Toast.LENGTH_SHORT).show();
                }
                else if(confirm.trim().equals("")){
                    Toast.makeText(MainActivity.this, "Checkbock Belum DiCentang", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("varNoPendaftar", NoPendaftar);
                    intent.putExtra("varNama", Nama);
                    intent.putExtra("varPndftr", Pendaftar);
                    startActivity(intent);
                }

            }
        });

    }
}