package java.dev.galasso.matheus.core.usecases.operations.withdraw;

import java.dev.galasso.matheus.core.entities.account.Account;
import java.util.Scanner;

public interface WithdrawUseCase {
    Scanner scanner = new Scanner(System.in);
    void execute(Account account, double budget);
}