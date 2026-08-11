public class App {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];

        // Conversão (Parsing) dos tipos primitivos usando classes Wrapper
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        // Exibição dos dados formatados no console
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
