package com.example.ylab.сore.homework2;

import java.util.Arrays;
import java.util.HashSet;

public class Task2 {

    public static void main(String[] args) {
        int[] arrNumbers = new int[]{3, 5, 5, 7};
        int summ = 10;
        System.out.println(getPairOfNumbersEqualSum(arrNumbers, summ));
    }

    private static String getPairOfNumbersEqualSum(int[] arrNumbers, int sum) {
        int[] answer = new int[2];
        HashSet<Integer> set = new HashSet<Integer>();
        for (int number : arrNumbers) {
            if (set.contains(sum - number)) {
                answer[0] = sum - number;
                answer[1] = number;
                set.remove(sum - number);
                break;
            } else
                set.add(number);
        }
        return Arrays.toString(answer);
    }
}
