package org.example;

import java.util.Arrays;
import java.util.Scanner;


// Сначала я разбиваю водную строку на левую и правую части уравнения, далее работаю с тими частями.
// Здесь много багов и недочётов. Например, в случае если указать уравнение вида 1-10=x  в ответе x = 0,
// т.к. вычисление идет по индексу
public class Itogovaya2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите уравнение вида '3 n 2=x', где n - операция вычитания или сложения");
        String vir = scan.nextLine();
        if (vir.length() != 5) {
            System.out.println("Неверный формат");
        } else {
            char[] vir1 = vir.toCharArray();
            String index1 = String.valueOf(vir1[0]);
            String index2 = String.valueOf(vir1[2]);
            String index3 = String.valueOf(vir1[4]);
            String operation = String.valueOf(vir1[1]);
            if (index1.equals("x")) {
                switch (operation) {
                    case ("+"):
                        int a = Integer.parseInt(index3);
                        int b = Integer.parseInt(index2);
                        System.out.println("x = " + (b - a));
                        break;
                    case ("-"):
                        int aa = Integer.parseInt(index3);
                        int bb = Integer.parseInt(index2);
                        System.out.println("x = " + (bb + aa));
                        break;
                    default:
                        System.out.println("Error1");
                }
            } else if (index2.equals("x")) {
                switch (operation) {
                    case ("+"):
                        int a = Integer.parseInt(index1);
                        int b = Integer.parseInt(index3);
                        System.out.println("x = " + (b - a));
                        break;
                    case ("-"):
                        int aa = Integer.parseInt(index1);
                        int bb = Integer.parseInt(index3);
                        System.out.println("x = " + (bb + aa));
                        break;
                    default:
                        System.out.println("Error2");

                }
            } else if (index3.equals("x")) {
                switch (operation) {
                    case ("+"):
                        int a = Integer.parseInt(index1);
                        int b = Integer.parseInt(index2);
                        System.out.println("x = " + (a + b));
                        break;
                    case ("-"):
                        int aa = Integer.parseInt(index1);
                        int bb = Integer.parseInt(index2);
                        System.out.println("x = " + (aa - bb));
                        break;
                    default:
                        System.out.println("Error3");
                }
            }

        }
    }
}
