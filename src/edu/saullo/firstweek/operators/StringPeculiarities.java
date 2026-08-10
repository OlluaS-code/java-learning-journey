package edu.saullo.firstweek.operators;

public class StringPeculiarities {

    // Ajustado de 'string' para 'main' para o Java conseguir executar o arquivo
    public static void main(String[] args) {

        // =========================================================================
        // 1. O POOL DE STRINGS E A ARMADILHA DO '=='
        // =========================================================================
        String name1 = "Saullo";
        String name2 = "Saullo"; // O Java reaproveita o endereço de "Saullo" do Pool de Strings

        // Criando uma String com 'new' força o Java a criar um objeto totalmente novo
        // na memória, ignorando o Pool, mesmo que o texto interno seja idêntico.
        String name3 = new String("Saullo");

        System.out.println("--- Comparison Test ---");

        // COMPARANDO COM '==': Ele olha o endereço de memória, não o conteúdo!
        System.out.println("name1 == name2? " + (name1 == name2)); // Retorna true (apontam para o mesmo Pool)
        System.out.println("name1 == name3? " + (name1 == name3)); // Retorna false (endereços de memória diferentes!)

        // COMPARANDO COM '.equals()': O JEITO CERTO. Compara o conteúdo real do texto.
        System.out.println("name1.equals(name3)? " + name1.equals(name3)); // Retorna true

        System.out.println("\n------------------------------------------------\n");

        // =========================================================================
        // 2. IMUTABILIDADE VS PERFORMANCE (StringBuilder)
        // =========================================================================
        System.out.println("--- Text Modification Test ---");

        String mutableText = "Java";
        // Toda vez que concatenamos com '+', o Java cria um NOVO objeto na memória.
        // Fazer isso dentro de loops grandes detona a performance do sistema.
        mutableText = mutableText + " 25";
        System.out.println("Text modified with '+': " + mutableText);

        // A SOLUÇÃO: StringBuilder (Funciona como um array dinâmico de caracteres)
        // Ele modifica o texto diretamente no mesmo endereço de memória.
        StringBuilder textBuilder = new StringBuilder("Node.js");
        textBuilder.append(" to").append(" Java"); // Modifica o mesmo objeto existente

        String finalResult = textBuilder.toString(); // Converte de volta para String no final
        System.out.println("Efficient text with StringBuilder: " + finalResult);

        System.out.println("\n------------------------------------------------\n");

        // =========================================================================
        // 3. MÉTODOS ÚTEIS DO MUNDO REAL
        // =========================================================================
        System.out.println("--- Utility Methods Test ---");

        String userInput = "   Rebeca_Santos@email.com   ";

        // .trim() -> Limpa os espaços em branco nas pontas (Padrão camelCase)
        String cleanEmail = userInput.trim();

        // .length() -> No Java precisa dos parênteses '()' por ser um método de classe
        System.out.println("Clean text length: " + cleanEmail.length());

        // .contains() -> Verifica se o trecho de texto existe dentro da String
        if (cleanEmail.contains("@"))
            System.out.println("It is a valid email!");

        // .isEmpty() -> Retorna verdadeiro (true) se o texto for igual a ""
        String emptyText = "";
        System.out.println("Is the text empty? " + emptyText.isEmpty());
    }
}
