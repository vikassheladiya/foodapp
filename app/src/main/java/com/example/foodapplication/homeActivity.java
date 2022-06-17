package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homeActivity extends AppCompatActivity {
    CardView orderbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initview();
    }

    private void initview() {
        orderbtn=findViewById(R.id.orderbtn);
        orderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(homeActivity.this,orderActivity.class);
                startActivity(i);
            }
        });
    }


}