package edu.saullo.firstweek.practice.loops;

import java.util.Scanner;

/**
 * PracticeTree
 */
public class PracticeTree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, soma, count, maior;

        count = 0;
        maior = 0;
        soma = 0;

        do {
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            soma += num;

            if (num > maior)
                maior = num;

            count++;
        } while (count < 5);

        System.out.println(String.format("O maior número é : %d \nA média é : %d", maior, soma / count));
    }
}