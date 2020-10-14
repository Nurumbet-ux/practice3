package com.company;


import com.sun.jdi.InterfaceType;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        returnerWithLine(24, generateRandomAge());
        canGoOut(23, generateRandomAge());
        canGoOut(27, generateRandomAge());
        canGoOut(12, generateRandomAge());
        canGoOut(23, generateRandomAge());
        canGoOut(10, generateRandomAge());


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

    public static int generateRandomAge() {

        Scanner userImput = new Scanner(System.in);
        System.out.println("Введите минимальное значение: ");

        int min = userImput.nextInt();


        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите максимальное значение: ");

        int max = userImput.nextInt();


        if (min >= max) {
            throw new IllegalArgumentException("max должен быть больше min!");
        }
        Random r = new Random();
        int age = r.nextInt((max - min) + 1) + min;
        return age;


    }


}
