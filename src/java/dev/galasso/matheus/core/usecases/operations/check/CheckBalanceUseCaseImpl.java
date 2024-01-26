package java.dev.galasso.matheus.core.usecases.operations.check;

import java.dev.galasso.matheus.core.entities.account.Account;

public class CheckBalanceUseCaseImpl implements CheckBalanceUseCase{
    @Override
    public void execute(Account account) {
        account.check();
    }
}