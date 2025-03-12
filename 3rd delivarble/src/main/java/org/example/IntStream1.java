package org.example;
import java.util.Random;
import java.util.stream.IntStream;

public class IntStream1 {
        public static void main(String[] args) {
             IntStream ex1 = IntStream.of(1,2,3);
            ex1.forEach(System.out::println);
        }
    }

