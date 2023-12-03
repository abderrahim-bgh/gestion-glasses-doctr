package com.example.gestion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    ListView list;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    EditText edit ;
    ImageView img;
  //  ImageView home;
      BottomNavigationView navBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        edit = findViewById(R.id.edit_1);
        img = findViewById(R.id.add);
       // home = findViewById(R.id.home);

        list = findViewById(R.id.listeview);
        items = new ArrayList<>();
        items.add("Homme _ Adulte");
        items.add("Femme _ Adulte");
        items.add("Homme _ Enfant");
        items.add("Femme _ Enfant");

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,items);
        list.setAdapter(adapter);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = edit.getText().toString();
                if (text == null || text.length() == 0) {
                    makeT("Enter");
                }else {
                    addItem(text);
                    makeT(text);
                }
            }
        });



        navBar = findViewById(R.id.id_navBar);
        navBar.setSelectedItemId(R.id.ico_add);

        navBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.ico_home:
                        Intent i_home = new Intent(MainActivity4.this,MainActivity2.class);
                        startActivity(i_home);
                        break;

                    case R.id.ico_add:
                        Intent i_add = new Intent(MainActivity4.this,Liste_Produits.class);
                        startActivity(i_add);
                        break;

                    case R.id.ico_seting:
                        Intent i_seting = new Intent(MainActivity4.this,MainActivity6.class);
                        startActivity(i_seting);
                        break;

                    default:
                }

                return true;
            }
        });

    }

    public void addItem(String item){
        items.add(item);
        list.setAdapter(adapter);
    }

    //afficher message
    Toast t ;
    private  void makeT(String s){
        if (t != null) t.cancel();
        t = Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT);
        t.show();
    }

    public void onHome(View view) {
        Intent i = new Intent(this,MainActivity3.class);
        startActivity(i);
    }
}