package com.skypro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    @Override
    public String minus(int num1, int num2) {
        int dif = num1 - num2;
        return num1 + " - " + num2 + " = " + dif;
    }

    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(double num1, double num2) {
        double result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}