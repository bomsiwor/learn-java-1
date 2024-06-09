package org.example.sesipertama;

public class BreakAndContinue {
    public static void main(String[] args) {
        /**
         * Penggunaan COntinue dan break
         * COntinue : skip iterasi saat ini
         * Break : menghentikan keseluruhan iterasi
         */
        String[] names = {"Andi", "Budi", "Cici", "Dodi"};

        int lengthOfNames = names.length;

        for (int i = 0; i < lengthOfNames; i++) {
            if (i %2 == 0) {
                continue;
            }
            System.out.println(names[i]);
        }

        for (int i = 0; i < lengthOfNames; i++) {
            if (i == 2) {
                break;
            }

            System.out.println(names[i]);
        }
    }
}
