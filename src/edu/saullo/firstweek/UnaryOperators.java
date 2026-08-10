package edu.saullo.firstweek;

public class UnaryOperators {
    public static void main(String[] args) {

        // ========================================================================= 1. OPERADORES DE SINAL MÁTEMÁTICO (+ e -) =========================================================================
        int positiveNumber = 10; // Por padrão, números sem sinal já são positivos

        // O operador unário '-' inverte o sinal aritmético do valor atual da variável
        int negativeNumber = -positiveNumber; // Vira -10

        // Se você aplicar o menos '-' em um número que já é negativo, ele vira positivo (Regra de sinais)
        int turnedPositive = -negativeNumber; // -(-10) vira 10 novamente

        System.out.println("--- Sinais Matemáticos Unários ---");
        System.out.println(String.format("Número original: %d", positiveNumber));
        System.out.println(String.format("Número negativado: %d", negativeNumber));
        System.out.println(String.format("Negativo negativado (Inversão): %d", turnedPositive));

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 2. OPERADOR DE NEGAÇÃO LÓGICA (!) =========================================================================
        // O operador de exclamação '!' serve estritamente para o tipo primitivo 'boolean'.
        // Ele inverte o valor lógico atual (verdadeiro vira falso, e vice-versa).
        boolean isLearningJava = true;
        boolean isTired = false;

        System.out.println("--- Negação Lógica ---");
        System.out.println("Estudando Java? " + isLearningJava);
        System.out.println("O oposto de estudando Java: " + !isLearningJava); // Printa false
        System.out.println("Está cansado? " + isTired);
        System.out.println("O oposto de cansado: " + !isTired); // Printa true

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 3. OPERADORES DE INCREMENTO E DECREMENTO (++ e --) =========================================================================
        // Eles também entram no grupo de unários porque alteram o valor de uma única variável.
        System.out.println("--- Incremento e Decremento (Unários) ---");

        int stepsCount = 20;

        // Incremento: adiciona 1 ao valor atual da variável
        stepsCount++; // Agora vale 21
        System.out.println(String.format("Contagem após incremento (++): %d", stepsCount));

        // Decremento: subtrai 1 do valor atual da variável
        stepsCount--; // Volta a valer 20
        System.out.println(String.format("Contagem após decremento (--): %d", stepsCount));
    }
}
