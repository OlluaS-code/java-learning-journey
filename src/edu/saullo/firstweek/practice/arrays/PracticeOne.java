package edu.saullo.firstweek.practice.arrays;

/**
 * PracticeOne
 */
public class PracticeOne {

    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6 };

        recursionVetor(vetor, 0);
    }

    public static void recursionVetor(int[] number, int count) {

        if (count >= number.length) {
            System.out.println("\nO Array já foi lido por completo!");
            return;
        }

        System.out.print(number[count] + " ");

        recursionVetor(number, count + 1);
    }

}