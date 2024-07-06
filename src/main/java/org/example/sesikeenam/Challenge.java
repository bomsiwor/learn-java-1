package org.example.sesikeenam;

public class Challenge {
    // Class dengan beberapa field
    // Inisialisasi field dengan getter/setter dan constructor

    // Instance variable
    private String title;

    private String content;

    private int point;

    // Static var - Gak perlu bikin object
    public static String defaultType = "tipe";

    // Default constructor
    public Challenge() {
//        this.title = title; // title gaada di args
    }

    // Parameterized Constructor
    public Challenge(String judul, String body, int totalPoint) {
        this.title = judul;
        this.content = body;
//        this.point = totalPoint;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return this.point;
    }
}
