package com.example.ylab.сore.homework1.task2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrNum = {5, 6, 3, 2, 5, 1, 4, 9};
        System.out.println(Arrays.toString(sortedArray(arrNum)));
    }

    public static int[] sortedArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

    @Test
    public void testSortedArray() {
        int[] arrNumSorted = {1, 2, 3, 4, 5, 5, 6, 9};
        int[] arrNum = {5, 6, 3, 2, 5, 1, 4, 9};
        Assert.assertArrayEquals(arrNumSorted,sortedArray(arrNum));
    }
}
