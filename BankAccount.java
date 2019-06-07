package com.company;

import javax.naming.LimitExceededException;

public class BankAccount<depositdoubleSum> {
   double amount;


    public double getAmount() {
        return amount;
    }

    public static void deposit(double sum){
        double amount =0.0;
        amount +=sum;

    }


    public double withDraw(double sum) throws LimitException {
        if (sum >amount ) {
            throw new LimitException( " A " , sum);
        }
        return amount -=sum;

    }

}
