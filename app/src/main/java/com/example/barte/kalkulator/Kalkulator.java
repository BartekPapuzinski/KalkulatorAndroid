package com.example.barte.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import static java.lang.Math.*;


public class Kalkulator extends AppCompatActivity {

    int index;

    public String dodawanie(String a,String b){
        return String.valueOf(Double.parseDouble(a)+Double.parseDouble(b));
    }
    public String odejmowanie(String a,String b){
        return String.valueOf(Double.parseDouble(a)-Double.parseDouble(b));
    }
    public String mnozenie(String a,String b ){
        return String.valueOf(Double.parseDouble(a)*Double.parseDouble(b));
    }
    public String dzielenie(String a,String b){
        return String.valueOf(Double.parseDouble(a)/Double.parseDouble(b));
    }
    public String xdo2(String a) {
        return String.valueOf((Double.parseDouble(a))*(Double.parseDouble(a)));
    }
    public String pierwiastek(String a) {
        return String.valueOf(sqrt(Double.parseDouble(a)));
    }
    public String plusminus(String a){
        return String.valueOf((Double.parseDouble(a)*(-1)));
    }
    public String sinus(String a){
        return String.valueOf(sin(Double.parseDouble(a)));
    }
    public String cosinus(String a){
        return String.valueOf(cos(Double.parseDouble(a)));
    }
    public String tangens(String a){
        return String.valueOf(tan(Double.parseDouble(a)));
    }
    public String ctg(String a){
        return String.valueOf((1.0/tan(Double.parseDouble(a))));
    }
    public String rowna(String wysw){
        int index;
        String[] obliczenia = wysw.split(" ");

        do {
            index=szukanie(obliczenia,"sin");
            if(index!=-1){
                String wartosc=sinus(obliczenia[index+1].substring(1,obliczenia[index+1].length()-1));
                obliczenia=obliczeniadwumiejscowe(obliczenia,index,wartosc);
            }
        }while(index!=-1);

        do {
            index=szukanie(obliczenia,"cos");
            if(index!=-1){
                String wartosc=cosinus(obliczenia[index+1].substring(1,obliczenia[index+1].length()-1));
                obliczenia=obliczeniadwumiejscowe(obliczenia,index,wartosc);
            }
        }while(index!=-1);

        do {
            index=szukanie(obliczenia,"tan");
            if(index!=-1){
                String wartosc=tangens(obliczenia[index+1].substring(1,obliczenia[index+1].length()-1));
                obliczenia=obliczeniadwumiejscowe(obliczenia,index,wartosc);
            }
        }while(index!=-1);

        do {
            index=szukanie(obliczenia,"ctg");
            if(index!=-1){
                String wartosc=ctg(obliczenia[index+1].substring(1,obliczenia[index+1].length()-1));
                obliczenia=obliczeniadwumiejscowe(obliczenia,index,wartosc);
            }
        }while(index!=-1);

        do {
            index=szukanie(obliczenia,"sqrt");
            if(index!=-1){
                String wartosc=pierwiastek(obliczenia[index+1].substring(1,obliczenia[index+1].length()-1));
                obliczenia=obliczeniadwumiejscowe(obliczenia,index,wartosc);
            }
        }while(index!=-1);

        do {
            index=szukanie(obliczenia,"^2");
            if(index!=-1){
                String wartosc=xdo2(obliczenia[index-1]);
                obliczenia=obliczeniadwumiejscowe(obliczenia,index-1,wartosc);
            }
        }while(index!=-1);




        //potęgowanie


        do{
            index=szukanie(obliczenia,"*");
            if(index!=-1){
                String wartosc=mnozenie(obliczenia[index-1],obliczenia[index+1]);
                obliczenia=obliczeniatrzymiejscowe(obliczenia,index,wartosc);
            }
        }while(index!=-1);

        do{
            index=szukanie(obliczenia,"/");
            if(index!=-1){
                String wartosc=dzielenie(obliczenia[index-1],obliczenia[index+1]);
                obliczenia=obliczeniatrzymiejscowe(obliczenia,index,wartosc);
            }
        }while(index!=-1);

        do {
            index=szukanie(obliczenia,"+");
            if(index!=-1){
                String wartosc=dodawanie(obliczenia[index-1],obliczenia[index+1]);
                obliczenia=obliczeniatrzymiejscowe(obliczenia,index,wartosc);
            }
        }while(index!=-1);

        do {
            index=szukanie(obliczenia,"-");
            if(index!=-1){
                String wartosc=odejmowanie(obliczenia[index-1],obliczenia[index+1]);
                obliczenia=obliczeniatrzymiejscowe(obliczenia,index,wartosc);
            }
        }while(index!=-1);





        return obliczenia[0];
    }


    public static String[] obliczeniadwumiejscowe(String[] obliczenia,int index,String wartosc){
        String[] tempobliczenia=obliczenia.clone();
        obliczenia = new String[tempobliczenia.length-1];
        int j=0;
        for(int i=0;i<tempobliczenia.length;i++)
        {
            if(i==index)
            {
                obliczenia[j]=wartosc;
                i+=1;
            }
            else {
                obliczenia[j] = tempobliczenia[i];
            }
            j++;

        }
        return obliczenia;
    }


    public static String[] obliczeniatrzymiejscowe(String[] obliczenia,int index, String wartosc){
        String[] tempobliczenia=obliczenia.clone();
        obliczenia = new String[tempobliczenia.length-2];
        int j=0;
        for(int i=0;i<tempobliczenia.length;i++)
        {

            if(i==index-1)
            {
                obliczenia[j]=wartosc;
                i+=2;

            }
            else {
                obliczenia[j] = tempobliczenia[i];
            }
            j++;

        }
        return obliczenia;
    }


    public int szukanie(String[] obliczenia,String klucz){
        for(int i=0;i<obliczenia.length;i++)
        {
            if(obliczenia[i].equals(klucz)) {
                return i;
            }
        }
        return -1;
    }



}
