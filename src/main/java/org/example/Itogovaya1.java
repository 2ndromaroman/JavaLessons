package org.example;

import java.util.Scanner;

import static java.lang.String.format;

public class Itogovaya1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite kurs $ ");
        Double dollar = scan.nextDouble();
        System.out.println("Vvedite summu v RUB ");
        Double rub = scan.nextDouble();
        System.out.println("Itogo: " + convert(rub,dollar) + " dollarov");
    }
    public static String convert(Double summa, Double kurs) {

        return ((format("%.2f",(summa/kurs))));
    }
}
