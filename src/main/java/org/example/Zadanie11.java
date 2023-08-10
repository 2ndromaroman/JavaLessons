package org.example;

import java.util.Scanner;

public class Zadanie11 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        String a = input.nextLine();
        System.out.println("Введите второе число");
        int b = input.nextInt();
        if (Integer.parseInt(a) > b) {
            System.out.println("Макимальное число = "+ a);
            String c = String.valueOf(b);
            System.out.println("Наименьшее число = " + Double.parseDouble(c));
        } else {
            System.out.println("Макимальное число = " + b);
            System.out.println("Наименьшее число = " + Double.parseDouble(a));
        }

    }
}