package org.example;

import java.util.Scanner;

public class calc {
    static float result;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a = ");
        int a = scan.nextInt();
        System.out.println("Введите число b = ");
        int b = scan.nextInt();
        System.out.println("Введите операцию из списка '+','-','*','/' ");
        String operation = scan.next();


        switch (operation) {
            case ("+"):
                result = summ(a, b);
                System.out.println();
                break;

            case ("-"):
                result = diff(a, b);
                break;

            case ("*"):
                result = mult(a,b);
                break;

            case ("/"):
                result = diff(a,b);
                break;
            default:
                System.out.println("Ошибка ввода, начните заново");
                break;
        }

        System.out.println("Результат операции " + a + operation + b + " = " + result);

    }
    public static Integer summ (Integer value1, Integer value2){
        Integer summ = 0;
        return (summ = value1 + value2);
    }
    public static Integer diff (Integer value1, Integer value2){
        Integer diff = 0;
        return (diff = value1 - value2);
    }
    public static Integer mult (Integer value1, Integer value2){
        Integer mult = 0;
        return (mult = value1 * value2);
    }
    public static Float div (Integer value1, Integer value2){
        Float div = 0f;
        return (div = (float) (value1 / value2));
    }
}

