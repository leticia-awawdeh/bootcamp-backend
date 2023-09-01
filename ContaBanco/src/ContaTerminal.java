import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

public static void main (String[] args){
    Scanner scanner =  new Scanner (System.in).useLocale(Locale.US);

    System.out.println ("Digite o nome do cliente: ");
    String nomeCliente = scanner.next();


    System.out.println ("Digite o número da agência: ");
    int agencia = scanner.nextInt();

    System.out.println ("Digite o número da conta: ");
    int conta = scanner.nextInt();

    System.out.println ("Digite o saldo da conta: ");
    double saldo = scanner.nextDouble();


    System.out.println ("olá " + nomeCliente + " Obrigado(a) por criar sua conta no Banco do Brasil, sua agência é " + agencia + " e sua conta é " + conta + " e o seu saldo é " + saldo + " reais.");
    }
}

