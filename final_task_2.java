package com.max.idea;

import java.util.Scanner;

public class final_task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String r = scanner.nextLine();
        String a1 = "+";
        String a2 = "-";
        int len = r.length();
        int res;
        res = r.indexOf("x");
        System.out.print("Ввод: ");
        String[] mas = r.split("");
        if (len != 5) {
            System.out.println("ВВеди снова!  'a+b=c'");
        } else {


            boolean a = mas[0].matches("[0-9x]");
            boolean z1 = mas[1].matches("[+-]");
            boolean b = mas[2].matches("[0-9x]");
            boolean z2 = mas[3].matches("[=]");
            boolean c = mas[4].matches("[0-9x]");

            if ((a == false) || (z1 == false) || (b == false) || (z2 == false) || (c == false)) {
                System.out.println("Введено неверно! Попробуй снова 'a+b=c'");
            }


            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i]);
            }
            System.out.println(" ");
            if ((res == 4) & (mas[1].equals(a1))) {
                Integer i = Integer.parseInt(mas[0]);
                Integer j = Integer.parseInt(mas[2]);
                Integer m = i + j;
                System.out.println("Вывод: " + m);
            } else if ((res == 4) & (mas[1].equals(a2))) {
                Integer i1 = Integer.parseInt(mas[0]);
                Integer j1 = Integer.parseInt(mas[2]);
                Integer m1 = i1 - j1;
                System.out.println("Вывод: " + m1);
            } else if ((res == 0) & (mas[1].equals(a1))) {
                Integer i2 = Integer.parseInt(mas[4]);
                Integer j2 = Integer.parseInt(mas[2]);
                Integer m2 = i2 - j2;
                System.out.println("Вывод: " + m2);
            } else if ((res == 0) & (mas[1].equals(a2))) {
                Integer i3 = Integer.parseInt(mas[4]);
                Integer j3 = Integer.parseInt(mas[2]);
                Integer m3 = i3 + j3;
                System.out.println("Вывод: " + m3);
            } else if ((res == 2) & (mas[1].equals(a1))) {
                Integer i4 = Integer.parseInt(mas[4]);
                Integer j4 = Integer.parseInt(mas[0]);
                Integer m4 = i4 - j4;
                System.out.println("Вывод: " + m4);
            } else if ((res == 2) & (mas[1].equals(a2))) {
                Integer i5 = Integer.parseInt(mas[0]);
                Integer j5 = Integer.parseInt(mas[4]);
                Integer m5 = i5 - j5;
                System.out.println("Вывод: " + m5);
            } else {
                System.out.println("");
            }
        }
    }

}

