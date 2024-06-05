package com.ey;

import java.util.Arrays;

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

public class AccountChecker {
    private BankAccount[] accounts;

    public AccountChecker(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    public boolean isValidAccount(int accno) throws AccountNotFoundException {
        for (BankAccount account : accounts) {
            if (account.getAccno() == accno) {
                return true;
            }
        }
        throw new AccountNotFoundException("Account not found with account number: " + accno);
    }

    public static void main(String[] args) {
        try {
            BankAccount[] accounts = new BankAccount[5];
            accounts[0] = new BankAccount(101, "Ajey Nagar", "Savings", 5000);
            accounts[1] = new BankAccount(102, "Aman Bhatt", "Current", 10000);
            accounts[2] = new BankAccount(103, "Rahul Singhal", "Savings", 7000);
            accounts[3] = new BankAccount(104, "Gautam Verma", "Current", 6000);
            accounts[4] = new BankAccount(105, "Jatin Singh", "Savings", 3000);

            AccountChecker accountChecker = new AccountChecker(accounts);

            int accNoToCheck = 102;
            if (accountChecker.isValidAccount(accNoToCheck)) {
                System.out.println("Account with account number " + accNoToCheck + " is valid.");
            } else {
                System.out.println("Account with account number " + accNoToCheck + " is not valid.");
            }

            int invalidAccNo = 103;
            if (accountChecker.isValidAccount(invalidAccNo)) {
                System.out.println("Account with account number " + invalidAccNo + " is valid.");
            } else {
                System.out.println("Account with account number " + invalidAccNo + " is not valid.");
            }
        } catch (LowBalanceException | InvalidAmountException | AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
