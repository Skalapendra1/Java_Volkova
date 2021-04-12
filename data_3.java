package com.max.idea;

import java.util.Random;

public class data_3 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] mas = new int[15];
        int max = mas[0];
        int min = mas[0];

        for (int i=0; i<mas.length;i++){
            mas[i]= r.nextInt(20 - (-20)) + (-20);
            System.out.print(mas[i]+" ");
            max = Math.max(max, mas[i]);
            min = Math.min(min, mas[i]);

        }
        System.out.println(" ");
        System.out.println("Максимальный эл-т = "+max);
        System.out.println("Мминимальный эл-т = "+min);
        
        if (Math.abs(min)>Math.abs(max)){
            System.out.println("Наибольший модуль = " +Math.abs(min));
        }
        else if ((Math.abs(min)<Math.abs(max))){
            System.out.println("Наибольший модуль = " +Math.abs(max));
        }
        else {
            System.out.println("Они равны");
        }


    }
}
