package java.dev.galasso.matheus.core.usecases.operations.deposit;

import java.dev.galasso.matheus.core.entities.account.Account;
import java.util.Scanner;

public interface DepositUseCase {
    Scanner scanner = new Scanner(System.in);
    void execute(Account account, double budget);
}