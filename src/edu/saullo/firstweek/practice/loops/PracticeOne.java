package edu.saullo.firstweek.practice.loops;

import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        executarMenu(scan);
        scan.close();
    }

    public static void executarMenu(Scanner scan) {
        System.out.println("Digite seu nome (ou 0 para sair): ");
        String name = scan.next();

        boolean condition = name.equals("0");

        if (condition) {
            System.out.println("Você saiu do loop recursão 💪");
            return;
        }

        System.out.println("Digite sua idade: ");
        int number = scan.nextInt();

        System.out.println(String.format("%s, tem %d de idade!", name, number));
        executarMenu(scan);
    }
}
