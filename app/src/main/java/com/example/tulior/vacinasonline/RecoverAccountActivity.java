package com.example.tulior.vacinasonline;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.tulior.vacinasonline.utils.Utils;

public class RecoverAccountActivity extends AppCompatActivity {
    EditText cpf = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover_account);

        cpf = (EditText) findViewById(R.id.cpf);
    }

    public void sendToLoginAccount(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void sendEmailToRecoverAccount(View v) {
        String message = "";

        if (TextUtils.isEmpty(cpf.getText().toString())) {
            message = "CPF Não Informado!";

        } else {
            message = "Foi enviado para o seu e-mail de cadastro uma nova senha.";
        }

        Utils.ShowAlert(this, "Senha de recuperação", message, "OK");
    }
}
