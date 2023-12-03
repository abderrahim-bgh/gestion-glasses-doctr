package com.example.gestion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity6 extends AppCompatActivity {

    BottomNavigationView navBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        navBar = findViewById(R.id.id_navBar);
        navBar.setSelectedItemId(R.id.ico_seting);

        navBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.ico_home:


                        Intent i_home = new Intent(MainActivity6.this,MainActivity2.class);
                        startActivity(i_home);
                        break;

                    case R.id.ico_add:
                        Intent i_add = new Intent(MainActivity6.this,Liste_Produits.class);
                        startActivity(i_add);
                        break;

                    case R.id.ico_seting:
                        Intent i_seting = new Intent(MainActivity6.this,MainActivity6.class);
                        startActivity(i_seting);
                        break;

                    default:
                }

                return true;
            }
        });


    }

    public void addclient(View view) {
        Intent i = new Intent(this,MainActivity5.class);
        startActivity(i);
    }

    public void onHome(View view) {
        Intent i = new Intent(this,MainActivity2.class);
        startActivity(i);
    }

    public void addFor(View view) {
        Intent i = new Intent(this,fornis.class);
        startActivity(i);
    }

    public void addCompte(View view) {
        Intent i = new Intent(this,Compte.class);
        startActivity(i);
    }
}