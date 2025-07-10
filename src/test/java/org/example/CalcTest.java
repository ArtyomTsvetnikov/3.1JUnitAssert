package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @ParameterizedTest(name = "#{index} - сложение {0} и {1} ожидаем {2}")
    @Tag("Plus")
    @CsvSource({"1, 2, 3", "-10, -20, -30", "10, -5, 5"})
    @DisplayName("Проверка сложения")
    @Timeout(10)
    void plus(int a, int b, int expectedResult) {
        Calc calculator = new Calc();
        int result = calculator.plus(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - разница {0} и {1} ожидаем {2}")
    @Tag("Minus")
    @CsvSource({"10, 5, 5", "-11, -11, 0", "10, -5, 15"})
    @DisplayName("Проверка вычитания")
    @Timeout(10)
    void minus(int a, int b, int expectedResult) {
        Calc calculator = new Calc();
        int result = calculator.minus(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }
}