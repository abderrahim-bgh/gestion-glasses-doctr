package com.example.gestion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity5 extends AppCompatActivity {
    BottomNavigationView navBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);



        navBar = findViewById(R.id.id_navBar);
        navBar.setSelectedItemId(R.id.ico_seting);

        navBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.ico_home:
                        Intent i_home = new Intent(MainActivity5.this,MainActivity2.class);
                        startActivity(i_home);
                        break;

                    case R.id.ico_add:
                        Intent i_add = new Intent(MainActivity5.this,Liste_Produits.class);
                        startActivity(i_add);
                        break;

                    case R.id.ico_seting:
                        Intent i_seting = new Intent(MainActivity5.this,MainActivity6.class);
                        startActivity(i_seting);
                        break;

                    default:
                }

                return true;
            }
        });
    }

    public void fermercompt(View view) {
        Intent i = new Intent(this,MainActivity6.class);
        startActivity(i);
    }
}