package edu.saullo.firstweek.methods;

public class MethodsPeculiarities {

    // =========================================================================
    // 1. O MÉTODO PRINCIPAL (Ponto de Entrada)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("--- Executando Testes de Métodos ---");

        // Chamando um método estático diretamente dentro do main
        int sumResult = sumNumbers(15, 35);
        System.out.println("Resultado da soma: " + sumResult);

        // Chamando um método que retorna texto
        String welcomeMessage = generateWelcomeMessage("Saullo");
        System.out.println(welcomeMessage);

        // Chamando um método sem retorno (void)
        logSystemStatus("Online");
    }

    // =========================================================================
    // 2. MÉTODO COM RETORNO NUMÉRICO E ESPECIFICAÇÃO DE TIPO
    // =========================================================================
    // Convenção de Nomenclatura: Sempre use verbos em camelCase (ex: sumNumbers).
    // 'public': Acessível por qualquer outra classe do projeto.
    // 'static': Significa que o método pertence à classe, permitindo ser chamado
    // diretamente por outro método estático (como o main) sem criar um objeto.
    // 'int': Define estritamente o tipo de dado que DEVE ser retornado pelo
    // 'return'.
    public static int sumNumbers(int firstNumber, int secondNumber) {
        // O Java obriga você a retornar exatamente o tipo prometido na assinatura (int)
        return firstNumber + secondNumber;
    }

    // =========================================================================
    // 3. MÉTODO COM RETORNO DE OBJETO (String) E VALIDAÇÃO DE PARÂMETROS
    // =========================================================================
    // No Java, você DEVE tipar cada parâmetro individualmente.
    // Não existe atalho como 'String firstName, lastName'. Deve ser feito um por
    // um.
    public static String generateWelcomeMessage(String userName) {
        // Boa prática: Sempre verifique se os objetos passados por parâmetro não são
        // nulos
        if (userName == null || userName.isEmpty()) {
            return "Welcome, Guest!"; // Se entrar no IF, o método morre aqui e retorna
        }

        return "Welcome back, " + userName + "!";
    }

    // =========================================================================
    // 4. MÉTODO SEM RETORNO (O famoso 'void')
    // =========================================================================
    // 'void' significa vazio. Esse método executa uma ação (ex: salvar no banco,
    // printar na tela, enviar um log), mas não devolve nenhum dado para quem o
    // chamou.
    // Portanto, o uso da palavra-chave 'return' aqui dentro é proibido (ou usado
    // apenas vazio para parar a execução).
    public static void logSystemStatus(String status) {
        System.out.println("[LOG SYSTEM] Current status: " + status);
        // Não há 'return' aqui!
    }
}
