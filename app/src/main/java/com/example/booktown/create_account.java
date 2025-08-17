package com.example.booktown;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;

public class create_account extends AppCompatActivity {
    public RadioButton r1,r2,r3;
    AlertDialog d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        r1 = findViewById(R.id.radioButton3);
        r2 = findViewById(R.id.radioButton);
        r3 = findViewById(R.id.radioButton2);

        String[] arraySpinner = new String[]{
                "Select State", "Gujarat", "Kashmir", "Rajasthan","Andhra Pradesh"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        String[] arrayISBN = new String[]{
                "Select City", "Ahmedabad", "Kutch","Rajkot"
        };
        Spinner s1 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayISBN);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter1);


        String[] arrayAuthor = new String[]{
                "Select Pin", "380024", "380021"
        };
        Spinner s2 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayAuthor);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);

        String[] arr = new String[]{
                "Select Nearby Area", "Bapunagar", "Kalupur", "Ambavadi"
        };
        Spinner s3 = (Spinner) findViewById(R.id.spinner10);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(adapter3);
        d = new AlertDialog.Builder(create_account.this).create();
    }
    public void btnhome(View view)
    {
        try {
            if(r1.isChecked() == true) {
                Intent i = new Intent(this, DeliveryPerson.class);
                startActivity(i);
            }
            else if(r3.isChecked() == true)
            {
                Intent i = new Intent(this, create_seller_company_info.class);
                startActivity(i);
            }
            else
            {
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
            }
        }
        catch (Exception e)
        {
            d.setMessage(e.getMessage());
            d.show();
        }
    }
}