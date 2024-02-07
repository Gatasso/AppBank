package dev.galasso.matheus.core.entities.menu;

import dev.galasso.matheus.core.entities.account.Account;
import dev.galasso.matheus.core.entities.exceptions.MoneyNotEnoughException;

import java.util.Scanner;

public enum NavigationOptions implements Executor {
    QUIT("Q") {
        @Override
        public void executor(Account account, Scanner scanner) {

        }
    },
    CONTINUE("M") {
        @Override
        public void executor(Account account, Scanner scanner) {

        }
    },
    CHECK("C") {
        @Override
        public void executor(Account account, Scanner scanner) {
            account.check();
        }
    },
    DEPOSIT("D") {
        @Override
        public void executor(Account account, Scanner scanner) {
            account.deposit(scanner);
        }
    },
    WITHDRAW("W") {
        @Override
        public void executor(Account account, Scanner scanner) {
            boolean executor = false;
            while (!executor) {
                try {
                    account.withdraw(scanner);
                    executor = true;
                } catch (MoneyNotEnoughException e) {
                    e.printStackTrace();
                }
            }
        }
    },
    PAYMENT("P") {
        @Override
        public void executor(Account account, Scanner scanner) {
            boolean executor = false;
            while (!executor) {
                try{
                    account.payBills(scanner);
                    executor = true;
                } catch (MoneyNotEnoughException e){
                    e.printStackTrace();
                }
            }
        }
    };

    private final String keyChar;

    NavigationOptions(String keyChar) {
        this.keyChar = keyChar;
    }

    public String getKeyChar() {
        return keyChar;
    }

    public static NavigationOptions getChosenOption(Scanner scanner) {
        String optionChosen = scanner.next();
        for (NavigationOptions option : values()) {
            if (option.getKeyChar().equals(optionChosen)) {
                return option;
            }
        }
        return null;
    }
}
