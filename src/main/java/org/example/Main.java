package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

//    Задание 1
    public static void main(String[] args) {
        System.out.println("Hello world!");
//    Задание 3
    ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.swap(listOfNumbers,0,4);
        int summa = listOfNumbers.get(4)+listOfNumbers.get(2);
        System.out.println(listOfNumbers);
        System.out.println(summa);
//    Задание 2

        double first = 1.3;
        byte second = 2;

    }
}