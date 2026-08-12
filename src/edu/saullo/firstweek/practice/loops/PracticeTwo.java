package edu.saullo.firstweek.practice.loops;

import java.util.Scanner;

/**
 * PracticeTwo
 */
public class PracticeTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        executeLoop(scan);
        scan.close();
    }

    public static void executeLoop(Scanner scan) {
        System.out.println("Digite um valor: ");
        int x = scan.nextInt();

        boolean fCondition = x < 0;
        boolean lCondition = x > 10;
        boolean condition = (fCondition || lCondition);

        if (!condition) {
            System.out.println("Excelente valor!!!");
            return;
        }

        System.out.println("Valor inválido (somente valores de 0 á 10)");
        executeLoop(scan);
    }
}