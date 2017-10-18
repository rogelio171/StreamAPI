package com.company;

import java.util.Arrays;
import java.util.List;

public class PracticeExercises {

    /* Print a person, if a person is not found, return null.
     * Expected:
     * Person{name = '[nameOfPerson]', age=[ageOfPerson] or null
     */
    private void exercise1(List<Person> personList) {

    }

    /* Print a person name or return "".
     * Expected:
     * name = [nameOfPerson]
     */
    private void exercise2(List<Person> personList) {

    }

    /* Print the age average of the person list.
     * Expected:
     * average = [ageAverage]
     */
    private void exercise3(List<Person> personList) {

    }

    /* Print all the names of the personList in uppercase. *Use method reference.
     * Expected:
     * [all the names in uppercase]
     */
    private void exercise4(List<Person> personList) {

    }

    public static void main(String[] args) {
        PracticeExercises practiceExercises = new PracticeExercises();
        practiceExercises.runExercises();
    }

    private void runExercises() {
        List<Person> people = Arrays.asList(
                new Person("Natalia", 21),
                new Person("Ana", 28),
                new Person("Arthurus", 62),
                new Person("Kratos", 31)
        );

        exercise1(people);
        //exercise2(people);
        //exercise3(people);
        //exercise4(people);
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
