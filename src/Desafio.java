import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Big Smog";
        String tipoConta = "Poupança";
        double saldo = 0;
        int opcao = 0;
        double valor;

        System.out.println("**************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo do cliente: " + saldo);
        System.out.println("**************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        Scanner ler = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = ler.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("O saldo atual é : R$"+saldo);
                    break;
                case 2:
                    System.out.println("Quanto deseja transferir?");
                    valor = ler.nextDouble();
                    if (valor > saldo){
                        System.out.println("Saldo menor do que o valor!");
                    }else {
                        saldo -= valor;
                        System.out.println("Tranferencia realizada com sucesso!");
                    }
                    break;
                case 3:
                    System.out.print("Valor a ser recebido: R$");
                    valor = ler.nextDouble();
                    saldo += valor;
                    break;
                default:
                    System.out.println("Opção INVALIDA");
            }
        }
    }
}