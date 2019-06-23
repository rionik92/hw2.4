package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random a = new Random();
        int randomAge = a.nextInt(107) - 0;
        System.out.println(randomAge);

    }
}
