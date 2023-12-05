import br.com.appbank.CheckingAccount;

import java.util.Scanner;
public class AppBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckingAccount acc01 = new CheckingAccount("Matheus", "0001");
        /*SavingAccount acc01 = null;
        acc01.welcomeMenu(scanner); */
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
                    acc01.opCheck();
                    break;
                case 2: 
                    acc01.opDeposit(scanner);
                    break;
                case 3:
                    acc01.opWithdraw(scanner);
                    break;
                case 4:
                    acc01.opPayBills(scanner);
                case 5:
                    break;
                default: 
                    System.out.println("Opção inválida");
            }
        } scanner.close();
    }
}
