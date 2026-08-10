package edu.saullo.firstweek;

public class BoletimEstudantil {
    public static void main(String[] args) {
        String nome = "Rebeca";
        double nota1 = 4.6;
        double nota2 = 7.4;

        String mediaVerificada = verificarSituacao(nome, nota1, nota2);

        System.out.println(mediaVerificada);
    }

    public static String verificarSituacao(String nome, double nota1, double nota2) {
        double mediaFinal = (nota1 + nota2) / 2.0;

        if (mediaFinal < 6.0)
            return String.format("O aluno %s ficou com média %.2f, portanto está REPROVADO", nome, mediaFinal);
        else if (mediaFinal == 6.0)
            return String.format("O aluno %s ficou com média %.2f, portanto está em PROVA MINERVA", nome, mediaFinal);
        else
            return String.format("O aluno %s ficou com média %.2f, portanto está APROVADO", nome, mediaFinal);

    }

}
