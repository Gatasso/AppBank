package br.com.appbank;

import java.util.Scanner;

public class Account{
    private String nameClient, accType;
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
                %s                %s \s
                1 - Consultar Saldo
                2 - Depósito
                3 - Saque
                4 - Sair   \s
                """,nameClient,accType);
    }

    public void opCheck(){
        System.out.println("O seu saldo é de: R$" + budgetClient);
    }
    public void opDeposit (Scanner scanner){
        System.out.println("Qual o valor do depósito?");
        setDepositValue(scanner.nextDouble());
        setBudgetClient(budgetClient + depositValue);
        System.out.println("Saldo atualizado para: R$" + budgetClient);
    }

    public void opWithdraw(Scanner scanner){
        System.out.println("Qual o valor do saque?");
        setWithDrawValue(scanner.nextDouble());
        if (withDrawValue> budgetClient) {
            System.out.println("Operação inválida");
            System.out.println("Saque maior que Saldo");
        } else {
            setBudgetClient(budgetClient- withDrawValue);
            System.out.println("Saldo atualizado para: R$" + budgetClient);
        }
    }
/*********************************************************************************/
//Setters
    public void setBudgetClient(double budgetClient) {
        this.budgetClient = budgetClient;
    }
    public void setDepositValue(double depositValue) {
        this.depositValue = depositValue;
    }
    public void setWithDrawValue(double withDrawValue) {
        this.withDrawValue = withDrawValue;
    }
    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
    public void setAccType(String accType) {
        this.accType = accType;
    }
}

