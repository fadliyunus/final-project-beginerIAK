package com.iak.aplikasicampusiak.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.iak.aplikasicampusiak.R;

public class LupapasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupapassword);

        TextView txtRegister = (TextView) findViewById(R.id.Register);

        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegistrasiActivity.class));
            }
        });
    }

    public void onClickButton(View v)
    {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
