package org.example;

import java.util.Random;
import java.util.Scanner;

import static java.lang.String.format;

public class Zadanie9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array x: ");
        int x = input.nextInt();
        System.out.println("Enter array y: ");
        int y = input.nextInt();
        double[][] array = new double[(int) x][(int) y];
        Random random = new Random();
        double sum = 0;
        double average = 0;
        int n = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = random.nextInt(10);
                sum = sum + array[i][j];
                n = n + 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            average = sum / n;
        }
        System.out.println("Среднее арифмитическое = " + format("%.2f",average) + "\nСумма всех элементов = " + sum);

        System.out.println("Матрица умноженная на среднее арифмитическое:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(format("%.2f",array[i][j]*average) + " ");
            }
            System.out.println();
        }
    }

}
