package org.example;
import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite 4islo a = ");
        int a = scan.nextInt();
        System.out.println("Vvedite 4islo b = ");
        int b = scan.nextInt();
        System.out.println("Vvedite 4islo c = ");
        int c = scan.nextInt();
        int srednee4islo = srednee(a,b,c);
        System.out.println(srednee4islo);
        double delenie4isla = delenie(srednee4islo);
        result(delenie4isla);

    }
    public static int srednee(int a, int b, int c){
        int[] numbers = {a,b,c};
        int result = 0;
        for (double i: numbers){
            result +=i;
        }
        System.out.println("Значение среднего арифметического равно: " + result / numbers.length);

        return result / numbers.length;
    }
    public static double delenie(int number){
        double result = Math.floor(number)/2;
        System.out.println("Результат после деления " + result);
        return result;
    }
    public static void result(Double number){
        if (number > 3) System.out.println("Программа выполнена корректно");
        else System.out.println("Программа выполнена корректно но с другим результатом");
        }
    }

