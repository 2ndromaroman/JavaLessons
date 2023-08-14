package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class Itogovaya2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите уравнение вида '3 n 2=x', где n - операция вычитания или сложения");
        String vir = scan.nextLine();
        if (vir.length() != 5) {
            System.out.println("Неверный формат");
        } else {
            String[] split = vir.split("=");
            String left = Arrays.toString(split[0].toCharArray());
            String right = Arrays.toString(split[1].toCharArray());
            if (String.valueOf(right.charAt(1)).equals("x")) {
                if (String.valueOf(left.charAt(4)).equals("+")) {
                    System.out.println("x = " + (Integer.parseInt(String.valueOf(left.charAt(1))) + Integer.parseInt(String.valueOf(left.charAt(7)))));
                } else if (String.valueOf(left.charAt(4)).equals("-")) {
                    System.out.println("x = " + (Integer.parseInt(String.valueOf(left.charAt(1))) - Integer.parseInt(String.valueOf(left.charAt(7)))));
                }

            } else if (String.valueOf(left.charAt(1)).equals("x")) {
                if (String.valueOf(right.charAt(4)).equals("+")) {
                    System.out.println("x = " + (Integer.parseInt(String.valueOf(right.charAt(1))) + Integer.parseInt(String.valueOf(right.charAt(7)))));
                } else if (String.valueOf(right.charAt(4)).equals("-")) {
                    System.out.println("x = " + (Integer.parseInt(String.valueOf(right.charAt(1))) - Integer.parseInt(String.valueOf(right.charAt(7)))));
                }
            } else System.out.println("Не корректный ввод");
        }
    }
}