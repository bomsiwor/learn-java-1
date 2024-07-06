package org.example.sesiketiga;

public class NonStaticMethod {
    /*
    Method capitalize is non static method.
    Non-static method can not called inside static context.
    To call non-static method, it should initialize new class object.
     */
    public static void main(String[] args) {
        // Initialize class with new
        // New class object can access non static method.
         NonStaticMethod nonStatic = new NonStaticMethod();

         String name = nonStatic.capitalizeName("Kambing Rujak");
        System.out.println(name);

        // Testing to put null value into a method
        // This wil throw null pointer exception
        nonStatic.testNull(null);
    }

    public String capitalizeName(String name) {
        return name.toUpperCase();
    }

    private void testNull(String text) {
        if (text.isBlank()) {
            System.out.println("Text is null");
            return;
        }

        String name = text.toUpperCase();

        System.out.println(name);
    }
}
