package edu.saullo.firstweek;

public class BoletimEstudantil {
    public static void main(String[] args) {
        String name = "Rebeca";
        double n1 = 4.6;
        double n2 = 7.4;

        String mediaVerificada = verificarSituacao(name, n1, n2);

        System.out.println(mediaVerificada);
    }

    public static String verificarSituacao(String name, double n1, double n2) {
        double finalGrade = (n1 + n2) / 2.0;

        if (finalGrade < 6.0)
            return String.format("O aluno %s ficou com média %.2f, portanto está REPROVADO", name, finalGrade);
        else if (finalGrade == 6.0)
            return String.format("O aluno %s ficou com média %.2f, portanto está em PROVA MINERVA", name, finalGrade);
        else
            return String.format("O aluno %s ficou com média %.2f, portanto está APROVADO", name, finalGrade);

    }

}
