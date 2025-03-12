package org.example;

import java.util.Random;

public class IntStreamDoubels {
    public static void main(String[] args) {
        Random ex4 =new Random();
        ex4.doubles(3,1,2).forEach(System.out::println);
    }
}
