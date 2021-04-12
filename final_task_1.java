package com.max.idea;

import java.util.Scanner;

public class final_task_1 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        double kurs = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        double rub = scanner2.nextDouble();

        double  itog = rub/kurs;
        System.out.println("Курс доллара: " + kurs);
        System.out.println("Количество рублей: " + rub);
        System.out.println(String.format("Итого: " + "%.2f", itog)  + " долларов");

    }
}
