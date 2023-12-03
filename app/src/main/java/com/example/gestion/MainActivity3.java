package com.example.gestion;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity3 extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST=1;
    Button fermer;
    BottomNavigationView navBar;
    ImageView img ;
    Uri urlImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        img = findViewById(R.id.image_view_1);
        Spinner dropdown = findViewById(R.id.spinner1);
        String[] items = new String[]{"1", "2", "three"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.style_spinner_1, items);
        adapter.setDropDownViewResource(R.layout.style_spinner_down);
        dropdown.setAdapter(adapter);

        fermer =  findViewById(R.id.fermer) ;

        fermer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent ii = new Intent( MainActivity3.this,MainActivity2.class);
                MainActivity3.this.startActivity(ii);
            }
        });



        navBar = findViewById(R.id.id_navBar);
        navBar.setSelectedItemId(R.id.ico_add);

        navBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.ico_home:
                        Intent i_home = new Intent(MainActivity3.this,MainActivity2.class);
                        startActivity(i_home);
                        break;

                    case R.id.ico_add:
                        Intent i_add = new Intent(MainActivity3.this,Liste_Produits.class);
                        startActivity(i_add);
                        break;

                    case R.id.ico_seting:
                        Intent i_seting = new Intent(MainActivity3.this,MainActivity6.class);
                        startActivity(i_seting);
                        break;

                    default:
                }

                return true;
            }
        });

    }

    public void addctgr(View view) {
        Intent i = new Intent(this,MainActivity4.class);
        startActivity(i);
    }

    public void choseImage(View view) {
        openFileImage();
    }
    public void openFileImage(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==PICK_IMAGE_REQUEST && resultCode== RESULT_OK
                && data != null && data.getData()!=null){
            urlImage = data.getData();
            img.setImageURI(urlImage);
        }
    }

}