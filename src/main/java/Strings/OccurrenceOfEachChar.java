package Strings;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachChar {

    public static void main(String[] args) {

        String str = "banana is good";
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

      System.out.println(hm);
    }

}
