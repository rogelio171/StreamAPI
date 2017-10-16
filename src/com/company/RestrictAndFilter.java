package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RestrictAndFilter {

    //Create a new list with all the strings from original list converted to
    //lower case and print them out
    private void exercise1() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

        List<String> newList = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        newList.forEach(System.out::println);
    }

    //Modify exercise 1 so that the new list only contains strings that have an
    //odd length
    private void exercise2() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

        List<String> newList = list.stream()
                .filter(s -> s.length() % 2 != 0)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        newList.forEach(System.out::println);
    }

    //Join the second, third and forth strings of the list into a single string,
    //where each word is separated by a hyphen (-). Print the resulting string.
    private void exercise3() {
        List<String> list = Arrays.asList(
                "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

        String resultingString = list.stream()
                .skip(1)
                .limit(3)
                .collect(Collectors.joining("-"));

        System.out.println(resultingString);

    }

    //From the list, convert to upper case and remove duplicates then sort in natural order.
    //Print the resulting list.
    private void exercise4() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG",
                "in", "jumped", "over", "the", "rush", "forest", "SEA", "Air");

        List<String> resultingList = list.stream()
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        resultingList.forEach(System.out::println);

    }

    public static void main(String[] args) {
        RestrictAndFilter demo = new RestrictAndFilter();
        demo.runExercise();
    }

    private void runExercise() {
        exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
    }
}
