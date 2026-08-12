package edu.saullo.firstweek.practice.loops;

import java.util.Scanner;

/**
 * PracticeSix
 */
public class PracticeSix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiply = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiply *= i;
        }

        System.out.println(multiply);
    }
}