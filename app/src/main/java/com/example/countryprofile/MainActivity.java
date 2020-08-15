package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bangladesh_button,india_button,pakisthan_button;
    private  Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladesh_button =(Button)findViewById(R.id.bangladeshButton);
        india_button =(Button)findViewById(R.id.indiaButton);
        pakisthan_button =(Button)findViewById(R.id.pakisthanButton);

        bangladesh_button.setOnClickListener(this);
        india_button.setOnClickListener(this);
        pakisthan_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bangladeshButton){
           intent = new Intent(MainActivity.this,ProfileActivity.class);
           intent.putExtra("name","bangladsh");
           startActivity(intent);
        }
        if(view.getId()==R.id.indiaButton){
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }
        if(view.getId()==R.id.pakisthanButton){
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","pakisthan");
            startActivity(intent);
        }
    }
}
