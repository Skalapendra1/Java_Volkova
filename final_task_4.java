package com.max.idea;

import java.util.Scanner;

public class final_task_4 {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String res="Заархивированный вирус";
        String pod = "Подсказка";
        boolean a = false;
        for (int i=1; i<=3;i++){
            System.out.print("Введи ответ: ");
            Scanner scanner=new Scanner(System.in);
            String vvod=scanner.nextLine();
            if (res.equalsIgnoreCase(vvod)){
                System.out.println("Правильно!");
                break;
            }
             else if ((vvod.equalsIgnoreCase(pod))&(i==1)){
                System.out.println("второе слово ВИРУС");
                a = true;
            }
             else if ((!res.equalsIgnoreCase(vvod)) & (a==true)& (i==2)){
                System.out.println("Обидно, приходи в другой раз");
                break;
            }

            else if ((vvod.equalsIgnoreCase(pod))&((i==2)|(i==3))){
                System.out.println("Подсказка уже недоступна");
                i--;
            }
            else if ((!res.equalsIgnoreCase(vvod))& (!pod.equalsIgnoreCase(vvod)) & ((i==1)|(i==2))){
                System.out.println("Подумай еще!");
            }
            else System.out.println("Обидно, приходи в другой раз");
        }
    }
}
