package com.example.booktown;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.nio.channels.SelectableChannel;

public class SellerHome extends AppCompatActivity {
    private Toolbar toolbar;
    BottomNavigationView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_home);
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        b = findViewById(R.id.bottomnavbar);
        b.setSelectedItemId(R.id.home);
        b.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.search)
                {
                    Intent i = new Intent(SellerHome.this, Recommendation_seller.class);
                    startActivity(i);
                }
                else if(id == R.id.manage)
                {
                    Intent i = new Intent(SellerHome.this, manage_book_seller.class);
                    startActivity(i);
                }
                else if(id == R.id.profile)
                {
                    Intent i = new Intent(SellerHome.this, seller_my_profile.class);
                    startActivity(i);
                }
                return false;
            }
        });

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
        else if(id == R.id.edit)
        {
            Intent i = new Intent(this, edit_profile_seller.class);
            startActivity(i);
        }


        return true;
    }
    public void btnbookdetail(View view)
    {
        Intent i = new Intent(this, book_details_seller.class);
        startActivity(i);
    }
//    public void btnorder(View view)
//    {
//        Intent i = new Intent(this, seller_orders.class);
//        startActivity(i);
//    }
//    public void btnsellerprofile(View view)
//    {
//        Intent i = new Intent(this, seller_my_profile.class);
//        startActivity(i);
//    }
//    public void btnsearch(View view) {
//        Intent i = new Intent(this, Recommendation.class);
//        startActivity(i);
//    }
//    public void btnmanage(View view) {
//        Intent i = new Intent(this, manage_book_seller.class);
//        startActivity(i);
//    }
//    public void btnsellerhome(View view) {
//        Intent i = new Intent(this, SellerHome.class);
//        startActivity(i);
//    }
//    public void btnmyorder(View view) {
//        Intent i = new Intent(this, seller_orders.class);
//        startActivity(i);
//    }
//    public void btnhelp(View view) {
//        Intent i = new Intent(this, help_seller.class);
//        startActivity(i);
//    }
//    public void btnlogout(View view) {
//        Intent i = new Intent(this, login.class);
//        startActivity(i);
//    }
//    public void btnabout(View view) {
//        Intent i = new Intent(this,about_us_seller.class);
//        startActivity(i);
//    }
}