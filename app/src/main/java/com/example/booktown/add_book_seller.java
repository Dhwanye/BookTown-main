package com.example.booktown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class add_book_seller extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book_seller);
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);



        String[] arraySpinner = new String[] {
                "The Alchemist", "Harry Potter", "The Liberation Trilogy", "NMA", "AJAVA", "Mcad"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        String[] arrayISBN = new String[] {
                "9123456781021", "9133446781022", "9623476781023", "9128359781024"
        };
        Spinner s1 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayISBN);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter1);


        String[] arrayAuthor = new String[] {
                "J.K. Rowling", "R.K. Narayan", "Jane Austen", "Ruskin Bond", "Arundhati Roy"
        };
        Spinner s2 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayAuthor);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);


        String[] arrayCategory = new String[] {
                "Comedy", "Suspense", "Engineering", "Horror", "Fantasy", "Fiction", "History", "Crime" ,"Fairytale","Biography"
        };
        Spinner s3 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayCategory);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(adapter3);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.seller_menu_whole, menu);
        return true;
    }
}