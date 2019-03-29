package com.example.barte.kalkulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.Inet4Address;

import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class Zaawansowany extends AppCompatActivity {

    String wysw="";
    String temp;
    String dzialanie="";
    boolean dzialanieuzyte=false;
    boolean rowna=false;

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
                String aa=a.toString();
                liczby(aa,wyswietlacz);

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
                temp="";
                dzialanie="";
                dzialanieuzyte=false;
                wyswietlacz.setText(wysw);

            }
        });
        przyciskc.setOnClickListener(new View.OnClickListener()
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
                double a=Double.parseDouble(wysw)*(-1);
                wysw=Double.toString(a);
                wyswietlacz.setText(wysw);


            }
        });
        przyciskplus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuzyte==true)
                {
                    przyciskrowna.callOnClick();
                }
                temp=wysw;
                dzialanie="+";
                wysw="";
                rowna=false;
                dzialanieuzyte=true;

            }
        });
        przyciskminus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuzyte==true)
                {
                    przyciskrowna.callOnClick();
                }
                temp=wysw;
                dzialanie="-";
                wysw="";
                rowna=false;
                dzialanieuzyte=true;

            }
        });
        przyciskrazy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuzyte==true)
                {
                    przyciskrowna.callOnClick();
                }
                temp=wysw;
                dzialanie="*";
                wysw="";
                rowna=false;
                dzialanieuzyte=true;

            }
        });
        przyciskdzielenie.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanieuzyte==true)
                {
                    przyciskrowna.callOnClick();
                }
                temp=wysw;
                dzialanie="/";
                wysw="";
                rowna=false;
                dzialanieuzyte=true;

            }
        });
        przycisksqrt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(dzialanieuzyte==true)
                {
                    przyciskrowna.callOnClick();
                }
                dzialanie="sqrt";
                przyciskrowna.callOnClick();
                rowna=false;


            }
        });
        przyciskxdo2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if (dzialanieuzyte == true) {
                    przyciskrowna.callOnClick();
                }
                dzialanie = "xdo2";
                przyciskrowna.callOnClick();
                rowna = false;


            }
        });
        przycisksin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if (dzialanieuzyte == true) {
                    przyciskrowna.callOnClick();
                }
                dzialanie = "sin";
                przyciskrowna.callOnClick();
                rowna = false;


            }
        });
        przyciskrowna.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(dzialanie.equals("+")){
                    String temp2=wysw;
                    double a=Double.parseDouble(temp)+Double.parseDouble(wysw);
                    wysw=Double.toString(a);
                    wyswietlacz.setText(wysw);
                    rowna=true;
                    if(dzialanieuzyte==true){
                        temp=temp2;
                    }

                }
                if(dzialanie.equals("-")) {
                    String temp2 = wysw;
                    if(rowna==false) {
                        double a = Double.parseDouble(temp) - Double.parseDouble(wysw);
                        wysw = Double.toString(a);
                        wyswietlacz.setText(wysw);
                        rowna=true;
                    }
                    else if(rowna==true) {
                        double a = Double.parseDouble(wysw) - Double.parseDouble(temp);
                        wysw = Double.toString(a);
                        wyswietlacz.setText(wysw);
                    }
                    if (dzialanieuzyte == true) {
                        temp = temp2;
                    }
                }
                if(dzialanie.equals("*")) {
                    String temp2 = wysw;
                    double a = Double.parseDouble(temp) * Double.parseDouble(wysw);
                    wysw = Double.toString(a);
                    wyswietlacz.setText(wysw);
                    rowna=true;
                    if (dzialanieuzyte == true) {
                        temp = temp2;
                    }
                }
                if(dzialanie.equals("/")) {
                    String temp2 = wysw;
                    if(rowna==false) {
                        double a = Double.parseDouble(temp) / Double.parseDouble(wysw);
                        wysw = Double.toString(a);
                        wyswietlacz.setText(wysw);
                        rowna=true;
                    }
                    else if(rowna==true) {
                        double a = Double.parseDouble(wysw) / Double.parseDouble(temp);
                        wysw = Double.toString(a);
                        wyswietlacz.setText(wysw);
                    }
                    if (dzialanieuzyte == true) {
                        temp = temp2;
                    }
                }
                if(dzialanie.equals("sqrt")){
                    Double temp2;
                    temp2=(sqrt(Double.parseDouble(wysw)));
                    wysw=temp2.toString();
                    wyswietlacz.setText(wysw);

                }
                if(dzialanie.equals("xdo2")){
                    Double temp2;
                    temp2=Double.parseDouble(wysw)*Double.parseDouble(wysw);
                    wysw=temp2.toString();
                    wyswietlacz.setText(wysw);

                }
                if(dzialanie.equals("sin")){
                    Double temp2;
                    temp2=sin(Double.parseDouble(wysw));
                    wysw=temp2.toString();
                    wyswietlacz.setText(wysw);

                }
                dzialanieuzyte=false;

            }
        });

    }

    private void liczby(String a,TextView wyswietlacz) {
        if(rowna==true){
            wysw="";
            rowna=false;
        }
        wysw=wysw+a;
        wyswietlacz.setText(wysw);
    }
}
