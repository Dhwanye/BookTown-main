package com.example.booktown;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DeliveryPerson extends AppCompatActivity {
    private Toolbar toolbar;
    BottomNavigationView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_person);
        toolbar = findViewById(R.id.tool_deliver);
        setSupportActionBar(toolbar);


        b = findViewById(R.id.bottomnavbar);
        b.setSelectedItemId(R.id.home);
        b.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.completed)
                {
                    Intent i = new Intent(DeliveryPerson.this, Delivery_person_order_completed.class);
                    startActivity(i);
                }
                else if(id == R.id.leftd)
                {
                    Intent i = new Intent(DeliveryPerson.this, Delivery_person_orders_left.class);
                    startActivity(i);
                }
                else if(id == R.id.profile)
                {
                    Intent i = new Intent(DeliveryPerson.this, delivery_my_profile.class);
                    startActivity(i);
                }
                return false;
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.delivery_menu_whole, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if(id == R.id.help)
        {
            Intent i = new Intent(this, help.class);
            startActivity(i);
        }
        else if(id == R.id.logout)
        {
            Intent i = new Intent(this, login.class);
            startActivity(i);
        }
        else if(id == R.id.about)
        {
            Intent i = new Intent(this, about_us_buyer.class);
            startActivity(i);
        }
        else if(id == R.id.edit)
        {
            Intent i = new Intent(this,edit_profile_delivery.class);
            startActivity(i);
        }
        return true;
    }

}