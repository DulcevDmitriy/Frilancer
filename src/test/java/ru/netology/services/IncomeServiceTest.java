package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncomeServiceTest {
    @Test
    public void test() {
        IncomeService service = new IncomeService();
        int actual = service.calculate(10000, 3000);
        int expected = 9;

        Assertions Assertation = null;
        Assertation.assertEquals(expected, actual);


    }
}
