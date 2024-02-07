package dev.galasso.matheus.core.entities.account;

import dev.galasso.matheus.core.entities.exceptions.MoneyNotEnoughException;

import java.util.Scanner;

public class Account implements Operations {
    private AccountType accType;
    protected String nameClient, idCode;
    private double budgetClient, depositValue, withDrawValue, paymentValue;

    public Account(String nameClient, AccountType accTypeENUM) {
        this.nameClient = nameClient;
        this.accType = accTypeENUM;
//        accType.setUpLimits(this.budgetClient);
    }

    /*********************************************************************************************************************/
// methods
    @Override
    public void check() {
        System.out.println("O seu saldo é de: R$" + this.budgetClient);
    }

    @Override
    public void deposit(Scanner scanner) {
        System.out.println("Qual o valor do depósito?");
        setDepositValue(scanner.nextDouble());
        setBudgetClient(this.budgetClient + this.depositValue);
        System.out.println("Saldo atualizado para: R$" + this.budgetClient);
//        accType.setUpLimits(this.budgetClient);
    }

    @Override
    public void withdraw(Scanner scanner) throws MoneyNotEnoughException {
        System.out.println("Qual o valor do saque?");
        setWithDrawValue(scanner.nextDouble());
        setBudgetClient(this.budgetClient - (this.withDrawValue * (1 + accType.getMaintenanceTax())));
        System.out.println("Saldo atualizado para: R$" + this.budgetClient);
//        accType.setUpLimits(this.budgetClient);
    }

    @Override
    public void payBills(Scanner scanner)throws MoneyNotEnoughException {
        System.out.println("Informe o valor da conta:");
        setPaymentValue(scanner.nextDouble());
        setBudgetClient(this.budgetClient - this.paymentValue);
        System.out.println("Saldo atualizado para: R$" + this.budgetClient);
//        accType.setUpLimits(this.budgetClient);
    }

    /*********************************************************************************************************************/
    //Setters
    private void setBudgetClient(double budgetClient) {
        this.budgetClient = budgetClient;
    }

    public void setDepositValue(double depositValue) {
        this.depositValue = depositValue;
    }

    public void setWithDrawValue(double withDrawValue) throws MoneyNotEnoughException {
        if (withDrawValue > this.budgetClient) {
            throw new MoneyNotEnoughException();
        } else {
            this.withDrawValue = withDrawValue;
        }
    }

    public void setPaymentValue(double paymentValue) throws MoneyNotEnoughException{
        if (paymentValue > (this.budgetClient + accType.getCreditLimit())) {
            throw new MoneyNotEnoughException();
        } else this.paymentValue = paymentValue;
    }

    public void printTaxes(){
//        accType.setCreditLimit(budgetClient);
//        accType.setMaintenanceTax(budgetClient);
        System.out.println(accType.getMaintenanceTax());
        System.out.println(accType.getCreditLimit());
    }
    /*********************************************************************************************************************/
//getters
    public String getNameClient() {
        return nameClient;
    }

    public AccountType getAccType() {
        return accType;
    }

    public String getIdCode() {
        return idCode;
    }

    public double getBudgetClient() {

        return budgetClient;
    }
}
