package edu.saullo.firstweek;

/**
 * Classe responsável por realizar a concatenação de nomes.
 * Demonstra o uso de sobrecarga de métodos (overloading) para manipulação de
 * strings.
 *
 * @author Saullo Moura Tavares
 * @since 1.0
 * @version 1.0
 */
public class ConcatName {

    /**
     * Ponto de entrada principal do programa.
     * Inicializa os nomes e exibe o resultado da concatenação no console.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        String firstName;
        String secondName;
        String thirdName;

        firstName = "Saullo";
        secondName = "Moura";
        thirdName = "Tavares";

        String nameComplete = nameComplete(firstName, secondName, thirdName);
        System.out.println(nameComplete);
    }

    /**
     * Concatena dois nomes. Transfere a execução para o método principal de três
     * parâmetros,
     * passando uma string vazia no último argumento.
     *
     * @param firstName  O primeiro nome.
     * @param secondName O segundo nome (sobrenome intermediário).
     * @return O resultado da concatenação dos dois nomes.
     */
    public static String nameComplete(String firstName, String secondName) {
        return nameComplete(firstName, secondName, "");
    }

    /**
     * Concatena até três nomes, validando se o terceiro nome existe e não está
     * vazio.
     *
     * @param firstName  O primeiro nome.
     * @param secondName O segundo nome (sobrenome intermediário).
     * @param thirdName  O terceiro nome (último sobrenome). Pode ser nulo ou vazio.
     * @return Uma string formatada contendo os nomes concatenados.
     */
    public static String nameComplete(String firstName, String secondName, String thirdName) {
        String resultadoParse = "Retorno do Metodo " + firstName.concat(" ").concat(secondName);

        if (thirdName != null && !thirdName.isEmpty()) {
            resultadoParse = resultadoParse.concat(" ").concat(thirdName);
        }

        return resultadoParse;
    }
}
