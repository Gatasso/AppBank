package dev.galasso.matheus.test;

import dev.galasso.matheus.core.entities.account.Account;
import dev.galasso.matheus.core.entities.account.AccountType;
import dev.galasso.matheus.core.entities.exceptions.MoneyNotEnoughException;
import java.util.Scanner;

public class AppBank2 {
    public static void main(String[] args) throws MoneyNotEnoughException {
        Scanner scan = new Scanner(System.in);
        Account account = new Account("Matheus", AccountType.CHECKING);
        account.deposit(scan);
        account.printTaxes();
        account.withdraw(scan);
        account.printTaxes();
    }
}