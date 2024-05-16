import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da conta:");
        Integer conta = Integer.valueOf(sc.nextLine());
        System.out.print("Digite a agência:");
        String agencia = sc.nextLine();
        System.out.print("Digite o nome do cliente:");
        String nome = sc.nextLine();
        System.out.print("Digite o saldo inicial:");
        Double saldo = Double.valueOf(sc.nextLine());

        System.out.println();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, conta, saldo);
    }
}