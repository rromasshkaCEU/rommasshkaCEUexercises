package org.example;

import java.util.stream.IntStream;

public class IntStreamRange {
    public static void main(String[] args) {
        IntStream ex2 = IntStream.range(1,3);
        ex2.forEach(System.out::println);
    }
}
