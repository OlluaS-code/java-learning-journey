package edu.saullo.firstweek.practice.arrays;

import java.util.Scanner;

/**
 * PracticeTwo
 */
public class PracticeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] consoantes = new char[5];
        int index = 0;

        System.out.println("=== Cadastro de Consoantes com Array de char ===");

        while (index < consoantes.length) {
            System.out.print("Digite uma consoante para a posição [" + index + "]: ");

            char letraOriginal = scanner.next().charAt(0);

            if (!Character.isLetter(letraOriginal)) {
                System.out.println("Erro: Digite apenas letras válidas!\n");
                continue;
            }

            char letraMinuscula = Character.toLowerCase(letraOriginal);

            boolean ehVogal = switch (letraMinuscula) {
                case 'a', 'e', 'i', 'o', 'u' -> true;
                default -> false;
            };

            if (ehVogal) {
                System.out.println("Erro: '" + letraOriginal + "' é uma vogal!\n");
            } else {
                consoantes[index] = letraOriginal;
                System.out.println("Sucesso: '" + letraOriginal + "' inserida!\n");
                index++;
            }
        }

        System.out.println("=== Array Final de Caracteres ===");
        System.out.println(java.util.Arrays.toString(consoantes));

        scanner.close();
    }
}
