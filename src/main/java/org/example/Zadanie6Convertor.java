package org.example;

import java.util.Scanner;

public class Zadanie6Convertor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние ");
        int condition1 = scan.nextInt();



        switch (condition1) {
            case (1) -> {
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут ");
                int a = scan.nextInt();
                System.out.println("Введите количество выбранных единиц (число) ");
                int b = scan.nextInt();
                if (a == 1)
                    System.out.println(b + "Метров = " + b/1609D + " Мили или " + b/1094D + " Ярдов или " + b/3281D + " Футов");
                else if (a == 2)
                    System.out.println(b + "Миль = " + b*1609 + " Метров или " + b/1760 + " Ярдов или " + b/5280 + " Футов");
                else if (a == 3)
                    System.out.println(b + "ярдов = " + b*1094 + " Метров или " + b/1760 + " Миль или " + b/5280 + " Футов");
                else if (a == 4)
                    System.out.println(b + "Футов = " + b*3281 + " Метров или " + b/0.3 + " Ярдов или " + b*3 + " Футов");
                else
                    System.out.println("Ошибка ввода, начните заново");
            }
            case (2) -> {
                System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна ");
                int b = scan.nextInt();
            }
            default -> System.out.println("Ошибка ввода, начните заново");
        }

    }
}
