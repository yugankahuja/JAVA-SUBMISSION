package com.ey;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

public class BankAccount {
    private int accno;
    private String custname;
    private String acctype;
    private float balance;

    public BankAccount(int accno, String custname, String acctype, float balance) throws LowBalanceException, InvalidAmountException {
        this.accno = accno;
        this.custname = custname;
        this.acctype = acctype;

        if (balance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative.");
        }

        if (acctype.equals("Savings") && balance < 1000) {
            throw new LowBalanceException("Minimum balance for Savings account is Rs. 1000.");
        }

        if (acctype.equals("Current") && balance < 5000) {
            throw new LowBalanceException("Minimum balance for Current account is Rs. 5000.");
        }

        this.balance = balance;
    }

    public void deposit(float amt) throws InvalidAmountException {
        if (amt < 0) {
            throw new InvalidAmountException("Amount cannot be negative.");
        }

        balance += amt;
    }

    public void withdraw(float amt) throws InvalidAmountException, InsufficientFundsException {
        if (amt < 0) {
            throw new InvalidAmountException("Amount cannot be negative.");
        }

        if (acctype.equals("Savings") && balance - amt < 1000) {
            throw new InsufficientFundsException("Insufficient funds. Minimum balance for Savings account is Rs. 1000.");
        }

        if (acctype.equals("Current") && balance - amt < 5000) {
            throw new InsufficientFundsException("Insufficient funds. Minimum balance for Current account is Rs. 5000.");
        }

        balance -= amt;
    }

    public float getBalance() {
        return balance;
    }

    public int getAccno() {
        return accno;
    }
}
