package com.revature.CH;

public class InsufficentBalanceException extends Exception{
    public InsufficentBalanceException(String msg)
    {
        super(msg);
    }
}
