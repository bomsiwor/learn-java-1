package org.example.sesipertama;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class DataType {

    public static void main(String[] args) {
        // Tipe data primitif
        // Tipe ditulis dengan huruf kecil

        // Tipe data numeric
        byte iniByte = 127;
        short iniShort = -128;
        int iniInteger = 1300;
        long iniLong = 123456789L;
        float iniFloat = 3.14f;
        double iniDouble = 3.14;

        // Tipe data non-numeric
        boolean iniBoolean = true;
        char iniChar = 'A';

        // Tipe data string - Non-primitive type
        // Di awali dengan huruf kapital
        // String merupakan tipe data non primitive (berbentuk object)
        // Sebuah objek bisa memiiliki sebuah method untuk memanipulasi/menghasilkan value
        String iniString = "Hello World";
        Boolean iniBoolean1 = Boolean.TRUE;
        Integer iniInteger1 = 123;
        Date iniDate = new Date();
        Point iniPoint = new Point();
    }
}
