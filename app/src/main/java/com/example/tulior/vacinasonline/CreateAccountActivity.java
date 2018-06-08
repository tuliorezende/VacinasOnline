package com.example.tulior.vacinasonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.tulior.vacinasonline.utils.Utils;

public class CreateAccountActivity extends AppCompatActivity {

    EditText userName;
    EditText userCpf;
    EditText userEmail;
    EditText userPassword;
    EditText userConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);


        userName = (EditText) findViewById(R.id.userName);
        userCpf = (EditText) findViewById(R.id.userCpf);
        userEmail = (EditText) findViewById(R.id.userEmail);
        userPassword = (EditText) findViewById(R.id.userPassword);
        userConfirmPassword = (EditText) findViewById(R.id.userConfirmPassword);
    }

    public void sendToAlert(View v) {

        String title = "Atenção!";
        String positiveButton = "OK";

        if (TextUtils.isEmpty(userName.getText().toString())) {
            Utils.ShowAlert(this, title, "Nome não informado!", positiveButton);
            return;
        }

        if (TextUtils.isEmpty(userCpf.getText().toString())) {
            Utils.ShowAlert(this, title, "CPF não informado!", positiveButton);
            return;
        }

        if (TextUtils.isEmpty(userEmail.getText().toString())) {
            Utils.ShowAlert(this, title, "E-mail não informado!", positiveButton);
            return;
        }

        if (TextUtils.isEmpty(userPassword.getText().toString())) {
            Utils.ShowAlert(this, title, "Senha não informada!", positiveButton);
            return;
        }

        if (TextUtils.isEmpty(userConfirmPassword.getText().toString())) {
            Utils.ShowAlert(this, title, "Confirmação de Senha não informada!", positiveButton);
            return;
        }

        if (!TextUtils.equals(userPassword.getText().toString(), userConfirmPassword.getText().toString())) {
            Utils.ShowAlert(this, title, "Senhas não conferem!", positiveButton);
            return;
        }

        Intent intent = new Intent(this, ReminderActivity.class);
        startActivity(intent);

    }
}
