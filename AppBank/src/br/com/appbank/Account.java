package br.com.appbank;

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
        System.out.println("""
                ***************************
                          MGR BANK

                1 - Consultar Saldo
                2 - Depósito
                3 - Saque
                4 - Sair   \s
                """);
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
    public void setAccType(String accType) {
        this.accType = accType;
    }
}

