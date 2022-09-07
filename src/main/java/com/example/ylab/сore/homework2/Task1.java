package com.example.ylab.сore.homework2;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    static class Person {
        final int id;

        final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ComplexExamples.Person person)) return false;
            return getId() == person.getId() && getName().equals(person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }
    }

    private static ComplexExamples.Person[] RAW_DATA = new ComplexExamples.Person[]{
            new ComplexExamples.Person(0, "Harry"),
            new ComplexExamples.Person(0, "Harry"), // дубликат
            new ComplexExamples.Person(1, "Harry"), // тёзка
            new ComplexExamples.Person(2, "Harry"),
            new ComplexExamples.Person(3, "Emily"),
            new ComplexExamples.Person(4, "Jack"),
            new ComplexExamples.Person(4, "Jack"),
            new ComplexExamples.Person(5, "Amelia"),
            new ComplexExamples.Person(5, "Amelia"),
            new ComplexExamples.Person(6, "Amelia"),
            new ComplexExamples.Person(7, "Amelia"),
            new ComplexExamples.Person(8, "Amelia"),
    };

    public static void main(String[] args) {
        System.out.println("Raw data:");
        System.out.println();

        for (ComplexExamples.Person person : RAW_DATA) {
            System.out.println(person.id + " - " + person.name);
        }

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
        System.out.println();


        Arrays.stream(RAW_DATA)
                .filter(Objects::nonNull)
                .distinct()
                .map(ComplexExamples.Person::getName)
                .collect(Collectors.toMap(key -> key, val -> 1, Integer::sum))
                .forEach((key1, value) -> System.out.println("Key: " + key1 + "\n" +
                        "Value:" + value));
    }
}
