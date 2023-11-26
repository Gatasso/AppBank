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
                    acc01.opCheck();
                    break;
                case 2: 
                    acc01.opDeposit(scanner);
                    break;
                case 3:
                    acc01.opWithdraw(scanner);
                    break;
                case 4:
                    break;
                default: 
                    System.out.println("Opção inválida");
            }
            
        }
        scanner.close();
    }
}
