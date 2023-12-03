package com.example.gestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home_Client extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_client);
    }

    public void page_admin(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void OpenMain_client(View view) {
        Intent i = new Intent(this,Page_Client.class);
        startActivity(i);
    }
}