package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class OptionalAndParallel {

    //Complete the function average to work when no parameters are passed to it
    private Optional<Double> average(int... values) {
        if(values.length == 0) {
            return Optional.empty();
        }

        int sum = IntStream.of(values).sum();
        return Optional.of((double) sum / values.length);
    }

    //Return the value of the list or return zero if the list is empty using Optional class
    private int lengthOfList(List<String> stringList) {
        Optional<List<String>> listOptional = Optional.of(stringList);

        return listOptional
                .map(List::size)
                .orElse(0);
    }

    //Checks the average method
    private void exercise1() {
        Optional<Double> result = average();
        System.out.println(result.orElse(Double.NaN));
        System.out.println(result.orElseGet(Math::random));
        System.out.println(result.orElseThrow(IllegalStateException::new));
    }

    //Return the value of the list or return zero if the list is empty using Optional class
    private void exercise2() {
        List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
        int size = lengthOfList(companyNames);
        System.out.println(size);

        List<String> emptyList = new ArrayList<>();
        size = lengthOfList(emptyList);
        System.out.println(size);
    }

    //Print values of a parallelStream
    private void exercise3() {
        IntStream.rangeClosed(1, 150).parallel().forEach(System.out::println);
    }

    public static void main(String[] args) {
        OptionalAndParallel demo = new OptionalAndParallel();
        demo.runExercise();
    }

    private void runExercise() {
        exercise1();
        //exercise2();
        //exercise3();
    }
}
