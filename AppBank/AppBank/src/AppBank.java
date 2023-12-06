import br.com.appbank.Account;

import java.util.Scanner;
public class AppBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account acc01 = new Account("Matheus", "0001", "Checking") {
        };
        acc01.initialMenu();
        int commandMenu = 0; //variável de controle para switch case

        //operações interativas
        while (commandMenu != 5) {
        acc01.creditLimit();
        acc01.setMaintenanceTax();
        acc01.menu();
        commandMenu = scanner.nextInt();
            
            switch (commandMenu) {
                case 1:
                    acc01.check();
                    break;
                case 2: 
                    acc01.deposit(scanner);
                    break;
                case 3:
                    acc01.withdraw(scanner);
                    break;
                case 4:
                    acc01.payBills(scanner);
                case 5:
                    break;
                default: 
                    System.out.println("Opção inválida");
            }
        } scanner.close();
    }
}
