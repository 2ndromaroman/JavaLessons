package org.example;

import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<= n; i = i + 2){
            sum = sum + i;
        }
        System.out.println (sum);
    }

}
