package com.example.barte.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button prosty =findViewById(R.id.Prosty);
        final Button zaawansowany =findViewById(R.id.Zaawansowany);
        final Button informacje =findViewById(R.id.Info);
        final Button wyjscie =findViewById(R.id.Exit);
        prosty.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), Prosty.class);
                startActivity(i);

            }
        });
        zaawansowany.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), Zaawansowany.class);
                startActivity(i);

            }
        });
        informacje.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), Informacje.class);
                startActivity(i);

            }
        });
        wyjscie.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                finishAndRemoveTask();

            }
        });
    }
}
