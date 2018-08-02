package com.example.calengray.mellanzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jobsButton = findViewById(R.id.jobsButton);
        Button emButton = findViewById(R.id.emButton);
        Button etButton = findViewById(R.id.etButton);
        Button goToLogin = findViewById(R.id.goToLogin);

        jobsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(MainActivity.this, JobsPage.class);
                startActivity(int1);

            }
        });

        emButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(MainActivity.this, emPage.class);
                startActivity(int2);

            }
        });

        etButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(MainActivity.this, etPage.class);
                startActivity(int3);

            }
        });

        goToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(MainActivity.this, loginPage.class);
                startActivity(int4);

            }
        });
    }

    public void onClick(View view) {

    }
}
