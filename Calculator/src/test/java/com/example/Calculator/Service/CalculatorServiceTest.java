package com.example.Calculator.Service;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

    @InjectMocks
    CalculatorService calculatorService;

    @Mock
    Logger logger = LoggerFactory.getLogger(CalculatorService.class);
 
 
    @Test
    public void testCalculateSquare() {
        calculatorService.squaretask(5);
        verify(logger).info("Square of 5 is: 25");
    }

    @Test
    public void testCalculatecube(){
        calculatorService.cubetask(5);
        verify(logger).info("Cube of 5 is: 125");
    }
    @Test
    public void testCalculateFactorial() {
        calculatorService.calculateFactorial(5);
        verify(logger).info("Factorial of 5 is: 120");
    }
    @Test
    public void testReverseNumber() {
        calculatorService.reverseNumber(123);
        verify(logger).info("Reverse of 123 is: 321");
    }

}
