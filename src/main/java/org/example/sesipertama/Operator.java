package org.example.sesipertama;

public class Operator {
    public static void main(String[] args) {
        double d = (double) 3; // Casting variable
        double e = 2;
        int a = 5;
        int b = 6;
        int c = 7;

        /**
         * Operator aritmetik sederhana
         * Tambah, Kurang, Bagi, Kali, Modulo, Pangkat
         */
        int Hasil1 = a + b;

        int Hasil2 = a - b;

        int Hasil3 = a * b;

        int Hasil4 = a / b;

        int Hasil5 = a % b;

        double Hasil6 = Math.pow(e, d);

        /**
         * Operator relasional
         * Komparasi (==. !=, <, > , <=, >=)
         */
        boolean Hasil7 = a < b;
        boolean Hasil8 = a == b;
        boolean Hasil9 = a != c;

        /**
         * Operator logika
         * AND dan OR
         */
        boolean Hasil10 = (a == c) && (b == c);
        boolean Hasil11 = (a == c) || (b == c);

        /**
         * Operator increment & decrement
         * ++. -- . +=, dan -=
         */
        int angka1 = 2;
        int angka2 = 3;

        System.out.println("Sebelum di increment " + angka1);
        angka1++;
        System.out.println("Sesudah di increment " + angka1);

        System.out.println("Sebelum di decrement " + angka2);
        angka2--;
        System.out.println("Sesudah di decrement " + angka2);

         angka2 += 5; // Angka sekarang dijumlah dengan 5, tidak bisa di assign ke variable baru
        System.out.println(angka2);
         angka2 =+ 2; // Angka sekarang dicopy ke variable baru, dan angka lama di tambah 2
        System.out.println(angka2);
    }
}
