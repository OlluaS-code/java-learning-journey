package edu.saullo.firstweek.practice;

import java.util.Scanner;

/**
 * SwitchCase
 */
public class SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o mês atual: ");
        String currentMonth = scanner.next();

        switchHolidays(currentMonth);
        switchWeek();
        switchNumber();

    }

    public static void switchWeek() {

        String day = "Terça";

        switch (day) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;

            default:
                System.out.println("Dia Inválido!");
                break;
        }
    }

    public static void switchNumber() {

        byte switchNumber = 6;

        switch (switchNumber) {
            case 1:

            case 2:

            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;

            default:
                System.out.println("Número Inválido!");
                break;
        }
    }

    public static void switchHolidays(String month) {

        String chosenMonth = month;

        switch (chosenMonth) {

            case "Janeiro":

            case "Julho":

            case "Dezembro":
                System.out.println("Estou de Férias");
                break;

            default:
                System.out.println("Estou Trabalhando!");
                break;
        }
    }
}
