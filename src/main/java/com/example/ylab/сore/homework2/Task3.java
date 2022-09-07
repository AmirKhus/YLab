package com.example.ylab.сore.homework2;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(fuzzySearch("cwheeel", "cartwheel"));
    }
    private static boolean fuzzySearch(String world, String text) {
        int kursor = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == world.charAt(kursor)) {
                if (world.length()-1 == kursor)
                    return true;
                kursor++;
            }
        }
        return false;
    }
}
