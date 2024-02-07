package dev.galasso.matheus.core.entities.menu;

import dev.galasso.matheus.core.entities.account.Account;

import java.util.Scanner;

public interface Executor {
    void executor(Account account, Scanner scanner);
}
