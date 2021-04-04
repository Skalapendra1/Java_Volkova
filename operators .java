package com.max.idea;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        double x = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        double y = scanner2.nextDouble();
        Scanner scanner3 = new Scanner(System.in);
        double z = scanner3.nextDouble();
        double sr = (x+y+z)/3;

        System.out.println("Cреднее арифметическое = "+sr);

        double pol = Math.floor(sr/2);
        System.out.println("Поделили среднее арифметическое на 2 = "+pol);

        if (pol > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }

}