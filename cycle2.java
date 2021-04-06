package com.max.idea;

import java.util.Scanner;

public class cycle2 {
    public static void main (String[] args){
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        double[] list = new double[n];
        double sum = 0;
        double sr = 0;
        for (int i=0; i< list.length; i++) {
            Scanner scanner2 = new Scanner(System.in);
            double mas = scanner2.nextDouble();
            list[i]=mas;
            sum=sum+list[i];
        }
        for (int i=0; i< list.length; i++) {
            System.out.print(list[i]+ "    ");
        }
        sr = sum/n;
        System.out.println( "    ");
        System.out.println("Среднее арифметическое = "+sr);
        for (int i=0; i<list.length; i++){
            System.out.print((list[i]*sr) + "    ");
        }


    }
}
