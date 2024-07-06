package org.example.sesiketujuh;

public class Mahasiswa {
    private String nama;

    private String jurusan;

    private int angkatan;

    public static void main(String []args) {
        // Create new mahasiswa object
        Mahasiswa dataMhs = new Mahasiswa("Dilla", "Sistem Komputer", 2014);

        // Output result
        infoMahasiswa(dataMhs);
    }

    // Static method to print mahasiswa data
    private static void infoMahasiswa(Mahasiswa mahasiswaObj) {
        System.out.println("Nama: " + mahasiswaObj.getNama() + " Jurusan: " + mahasiswaObj.getJurusan() + " Angkatan: " + mahasiswaObj.getAngkatan());
    }

    /**
     * Construct new Mahasiswa Object
     * @param nama Nama mahasiswa
     * @param jurusan Jurusan mahasiswa
     * @param angkatan Angkatan mahasiswa
     */
    public Mahasiswa (String nama, String jurusan, int angkatan) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    // Getter for nama mahasiswa
    public String getNama() {
        return this.nama;
    }

    // Getter for jurusan mahasiswa
    public String getJurusan() {
        return this.jurusan;
    }

    // Getter for angkatan mahasiswa
    public int getAngkatan() {
        return this.angkatan;
    }

}
