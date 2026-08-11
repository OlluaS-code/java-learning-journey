package edu.saullo.firstweek.methods;

public class SmartTv {

    // =========================================================================
    // 1. ESCOPO DE CLASSE (Variáveis de Instância ou Atributos)
    // =========================================================================
    // Estas variáveis foram declaradas fora de qualquer método, direto no corpo da
    // classe.
    // Elas nascem quando o objeto TV é criado e duram enquanto a TV existir na
    // memória.
    // TODOS os métodos abaixo conseguem ler e alterar essas variáveis livremente.
    boolean isOn = false;
    int currentChannel = 1;
    int currentVolume = 25;

    // Exemplo de parâmetro: 'numberChannel' tem ESCOPO DE MÉTODO.
    // Ele nasce quando o método é chamado e morre quando o método fecha a chave
    // '}'.
    public void changeChannel(int numberChannel) {
        // Correto: 'currentChannel' (classe) recebe o valor de 'numberChannel' (método)
        currentChannel = numberChannel;
    }

    public void nextChannel() {
        currentChannel++;
    }

    public void previousChannel() {
        currentChannel--;
    }

    // =========================================================================
    // 2. EXEMPLO PRÁTICO DE ESCOPO DE MÉTODO (Variável Local)
    // =========================================================================
    public void increaseVolume() {
        // Esta variável 'volumeBoost' foi criada DENTRO deste método.
        // O escopo dela é estritamente local: ela só existe entre ESTAS chaves { }.
        int volumeBoost = 2;

        // Ela pode ler e alterar o 'currentVolume' porque ele tem escopo de classe
        currentVolume = currentVolume + volumeBoost;
    } // Aqui a variável 'volumeBoost' é destruída e APAGADA da memória RAM!

    public void decreaseVolume() {
        currentVolume--;

        // ERRO DE COMPILAÇÃO SE VOCÊ DESCOMENTAR A LINHA ABAIXO:
        // currentVolume = currentVolume - volumeBoost;
        // Por que dá erro? Porque 'volumeBoost' pertence ao escopo do método de cima.
        // O método 'decreaseVolume' não faz a menor ideia de que essa variável existe.
    }

    // =========================================================================
    // 3. ESCOPO DE BLOCO (Sub-escopo como IF ou FOR)
    // =========================================================================
    public void turnOn() {
        isOn = true;

        if (isOn) {
            // Esta variável 'welcomeMessage' pertence ao escopo DO BLOCO IF.
            // Ela nasce aqui dentro.
            String welcomeMessage = "Bem-vindo à sua SmartTV!";
            System.out.println(welcomeMessage);
        } // Ela morre exatamente nesta chave de fechamento do IF!

        // ERRO DE COMPILAÇÃO SE VOCÊ DESCOMENTAR A LINHA ABAIXO:
        // System.out.println(welcomeMessage);
        // O método 'turnOn' não consegue acessá-la aqui fora, mesmo estando na mesma
        // função.
    }

    public void turnOff() {
        isOn = false;
    }
}
