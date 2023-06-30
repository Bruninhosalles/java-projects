import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int conta = scanner.nextInt();

        System.out.println("Agora digite o número da agência!");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo!");
        String nomeCliente = scanner.next();
        nomeCliente = nomeCliente + scanner.nextLine();


        System.out.println("Digite o valor do seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " " + conta + " e seu saldo: " + saldo + " já está disponível para saque.");

    }
}
