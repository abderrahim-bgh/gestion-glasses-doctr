package com.example.gestion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity2 extends AppCompatActivity {

    TextView user ;
    BottomNavigationView navBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        navBar = findViewById(R.id.id_navBar);
        navBar.setSelectedItemId(R.id.ico_home);

        navBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.ico_home:
                        Intent i_home = new Intent(MainActivity2.this,MainActivity2.class);
                        startActivity(i_home);
                        break;

                    case R.id.ico_add:
                        Intent i_add = new Intent(MainActivity2.this,Liste_Produits.class);
                        startActivity(i_add);
                        break;

                    case R.id.ico_seting:
                        Intent i_seting = new Intent(MainActivity2.this,MainActivity6.class);
                        startActivity(i_seting);
                        break;
                }

                return true;
            }
        });


    }

    public void addproduit(View view) {

        Intent i = new Intent(this,MainActivity3.class);
        startActivity(i);

    }

    public void AppCompat(View view) {
        Intent i = new Intent(this,MainActivity6.class);
        startActivity(i);
    }

    public void liste(View view) {
        Intent i = new Intent(this,Listes_Prd_Client.class);
        startActivity(i);
    }
}