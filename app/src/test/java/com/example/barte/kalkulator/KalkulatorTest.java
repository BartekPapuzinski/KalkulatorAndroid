package com.example.barte.kalkulator;

import org.junit.Test;

import static org.junit.Assert.*;

public class KalkulatorTest {

    Kalkulator kalkulator = new Kalkulator();
    @Test
    public void sintest() {
        String wejscie1 = "sin (25 + 45 / 6)";
        String wejscie2 = "sin (25 ^2)";
        String wejscie3 = "sin (sin (sqrt (2 ^2)))";
        String wejscie4 = "sin (25)";
        String wejscie5 = "sin (-25 * 6) / 2";

        String wyjscie1 = "0.88387042354";
        String wyjscie2 = "0.17601627283";
        String wyjscie3 = "0.78907234356";
        String wyjscie4 = "-0.13235175009";
        String wyjscie5 = "0.35743821481";

        assertEquals(wyjscie1,kalkulator.rowna(wejscie1));
        assertEquals(wyjscie2,kalkulator.rowna(wejscie2));
        assertEquals(wyjscie3,kalkulator.rowna(wejscie3));
        assertEquals(wyjscie4,kalkulator.rowna(wejscie4));
        assertEquals(wyjscie5,kalkulator.rowna(wejscie5));
    }
    @Test public void costest() {
        String wejscie1 = "cos (36 * 2 ^3)";
        String wejscie2 = "cos (cos (sqrt (12 ^4)))";
        String wejscie3 = "(cos (287 / 6) + 120)";
        String wejscie4 = "cos (36 + 48 / 7)";
        String wejscie5 = "cos (-73 * 8 / 12)";

        String wyjscie1 = "0.51779558865";
        String wyjscie2 = "0.64394913115";
        String wyjscie3 = "119.241275515";
        String wyjscie4 = "0.43103729795";
        String wyjscie5 = "-0.02801579788";

        assertEquals(wyjscie1,kalkulator.rowna(wejscie1));
        assertEquals(wyjscie2,kalkulator.rowna(wejscie2));
        assertEquals(wyjscie3,kalkulator.rowna(wejscie3));
        assertEquals(wyjscie4,kalkulator.rowna(wejscie4));
        assertEquals(wyjscie5,kalkulator.rowna(wejscie5));
    }
    @Test public void powtest(){
        String wejscie1 = "2 ^2";
        String wejscie2 = "2 ^2 ^2";
        String wejscie3 = "3 * 2 ^2";
        String wejscie4 = "3 ^3";
        String wejscie5 = "2 ^3 ^4";

        String wyjscie1 = "4.0";
        String wyjscie2 = "16.0";
        String wyjscie3 = "12.0";
        String wyjscie4 = "27.0";
        String wyjscie5 = "4096.0";

        assertEquals(wyjscie1,kalkulator.rowna(wejscie1));
        assertEquals(wyjscie2,kalkulator.rowna(wejscie2));
        assertEquals(wyjscie3,kalkulator.rowna(wejscie3));
        assertEquals(wyjscie4,kalkulator.rowna(wejscie4));
        assertEquals(wyjscie5,kalkulator.rowna(wejscie5));
    }
    @Test public void zakazanedzialania(){
        String wejscie1 = "6 / 0";

        String wyjscie1 = "error";

        assertEquals(wyjscie1,kalkulator.rowna(wejscie1));

    }

    @Test public void pierwistkitest(){
        String wejscie4 = "(sqrt (60))";

        String wyjscie4 = "7.74596669241";

        assertEquals(wyjscie4,kalkulator.rowna(wejscie4));

    }

    @Test public void logarytmy(){
        String wejscie1 = "log (10)";
        String wejscie2 = "ln (10)";
        String wejscie3 = "log (sin (45))";
        String wejscie4 = "ln (sqrt (60))";
        String wejscie5 = "ln (cos (287 / 6) + 120)";

        String wyjscie1 = "1.0";
        String wyjscie2 = "2.30258509299";
        String wyjscie3 = "-0.07011967744";
        String wyjscie4 = "2.04717228111";
        String wyjscie5 = "4.78114896579";

        assertEquals(wyjscie1,kalkulator.rowna(wejscie1));
        assertEquals(wyjscie2,kalkulator.rowna(wejscie2));
        assertEquals(wyjscie3,kalkulator.rowna(wejscie3));
        assertEquals(wyjscie4,kalkulator.rowna(wejscie4));
        assertEquals(wyjscie5,kalkulator.rowna(wejscie5));


    }
}