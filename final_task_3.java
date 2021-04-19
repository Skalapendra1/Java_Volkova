package com.max.idea;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("ВВеди число строк");
        Scanner scanner1=new Scanner(System.in);
        int n = scanner1.nextInt();
        String[] mas = new String[n];

        for (int i=0;i<n;i++){
            Scanner scanner2=new Scanner(System.in);
            String st = scanner2.nextLine();
            mas[i]=st;
        }
        for (int i=0;i< mas.length;i++){
            System.out.println("Строка "+ (i+1) + ": "+mas[i]);

        }
        int[] res = new int[n];
        for (int l=0; l<mas.length; l++)  {

            String[] m = mas[l].split("");
            int k = 0;

            for (int i=0;i<m.length;i++) {

                for (int j = i+1; j < m.length; j++) {
                    if (m[i].equals(m[j])) {

                        k = k + 1;
                        break;
                    }

                }
            }
            res[l] = m.length - k;
        }
        int f=0;
        int ff=0;
        for (int l=0;l<mas.length; l++){
            if (f<res[l]){
                    f = res[l];
                    ff=l;
            }
        }
        System.out.println("Ответ: "+mas[ff]);

    }
}
