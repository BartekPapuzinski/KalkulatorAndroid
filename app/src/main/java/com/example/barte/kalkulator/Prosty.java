package com.example.barte.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Prosty extends AppCompatActivity {

    final Kalkulator kalkulator = new Kalkulator();
    String wysw="";
    boolean dzialanieuz=false;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prosty);

        final TextView wyswietlacz = findViewById(R.id.Wyswietlacz);
        final Button przycisk0 =findViewById(R.id.Przycisk0);
        final Button przycisk1 =findViewById(R.id.Przycisk1);
        final Button przycisk2 =findViewById(R.id.Przycisk2);
        final Button przycisk3 =findViewById(R.id.Przycisk3);
        final Button przycisk4 =findViewById(R.id.Przycisk4);
        final Button przycisk5 =findViewById(R.id.Przycisk5);
        final Button przycisk6 =findViewById(R.id.Przycisk6);
        final Button przycisk7 =findViewById(R.id.Przycisk7);
        final Button przycisk8 =findViewById(R.id.Przycisk8);
        final Button przycisk9 =findViewById(R.id.Przycisk9);
        final Button przyciskkropka =findViewById(R.id.PrzyciskKropka);
        final Button przyciskac =findViewById(R.id.PrzyciskAC);
        final Button przyciskc =findViewById(R.id.PrzyciskC);
        final Button przyciskplus =findViewById(R.id.PrzyciskPlus);
        final Button przyciskminus =findViewById(R.id.PrzyciskMinus);
        final Button przyciskrazy =findViewById(R.id.PrzyciskRazy);
        final Button przyciskdzielenie =findViewById(R.id.PrzyciskDzielenie);
        final Button przyciskrowna =findViewById(R.id.PrzyciskRowna);
        final Button przyciskplusminus =findViewById(R.id.PrzyciskPlusMinus);

        przycisk0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("0",wyswietlacz);

            }
        });
        przycisk1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("1",wyswietlacz);

            }
        });
        przycisk2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("2",wyswietlacz);

            }
        });
        przycisk3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("3",wyswietlacz);

            }
        });
        przycisk4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("4",wyswietlacz);

            }
        });
        przycisk5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("5",wyswietlacz);

            }
        });
        przycisk6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("6",wyswietlacz);

            }
        });
        przycisk7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("7",wyswietlacz);

            }
        });
        przycisk8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("8",wyswietlacz);

            }
        });
        przycisk9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby("9",wyswietlacz);

            }
        });
        przyciskkropka.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int x=wysw.indexOf(".");
                if(x==(-1))
                {
                    if(wyswietlacz.length()==0) {
                        liczby("0.", wyswietlacz);
                    }
                    else{
                        liczby(".", wyswietlacz);
                    }
            }


            }
        });
        przyciskac.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wysw="";
                dzialanieuz=true;
                wyswietlacz.setText(wysw);

            }
        });
        przyciskc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                    if(!wysw.equals("")) {
                        String[] temp = wysw.split(" ");
                        wysw="";
                        for(int i=0;i<temp.length-1;i++)
                        {
                            if(i==temp.length-1){
                                wysw+=temp[i];
                            }
                            else {
                                wysw += temp[i] + " ";
                            }
                        }
                        if(temp[temp.length]=="+" || temp[temp.length]=="-" || temp[temp.length]=="*" || temp[temp.length]=="/"){
                            dzialanieuz=false;
                        }
                        wyswietlacz.setText(wysw);
                    }


            }
        });

        przyciskplus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(dzialanieuz==true){

                }
                else {

                    wysw += " + ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz=true;
                }

            }
        });
        przyciskminus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuz==true){
                    wysw += "-";
                    wyswietlacz.setText(wysw);
                    dzialanieuz = false;
                }
                else {
                    wysw += " - ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz = true;
                }

            }
        });
        przyciskrazy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuz==true){

                }
                else {

                    wysw += " * ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz=true;
                }

            }
        });
        przyciskdzielenie.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuz==true){

                }
                else {

                    wysw += " / ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz=true;
                }

            }

        });
        przyciskrowna.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String temp=kalkulator.rowna(wysw);
                wysw=temp;
                wyswietlacz.setText(wysw);
                dzialanieuz=true;
            }
        });

    }

    private void liczby(String a,TextView wyswietlacz) {
        dzialanieuz=false;
        wysw=wysw+a;
        wyswietlacz.setText(wysw);
    }


}
