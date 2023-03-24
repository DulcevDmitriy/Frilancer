package ru.netology.services;

public class IncomeService {

    public int calculate(int income, int expenses) {
        int count = 1; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (money >= expenses * 3) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses);
            } else {
                money = money + income;
            }
        }
        return count;
    }
}
