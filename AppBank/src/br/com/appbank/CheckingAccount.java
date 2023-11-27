package br.com.appbank;
import java.util.Scanner;

public class CheckingAccount extends Account {
    private double maintenanceTax, creditLimit, paymentValue;

    @Override
    public void menu() {
        System.out.printf("""
                ***************************
                          MGR BANK
                %s                %s \s
                1 - Consultar Saldo
                2 - Depósito
                3 - Saque
                4 - Pagar Conta
                5 - Sair   \s
                """,maintenanceTax,creditLimit);
    }

    @Override
    public void opWithdraw(Scanner scanner) {
        System.out.println("Qual o valor do saque?");
        setWithDrawValue(scanner.nextDouble());
        setBudgetClient(budgetClient- (withDrawValue *(1+maintenanceTax)));
        System.out.println("Saldo atualizado para: R$" + budgetClient);
    }
    public void payBills(Scanner scanner) {
        System.out.println("Informe o valor da conta:");
        setPaymentValue(scanner.nextDouble());
        setBudgetClient(budgetClient - paymentValue);
        System.out.println("Saldo atualizado para: R$" + budgetClient);
    }
    public void creditLimit() {
        if (budgetClient < 1000) this.creditLimit = 4000;
        else if (budgetClient < 10000) this.creditLimit = 6000;
        else this.creditLimit = 10000;
    }
    public void setPaymentValue(double paymentValue) {
        if (paymentValue > budgetClient + creditLimit) {
            System.out.println("Saldo insuficiente para pagar a conta");
        }else this.paymentValue = paymentValue;
    }
    public void maintenanceTax() {
        if (budgetClient < 1000) this.maintenanceTax = 0.02;
        else if (budgetClient < 10000) this.maintenanceTax = 0.04;
        else this.maintenanceTax = 0.08;
    }
}