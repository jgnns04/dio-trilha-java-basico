import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner  = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o numero de sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o numero de sua agencia: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite o seu saldo bancário: ");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo " + saldoCliente + " já está disponível para saque.");

    }
}
