package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PipeLineDemo {

    public static void main(String[] args) {
        //Create an empty stream of string
        System.out.println("Empty Stream: ");
        Stream<String> empty = Stream.empty();
        empty.forEach(System.out::println);

        //Create a single element stream of integer
        System.out.println("\n\nStream of single element: ");
        Stream<Integer> singleElement = Stream.of(1);
        singleElement.forEach(System.out::print);

        //Create a stream of integers from an array
        System.out.println("\n\nStream of integers: ");
        Stream<Integer> fromArray = Stream.of(1,2,3,4,5);
        fromArray.forEach(System.out::print);

        //Convert a list to stream
        System.out.println("\n\nStream of strings: ");
        List<String> list = Arrays.asList("L", "i", "s", "t");
        Stream<String> fromList = list.stream();
        fromList.forEach(System.out::print);

        System.out.println("\n\nStream of strings, the short way: ");
        Arrays.asList("S", "h", "o", "r", "t").stream().forEach(System.out::print);

        //Create a stream of random numbers
        System.out.println("\n\nRandom numbers: ");
        Stream<Double> randomNumbers = Stream.generate(Math::random);
        randomNumbers.limit(5).forEach(System.out::println);

        //Create a stream of odd numbers
        System.out.println("\nOdd numbers: ");
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        oddNumbers.limit(5).forEach(System.out::println);

    }
}
