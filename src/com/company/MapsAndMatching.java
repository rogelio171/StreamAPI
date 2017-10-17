package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapsAndMatching {

    //Print a list of lists using flatMap
    private void exercise1() {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("L1", "L2", "L3"),
                Arrays.asList("M1", "M2", "M3"),
                Arrays.asList("N1", "N2", "N3"));

        list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    //Convert Stream<String[][]> to Stream<String> and print the result
    private void exercise2() {
        String[][] data = new String[][]{{"a", "b", "c"}, {"d", "e"}, {"f", "g", "h"}};

        Arrays.stream(data)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

    }

    //Find the first element of the stream
    private void exercise3() {
        Stream<String> s = Stream.of("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

        s.findFirst().ifPresent(System.out::println);
    }

    //Find any element of the stream
    private void exercise4() {
        Stream<String> s = Stream.of("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog").parallel();

        s.findAny().ifPresent(System.out::println);
    }

    //Check if all integers in a list are 7
    private void exercise5() {
        List<Integer> numbers = Arrays.asList(7,7,7,7,7,7,7,7);

        boolean isAllMatch = numbers.stream().allMatch(n -> n == 7);
        System.out.println(isAllMatch);
    }

    //Check if any integers in a list is a 9
    private void exercise6() {
        List<Integer> numbers = Arrays.asList(3,4,5,6,8,2,6,9,5,1,4,7);

        boolean isAnyMatch = numbers.stream().anyMatch(n -> n == 9);
        System.out.println(isAnyMatch);
    }

    //Check if no integers in a list is a 3
    private void exercise7() {
        List<Integer> numbers = Arrays.asList(3,4,5,6,8,2,6,9,5,1,4,7);

        boolean isNoneMatch = numbers.stream().noneMatch(n -> n == 3);
        System.out.println(isNoneMatch);
    }

    public static void main(String[] args) {
        MapsAndMatching demo = new MapsAndMatching();
        demo.runExercise();
    }

    private void runExercise() {
        exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        //exercise7();
    }
}
