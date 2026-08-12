package edu.saullo.firstweek.practice.loops;

import java.util.Scanner;

/**
 * PracticeFive
 */
public class PracticeFive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada deseja realizar: ");
        int tabuada = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d", tabuada, i, (tabuada * i)));
        }
    }
}