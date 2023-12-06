package br.com.appbank;

import br.com.appbank.operations.Operations;
import java.util.Scanner;

public class Account implements Operations {
    protected String nameClient, codigo, accType;
    private double depositValue, withDrawValue, paymentValue, maintenanceTax, creditLimit;
    protected  double budgetClient;

    public Account(String nameClient, String codigo, String accType){
        this.nameClient = nameClient;
        this.codigo = codigo;
        this.accType = accType;
    }
/*********************************************************************************************************************/
//Setters
    public void setBudgetClient(double budgetClient) {
        this.budgetClient = budgetClient;
    }

    public void setDepositValue(double depositValue) {
        this.depositValue = depositValue;
    }

    public void setWithDrawValue(double withDrawValue) {
        if (withDrawValue> budgetClient) {
            System.out.println("Operação inválida");
            System.out.println("Saque maior que Saldo");
            this.withDrawValue = 0;
        }else {
            this.withDrawValue = withDrawValue;
        }
    }

    public void setMaintenanceTax() {
        if (budgetClient < 1000) this.maintenanceTax = 0.02;
        else if (budgetClient < 10000) this.maintenanceTax = 0.04;
        else this.maintenanceTax = 0.08;
    }

    public void setPaymentValue(double paymentValue) {
        if (paymentValue > budgetClient + creditLimit) {
            System.out.println("Saldo insuficiente para pagar a conta");
        }else this.paymentValue = paymentValue;
    }
/*********************************************************************************************************************/
// methods

    /* public void welcomeMenu(Scanner scanner){
        //coletando dados iniciais
        System.out.println("Seja bem vindo, informe seu nome");
        setNameClient(scanner.next());
        System.out.println("Qual será o tipo da sua conta?");
        System.out.println("Corrente ou Poupança?");
        setAccType(scanner.next());
    }  */

public void initialMenu() {
    System.out.printf("""
                ***************************
                         MGR BANK

                NAME:  %s      %s\s
                %n""", nameClient, codigo);
}

    public void  menu(){
        if(accType.equals("Checking")){
            System.out.printf("""
                ***************************
                          MGR BANK
                Limite: R$%s\s
                Taxa Manutenção: %s %%\s
                1 - Consultar Saldo
                2 - Depósito
                3 - Saque
                4 - Pagar Conta
                5 - Sair   \s
                """,creditLimit,maintenanceTax);
        }
        System.out.printf("""
                ***************************
                          MGR BANK
                %s                %s \s
                1 - Consultar Saldo
                2 - Depósito
                3 - Saque
                4 - Sair   \s
                """,nameClient,codigo);
    }

    @Override
    public void check() {
        System.out.println("O seu saldo é de: R$" + budgetClient);
    }

    @Override
    public void deposit(Scanner scanner) {
        System.out.println("Qual o valor do depósito?");
        setDepositValue(scanner.nextDouble());
        setBudgetClient(budgetClient + depositValue);
        System.out.println("Saldo atualizado para: R$" + budgetClient);
    }

    @Override
    public void withdraw(Scanner scanner) {
        if(accType.equals("Checking")){
            System.out.println("Qual o valor do saque?");
            setWithDrawValue(scanner.nextDouble());
            setBudgetClient(budgetClient- (withDrawValue *(1+maintenanceTax)));
            System.out.println("Saldo atualizado para: R$" + budgetClient);
        }else{
            System.out.println("Qual o valor do saque?");
            setWithDrawValue(scanner.nextDouble());
            setBudgetClient(budgetClient- withDrawValue);
            System.out.println("Saldo atualizado para: R$" + budgetClient);
        }
    }

    @Override
    public void payBills(Scanner scanner) {
        System.out.println("Informe o valor da conta:");
        setPaymentValue(scanner.nextDouble());
        setBudgetClient(budgetClient - paymentValue);
        System.out.println("Saldo atualizado para: R$" + budgetClient);
    }

    @Override
    public void creditLimit() {
        if (budgetClient < 1000) this.creditLimit = 4000;
        else if (budgetClient < 10000) this.creditLimit = 6000;
        else this.creditLimit = 10000;
    }
}