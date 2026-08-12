package edu.saullo.firstweek.practice.arrays;

import java.util.Random;

/**
 * PracticeTree
 */
public class PracticeTree {

    public static void main(String[] args) {
        Random random = new Random(9);

        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matrix: ");
        for (int[] row : M) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}