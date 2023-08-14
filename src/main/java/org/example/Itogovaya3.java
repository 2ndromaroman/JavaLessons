package org.example;

import java.util.Scanner;

public class Itogovaya3 {

    public static void main(String[] args) {
        int n = 0;
        System.out.println("Введите количество строк");
        Scanner sc1 = new Scanner(System.in);
        n = sc1.nextInt();
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = sc2.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
        }
        int[] count = new int[n];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                char temp = ' ';
                for (int z = j; z < str[i].length(); z++) {
                    if (str[i].charAt(j) != str[i].charAt(z) && temp != str[i].charAt(z)) {
                        temp = str[i].charAt(z);
                        count[i]++;
                    }
                }
            }
        }
        int max = 0;
        String answer = "";
        for (int i = 0; i < count.length; i++) {
            if (max <= count[i]) {
                max = count[i];
                answer = str[i];
            }
        }
        System.out.println(answer);
    }
    }

