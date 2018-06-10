package com.example.tulior.vacinasonline;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.tulior.vacinasonline.utils.Utils;

public class LoginActivity extends AppCompatActivity {
    EditText informedCpf;
    EditText informedPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        informedCpf = findViewById(R.id.informedCpf);
        informedPassword = findViewById(R.id.informedPassword);
    }

    public void sendToRecoverAccount(View v) {
        Intent intent = new Intent(this, RecoverAccountActivity.class);
        startActivity(intent);
    }

    public void sendToCreateAccount(View v) {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void sendToMainMenu(View v) {

        if (TextUtils.isEmpty(informedCpf.getText().toString())) {
            Utils.ShowAlert(this, "Alerta!", "Cpf não informado!", "OK");
            return;
        }

        if (TextUtils.isEmpty(informedPassword.getText().toString())) {
            Utils.ShowAlert(this, "Alerta!", "Senha não informada!", "OK");
            return;
        }

        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);

    }
}
