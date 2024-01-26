package java.dev.galasso.matheus.core.entities.menu;

import java.dev.galasso.matheus.core.entities.account.Account;
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
            account.withdraw(scanner);
        }
    },
    PAYMENT("P") {
        @Override
        public void executor(Account account, Scanner scanner) {
            account.payBills(scanner);
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
