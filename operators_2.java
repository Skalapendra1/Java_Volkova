package com.max.idea;

import java.util.Scanner;

public class operators_2 {
    public static void main(String[] args) {
        double metr, mila, yard, foot;
        double kg, pound, ounce, gr;
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner scanner1 = new Scanner(System.in);
        int choice1 = scanner1.nextInt();
        switch (choice1) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                Scanner scanner2 = new Scanner(System.in);
                int choice2 = scanner2.nextInt();
                System.out.println("Введи число: ");
                Scanner scanner3 = new Scanner(System.in);
                double chislo = scanner3.nextDouble();
                switch (choice2) {
                    case 1:
                        metr = chislo;
                        mila = chislo * 0.0006;
                        yard = chislo * 1.094;
                        foot = chislo * 3.281;
                        System.out.println("Метры =" + metr + "\n" + "Мили = " + mila + "\n" + "Ярды = " + yard + "\n" + "Футы = " + foot);
                        break;
                    case 2:
                        metr = chislo * 1609;
                        mila = chislo;
                        yard = chislo * 1760;
                        foot = chislo * 5280;
                        System.out.println("Метры =" + metr + "\n" + "Мили = " + mila + "\n" + "Ярды = " + yard + "\n" + "Футы = " + foot);
                        break;
                    case 3:
                        metr = chislo * 0.91;
                        mila = chislo * 0.00057;
                        yard = chislo;
                        foot = chislo * 3;
                        System.out.println("Метры =" + metr + "\n" + "Мили = " + mila + "\n" + "Ярды = " + yard + "\n" + "Футы = " + foot);
                        break;
                    case 4:
                        metr = chislo * 0.3;
                        mila = chislo * 0.00019;
                        yard = chislo * 0.33;
                        foot = chislo;
                        System.out.println("Метры =" + metr + "\n" + "Мили = " + mila + "\n" + "Ярды = " + yard + "\n" + "Футы = " + foot);
                        break;
                    default: System.out.println("Такой меры измерения нет! Попробуй снова!");
                        break;}
                        break;

            case 2:
                    System.out.println("Выберите единицу измерения: 1 - кг, 2 - фунт, 3 - унция, 4 - грамм ");
                    Scanner scanner4 = new Scanner(System.in);
                    int choice3 = scanner4.nextInt();
                    System.out.println("Введи число: ");
                    Scanner scanner5 = new Scanner(System.in);
                    double chislo1 = scanner5.nextDouble();
                    switch (choice3) {
                        case 1:
                            kg = chislo1;
                            pound = chislo1 * 2.205;
                            ounce = chislo1 * 35.2;
                            gr = chislo1 * 1000;
                            System.out.println("Киллограммы =" + kg + "\n" + "Фунты = " + pound + "\n" + "Унции = " + ounce + "\n" + " Граммы= " + gr);
                            break;
                        case 2:
                            kg = chislo1 * 0.45;
                            pound = chislo1;
                            ounce = chislo1 * 16;
                            gr = chislo1 * 453.5;
                            System.out.println("Киллограммы =" + kg + "\n" + "Фунты = " + pound + "\n" + "Унции = " + ounce + "\n" + " Граммы= " + gr);
                            break;
                        case 3:
                            kg = chislo1 * 0.028;
                            pound = chislo1 * 0.624;
                            ounce = chislo1;
                            gr = chislo1 * 2834;
                            System.out.println("Киллограммы =" + kg + "\n" + "Фунты = " + pound + "\n" + "Унции = " + ounce + "\n" + " Граммы= " + gr);
                            break;
                        case 4:
                            kg = chislo1 * 0.001;
                            pound = chislo1 * 0.0022;
                            ounce = chislo1 * 0.352;
                            gr = chislo1;
                            System.out.println("Киллограммы =" + kg + "\n" + "Фунты = " + pound + "\n" + "Унции = " + ounce + "\n" + " Граммы= " + gr);
                            break;
                        default: System.out.println("Такой меры измерения нет! Попробуй снова!");
                            break;}
                break;
            default: System.out.println("Такого значения нет! Попробуй снова!");
            break;
                }

        }
    }


