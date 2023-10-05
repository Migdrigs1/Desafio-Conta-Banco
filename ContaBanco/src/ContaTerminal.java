import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args)
    
    {

        Scanner scanner = new Scanner(System.in); 
        scanner.useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agencia!");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, seu saldo!");
        double saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco."); 
        System.out.println("Sua agência é " + numeroAgencia + ", conta " + numeroConta + ".");
        System.out.println("E seu saldo " + saldo + " já está disponível para saque");

    }
}
