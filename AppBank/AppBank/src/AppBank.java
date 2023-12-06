import br.com.appbank.Account;
import br.com.appbank.SavingAccount;

import java.util.Scanner;
public class AppBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account acc01 = new Account("Matheus", "0001", "Checking");
        acc01.initialMenu();
        //operações interativas
        String commandMenu = "Running";
        while (!commandMenu.equals("Q")) {
        acc01.creditLimit();
        acc01.setMaintenanceTax();
        acc01.menu();
        commandMenu = scanner.next();


            switch (commandMenu) {
                case "Q":
                    System.out.println("Sessão Encerrada");
                    break;
                case "C":
                    acc01.check();
                    break;
                case "D":
                    acc01.deposit(scanner);
                    break;
                case "W":
                    acc01.withdraw(scanner);
                    break;
                case "P":
                    acc01.payBills(scanner);
                    break;
                case "I":
                    SavingAccount SAcc = new SavingAccount(acc01.getNameClient(), acc01.getCodigo(), "Saving","Saver");
                    SAcc.menu();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } scanner.close();
    }
}
