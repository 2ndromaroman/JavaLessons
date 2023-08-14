package org.example;

import java.util.Scanner;

public class Itogovaya4 {

    public static void main(String[] args) {

        System.out.println("Загадка. Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner scan = new Scanner(System.in);
        String answer;
        boolean chanse;
        int count = 0;
        String advice = "Это не лук";
        while (count<3) {
            answer = scan.nextLine();
            chanse = answer.equalsIgnoreCase("Заархивированный вирус");
            if (answer.equalsIgnoreCase("Подсказка")) {
                System.out.println(advice);
                count = 2;
                System.out.println("Осталась одна попытка");
            }else if (chanse) {
                System.out.println("Правильно!");
                break;
            } else if (count<2){
                System.out.println("Подумай еще");
                count++;
            }else{
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}


