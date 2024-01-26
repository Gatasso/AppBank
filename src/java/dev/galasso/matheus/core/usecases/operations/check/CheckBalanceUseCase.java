package java.dev.galasso.matheus.core.usecases.operations.check;

import java.dev.galasso.matheus.core.entities.account.Account;

public interface CheckBalanceUseCase {
    void execute(Account account);
}