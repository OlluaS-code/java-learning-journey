package edu.saullo.firstweek.operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        // ========================================================================= 1. OPERADORES BÁSICOS (Soma, Subtração, Multiplicação e Módulo) =========================================================================
        int firstNumber = 10;
        int secondNumber = 3;

        int sumResult = firstNumber + secondNumber; // Soma (+)
        int subtractionResult = firstNumber - secondNumber; // Subtração (-)
        int multiplicationResult = firstNumber * secondNumber; // Multiplicação (*)
        int remainderResult = firstNumber % secondNumber; // Módulo (%) -> Resto da divisão de 10 por 3

        System.out.println("--- Operações Básicas ---");
        System.out.println(String.format("Soma: %d", sumResult));
        System.out.println(String.format("Subtração: %d", subtractionResult));
        System.out.println(String.format("Multiplicação: %d", multiplicationResult));
        System.out.println(String.format("Resto da Divisão (Módulo): %d", remainderResult));

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 2. A REGRA DA DIVISÃO (Inteiro vs Decimal)  =========================================================================
        System.out.println("--- Comportamento de Divisão ---");

        // Como vimos no Boletim, dividir dois inteiros joga os decimais fora (Truncamento)
        int integerDivision = firstNumber / secondNumber; // 10 / 3 vira 3
        System.out.println(String.format("Divisão entre inteiros: %d", integerDivision));

        // Para manter as casas decimais, pelo menos um dos números deve ser decimal (.0)
        double decimalDivision = firstNumber / 3.0; // 10 / 3.0 vira 3.3333...
        System.out.println(String.format("Divisão com número decimal: %.2f", decimalDivision));

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 3. PRECEDÊNCIA MATEMÁTICA (A Ordem dos Fatores Altera o Resultado) =========================================================================
        System.out.println("--- Precedência Matemática ---");

        // O Java segue a regra matemática real (PEMDAS): Multiplicação e Divisão acontecem ANTES.
        int wrongOrder = 5 + 2 * 4; // Primeiro faz 2 * 4 (= 8), depois soma 5. Resultado: 13.

        // Use parênteses para forçar o Java a priorizar a operação que você quer primeiro.
        int rightOrder = (5 + 2) * 4; // Primeiro faz 5 + 2 (= 7), depois multiplica por 4. Resultado: 28.

        System.out.println(String.format("Sem parênteses (5 + 2 * 4): %d", wrongOrder));
        System.out.println(String.format("Com parênteses ((5 + 2) * 4): %d", rightOrder));

        System.out.println("\n------------------------------------------------\n");

        // ========================================================================= 4. OPERADORES DE INCREMENTO E DECREMENTO (Pré vs Pós) =========================================================================
        System.out.println("--- Incremento e Decremento ---");

        int currentNumber = 5;

        // PÓS-INCREMENTO (Variavel++): O Java usa o valor atual da variável e SÓ DEPOIS soma 1.
        System.out.println(String.format("Valor no Pós-Incremento: %d", currentNumber++)); // Printa 5, mas vira 6 na memória
        System.out.println(String.format("Valor na linha seguinte: %d", currentNumber)); // Agora printa 6

        // PRÉ-INCREMENTO (++Variavel): O Java soma 1 primeiro e DEPOIS usa o valor atualizado.
        System.out.println(String.format("Valor no Pré-Incremento: %d", ++currentNumber)); // Soma 1 (6 vira 7) e já printa 7

        // O mesmo vale para o decremento com o sinal de menos (currentNumber-- ou --currentNumber)

        // ========================================================================= 5. MISTURANDO NÚMEROS E STRINGS (Conversão e Concatenação) =========================================================================

        System.out.println("--- Concatenação de Números e Textos ---");

        // REGRA DE OURO NO JAVA: A execução acontece da esquerda para a direita.
        // O operador '+' serve tanto para somar quanto para juntar textos.
        // Assim que o Java esbarra em uma String ("1"), TUDO o que vem depois vira texto também.

        // Variação A: 1 + 1 + "1" + 1
        // Passo 1: Da esquerda para a direita, ele faz 1 + 1 = 2 (Operação matemática pura).
        // Passo 2: Ele pega o resultado 2 e encontra a String "1". Ele junta os dois -> "21".
        // Passo 3: Ele pega a String "21" e encontra o número 1. Vira tudo texto -> "211".
        String variationA = 1 + 1 + "1" + 1;

        // Variação B: "1" + (1 + 1 + 1)
        // Os parênteses quebram a regra da esquerda para a direita porque têm prioridade máxima.
        // Passo 1: O Java resolve os parênteses primeiro -> 1 + 1 + 1 = 3 (Matemática pura).
        // Passo 2: Ele junta a String "1" com o resultado 3 -> "13".
        String variationB = "1" + (1 + 1 + 1);

        // Variação C: "1" + 1 + 1 + 1
        // Sem parênteses, ele começa direto com o texto "1".
        // Daqui para a frente, nenhum número consegue somar matematicamente; todos vão apenas grudando atrás.
        // Resultado final: "1111"
        String variationC = "1" + 1 + 1 + 1;

        System.out.println("Variação A (1 + 1 + \"1\" + 1): " + variationA);
        System.out.println("Variação B (\"1\" + (1 + 1 + 1)): " + variationB);
        System.out.println("Variação C (\"1\" + 1 + 1 + 1): " + variationC);
    }
}
