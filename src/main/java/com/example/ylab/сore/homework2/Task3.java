package com.example.ylab.сore.homework2;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(fuzzySearch("lw", "cartwheel")); // false
    }
    private static boolean fuzzySearch(String searchWord, String string) {
        int indexString = 0;
        int fromIndexString = 0;

        if(searchWord == null || string == null)
            return false;


        if (searchWord.length() > string.length())
            return false;


        if (searchWord.length() == string.length())
            return string.contains(searchWord);


        while (indexString < searchWord.length()) {
            fromIndexString = string.indexOf(searchWord.charAt(indexString), fromIndexString);
            indexString++;
            fromIndexString++;

            if (fromIndexString == 0)
                return false;
        }
        return true;

    }
}
