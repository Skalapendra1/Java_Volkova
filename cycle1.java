package com.max.idea;

import java.util.Scanner;

public class cycle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Вы ввели '"+n+"'");

        int sum = 0;
        int i =1;
        while (i <= n){
            if (n<=0){
                System.out.println("ВВедите положительное число");
            }
            else if (!(i%2==0)) {
                sum = sum+i;
                i++;
            }
            else {
                i++;
            }
        }
        System.out.println("Сумма всех нечетных чисел = "+sum);

    }
}

