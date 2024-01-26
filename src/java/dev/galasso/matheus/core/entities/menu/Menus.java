package java.dev.galasso.matheus.core.entities.menu;

import java.dev.galasso.matheus.core.entities.account.AccountType;

public enum Menus  {
    INITIAL_MENU {
        @Override
        public void menu(AccountType accType, String nameClient) {
            System.out.printf("""
                    ******************************
                             MGR BANK

                    |     %s     |      %s      |
                    %n""", nameClient, accType);
        }
    },

    MAIN_MENU {
        @Override
        public void menu(AccountType accType, String nameClient) {
            switch (accType) {
                case CHECKING:
                    System.out.printf("""
                            ********************************************************************
                                                            MGR BANK
                            |     %s     |      %s      |     %s     |     %s     |\n          
                            
                            C - Consultar Saldo
                            D - Depósito
                            W - Saque
                            P - Pagar Conta
                            I - Saving Account
                            Q - Sair   \s
                            """, nameClient, accType.getAccTypeName(), accType.getCreditLimit(), accType.getMaintenanceTax());
                    break;

                case SAVING:
                    System.out.printf("""
                            ********************************************************************
                                      MGR BANK
                            |     %s     |      %s      |     %s     |     %s     |\n  
                            C - Consultar Saldo
                            D - Depósito
                            W - Saque
                            P - Pagar Conta
                            Q - Sair   \s
                            """, nameClient, accType.getAccTypeName(),accType.getCreditLimit(), accType.getMaintenanceTax());
                    break;
                case INVESTMENT:
                    System.out.printf("""
                            ********************************************************************
                                      MGR BANK
                            |     %s     |      %s      |     %s     |     %s     |\n  
                            N - Novo Investimento
                            A - Aportar
                            C - Consultar Investimentos
                            R - Retornar MainScreen   \s
                            """, nameClient, accType.getAccTypeName(),accType.getCreditLimit(), accType.getMaintenanceTax());
                    break;
            }
        }
    };
    public abstract void menu(AccountType accType, String nameClient);
}
