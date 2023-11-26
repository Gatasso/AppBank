package br.com.appbank;

import java.util.Scanner;

public class Account{
    public String nameClient, accType;
    private double budgetClient, depositValue, withDrawValue;

    public void initialMenu() {
        System.out.printf("""
                ***************************
                         MGR BANK

                NAME:  %s      \s
                TIPO CONTA:  %s\s
                SALDO: R$ %.2f  \s
                %n""", nameClient, accType, budgetClient);
    }
    public void  menu(){
        System.out.printf("""
                ***************************
                          MGR BANK
                %s                %s   
                1 - Consultar Saldo
                2 - Depósito
                3 - Saque
                4 - Sair   \s
                """,nameClient,accType);
    }

    public void opCheck(){
        System.out.println("O seu saldo é de: R$" + getBudgetClient());
    }
    public void opDeposit (Scanner scanner){
        System.out.println("Qual o valor do depósito?");
        setDepositValue(scanner.nextDouble());
        setBudgetClient(getBudgetClient() + getDepositValue());
        System.out.println("Saldo atualizado para: R$" + getBudgetClient());
    }

    public void opWithdraw(Scanner scanner){
        System.out.println("Qual o valor do saque?");
        setWithDrawValue(scanner.nextDouble());
        if (getWithDrawValue()> getBudgetClient()) {
            System.out.println("Operação inválida");
            System.out.println("Saque maior que Saldo");
        } else {
            setBudgetClient(getBudgetClient()- getWithDrawValue());
            System.out.println("Saldo atualizado para: R$" + getBudgetClient());
        }
    }

    public void setBudgetClient(double budgetClient) {
        this.budgetClient = budgetClient;
    }
    public double getBudgetClient() {
        return budgetClient;
    }
    public void setDepositValue(double depositValue) {
        this.depositValue = depositValue;
    }
    public double getDepositValue() {
        return depositValue;
    }
    public void setWithDrawValue(double withDrawValue) {
        this.withDrawValue = withDrawValue;
    }
    public double getWithDrawValue() {
        return withDrawValue;
    }
    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
}

