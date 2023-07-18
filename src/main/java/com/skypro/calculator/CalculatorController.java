package com.skypro.calculator;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String answerCalculator() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plus(num1, num2);

    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя!";
        }
        return calculatorService.divide(num1, num2);
    }
    @ExceptionHandler (Exception.class)
    public String handleException(){
        return "Нужно ввести два параметра";
    }
}