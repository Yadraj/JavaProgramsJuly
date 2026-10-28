package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachChar2 {

    public static void main(String[] args) {

        String str = "hello";
        Map<Character, Integer> count = new HashMap<>();

        for (char ch : str.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        System.out.println(count);

    }

}
