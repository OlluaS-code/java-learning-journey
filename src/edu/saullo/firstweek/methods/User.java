package edu.saullo.firstweek.methods;

public class User {

    public static void main(String[] args) throws Exception {
        // Criando a instância da nossa TV na memória
        SmartTv smartv = new SmartTv();

        System.out.println("--- ESTADO INICIAL DA TV ---");
        // sysout mostrando o estado de fábrica da TV
        System.out.println("A Tv está ligada ? " + smartv.isOn);
        System.out.println("Canal Atual: " + smartv.currentChannel);
        System.out.println("Volume Atual : " + smartv.currentVolume);

        System.out.println("\n--- INTERAGINDO COM A TV ---");

        // Ligando a TV e mudando as configurações usando os métodos que você criou
        smartv.turnOn();
        System.out.println("TV ligou.");

        smartv.increaseVolume(); // 25 + 1 = 26
        smartv.increaseVolume(); // 26 + 1 = 27
        smartv.changeChannel(12); // Vai direto para o canal 12
        smartv.nextChannel(); // Avança do 12 para o 13

        // Exibindo o novo estado após as modificações
        System.out.println("A Tv está ligada ? " + smartv.isOn);
        System.out.println("Canal Atual: " + smartv.currentChannel);
        System.out.println("Volume Atual : " + smartv.currentVolume);

        System.out.println("\n------------------------------------------------\n");

        // Desligando a TV
        smartv.turnOff();
        System.out.println("a TV desligou.");
        System.out.println("A Tv está ligada ? " + smartv.isOn);
    }
}
