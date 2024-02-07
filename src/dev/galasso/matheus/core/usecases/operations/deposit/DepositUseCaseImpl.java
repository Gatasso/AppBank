package dev.galasso.matheus.core.usecases.operations.deposit;

import dev.galasso.matheus.core.entities.account.Account;

public class DepositUseCaseImpl implements DepositUseCase{
    @Override
    public void execute(Account account, double budget) {
        account.deposit(scanner);
    }
}