package dev.galasso.matheus.core.usecases.operations.check;

import dev.galasso.matheus.core.entities.account.Account;

public interface CheckBalanceUseCase {
    void execute(Account account);
}