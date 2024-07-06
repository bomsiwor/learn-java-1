package org.example.sesiketiga;

public class Kalkulator {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();

        // Add two value
        double tambah = calc.sum(20,10);

        // Multiply two value
        double multiply = calc.multiply(20,500);

        // Show output to console
        System.out.println(tambah);
        System.out.println(multiply);
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}
