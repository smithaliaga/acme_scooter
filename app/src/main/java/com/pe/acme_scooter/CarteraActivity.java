package com.pe.acme_scooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class CarteraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartera);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_principal:
                Log.i("====>","Click en principal!!");
                finish();
                Intent principal = new Intent(this,  MainActivity.class);
                startActivity(principal);
                return true;
            case R.id.menu_cartera:
                Log.i("====>","Click en cartera!!");
                finish();
                Intent cartera = new Intent(this, CarteraActivity.class);
                startActivity(cartera);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
