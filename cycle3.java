package com.max.idea;

import java.util.Scanner;

public class cycle3 {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int m = scanner2.nextInt();
        double [][] matr = new double[n][m];
        for (int i = 0; i<n; i++ ){
            for (int j =0; j<m; j++){
                Scanner scanner3 = new Scanner(System.in);
                double a = scanner3.nextDouble();
                matr [i][j] = a;

            }
        }
        System.out.println("Полная матрицв: ");
        for (int i = 0; i<n; i++ ){
            for (int j =0; j<m; j++){
                System.out.print(matr[i][j] +" ");

            }
            System.out.println();

        }
        System.out.println("Первая строка матрицы, умноженная на 3: ");

            for (int j =0; j<m;j++){
                System.out.print(matr[0][j] * 3 +" ");
            }

    }
}
