package com.max.idea;

import java.util.Scanner;

public class operator_1 {
    public static void  main(String[] args) throws java.io.IOException{
        Scanner scanner1 = new Scanner(System.in);
        double x = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        double y = scanner2.nextDouble();
        char c = (char) System.in.read ();
        double result = 0;
        String bad = null;

        switch (c){
            case '+': result=x+y;
                System.out.println("Результат "+result);
            break;
            case '-': result=x-y;
                System.out.println("Результат "+result);
            break;
            case '*': result=x*y;
                System.out.println("Результат "+result);
            break;
            case '/': result=x/y;
                System.out.println("Результат "+result);
            break;
            default: bad="Попробуй еще раз";
            System.out.println(bad);
            break;
        }
    }
    }
