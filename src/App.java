import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String firstname = scanner.next();

        System.out.println("Digite seu sobrenome");
        String lastname = scanner.next();

        System.out.println("Digite sua idade");
        int age = scanner.nextInt();

        System.out.println("Digite sua altura");
        double height = scanner.nextDouble();

        System.out.println("\nMeu nome é " + firstname);
        System.out.println("Meu sobrenome é " + lastname);
        System.out.println("Minha idade é " + age + " anos");
        System.out.println("Minha altura é " + height + "m");

    }
}
