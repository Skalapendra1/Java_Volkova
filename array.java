package com.max.idea;

public class array {
    public static void main(String[] args) {
        byte arr[] = {1, 8, 3, 5, 11};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + "");
        }
        System.out.println();
        byte m = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = m;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + "");
        }
        System.out.println();
        System.out.println("Сумма первого эл-та " +arr[0]+" и среднего " +arr[arr.length / 2] +" = " + (arr[0] + arr[arr.length / 2]));

    }
}
