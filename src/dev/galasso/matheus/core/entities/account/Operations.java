package dev.galasso.matheus.core.entities.account;

import dev.galasso.matheus.core.entities.exceptions.MoneyNotEnoughException;

import java.util.Scanner;

public interface Operations {
    void check();

    void deposit(Scanner scanner);

    void withdraw(Scanner scanner)throws MoneyNotEnoughException;

    void payBills(Scanner scanner)throws MoneyNotEnoughException;
}
