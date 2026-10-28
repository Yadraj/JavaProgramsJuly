package javaPrograms;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String a = "listen";
        String b = "silent";

        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2)); // true

    }

}
