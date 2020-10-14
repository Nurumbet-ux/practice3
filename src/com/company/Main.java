package com.company;


import com.sun.jdi.InterfaceType;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        returnerWithLine(24, generateRandomAge(34, 56));
        canGoOut(23, generateRandomAge(14, 34));
        canGoOut(27, generateRandomAge(24, 56));
        canGoOut(12, generateRandomAge(14, 56));
        canGoOut(23, generateRandomAge(4, 6));
        canGoOut(10, generateRandomAge(5, 56));
        

    }

    public static void returnerWithLine(int temperature, int ageOfman) {
        System.out.println(temperature + " " + ageOfman);
    }

    public static void canGoOut(int temperature, int age) {
        if ((age >= 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            System.out.println("Можно идти гулять!");
        } else if (age < 20 && (temperature >= 0 && temperature < 28)) {
            System.out.println("Можно идти гулять!");
        } else if (age > 45 && (temperature >= -10 && temperature < 25)) {
            System.out.println("Можно идти гулять!");
        } else {
            System.out.println("Оставайтесь дома!");
        }

    }

    public static int generateRandomAge(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max должен быть больше min!");
        }
        Random r = new Random();
        int age = r.nextInt((max - min) + 1) + min;
        return age;


    }


}
