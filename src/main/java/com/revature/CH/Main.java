package com.revature.CH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Customer c = new Customer();
        System.out.println("Enter name");
        c.setName(sc.next());
        System.out.println("Enter Balance");
        c.setBalance(sc.nextDouble());
        System.out.println("name"+c.getName());
        System.out.println("Balance before withdrawl"+c.getBalance());
        System.out.println("Enter amount to be withdraw");
        int amount=sc.nextInt();
        try{
            c.withdraw(amount);
        } catch (InsufficentBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction Completed");
        }

    }
}
