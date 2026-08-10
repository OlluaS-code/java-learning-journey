package edu.saullo.firstweek.operators;

public class TypeVariables {
    public static void main(String[] args) throws Exception {

        // 1. SEPARADOR DE MILHAR (UNDERLINE):
        // Usamos '_' para deixar valores como 2500 mais fáceis de ler (2_500.00).
        // O compilador ignora completamente os underlines na hora de rodar.
        double minimumWage = 2_500.00;

        // 2. DE MENOR PARA MAIOR (CASTING IMPLÍCITO):
        // Um 'short' (16 bits) cabe de forma segura dentro de um 'int' (32 bits).
        // Por isso, o Java faz essa transferência de valores de forma automática.
        short shortNumber = 1;
        int normalNumber = shortNumber;

        // 3. DE MAIOR PARA MENOR (CASTING EXPLÍCITO):
        // Um 'int' não cabe em um 'short' automaticamente porque o Java teme perda de
        // dados.
        // Usamos os parênteses '(short)' para avisar ao compilador: "Eu sei o que estou
        // fazendo".
        short shortNumber2 = (short) normalNumber;

        // 4. O SUFIXO 'L' PARA NÚMEROS LONG (Novidade importante!):
        // No Java, qualquer número inteiro digitado é tratado como 'int' por padrão.
        // Se você criar um 'long' para um número gigante (como CPF ou ID longo) e não
        // colocar
        // a letra 'L' no final, o Java vai dar erro de compilação dizendo que o número
        // é grande demais para um int.
        long idGrandao = 9_999_999_999L; // O 'L' avisa que o número é explicitamente do tipo long.

        // 5. A ARMADILHA DE IMPRECISÃO COM DOUBLE/FLOAT:
        // Tipos flutuantes (double e float) usam uma lógica binária que gera pequenas
        // imprecisões em contas decimais.
        // Veja esse cálculo: 0.1 + 0.2 deveria ser exatamente 0.3, mas o Java vai
        // printar 0.30000000000000004.
        // NUNCA use double para dinheiro ou sistemas financeiros em produção. Para
        // isso, usamos a classe 'BigDecimal'.
        double contaImprecisa = 0.1 + 0.2;

        // 1. VARIÁVEL COMUM (Mutável / Pode mudar)
        // Ao declarar 'int number = 5', o Java reserva um espaço na memória e guarda o
        // valor 5.
        int number = 5;

        // Como é uma variável comum, você pode reatribuir um novo valor a ela a
        // qualquer momento.
        // O valor antigo (5) é apagado da memória e substituído pelo novo valor (10).
        number = 10;

        // 2. CONSTANTE (Imutável / Nunca muda)
        // A palavra-chave 'final' avisa ao Java que este valor é definitivo e está
        // "bloqueado".
        // Por convenção de mercado, nomes de constantes sempre usam LETRAS_MAIÚSCULAS.
        // O 'f' no final do número 3.14f é obrigatório para dizer ao Java que este
        // número é um 'float'.
        final float VALUE_OF_PI = 3.14f;

        // Exibindo os resultados no console com os especificadores de formato
        System.out.println(String.format("Minimum wage formatted: $ %.2f", minimumWage));
        System.out.println(String.format("Converted short number: %d", shortNumber2));
        System.out.println(String.format("Id Long: %d", idGrandao));
        System.out.println(String.format("Resultado Impreciso do Double: %f", contaImprecisa));
    }
}
