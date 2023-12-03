package com.example.gestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Page_Client extends AppCompatActivity {
    BottomNavigationView navBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_client);

        navBar = findViewById(R.id.id_navBar);
        navBar.setSelectedItemId(R.id.ico_home);


    }

    public void liste_prd_cln(View view) {
        Intent i = new Intent(this,Liste_Produits.class);
        startActivity(i);
    }
}