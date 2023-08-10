package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку");
        String message = input.nextLine();
        String[] submessage = message.split(" ");
        int number = 0;
        for (String numberofwords : submessage){
            number +=1;
        }
        System.out.println(number);

    }
}
