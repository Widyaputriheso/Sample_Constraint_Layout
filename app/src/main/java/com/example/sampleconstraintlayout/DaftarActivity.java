package com.example.sampleconstraintlayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {
    EditText edNama, adAlamat, edEmail, edPassword, edrepass;
    FloatingActionButton fab;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view) {
                if (edNama.getText().toString().isEmpty() ||
                        edAlamat.getText().toString().isEmpty() ||
                        edEmail.getText().toString().isEmpty() ||
                        edPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty()) {
                    Snackbar.make(view, "wajib isi seluruh data!!!", Snackbar.LENGTH_LONG).show();
                }
                else {
                    if (edtPassword.getText().toString().equals(edtrapass.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil...",
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                     Snackbar.make(view, "Password dan Repassword harus sama!!!",
                             Snackbar.LENGTH_LONG);

                    }
                )
            }

        });

    }
}
