import java.util.Scanner;
import java.util.Locale;

public class ContaBanco{
    public static void main(String[] args){

        //Objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Numero: ");
        int numero = scanner.nextInt();

        System.out.println("Agência: ");
        String agencia = scanner.next();

        System.out.println("Seu nome: ");
        String nome = scanner.next();

        System.out.println("Seu saldo: ");
        double saldo = scanner.nextDouble();

        //Imprimindo dados do usuário
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Seu nome: " + nome);
        System.out.println("Saldo: " + saldo);

    }
}