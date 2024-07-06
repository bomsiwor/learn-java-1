package org.example.sesikeenam;

public class Mahasiswa {
    // Variabel di dalam class adalah property / attribute
    // Non-primitive var / attribute bisa mempunyai default value : null
    private int age;

    // Ini default value nya null
    private String nama;

    // Default constructor
    public Mahasiswa() {

    }

    // Parameterized constructor
    // Overload the first method / constructor
    public Mahasiswa(final int age, final String nama) {
        this.age = age;
        this.nama = nama;
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println(mahasiswa.nama);
        // Set new name
        mahasiswa.setNama("Anji");

        System.out.println("Nama mahasiswa ini " + mahasiswa.getNama().toUpperCase());
    }

    // Setter function
    // Untuk mengisikan data property nama
    // Ini digunakan untuk implementasi enkapsulasi dan
    // Mencoba memodifikasi sebuah objek dengan cara yang lebih terkontrol
    private void setNama(String nama) {
        this.nama = nama;
    }

    private String getNama(){
        return this.nama;
    }

}
