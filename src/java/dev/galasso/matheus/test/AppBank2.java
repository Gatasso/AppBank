package java.dev.galasso.matheus.test;

import java.dev.galasso.matheus.core.entities.account.Account;
import java.dev.galasso.matheus.core.entities.account.AccountType;
import java.util.Scanner;

public class AppBank2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account account = new Account("Matheus", AccountType.CHECKING);
        account.deposit(scan);
        account.printTaxes();
        account.withdraw(scan);
        account.printTaxes();
    }
}