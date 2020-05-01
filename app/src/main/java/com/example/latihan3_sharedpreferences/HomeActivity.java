package com.example.latihan3_sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import utils.Preferences;

/*

Nama  : M Izzudin Wijaya
Nim : 10117152
Waktu : 1 Mei 2020, 09.00 WIB

 */

public class HomeActivity extends AppCompatActivity {

    private TextView txtKeluar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clear Set Preferences
                Preferences.setLogout(getBaseContext());

                //Pindah Halaman ke Login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });
    }

    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
