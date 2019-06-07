package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit ( 10000);
        int deposit = 4000;
        while(true) {
            System.out.println("" + bankAccount.withDraw(6000));
        }
    }
}

