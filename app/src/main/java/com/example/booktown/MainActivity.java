package com.example.booktown;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView b;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
                    Intent i = new Intent(MainActivity.this, Recommendation.class);
                    startActivity(i);
                }
                else if(id == R.id.cart)
                {
                    Intent i = new Intent(MainActivity.this, cart.class);
                    startActivity(i);
                }
                else if(id == R.id.profile)
                {
                    Intent i = new Intent(MainActivity.this, buyer_my_profile.class);
                    startActivity(i);
                }
                return false;
            }
        });





//        ImageButton ib1 = findViewById(R.id.i1), ib2 = findViewById(R.id.i2), ib3 = findViewById(R.id.i3), ib4 = findViewById(R.id.i4), ib5 = findViewById(R.id.i5);


//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
//            new BackgroundWorker(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
//        else
//            new BackgroundWorker(this).execute();
//
//        BackgroundWorker b = new BackgroundWorker(this);
//        b.execute();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.buyer_menu_whole, menu);
        return true;
    }
    public void btnbookdetail(View view)
    {
        Intent i = new Intent(this, book_details_specific.class);
        startActivity(i);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if(id == R.id.myorder)
        {
            Intent i = new Intent(this, buyer_ordered_books.class);
            startActivity(i);
        }
        else if(id == R.id.help)
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
        else if(id == R.id.manage)
        {
            Intent i = new Intent(this, manage_book_seller.class);
            startActivity(i);
        }
        else if(id == R.id.add)
        {
            Intent i = new Intent(this, add_book_seller.class);
            startActivity(i);
        }
        else if(id == R.id.category)
        {
            Intent i = new Intent(this, category_list.class);
            startActivity(i);
        }
        else if(id == R.id.subscription)
        {
            Intent i = new Intent(this, subscription.class);
            startActivity(i);
        }
        else if(id == R.id.sellingorder)
        {
            Intent i = new Intent(this, seller_orders.class);
            startActivity(i);
        }
        else if(id == R.id.edit)
        {
            Intent i = new Intent(this, edit_profile_buyer.class);
            startActivity(i);
        }
        else if(id == R.id.wishlist)
        {
            Intent i = new Intent(this, whishlist_buyer.class);
            startActivity(i);
        }
        return true;
    }
//    class BackgroundWorker extends AsyncTask<Void,Void,String> {
//        Context ctx;
//        AlertDialog d;
//        public BackgroundWorker(Context context)
//        {
//            ctx = context;
//        }
//        @Override
//        protected String doInBackground(Void...voids) {
//            String image="null";
//            int i = 0;
//            try {
//                String str = "https://192.168.1.208/DWPD_PHP/proj_conn.php";
//                URL u = new URL(str);
//                HttpsURLConnection http_conn = (HttpsURLConnection) u.openConnection();
//                http_conn.setRequestProperty("content-type", "text/html; charset=utf-8");
//                http_conn.setRequestMethod("GET");
//                http_conn.connect();
//                BufferedReader b =new BufferedReader(new InputStreamReader(http_conn.getInputStream()));
//                image = b.readLine();
//            image=String.valueOf(http_conn.getResponseCode());
//

//            if(http_conn.getResponseCode() == http_conn.HTTP_OK) {
//            InputStream inp = http_conn.getInputStream();
////                BufferedReader br = new BufferedReader(new InputStreamReader(inp,"iso-8859-1"));
////                while ((image = br.readLine()) != null) {
////                    byte[] decodedString = Base64.decode(image, Base64.DEFAULT);
////                    Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
////                    ib5.setImageBitmap(decodedByte);
////
////                }
////                image = br.readLine();
//            }
//            if (http_conn != null){
//                http_conn.disconnect();
//            }
//            } catch (Exception e) {
//                d.setMessage(e.getMessage());
//                d.show();
//            }
//            return image;
//        }
////
////        @Override
////        protected void onPreExecute() {
////            d = new AlertDialog.Builder(ctx).create();
////        }
////
////        @Override
////        protected void onPostExecute(String s) {
////            d.setMessage(s);
////            d.show();
////        }
////
////        @Override
////        protected void onProgressUpdate(Void... values) {
////            super.onProgressUpdate(values);
////        }
//    }


}