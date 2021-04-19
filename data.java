package com.max.idea;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class data {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in );
        String a1 = scanner1.nextLine();
        String a2 = scanner1.nextLine();


        double b1 = Double.valueOf(a1);
       Double i2 = Double.valueOf(a2);

        int b2 = i2.intValue();

        if (b1>b2){
            double i = b2;
            System.out.println("Наибольшее число = "+b1);
            System.out.println("Тип double "+i);}
        else {
          //  double j = b1;
            System.out.println("Наибольшее число = "+b2);
            System.out.println("Тип double "+b1);

        }
        }
    }

