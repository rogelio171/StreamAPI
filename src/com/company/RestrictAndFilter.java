package com.company;

import java.util.Arrays;
import java.util.List;

public class RestrictAndFilter {

    //Create a new list with all the strings from original list converted to
    //lower case and print them out
    private void exercise1() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

    }

    //Modify exercise 1 so that the new list only contains strings that have an
    //odd length
    private void exercise2() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

    }

    //Join the second, third and forth strings of the list into a single string,
    //where each word is separated by a hyphen (-). Print the resulting string.
    private void exercise3() {
        List<String> list = Arrays.asList(
                "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

    }

    //From the list, convert to lower-case and remove duplicates then sort in natural order.
    //Print the resulting list.
    private void exercise4() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG",
                "in", "jumped", "over", "the", "rush", "forest", "SEA", "Air");

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
