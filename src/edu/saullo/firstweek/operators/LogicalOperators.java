package edu.saullo.firstweek.operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // Dados de teste para os exemplos de regras de negócio
        int studentAge = 20;
        double accountBalance = 150.00;
        double ticketPrice = 50.00;
        boolean hasParentalPermission = false;

        // ========================================================================= 1. OPERADOR LÓGICO "E" (&&) - AND =========================================================================
        System.out.println("--- Testando Operador E (&&) ---");

        // Regra: Para comprar a entrada, o estudante deve ser maior de idade (>= 18)
        // E também deve ter dinheiro suficiente na conta (balance >= price).
        // Ambas as condições RELACIONAIS precisam dar TRUE para o resultado final ser TRUE.
        
        boolean canBuyTicket = (studentAge >= 18) && (accountBalance >= ticketPrice);

        if (canBuyTicket)
            System.out.println("Compra autorizada: O aluno cumpre ambos os requisitos.");
        else
            System.out.println("Compra negada: Um ou nenhum dos requisitos foi atendido.");

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 2. OPERADOR LÓGICO "OU" (||) - OR =========================================================================
        System.out.println("--- Testando Operador OU (||) ---");

        // Regra: Para entrar em um evento restrito, o jovem precisa ter 18 anos ou mais
        // OU possuir uma autorização assinada pelos pais (hasParentalPermission == true).
        // Apenas UMA das condições relacionais precisa dar TRUE para o bloco ser executado.
        
        boolean entranceAllowed = (studentAge >= 18) || (hasParentalPermission == true);

        if (entranceAllowed)
            System.out.println("Entrada liberada: Pelo menos uma condição é válida.");
        else
            System.out.println("Entrada barrada: O jovem não cumpre nenhuma condição.");

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 3. MISTURANDO OPERADORES E PRECEDÊNCIA (&& com ||) =========================================================================
        System.out.println("--- Misturando Relacionais e Lógicos ---");

        // Dados para um cenário de promoção de cinema
        boolean isStudent = true;
        int age = 15;
        boolean isTuesday = true;

        // Regra: Tem direito a meia-entrada quem for estudante E menor de 18 anos, OU qualquer pessoa se hoje for terça-feira.
        // Cuidado: O operador '&&' tem prioridade sobre o '||' por padrão no Java!
        // Use parênteses para agrupar as regras relacionais e deixar a lógica limpa.
        
        if ((isStudent && age < 18) || isTuesday)
            System.out.println("Desconto aplicado: Regra de meia-entrada validada!");
        else
            System.out.println("Valor integral: Sem direito a descontos.");

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 4. ENTENDENDO O CURTO-CIRCUITO (Efeito de Performance) =========================================================================
        System.out.println("--- Como o Curto-Circuito Funciona ---");

        int capacity = 100;
        int currentGuests = 100;

        // No operador '&&', se a primeira condição relacional for FALSO, o Java é esperto:
        // ele já sabe que o resultado final será FALSO e ignora completamente a segunda metade.
        if ((currentGuests < capacity) && (accountBalance > 0))
            System.out.println("Há vagas disponíveis.");

        // No operador '||', se a primeira condição for VERDADEIRO, o Java também entra em curto-circuito:
        // ele ignora a segunda metade porque sabe que o resultado final já está garantido como VERDADEIRO.
        if ((studentAge >= 18) || (accountBalance / 0 == 0)) 
            System.out.println("Curto-circuito evitou um erro de divisão por zero na segunda condição!");
    }
}
