import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = sc.next();
        System.out.println("Por favor, Digite o número da Agência.");
        String agencia = sc.next();
        System.out.println("Por favor, Digite o  nùmero da sua Conta.");
        int numero = sc.nextInt();
        double saldo = 237.48;
        System.out.println("Òla " + nome + ".obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ ", sua conta é "
                + numero+ " e seu saldo é "+ saldo+ " já está disponivel para saque");



    }
}
