package com.example.Calculator.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.Calculator.Exception.NegativeNumberException;

@Service
public class CalculatorService {

    Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public void squaretask(int n) {
        if (n < 0) {
            throw new NegativeNumberException("Input number must be non-negative");
        }

        int square = n * n;
        logger.info("Square of " + n + " is: " + square);
    }

    public void cubetask(int n) {
        if (n < 0) {
            throw new NegativeNumberException("Input number must be non-negative");
        }

        int cube = n * n * n;
        logger.info("Cube of " + n + " is: " + cube);
    }

    public void evenoddtask(int n) {
        if (n < 0) {
            throw new NegativeNumberException("Input number must be non-negative");
        }

        String evenodd = (n % 2 == 0) ? "Even" : "Odd";
        logger.info("Even/Odd check for " + n + ": " + evenodd);
    }

    public void checkprime(int n) {
        if (n < 0) {
            throw new NegativeNumberException("Input number must be non-negative");
        }

        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            logger.info(n + " is a prime number");
        } else {
            logger.info(n + " is not a prime number");
        }
    }

    public void checkPalindrome(int n) {
        if (n < 0) {
            throw new NegativeNumberException("Input number must be non-negative");
        }

        int temp = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (temp == rev) {
            logger.info(temp + " is a palindrome number");
        } else {
            logger.info(temp + " is not palindrome number");
        }
    }

    public void calculateFactorial(int n) {
        if (n < 0) {
            throw new NegativeNumberException("Input number must be non-negative");
        }

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        logger.info("Factorial of " + n + " is: " + factorial);
    }

    public void reverseNumber(int n) {
        if (n < 0) {
            throw new NegativeNumberException("Input number must be non-negative");
        }

        int temp = n;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            temp = temp / 10;
            rev = rev * 10 + digit;
        }

        logger.info("Reverse of " + n + " is: " + rev);
    }

    public void checkArmstrong(int n) {
        if (n < 0) {
            throw new NegativeNumberException("Input number must be non-negative");
        }

        int temp = n;
        int numDigits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n = n / 10;
        }

        if (sum == temp) {
            logger.info(n + " is an Armstrong number");
        } else {
            logger.info(n + " is not an Armstrong number");
        }
    }
}
