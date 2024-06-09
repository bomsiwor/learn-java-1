package org.example.sesipertama;

import java.util.HashMap;

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
         * Jalankan keputusan terlebih dahulu DO (setidaknya 1 kali)
         * Kemudian, jalankan while apabila kondisi pada statement While terpenuhi
         */
        int initValue = 5;

        do {
            System.out.println(initValue);
            initValue++;
        }while(initValue <= 5);

        /**
         * For Loop
         * Inisialisasi nilai awal bbisa dilakukan di dalam deklarasi for
         * Nilai i bisa dipakai dan dimanipulasi di dalam blok program. Aksi ini akan memengaruhi flow program/perulangan.
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            i++;
        }


        /**
         * For each
         * Sedikit berbeda dengan forEach di PHP / JS
         * Format (dataType item : collection)
         */
        String[] banyak = {"bebek1","banyak2"};

        // Looping mnggunakan for biasa
        for (int i = 0; i < banyak.length;i++){
            System.out.println(banyak[i]);
        }

        // Loopingmenggunaakna foreach
        // Format : (DataType item : array)
        for (String b : banyak) {
            System.out.println(b);
        }
        // Akses ukuran dari sebuah array
        int ukuran = banyak.length;

        /**
         * Kalau mau punya key di array,
         * Bisa menggunakan hasMap dengan format di bawah ini
         */
        HashMap<String,String> data = new HashMap<String,String>();
        data.put("Jatim", "Surabaya");
        data.put("Jateng","Semarang");

        data.forEach((k,v)->{
            System.out.println(k);
        });

    }
}
