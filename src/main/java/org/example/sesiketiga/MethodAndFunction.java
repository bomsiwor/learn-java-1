package org.example.sesiketiga;

public class MethodAndFunction {
    /*
    Accessor / Encapsulation in java :
    - Public
    - Protected
    - Private
    Static method can access static method from other class/package (with public mark).
     */
    public static void main(String[] args) {
        // Call other static function
        printHello();

        // Call other static method with parameter
        String rawName = "Bomsiwor";
        String finalName = printName(rawName);

        System.out.println(finalName);

        // Use method overloading
        String fullname = printName(rawName, "PHD");

        System.out.println(fullname);

        // Static method can not call non-static method
    }

    /**
     * Print Hello string
     */
    public static void printHello() {
        System.out.println("Hello");
    }

    /**
     * Print uppercase name
     * @param name Nama orang
     * @return String Nama orang dalam kapital
     */
    public static String printName(String name) {
        return name.toUpperCase();
    }

    // Method overloading
    // Method dengan nama yang sama, tapi signature nya berbeda.
    /*
        Method overloading membuat method dengan signature yang berbeda tapi memiliki nama yg sama.
        - Dengan jumlah parameter yang berbeda
        - Dengan jumlah paramater yang sama tetapi tipe data berbeda.
     */
    public static String printName(String name, String title) {
        return name + " " + title;
    }
}
