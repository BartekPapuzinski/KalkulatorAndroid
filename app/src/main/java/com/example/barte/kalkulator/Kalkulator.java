package com.example.barte.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.io.PrintWriter;
import java.io.StringWriter;

import static java.lang.Math.*;

public class Kalkulator extends AppCompatActivity {

    int index;

    public String dodawanie(String a, String b) {
        return String.valueOf(Double.parseDouble(a) + Double.parseDouble(b));
    }

    public String odejmowanie(String a, String b) {
        return String.valueOf(Double.parseDouble(a) - Double.parseDouble(b));
    }

    public String mnozenie(String a, String b) {
        return String.valueOf(Double.parseDouble(a) * Double.parseDouble(b));
    }

    public String dzielenie(String a, String b) {
        return String.valueOf(Double.parseDouble(a) / Double.parseDouble(b));
    }

    public String xdo2(String a) {
        return String.valueOf((Double.parseDouble(a)) * (Double.parseDouble(a)));
    }

    public String xdoy(String a, String b) {
        return String.valueOf(pow((Double.parseDouble(a)), (Double.parseDouble(b))));
    }

    public String pierwiastek(String a) {
        return String.valueOf(sqrt(Double.parseDouble(a)));
    }

    public String plusminus(String a) {
        return String.valueOf((Double.parseDouble(a) * (-1)));
    }

    public String sinus(String a) {
        return String.valueOf(sin(Double.parseDouble(a)));
    }

    public String ln(String a) {
        return String.valueOf(Math.log(Double.parseDouble(a)));
    }

    public String log(String a) {
        return String.valueOf(Math.log10(Double.parseDouble(a)));
    }

    public String cosinus(String a) {
        return String.valueOf(cos(Double.parseDouble(a)));
    }

    public String tangens(String a) {
        return String.valueOf(tan(Double.parseDouble(a)));
    }

    public String ctg(String a) {
        return String.valueOf((1.0 / tan(Double.parseDouble(a))));
    }

    public String rowna(String wysw) {

        try {
            int index;
            String[] obliczenia = wysw.split(" ");

            do {
                index = szukanienawiasotwierajacy(obliczenia, '(');
                int index2 = szukanienawiaszamykajacy(obliczenia, ')');
                if (index != -1) {
                    String tempobliczenia = "";
                    if (index == index2) {
                        tempobliczenia += obliczenia[index].substring(1, obliczenia[index].length() - 1);
                    } else {
                        for (int i = index; i <= index2; i++) {
                            if (i == index) {
                                tempobliczenia += obliczenia[i].substring(1, obliczenia[i].length()) + " ";
                            } else if (i == index2) {
                                tempobliczenia += obliczenia[i].substring(0, obliczenia[i].length() - 1) + " ";
                            } else {
                                tempobliczenia += obliczenia[i] + " ";
                            }
                        }
                    }
                    String wartosc = rowna(tempobliczenia);

                    if (index == index2) {
                        obliczenia[index] = wartosc;
                    } else {
                        obliczenia = obliczeniaxmiejscowe(obliczenia, index, wartosc, index2 - index);
                    }
                }
            }
            while (index != -1);

            if (wysw.equals("Niedozwolone działanie")) {
                return "Niedozwolone działanie";
            }

            do {
                index = szukanie(obliczenia, "sin");
                if (index != -1) {
                    String wartosc = sinus(obliczenia[index + 1]);
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index, wartosc, 1);
                }
            }
            while (index != -1);

            do {
                index = szukanie(obliczenia, "cos");
                if (index != -1) {
                    String wartosc = cosinus(obliczenia[index + 1]);
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index, wartosc, 1);
                }
            }
            while (index != -1);

            do {
                index = szukanie(obliczenia, "tan");
                if (index != -1) {
                    String wartosc = tangens(obliczenia[index + 1]);
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index, wartosc, 1);
                }
            }
            while (index != -1);

            do {
                index = szukanie(obliczenia, "sqrt");
                if (index != -1) {
                    if (Double.parseDouble(obliczenia[index + 1]) < 0) {
                        throw new IllegalArgumentException("Niedozwolone działanie");
                    }
                    String wartosc = pierwiastek(obliczenia[index + 1]);
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index, wartosc, 1);
                }
            }
            while (index != -1);

            do {
                index = szukanie(obliczenia, "ln");
                if (index != -1) {
                    if (Double.parseDouble(obliczenia[index + 1]) < 0) {
                        throw new IllegalArgumentException("Niedozwolone działanie");
                    }
                    String wartosc = ln(obliczenia[index + 1]);
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index, wartosc, 1);
                }
            }
            while (index != -1);

            do {
                index = szukanie(obliczenia, "log");
                if (index != -1) {
                    if (Double.parseDouble(obliczenia[index + 1]) < 0) {
                        throw new IllegalArgumentException("Niedozwolone działanie");
                    }
                    String wartosc = log(obliczenia[index + 1]);
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index, wartosc, 1);
                }
            }
            while (index != -1);

            do {
                index = szukanienawiasotwierajacy(obliczenia, '^');

                if (index != -1) {
                    String wartosc = xdoy(obliczenia[index - 1], obliczenia[index].substring(1, obliczenia[index].length()));
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index - 1, wartosc, 1);
                }
            }
            while (index != -1);

            do {
                index = szukanie(obliczenia, "*");
                if (index != -1) {
                    String wartosc = mnozenie(obliczenia[index - 1], obliczenia[index + 1]);
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index - 1, wartosc, 2);
                }
            }
            while (index != -1);

            do {
                index = szukanie(obliczenia, "/");
                if (index != -1) {
                    if (Double.parseDouble(obliczenia[index + 1]) == 0) {
                        throw new IllegalArgumentException("Niedozwolone działanie");
                    }
                    String wartosc = dzielenie(obliczenia[index - 1], obliczenia[index + 1]);
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index - 1, wartosc, 2);
                }
            }
            while (index != -1);

            do {
                index = szukanie(obliczenia, "+");
                if (index != -1) {
                    String wartosc = dodawanie(obliczenia[index - 1], obliczenia[index + 1]);
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index - 1, wartosc, 2);
                }
            }
            while (index != -1);

            do {
                index = szukanie(obliczenia, "-");
                if (index != -1) {
                    String wartosc = odejmowanie(obliczenia[index - 1], obliczenia[index + 1]);
                    obliczenia = obliczeniaxmiejscowe(obliczenia, index - 1, wartosc, 2);
                }
            }
            while (index != -1);

            return obliczenia[0];
        } catch (Exception e) {
            return "Niedozwolone działanie";
        }
    }

    public int szukanie(String[] obliczenia, String klucz) {
        for (int i = 0; i < obliczenia.length; i++) {
            if (obliczenia[i].equals(klucz)) {
                return i;
            }
        }
        return -1;
    }

    public int szukanienawiasotwierajacy(String[] obliczenia, char klucz) {
        for (int i = 0; i < obliczenia.length; i++) {
            if (obliczenia[i].charAt(0) == klucz) {
                return i;
            }
        }
        return -1;
    }

    public int szukanienawiaszamykajacy(String[] obliczenia, char klucz) {
        for (int i = obliczenia.length - 1; i >= 0; i--) {
            if (obliczenia[i].charAt(obliczenia[i].length() - 1) == klucz) {
                return i;
            }
        }
        return -1;
    }

    public static String[] obliczeniaxmiejscowe(String[] obliczenia, int index, String wartosc, int iloscmiejsc) {
        String[] tempobliczenia = obliczenia.clone();
        obliczenia = new String[tempobliczenia.length - iloscmiejsc];
        int j = 0;
        for (int i = 0; i < tempobliczenia.length; i++) {
            if (i == index) {
                obliczenia[j] = wartosc;
                i += iloscmiejsc;
            } else {
                obliczenia[j] = tempobliczenia[i];
            }
            j++;

        }
        return obliczenia;
    }

}
