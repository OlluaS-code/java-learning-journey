package edu.saullo.firstweek.practice;

import java.util.Scanner;

public class Loading {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        for (int i = 0; i < tamanho; i++) {
            System.out.print("/");
        }
    }
}
