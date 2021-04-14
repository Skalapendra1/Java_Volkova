package com.max.idea;

import java.util.Scanner;

public class data_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        String[] r = st.split(" ");
        int q=0;

        for (int i = 0; i< r.length; i++) {
            boolean a = r[i].matches("[a-zA-Z]+");
            //System.out.print("  " +a);
            if (a==true){
                q++;
            System.out.println("   " +r[i]);

            }
        }
        System.out.println("Количество слов в строке: " +q);
    }
}