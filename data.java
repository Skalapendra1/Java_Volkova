package com.max.idea;

import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in );
        String a1 = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        int a2 = scanner2.nextInt();
        int b = Integer.parseInt(a1);
        if (b>a2){
            double i = a2;
            System.out.println("Наибольшее число = "+b);
            System.out.println("Тип double "+i);}
        else {
            double j = b;
            System.out.println("Наибольшее число = "+a2);
            System.out.println("Тип double "+j);

        }
        }
    }

