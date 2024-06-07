package org.example.sesipertama;

public class ConditionalStatement {
    public static void main(String[] args) {
        // Penulisan if biasa,
        // Tanpa else
        int value1 = 10;
        boolean isBig = false;

        if (value1 > 10) {
            isBig = true;
        }

        // Penulisan if dan else
        if (value1 < 10) {
            isBig = false;
        } else {
            isBig = true;
        }

        // Penulisan if else if
        int value2 = 20;

        if (value1 > 10 && value2 %2==0) {
            isBig = true;
        } else if (value1 < 10 && value2 %2!=0) {
            isBig = false;
        }

        /**
         * Penulisan switch statement
         * Mirip seperti golang.
         */
        switch (value2) {
            case 10:
                isBig = false;
                break;

            case 20:
                isBig = true;
                break;

            default:
                isBig = false;
        }

        System.out.println(isBig);
    }
}
