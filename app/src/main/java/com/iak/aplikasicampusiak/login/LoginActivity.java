package com.iak.aplikasicampusiak.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.iak.aplikasicampusiak.MainActivity;
import com.iak.aplikasicampusiak.R;

public class LoginActivity extends AppCompatActivity {

    EditText txtUsername, txtPassword;
    TextView txtAlert, txtLupaPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsername = (EditText) findViewById(R.id.mTxtUsername);
        txtPassword = (EditText) findViewById(R.id.mTxtPassword);
        txtLupaPassword = (TextView) findViewById(R.id.mTxtLupaPassword);

        txtAlert = (TextView) findViewById(R.id.mTxtAlert);
        txtAlert.setVisibility(View.GONE);

        txtLupaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LupapasswordActivity.class));
            }
        });
    }

    //pada saat Button Register di Klik
    public void onClickRegister(View v)
    {
        startActivity(new Intent(this, RegistrasiActivity.class));
    }

    //pada saat Button Login di Klik
    public void onClickLogin(View v)
    {
        String user = txtUsername.getText().toString();
        String pass = txtPassword.getText().toString();
        if (user.length() > 0)
        {
            if (pass.length() > 0)
            {
                reset();

                //pindah ke halaman home
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("username", user);
                startActivity(intent);
                finish();
            }
            else
            {
                gagalMasuk();
            }
        }
        else
        {
            gagalMasuk();
        }
    }

    //pada saat CheckBox Lihat Password active
    public void onClickLihatPassword(View v)
    {
        CheckBox chk = (CheckBox) findViewById(R.id.mChkLihatPassword);

        if (chk.isChecked())
        {
            txtPassword.setTransformationMethod(null);
        }
        else
        {
            txtPassword.setTransformationMethod(new PasswordTransformationMethod());
        }
    }

    private void gagalMasuk()
    {
        txtAlert.setVisibility(View.VISIBLE);
    }

    private void reset()
    {
        txtUsername.setText("");
        txtPassword.setText("");
        txtAlert.setVisibility(View.GONE);
    }
}
