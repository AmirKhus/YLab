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
            if (!(o instanceof Person person)) return false;
            return getId() == person.getId() && getName().equals(person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }
    }

    private static Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"), // дубликат
            new Person(1, "Harry"), // тёзка
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
    };

    public static void main(String[] args) {

        System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
        System.out.println();
        if (RAW_DATA != null) {
        Arrays.stream(RAW_DATA)
                .filter(Objects::nonNull)
                .filter(obj -> obj.getName() != null)
                .sorted(Comparator.comparing(Person::getName))
                .sorted(Comparator.comparing(Person::getId))
                .distinct()
                .collect(Collectors.groupingBy(Person::getName))
                .forEach((name, numberOfNameRepetitions) -> {
                    System.out.println(name);
                    for (int i = 0; i < numberOfNameRepetitions.size(); i++) {
                        int count = i+1;
                        System.out.println( count +" - "+ numberOfNameRepetitions.get(i).getName() + "(" +numberOfNameRepetitions.get(i).getId() +")");
                    }
                });
                }else {
            System.out.println("Введите значение в массив");
        }

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Убрать дубликаты, отсортировать по идентификатору, сгруппировать по имени:");
        System.out.println();

        if (RAW_DATA != null) {
            Arrays.stream(RAW_DATA)
                    .filter(Objects::nonNull)
                    .filter(obj -> obj.getName() != null)
                    .distinct()
                    .sorted(Comparator.comparing(Person::getName))
                    .sorted(Comparator.comparing(Person::getId))
                    .collect(Collectors.groupingBy(Person::getName,Collectors.counting()))
                    .forEach((name, numberOfNameRepetitions) -> System.out.println("Key: " + name + "\n" +
                            "Value:" + numberOfNameRepetitions));
        }else {
            System.out.println("Введите значение в массив");
        }
    }
}
