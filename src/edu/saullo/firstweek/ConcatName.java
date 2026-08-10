package edu.saullo.firstweek;

public class ConcatName {
    public static void main(String[] args) {
        String primeiroNome;
        String segundoNome;
        String terceiroNome;

        primeiroNome = "Saullo";
        segundoNome = "Moura";
        terceiroNome = "Tavares";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return nomeCompleto(primeiroNome, segundoNome, "");
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome, String terceiroNome) {
        String resultadoParse = "Retorno do Metodo " + primeiroNome.concat(" ").concat(segundoNome);

        if (terceiroNome != null && !terceiroNome.isEmpty()) {
            resultadoParse = resultadoParse.concat(" ").concat(terceiroNome);
        }

        return resultadoParse;
    };
}
