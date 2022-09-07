package com.example.ylab.сore.homework1.task1;

import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int minValue = 0, maxValue = 0;
        float averageArr = 0;
        int[][] arr = new int[2][2];
        int countElementsArr = Stream.of(arr).mapToInt(m -> m.length).sum();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt();
                averageArr +=arr[i][j];

//                Поиск максимуму
                if(arr[i][j] > maxValue)
                    maxValue = arr[i][j];

//                Поиск минимума
                if(arr[i][j] < minValue)
                    minValue = arr[i][j];

                }
        }
        averageArr = averageArr/countElementsArr;

        System.out.printf("Максимальное значение в массиве: %d;\n" +
                "Минимальное значение в массиве: %d;\n" +
                "Среднее значение в массиве: %f;\n",maxValue,minValue,averageArr);
        for (int i = 0; i < arr.length; i++, System.out.println()) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
