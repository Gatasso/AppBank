package java.dev.galasso.matheus.core.usecases.operations.deposit;

import java.dev.galasso.matheus.core.entities.account.Account;

public class DepositUseCaseImpl implements DepositUseCase{
    @Override
    public void execute(Account account, double budget) {
        account.deposit(scanner);
    }
}