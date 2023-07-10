package com.example.celenganku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HalamanLogin extends AppCompatActivity {

    EditText Username,Password;
    Button BtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login);

        Username = findViewById(R.id.et_username);
        Password = findViewById(R.id.et_password);
        BtnLogin = findViewById(R.id.btn_login);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Tombol telah di Klik", Toast.LENGTH_SHORT).show();

                String username = Username.getText().toString().trim();
                String password = Password.getText().toString().trim();

                if(username.isEmpty()){
                    Username.setError("Username wajib diisi");
                    return;
                }
                if(password.isEmpty()){
                    Password.setError("Password wajib diisi");
                    return;
                }

                Intent intent = new Intent(HalamanLogin.this, HalamanDashboard.class);
                startActivity(intent);
            }
        });
    }
}