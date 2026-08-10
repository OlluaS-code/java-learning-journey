package edu.saullo.firstweek;

public class ConcatName {
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

    public static String nameComplete(String firstName, String secondName) {
        return nameComplete(firstName, secondName, "");
    }

    public static String nameComplete(String firstName, String secondName, String thirdName) {
        String resultadoParse = "Retorno do Metodo " + firstName.concat(" ").concat(secondName);

        if (thirdName != null && !thirdName.isEmpty()) {
            resultadoParse = resultadoParse.concat(" ").concat(thirdName);
        }

        return resultadoParse;
    };
}
