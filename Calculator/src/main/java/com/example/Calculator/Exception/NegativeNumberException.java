package com.example.Calculator.Exception;

public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException(String msg){
        super(msg);
    }
}