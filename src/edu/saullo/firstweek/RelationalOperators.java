package edu.saullo.firstweek;

public class RelationalOperators {
    public static void main(String[] args) {

        // ========================================================================= 1. COMPARAÇÕES DE GRANDEZA (Maior, Menor, Maior ou Igual, Menor ou Igual) =========================================================================
        int studentAge = 21;
        int minimumAge = 18;

        boolean isOlder = studentAge > minimumAge;   
        boolean isYounger = studentAge < minimumAge; 

        boolean isOfAge = studentAge >= 18;        
        boolean isUnderAge = studentAge <= 17;      

        System.out.println("--- Comparações de Grandeza ---");
        System.out.println("O aluno é mais velho que a idade mínima? " + isOlder);
        System.out.println("O aluno é maior ou igual a 18 anos? " + isOfAge);

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 2. COMPARAÇÕES DE IGUALDADE E DIFERENÇA (== e !=) =========================================================================
        System.out.println("--- Igualdade e Diferença ---");

        int firstScore = 10;
        int secondScore = 8;

        boolean areScoresEqual = firstScore == secondScore; 
        boolean areScoresDifferent = firstScore != secondScore; 

        System.out.println("As notas são iguais (==)? " + areScoresEqual);
        System.out.println("As notas são diferentes (!=)? " + areScoresDifferent);

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 3. RELEMBRANDO A REGRA PARA OBJETOS (A exceção do ==) =========================================================================
        System.out.println("--- Alerta Importante (Primitivos vs Objetos) ---");

        int numberA = 5;
        int numberB = 5;
        System.out.println("Comparando inteiros com ==: " + (numberA == numberB)); 

        String textA = new String("Java");
        String textB = new String("Java");
        System.out.println("Comparando Strings com ==: " + (textA == textB)); 
        System.out.println("Comparando Strings com .equals(): " + textA.equals(textB)); 

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 4. APLICAÇÃO DOS OPERADORES RELACIONAIS DENTRO DE ESTRUTURAS IF =========================================================================
        System.out.println("--- Execução de Testes com IF ---");

        int ageInput = 16;
        int scoreInput = 7;

        // Exemplo 1: Usando uma variável booleana que já guardou a relação
        boolean canVote = ageInput >= 16;
        if (canVote)
            System.out.println("Resultado 1: O jovem já possui idade para votar.");

        // Exemplo 2: Fazendo a comparação relacional diretamente na condição do IF
        if (scoreInput >= 6)
            System.out.println("Resultado 2: Aprovado pelo critério de nota.");
        else
            System.out.println("Resultado 2: Reprovado pelo critério de nota.");

        // Exemplo 3: Testando igualdade exata (==)
        if (scoreInput == 10)
            System.out.println("Resultado 3: Desempenho perfeito! Nota máxima.");
        else
            System.out.println("Resultado 3: Nota abaixo da pontuação máxima.");
    }
}
