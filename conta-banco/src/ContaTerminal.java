import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Por favor, digite o número da conta!");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.next();

        System.out.println("Como podemos te chamar?");
        String nome = sc.next();

        System.out.println("Quanto gostaria de depositar?");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
