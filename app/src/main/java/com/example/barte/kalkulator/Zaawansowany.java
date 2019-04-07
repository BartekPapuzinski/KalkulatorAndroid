package com.example.barte.kalkulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Zaawansowany extends AppCompatActivity {

    String wysw="";
    String dzialanie="";
    boolean dzialanieuz=true;
    boolean trygonometria =false;
    boolean minus=true;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("wysw",wysw);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String wysw1 = savedInstanceState.getString("wysw");
        wysw=wysw1;
        final TextView wyswietlacz = findViewById(R.id.Wyswietlacz);
        wyswietlacz.setText(wysw);
        super.onRestoreInstanceState(savedInstanceState);
    }


    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zaawansowany);


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
        final Button przyciskpi =findViewById(R.id.PrzyciskPi);
        final Button przyciskkropka =findViewById(R.id.PrzyciskKropka);
        final Button przyciskac =findViewById(R.id.PrzyciskAC);
        final Button przyciskc =findViewById(R.id.PrzyciskC);
        final Button przyciskplus =findViewById(R.id.PrzyciskPlus);
        final Button przyciskminus =findViewById(R.id.PrzyciskMinus);
        final Button przyciskrazy =findViewById(R.id.PrzyciskRazy);
        final Button przyciskdzielenie =findViewById(R.id.PrzyciskDzielenie);
        final Button przyciskrowna =findViewById(R.id.PrzyciskRowna);
        final Button przyciskplusminus =findViewById(R.id.PrzyciskPlusMinus);
        final Button przycisksqrt =findViewById(R.id.PrzyciskSqrt);
        final Button przyciskxdo2 =findViewById(R.id.PrzyciskXdo2);
        final Button przycisksin =findViewById(R.id.PrzyciskSin);
        final Button przyciskcos =findViewById(R.id.PrzyciskCos);

        final Kalkulator kalkulator = new Kalkulator();
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
        przyciskpi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Double a= Math.PI;
                String pi=a.toString();
                liczby(pi,wyswietlacz);

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
                dzialanie="";
                wyswietlacz.setText(wysw);

            }
        });
        przyciskc.setOnClickListener(new View.OnClickListener()//todo
        {
            @Override
            public void onClick(View v) {
                if(!wysw.equals("")) {
                    wysw = wysw.substring(0, wysw.length() - 1);
                    wyswietlacz.setText(wysw);
                }


            }
        });

        przyciskplusminus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                wysw= kalkulator.plusminus(wysw);
                wyswietlacz.setText(wysw);
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
                    if(trygonometria==true){
                        wysw+=")";
                        trygonometria =false;
                    }
                    wysw += " + ";
                    dzialanie += " +";
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

                }
                else {
                    if(trygonometria==true){
                        wysw+=")";
                        trygonometria =false;
                    }
                    wysw += " - ";
                    dzialanie += " -";
                    wyswietlacz.setText(wysw);
                    dzialanieuz=true;
                }
                if(trygonometria ==true && minus==true){
                    wysw+="-";
                    wyswietlacz.setText(wysw);
                    minus=false;
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
                    if(trygonometria==true){
                        wysw+=")";
                        trygonometria =false;
                    }
                    wysw += " * ";
                    dzialanie += " *";
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
                    if(trygonometria==true){
                        wysw+=")";
                        trygonometria =false;
                    }
                    wysw += " / ";
                    dzialanie += " /";
                    wyswietlacz.setText(wysw);
                    dzialanieuz=true;
                }

            }
        });
        przycisksqrt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                wysw += " sqrt (";
                dzialanie += " sqrt";
                wyswietlacz.setText(wysw);
                trygonometria =true;
                minus=false;




            }
        });
        przyciskxdo2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {


                    wysw += " ^2";
                    dzialanie += " ^2";
                    wyswietlacz.setText(wysw);
                    dzialanieuz=true;



            }
        });
        przycisksin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                    wysw += "sin (";
                    dzialanie += " sin";
                    wyswietlacz.setText(wysw);
                    trygonometria =true;
                    minus=true;

            }
        });
        przyciskcos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                    wysw += "cos (";
                    dzialanie += " cos";
                    wyswietlacz.setText(wysw);
                    trygonometria =true;
                    minus=true;

            }
        });
        przyciskrowna.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(trygonometria==true){
                    wysw+=")";
                    trygonometria =false;
                }
                String temp=kalkulator.rowna(wysw);
                wysw=temp;
                wyswietlacz.setText(wysw);


            }
        });

    }

    private void liczby(String a,TextView wyswietlacz) {


        dzialanieuz=false;
        wysw=wysw+a;
        wyswietlacz.setText(wysw);

    }
}
