package org.example;

public class Calc {

    public int plus(int a, int b) {
        int result;
        result = a + b;
        System.out.printf("Сумма %d и %d равна %d\n", a, b, result);
        return result;
    }

    public int minus(int a, int b) {
        int result = a - b;
        System.out.printf("Разность %d и %d равна %d\n", a, b, result);
        return result;
    }
}
