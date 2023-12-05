package br.com.appbank;

import java.util.Scanner;

public abstract class Account{
    protected String nameClient;
    private String codigo;
    protected double budgetClient, depositValue, withDrawValue;

    public Account(String nameClient, String codigo){
        this.nameClient = nameClient;
        this.codigo = codigo;
    }

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
        setBudgetClient(budgetClient- withDrawValue);
        System.out.println("Saldo atualizado para: R$" + budgetClient);
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
        if (withDrawValue> budgetClient) {
            System.out.println("Operação inválida");
            System.out.println("Saque maior que Saldo");
            this.withDrawValue = 0;
        }else {
            this.withDrawValue = withDrawValue;
        }
    }
    /*public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    } */
}