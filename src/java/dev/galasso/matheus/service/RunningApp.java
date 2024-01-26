package java.dev.galasso.matheus.service;

import java.dev.galasso.matheus.core.entities.account.Account;
import java.dev.galasso.matheus.core.entities.account.AccountType;
import java.dev.galasso.matheus.core.entities.menu.Menus;
import java.dev.galasso.matheus.core.entities.menu.NavigationOptions;
import java.util.Scanner;

public class RunningApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NavigationOptions selectedOption;
        Account account1 = new Account("Matheus", AccountType.CHECKING);
        do {
            Menus.INITIAL_MENU.menu(account1.getAccType(), account1.getNameClient());
            System.out.println("Aperte \"M\" para continuar");
        } while (NavigationOptions.getChosenOption(scanner) == null);

        do{
            Menus.MAIN_MENU.menu(account1.getAccType(), account1.getNameClient());
            selectedOption = NavigationOptions.getChosenOption(scanner);
            if (selectedOption != null){
                selectedOption.executor(account1,scanner);
            }
        }while (selectedOption != NavigationOptions.QUIT);

    }
}
