package java.dev.galasso.matheus.core.entities.account;

import java.util.Scanner;

public interface Operations {
    void check();

    void deposit(Scanner scanner);

    void withdraw(Scanner scanner);

    void payBills(Scanner scanner);
}
