package org.example.sesipertama;

public class Looping {
    public static void main(String[] args) {
        /**
         * Perulangan dengan WHILE
         */
        // Initiates value
        int count = 1;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        /**
         * Perulangan dengan DO..WHILE
         * Jalankan terlebih dahulu DO (setidaknya 1 kali)
         * Kemudian, jalankan while apabila kondisi pada statement While terpenuhi
         */
        int initValue = 5;

        do {
            System.out.println(initValue);
            initValue++;
        }while(initValue <= 5);
    }
}
