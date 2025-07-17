package com.revature.CH;

public class Customer {
     String name;
     double balance;
     Customer()
     {

     }

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  void withdraw(double amount) throws InsufficentBalanceException{
         if(amount>balance)
         {
             throw new InsufficentBalanceException("insufficient Balance");
         }
         else {
             balance-=amount;
             System.out.println("updated balance: "+balance);
         }
    }

}
