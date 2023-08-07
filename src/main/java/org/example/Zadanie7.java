package org.example;

import java.util.Scanner;

public class Zadanie7 {

        public static void main(String[] args) {
            int a = 5;
            int b = 7;
            int c = 9;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter array length: ");
            int size = input.nextInt();
            int array[] = new int[size];
            System.out.println("Insert array elements: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
                if (array[i] == a | array[i] == b | array[i] == c )
                    System.out.println("Данное значение имеется в константах");
            }
    }
}
