package br.com.appbank.operations;

import java.util.Scanner;

public interface Operations {

    void check();
    void deposit(Scanner scanner);
    void withdraw(Scanner scanner);
    void payBills(Scanner scanner);
    void creditLimit();
}
