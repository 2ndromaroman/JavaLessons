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
        String[] split = vir.split("=");
        String left = Arrays.toString(split[0].toCharArray());
        String right = Arrays.toString(split[1].toCharArray());
        if(String.valueOf(right.charAt(1)).equals("x")){
            if(String.valueOf(left.charAt(4)).equals("+")){
                System.out.println("x = "+ (Integer.parseInt(String.valueOf(left.charAt(1)))+Integer.parseInt(String.valueOf(left.charAt(7)))));
        } else if (String.valueOf(left.charAt(4)).equals("-")) {
                System.out.println("x = "+ (Integer.parseInt(String.valueOf(left.charAt(1)))-Integer.parseInt(String.valueOf(left.charAt(7)))));
            }

        } else if (String.valueOf(left.charAt(1)).equals("x")){
            if(String.valueOf(right.charAt(4)).equals("+")){
                System.out.println("x = "+ (Integer.parseInt(String.valueOf(right.charAt(1)))+Integer.parseInt(String.valueOf(right.charAt(7)))));
            } else if (String.valueOf(right.charAt(4)).equals("-")) {
                System.out.println("x = "+ (Integer.parseInt(String.valueOf(right.charAt(1)))-Integer.parseInt(String.valueOf(right.charAt(7)))));
            }
        } else System.out.println("Не корректный ввод");
    }

}