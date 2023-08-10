package org.example;

public class Zadanie12 {
    public static void main(String[] args) {

        String stroka = "I like Java!!!";
        boolean a, b ,c;
        System.out.println(a = stroka.contains("I like Java!!!"));
        System.out.println(b = stroka.startsWith("I like"));
        System.out.println(c = stroka.endsWith("!!!"));
        if (a == true && b == true && c == true){
            System.out.println(stroka.replaceAll("a", "o"));
        }

    }
}
