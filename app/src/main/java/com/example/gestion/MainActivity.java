package com.example.gestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nom;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // card = findViewById(R.id.card);
    }

    public void OpenMain(View view) {
        nom = (EditText)findViewById(R.id.nom);
        password = (EditText)findViewById(R.id.password);
        String Snom      =  nom.getText().toString();
        String Spass     =  password.getText().toString();

//        if ((Snom.equals("souhaib"))&&(Spass.equals("admin"))){



            Intent i = new Intent(this,MainActivity2.class);

            startActivity(i);
//        }

    }

    public void page_client(View view) {
        Intent i = new Intent(this,Home_Client.class);
        startActivity(i);
    }
}