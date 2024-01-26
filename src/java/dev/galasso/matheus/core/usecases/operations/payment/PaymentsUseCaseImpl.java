package java.dev.galasso.matheus.core.usecases.operations.payment;

import java.dev.galasso.matheus.core.entities.account.Account;

public class PaymentsUseCaseImpl implements PaymentsUseCase{
    @Override
    public void execute(Account account, double budget) {
        account.payBills(scanner);
    }
}
