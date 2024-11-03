package pert6;

import java.util.Scanner;

public class Cakeppp {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?\nJawab (Yoi/Enggak): ");
        String jawaban = input.nextLine();

        if (jawaban.equalsIgnoreCase("Yoi")) {
            System.out.println("\nCakep Bener. Good Job");
        } else if (jawaban.equalsIgnoreCase("Enggak")) {
            System.out.println("\nTetep cakep sih.");
            System.out.println("Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        } else {
            System.out.println("\nJawaban tidak valid.");
        }
    }
}
 
