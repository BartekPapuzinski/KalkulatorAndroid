package com.example.barte.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Prosty extends AppCompatActivity {

    String wysw="";
    String temp;
    String dzialanie="";
    boolean dzialanieuzyte=false;
    boolean rowna=false;
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
        final Button przyciskac =findViewById(R.id.przyciskAC);
        final Button przyciskc =findViewById(R.id.przyciskC);
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
                liczby(0,wyswietlacz);

            }
        });
        przycisk1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby(1,wyswietlacz);

            }
        });
        przycisk2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby(2,wyswietlacz);

            }
        });
        przycisk3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby(3,wyswietlacz);

            }
        });
        przycisk4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby(4,wyswietlacz);

            }
        });
        przycisk5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby(5,wyswietlacz);

            }
        });
        przycisk6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby(6,wyswietlacz);

            }
        });
        przycisk7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby(7,wyswietlacz);

            }
        });
        przycisk8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby(8,wyswietlacz);

            }
        });
        przycisk9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                liczby(9,wyswietlacz);

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
                dzialanieuzyte=false;

            }
        });

    }

    private void liczby(int a,TextView wyswietlacz) {
        if(rowna==true){
            wysw="";
            rowna=false;
        }
        wysw=wysw+a;
        wyswietlacz.setText(wysw);
    }


}
