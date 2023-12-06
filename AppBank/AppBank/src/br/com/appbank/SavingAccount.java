package br.com.appbank;

import java.util.Scanner;

public class SavingAccount extends Account{
    private double valueContribution;
    private String statusInvestor;

    public SavingAccount(String nameClient, String codigo, String accType, String statusInvestor) {
        super(nameClient, codigo, accType);
        this.statusInvestor= statusInvestor;
    }


    @Override
    public void menu() {
        System.out.printf("""
                ***************************
                          MGR BANK
                %s  |   %s  |   %s\s
                1 - Novo Investimento
                2 - Aportar
                3 - Sacar
                4 - Consultar Investimentos
                5 - Retornar MainScreen   \s
                """,getNameClient(), getCodigo(), statusInvestor);
    }
// entrar no modo investimentos pelo mainscreen, retornar ao "menu" de checking account

    public void investmentMenu() {
        System.out.print("""
                ***************************
                          MGR BANK
                Produtos disponíveis:
                1 - 12% a.a.
                Saque do investimento: 3 anos;
                
                2 - 8% a.a.
                Saque do Investimento: 1 ano;
                 
                3 - 10% a.a.
                Saque do Investimento: 2 anos
                
                4- Voltar para o Menu de Investimentos""");
    }

    public void opInvest(Scanner scanner){
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Qual o valor para simulação?");
                double simulationValue = scanner.nextDouble();
                System.out.printf("O valor no momento do saque será de: R$", (simulationValue + (simulationValue * 0.12)));
                break;
            case 2:
                System.out.println("Qual o valor para simulação?");
                simulationValue = scanner.nextDouble();
                System.out.printf("O valor no momento do saque será de: R$", (simulationValue + (simulationValue * 0.08)));
                break;
            case 3:
                System.out.println("Qual o valor para simulação?");
                simulationValue = scanner.nextDouble();
                System.out.printf("O valor no momento do saque será de: R$", (simulationValue + (simulationValue * 0.1)));
                break;
            default:
                break;
        }
    }

    public void opContribution(Scanner scanner){
        System.out.println("Informe o valor da conta:");
        setValueContribution(scanner.nextDouble());
        setBudgetClient(budgetClient - valueContribution);
        System.out.println("Saldo atualizado para: R$" + budgetClient);
    }

/**********************************************************************/
//Setters
    public void setValueContribution(double valueContribution) {
        if (valueContribution > budgetClient) {
            System.out.println("Saldo insuficiente para investir");
        }else this.valueContribution = valueContribution;
    }

/**********************************************************************/
//Getters







}
