import java.util.Scanner;

public class AppBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandMenu = 0;
        double depositValue;
        double withDrawValue;
        String nameClient = "Matt Galss Romeu";
        String accType = "Corrente";
        double budgetClient = 5000;
        String initialMenu = """
                ***************************
                        MGR BANK

                NAME:  %s
                TIPO CONTA:  %s
                SALDO: R$ %.2f    
                """  .formatted(nameClient, accType, budgetClient);
        String menu = """
                ***************************
                        MGR BANK

                1 - Consultar Saldo
                2 - Depósito
                3 - Saque
                4 - Sair    
                """;
        System.out.println(initialMenu);    
            
        while (commandMenu != 4) {
        System.out.println(menu);
        commandMenu = scanner.nextInt();
            
            switch (commandMenu) {
                case 1:
                    System.out.println(budgetClient); 
                    System.out.println("O seu saldo é de: R$" + budgetClient);                   
                    break;
                case 2: 
                    System.out.println("Qual o valor do depósito?");
                    depositValue = scanner.nextDouble();
                    budgetClient = budgetClient + depositValue;
                    System.out.println("Saldo atualizado para: R$" + budgetClient);                                     
                    break;
                case 3:
                    System.out.println("Qual o valor do saque?");
                    withDrawValue = scanner.nextDouble();
                    budgetClient = budgetClient - withDrawValue;
                    System.out.println("Saldo atualizado para: R$" + budgetClient);  
                    break;
                default: 
                    System.out.println("Opção inválida");
            
            }
            
        }
        scanner.close();
    }
}
