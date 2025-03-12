package org.example;

import java.util.stream.IntStream;

public class IntStreamIterate {
    public static void main(String[] args) {
        IntStream ex3 = IntStream.iterate(1,n->n+3).limit(30);
        ex3.forEach(System.out::println);
    }
}
