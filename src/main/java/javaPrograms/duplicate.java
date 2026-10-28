package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class duplicate {

    public static void main(String[] args) {

        String str = "programming";
        Map<Character, Integer> count = new HashMap<>();

        for (char ch : str.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

    }

}
