import br.com.appbank.Account;
import java.util.Scanner;
public class AppBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account acc01 = new Account();
        //coletando dados iniciais
        System.out.println("Seja bem vindo, informe seu nome");
        acc01.setNameClient(scanner.next());
        System.out.println("Qual será o tipo da sua conta?");
        acc01.setAccType(scanner.next());
        System.out.println("Qual valor inicial você irá depositar?");
        acc01.setBudgetClient(scanner.nextDouble());
        acc01.initialMenu();
        int commandMenu = 0; //variável de controle para switch case

        //operações interativas
        while (commandMenu != 4) {
        acc01.menu();
        commandMenu = scanner.nextInt();
            
            switch (commandMenu) {
                case 1:
                    System.out.println("O seu saldo é de: R$" + acc01.getBudgetClient());
                    break;
                case 2: 
                    System.out.println("Qual o valor do depósito?");
                    acc01.setDepositValue(scanner.nextDouble());
                    acc01.setBudgetClient(acc01.getBudgetClient() + acc01.getDepositValue());
                    System.out.println("Saldo atualizado para: R$" + acc01.getBudgetClient());
                    break;
                case 3:
                    System.out.println("Qual o valor do saque?");
                    acc01.setWithDrawValue(scanner.nextDouble());
                    if (acc01.getWithDrawValue()> acc01.getBudgetClient()) {
                        System.out.println("Operação inválida");
                        System.out.println("Saque maior que Saldo");
                    } else {
                    acc01.setBudgetClient(acc01.getBudgetClient()- acc01.getWithDrawValue());
                    System.out.println("Saldo atualizado para: R$" + acc01.getBudgetClient());
                    }
                    break;
                default: 
                    System.out.println("Opção inválida");
            }
            
        }
        scanner.close();
    }
}
