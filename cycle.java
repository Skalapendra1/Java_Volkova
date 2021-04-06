package com.max.idea;

import java.util.Scanner;

public class cycle {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 12;
        Scanner j = new Scanner(System.in);
        int k = j.nextInt();
        int[] list = new int[k];
        for (int i = 0; i < list.length; i++) {
            Scanner scanner = new Scanner(System.in);
            int mas = scanner.nextInt();
            list[i] = mas;
        }
        System.out.print("Массив: ");

        for (int l =0; l< list.length; l++) {
            System.out.print(" " + list[l] + " ");
        }
        System.out.println();
        for (int l =0; l< list.length; l++){
            if (list[l] == x || list[l] == y || list[l] == z) {
                System.out.println("Данное значение имеется в константах = " +list[l]);
            }

        }

    }
}



