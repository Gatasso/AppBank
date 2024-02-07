package dev.galasso.matheus.core.entities.exceptions;

public class MoneyNotEnoughException extends Exception{
    public MoneyNotEnoughException() {
        super("You dont have money enough to do this operation. Certify the amount and try again.");
    }

    public MoneyNotEnoughException(String message) {
        super(message);
    }
}
