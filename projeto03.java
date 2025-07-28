package projetos;
import java.util.Scanner;
public class projeto03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";
        double saldo = 0;
        System.out.println("Bem vindo ao caixa eletrônico");
        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");
        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Escolha uma opção: " +
                    " 1 - ver saldo" +
                    ", 2 - Depositar" +
                    ", 3 - Sacar");
                     int opcao = scanner.nextInt();
                        if (opcao == 1) {
                            System.out.println("Seu saldo atual: R$" + saldo);
                        } else if (opcao == 2) {
                            System.out.println("Qual valor voce gostaria de depositar?: ");
                            double deposito = scanner.nextDouble();
                            saldo = deposito + saldo;
                            System.out.println("Depositado com sucesso!");
                        } else if (opcao == 3) {
                            System.out.println("Qual o valor você gostaria de sacar?: ");
                            double saque = scanner.nextDouble();
                            saldo = saldo - saque;
                            System.out.println("Valor retirado com sucesso!");
                        }else {
                            System.out.println("Opção invalida!");
                        }
            System.out.println("Deseja continuar? (menu aparece de novo)");
                        continuar = scanner.next();
        }
        System.out.println("Fechando programa de banco! até logo");
        System.exit(0);
    }
}
