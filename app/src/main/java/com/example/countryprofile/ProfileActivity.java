package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = (ImageView) findViewById(R.id.ImageViewId);
        textView = (TextView) findViewById(R.id.textviewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }
    }

    void showDetails(String countryName){
        if (countryName.equals("bangladsh")){
            imageView.setImageResource(R.drawable.bangladesh2);
            textView.setText(R.string.bangladesh_text);
        }
        if (countryName.equals("india")){
            imageView.setImageResource(R.drawable.india2);
            textView.setText(R.string.india_text);
        }
        if (countryName.equals("pakisthan")){
            imageView.setImageResource(R.drawable.pakisthan2);
            textView.setText(R.string.paksithan_text);
        }
    }
}
