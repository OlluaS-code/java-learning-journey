package edu.saullo.firstweek.practice;

import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int paginas = scan.nextInt();
        int paginasLidas = 0;

        for (int i = 0; i < paginas; i += 3) {
            paginasLidas++;
        }

        System.out.println(paginasLidas);
    }
}
