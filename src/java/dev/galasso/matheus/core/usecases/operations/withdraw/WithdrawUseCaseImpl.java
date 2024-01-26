package java.dev.galasso.matheus.core.usecases.operations.withdraw;

import java.dev.galasso.matheus.core.entities.account.Account;

public class WithdrawUseCaseImpl implements WithdrawUseCase{
    @Override
    public void execute(Account account, double budget) {
        account.withdraw(scanner);
    }
}
