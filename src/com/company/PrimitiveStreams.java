package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {

    //Create a integer stream with a range between 1 and 10 and print the result
    private void exercise1() {
        IntStream range = IntStream.range(1, 11);
        range.forEach(System.out::println);

        System.out.println("Another solution:\n");
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }

    //Create a double stream, sum all the elements and print the result
    private void exercise2() {
        double sum = DoubleStream.of(1.24, 2.74, 8.32, 4.21).sum();
        System.out.println("The sum is: " + sum);
    }

    //Map the length of each word from the list to an integer stream and print the result
    private void exercise3() {
        List<String> list = Arrays.asList(
                "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

        list.stream()
                .mapToInt(s -> s.length())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        PrimitiveStreams demo = new PrimitiveStreams();
        demo.runExercise();

    }

    private void runExercise() {
        exercise1();
        //exercise2();
        //exercise3();
    }
}
