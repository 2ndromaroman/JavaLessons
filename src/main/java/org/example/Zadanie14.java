package org.example;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class Zadanie14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for(int i = 0; i < 15; i++){
            array[i] = (int) (Math.random() * (40 + 1) - 20);
            System.out.println(array[i]);
            }
        OptionalInt max = Arrays.stream(array).max();
        OptionalInt min = Arrays.stream(array).min();
        System.out.println("Max value = " + Math.abs(max.getAsInt()) + ", Min value = " + Math.abs(min.getAsInt()));
        }
    }

