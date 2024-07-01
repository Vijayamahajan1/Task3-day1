package com.example.Calculator.Controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Calculator.Service.CalculatorService;

@RestController
@RequestMapping("/Calculator")
public class CalculatorController {
    private final ExecutorService executorService = Executors.newFixedThreadPool(8); // Adjust pool size as needed

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam int n) {
        executorService.submit(() -> calculatorService.squaretask(n));
        executorService.submit(() -> calculatorService.cubetask(n));
        executorService.submit(() -> calculatorService.checkArmstrong(n));
        executorService.submit(() -> calculatorService.checkPalindrome(n));
        executorService.submit(() -> calculatorService.evenoddtask(n));
        executorService.submit(() -> calculatorService.reverseNumber(n));
        executorService.submit(() -> calculatorService.checkprime(n));
        executorService.submit(() -> calculatorService.calculateFactorial(n));

        return "Calculations started";
    }
}
