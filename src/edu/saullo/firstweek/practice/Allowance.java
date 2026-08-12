package edu.saullo.firstweek.practice;

import java.util.Scanner;

public class Allowance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mesada = 50;

        System.out.println("Digite a quantidade de Meses: ");
        int qMeses = scan.nextInt();

        switch (qMeses) {
            case 1 -> System.out.println("Com 1 mês a quantidade será: R$" + (1 * mesada) + " reais");
            case 2 -> System.out.println("Com 2 mês a quantidade será: R$" + (2 * mesada) + " reais");
            case 3 -> System.out.println("Com 3 mês a quantidade será: R$" + (3 * mesada) + " reais");
            case 4 -> System.out.println("Com 4 mês a quantidade será: R$" + (4 * mesada) + " reais");
            case 5 -> System.out.println("Com 5 mês a quantidade será: R$" + (5 * mesada) + " reais");
            case 6 -> System.out.println("Com 6 mês a quantidade será: R$" + (6 * mesada) + " reais");
            case 7 -> System.out.println("Com 7 mês a quantidade será: R$" + (7 * mesada) + " reais");
            case 8 -> System.out.println("Com 8 mês a quantidade será: R$" + (8 * mesada) + " reais");
            case 9 -> System.out.println("Com 9 mês a quantidade será: R$" + (9 * mesada) + " reais");
            case 10 -> System.out.println("Com 10 mês a quantidade será: R$" + (10 * mesada) + " reais");
            case 11 -> System.out.println("Com 11 mês a quantidade será: R$" + (11 * mesada) + " reais");
            case 12 -> System.out.println("Com 12 mês a quantidade será: R$" + (12 * mesada) + " reais");

            default -> System.out.println("Este mês não existe!!!");

        }

    }
}
