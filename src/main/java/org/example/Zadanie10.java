package org.example;

import java.util.Random;
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array x: ");
        int x = input.nextInt();
        System.out.println("Enter array y: ");
        int y = input.nextInt();
        int[][] array = new int[x][y];
        Random random = new Random();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
                }
            System.out.println();
            }
        System.out.println("Результат перемноженной первой строки матрицы:");
        int row = 0;
        for (int col = 0; col < array[row].length; col++) {
            System.out.print((array[row][col]) * 3 + " ");
        }
            }

}





