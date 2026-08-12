package edu.saullo.firstweek.practice.loops;

import java.util.Scanner;

/**
 * PracticeFour
 */
public class PracticeFour {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qPares, qImpar, count, qLoops, num;

        qPares = 0;
        qImpar = 0;
        count = 0;
        System.out.println("Quantos números deseja adicionar: ");
        qLoops = scan.nextInt();

        do {

            System.out.println("Digite um número: ");
            num = scan.nextInt();

            if (num % 2 == 0)
                qPares++;
            else
                qImpar++;

            count++;
        } while (count < qLoops);

        System.out.println(String.format("\nQuantidade de Pares: %d \nQuantidade de Ímpares: %d \nTotal de números: %d",
                qPares, qImpar, qLoops));
    }
}