package com.example.ylab.сore.homework2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {
        int[] arrNumbers = new int[]{3, 4, 2, 7};
        int summ = 10;
        System.out.println(Arrays.toString(searchSum(arrNumbers, summ)));
    }

    private static int[] searchSum(int[] arrNumbers, int sum) {
        Map<Integer, Integer> numObject = new HashMap<>();
        int[] result = new int[2];
        if (arrNumbers != null) {
            for (int i = 0; i < arrNumbers.length; i++) {
                numObject.put(arrNumbers[i], i);
                if (numObject.containsKey(sum - arrNumbers[i]) && numObject.get(sum - arrNumbers[i]) != i) {
                    result[0] = sum - arrNumbers[i];
                    result[1] = arrNumbers[i];
                }
            }
        }
        return result;
    }
}
