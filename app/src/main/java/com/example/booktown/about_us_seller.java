package com.example.booktown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class about_us_seller extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_seller);
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.seller_menu_whole, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if(id == R.id.myorder)
        {
            Intent i = new Intent(this, seller_orders.class);
            startActivity(i);
        }
        else if(id == R.id.help)
        {
            Intent i = new Intent(this, help_seller.class);
            startActivity(i);
        }
        else if(id == R.id.logout)
        {
            Intent i = new Intent(this, login.class);
            startActivity(i);
        }
        else if(id == R.id.about)
        {
            Intent i = new Intent(this, about_us_seller.class);
            startActivity(i);
        }
        else if(id == R.id.addbook)
        {
            Intent i = new Intent(this, add_book_seller.class);
            startActivity(i);
        }

        return true;
    }
}