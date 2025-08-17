package com.example.booktown;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    AlertDialog d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        d = new AlertDialog.Builder(login.this).create();
//        b = findViewById(R.id.button);

    }
    public void btnforget(View view)
    {
        try {
            Intent i = new Intent(this, forget_password.class);
            startActivity(i);
        }
        catch (Exception e)
        {
            d.setMessage(e.getMessage());
            d.show();
        }
    }
    public void btncreate(View view) {
        try {
            Intent i = new Intent(this, create_account.class);
            startActivity(i);
        }
        catch (Exception e)
        {
            d.setMessage(e.getMessage());
            d.show();
        }
    }
}