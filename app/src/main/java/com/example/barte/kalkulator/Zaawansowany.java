package com.example.barte.kalkulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Zaawansowany extends AppCompatActivity {

    String wysw = "";
    int liczniknawiaskow = 0;
    boolean dzialanieuz = true;
    boolean trygonometria = false;

    @Override protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("wysw", wysw);
        outState.putBoolean("dzialanieuz",dzialanieuz);
        outState.putBoolean("trygonometria",trygonometria);
        outState.putInt("licznikanawiasow",liczniknawiaskow);
    }

    @Override protected void onRestoreInstanceState(Bundle savedInstanceState) {
        wysw = savedInstanceState.getString("wysw");
        dzialanieuz = savedInstanceState.getBoolean("dzialanieuz");
        trygonometria = savedInstanceState.getBoolean("trygonometria");
        liczniknawiaskow = savedInstanceState.getInt("liczniknawiasow");
        final TextView wyswietlacz = findViewById(R.id.Wyswietlacz);
        wyswietlacz.setText(wysw);
        super.onRestoreInstanceState(savedInstanceState);
    }

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zaawansowany);

        final TextView wyswietlacz = findViewById(R.id.Wyswietlacz);
        final Button przycisk0 = findViewById(R.id.Przycisk0);
        final Button przycisk1 = findViewById(R.id.Przycisk1);
        final Button przycisk2 = findViewById(R.id.Przycisk2);
        final Button przycisk3 = findViewById(R.id.Przycisk3);
        final Button przycisk4 = findViewById(R.id.Przycisk4);
        final Button przycisk5 = findViewById(R.id.Przycisk5);
        final Button przycisk6 = findViewById(R.id.Przycisk6);
        final Button przycisk7 = findViewById(R.id.Przycisk7);
        final Button przycisk8 = findViewById(R.id.Przycisk8);
        final Button przycisk9 = findViewById(R.id.Przycisk9);
        final Button przyciskpi = findViewById(R.id.PrzyciskPi);
        final Button przyciskkropka = findViewById(R.id.PrzyciskKropka);
        final Button przycisknawiaszamykajacy = findViewById(R.id.PrzyciskNawiaszZmykajacy);
        final Button przycisknawiasotwierajacy = findViewById(R.id.PrzyciskNawiaszOtwierajacy);
        final Button przyciskac = findViewById(R.id.PrzyciskAC);
        final Button przyciskc = findViewById(R.id.PrzyciskC);
        final Button przyciskplus = findViewById(R.id.PrzyciskPlus);
        final Button przyciskminus = findViewById(R.id.PrzyciskMinus);
        final Button przyciskrazy = findViewById(R.id.PrzyciskRazy);
        final Button przyciskdzielenie = findViewById(R.id.PrzyciskDzielenie);
        final Button przyciskrowna = findViewById(R.id.PrzyciskRowna);
        final Button przyciskplusminus = findViewById(R.id.PrzyciskPlusMinus);
        final Button przycisksqrt = findViewById(R.id.PrzyciskSqrt);
        final Button przyciskxdo2 = findViewById(R.id.PrzyciskXdo2);
        final Button przycisksin = findViewById(R.id.PrzyciskSin);
        final Button przyciskcos = findViewById(R.id.PrzyciskCos);
        final Button przycisktan = findViewById(R.id.PrzyciskTan);
        final Button przyciskln = findViewById(R.id.PrzyciskLn);
        final Button przycisklog = findViewById(R.id.PrzyciskLog);
        final Button przyciskxdoy = findViewById(R.id.PrzyciskXdoy);

        final Kalkulator kalkulator = new Kalkulator();
        przycisk0.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                liczby("0", wyswietlacz);

            }
        });
        przycisk1.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                liczby("1", wyswietlacz);

            }
        });
        przycisk2.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                liczby("2", wyswietlacz);

            }
        });
        przycisk3.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                liczby("3", wyswietlacz);

            }
        });
        przycisk4.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                liczby("4", wyswietlacz);

            }
        });
        przycisk5.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                liczby("5", wyswietlacz);

            }
        });
        przycisk6.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                liczby("6", wyswietlacz);

            }
        });
        przycisk7.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                liczby("7", wyswietlacz);

            }
        });
        przycisk8.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                liczby("8", wyswietlacz);

            }
        });
        przycisk9.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                liczby("9", wyswietlacz);

            }
        });
        przyciskpi.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                Double a = Math.PI;
                String pi = a.toString();
                liczby(pi, wyswietlacz);

            }
        });
        przyciskkropka.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                String[] temp = wysw.split(" ");
                int x = temp[temp.length - 1].indexOf(".");
                if (x == -1)
                    if (wyswietlacz.length() == 0) {
                        liczby("0.", wyswietlacz);
                    } else if (dzialanieuz == false && trygonometria == false) {
                        liczby(".", wyswietlacz);
                    }

            }
        });

        przycisknawiaszamykajacy.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == false && liczniknawiaskow > 0) {
                    wysw += ")";
                    wyswietlacz.setText(wysw);
                    trygonometria = false;
                    liczniknawiaskow--;
                }
            }
        });
        przycisknawiasotwierajacy.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {

                wysw += "(";
                wyswietlacz.setText(wysw);
                trygonometria = false;
                liczniknawiaskow++;

            }
        });
        przyciskac.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                wysw = "";
                liczniknawiaskow = 0;
                dzialanieuz = true;
                trygonometria = false;
                wyswietlacz.setText(wysw);

            }
        });
        przyciskc.setOnClickListener(new View.OnClickListener()//todo
        {

            @Override public void onClick(View v) {
                if (!wysw.equals("")) {
                    String[] temp = wysw.split(" ");
                    wysw = "";
                    for (int i = 0; i < temp.length - 1; i++) {
                        if (i == temp.length - 1) {
                            wysw += temp[i];
                        } else {
                            wysw += temp[i] + " ";
                        }
                    }
                    if (temp[temp.length - 1] == "+"
                        || temp[temp.length - 1] == "-"
                        || temp[temp.length - 1] == "*"
                        || temp[temp.length - 1] == "/"
                        || temp[temp.length - 1].charAt(0) == '^') {
                        dzialanieuz = false;
                    }
                    if (temp[temp.length - 1] == "(") {
                        liczniknawiaskow--;
                        trygonometria = true;
                    }

                    if (temp[temp.length - 1] == ")") {
                        liczniknawiaskow++;
                        trygonometria = true;
                    }
                    if (temp[temp.length - 1] == "sin"
                        || temp[temp.length - 1] == "cos"
                        || temp[temp.length - 1] == "tan"
                        || temp[temp.length - 1] == "sqrt"
                        || temp[temp.length - 1] == "log"
                        || temp[temp.length - 1] == "ln") {

                        trygonometria = false;
                    }

                    wyswietlacz.setText(wysw);
                }

            }
        });

        przyciskplusminus.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {

            }
        });
        przyciskplus.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {

                if (dzialanieuz == true || trygonometria == true) {

                } else {

                    wysw += " + ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz = true;
                }

            }
        });
        przyciskminus.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == true || trygonometria == true) {
                    wysw += "-";
                    wyswietlacz.setText(wysw);
                } else {
                    wysw += " - ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz = true;
                }

            }
        });
        przyciskrazy.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == true || trygonometria == true) {

                } else {

                    wysw += " * ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz = true;
                }

            }
        });
        przyciskdzielenie.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == true || trygonometria == true) {

                } else {

                    wysw += " / ";
                    wyswietlacz.setText(wysw);
                    dzialanieuz = true;
                }

            }
        });
        przycisksqrt.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == true || trygonometria == true) {
                    wysw += "sqrt (";
                    wyswietlacz.setText(wysw);
                    trygonometria = true;
                    liczniknawiaskow++;
                }
            }
        });
        przyciskxdo2.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {

                if (dzialanieuz == true || trygonometria == true) {
                } else {
                    wysw += " ^2";
                    wyswietlacz.setText(wysw);
                    dzialanieuz = true;
                }

            }
        });
        przycisksin.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == true || trygonometria == true) {
                    wysw += "sin (";
                    wyswietlacz.setText(wysw);
                    trygonometria = true;
                    liczniknawiaskow++;
                }
            }
        });
        przyciskcos.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == true || trygonometria == true) {
                    wysw += "cos (";
                    wyswietlacz.setText(wysw);
                    trygonometria = true;
                    liczniknawiaskow++;
                }
            }
        });
        przycisktan.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == true || trygonometria == true) {
                    wysw += "tan (";
                    wyswietlacz.setText(wysw);
                    trygonometria = true;
                    liczniknawiaskow++;
                }
            }
        });
        przyciskln.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == true || trygonometria == true) {
                    wysw += "ln (";
                    wyswietlacz.setText(wysw);
                    trygonometria = true;
                    liczniknawiaskow++;
                }
            }
        });
        przycisklog.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == true || trygonometria == true) {
                    wysw += "log (";
                    wyswietlacz.setText(wysw);
                    trygonometria = true;
                    liczniknawiaskow++;
                }
            }
        });
        przyciskxdoy.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                if (dzialanieuz == true || trygonometria == true) {
                } else {
                    wysw += " ^";
                    wyswietlacz.setText(wysw);
                    dzialanieuz = true;
                }
            }
        });
        przyciskrowna.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                for (int i = 0; i < liczniknawiaskow; i++) {
                    wysw += ")";
                }

                String temp = kalkulator.rowna(wysw);
                if (temp == "Niedozwolone działanie") {
                    wysw = temp;
                } else {
                    double x = Double.parseDouble(temp);
                    x = Math.round(x * 10000000000000.0) / 10000000000000.0;
                    wysw = String.valueOf(x);
                }
                wyswietlacz.setText(wysw);
                liczniknawiaskow = 0;
                dzialanieuz = true;
                trygonometria = false;
            }
        });

    }

    private void liczby(String a, TextView wyswietlacz) {

        trygonometria = false;
        dzialanieuz = false;
        wysw = wysw + a;
        wyswietlacz.setText(wysw);

    }
}