package org.example.sesikeenam;

public class CobaChallenge {
    public static void main(String[] args) {
        Challenge quiz = new Challenge();

        quiz.setTitle("Kuis Keluarga");
        quiz.setContent("Kuis ini seru");
        quiz.setPoint(100);

        System.out.println("Judul challenge : " + quiz.getTitle());
        System.out.println("Desc : " + quiz.getContent());
        System.out.println("Total poin : " + quiz.getPoint());

        Challenge quiz2 = new Challenge("Family 100", "Kuis rame banget", 200);
        System.out.println("Judul challenge : " + quiz2.getTitle());
        System.out.println("Desc : " + quiz2.getContent());
        System.out.println("Total poin : " + quiz2.getPoint());
    }
}
