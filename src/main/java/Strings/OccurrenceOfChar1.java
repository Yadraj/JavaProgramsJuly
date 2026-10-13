package Strings;

public class OccurrenceOfChar1 {

    public static void main(String[] args) {

        String input = "java programming";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'a') {
                count++;

            }

            
        }

        System.out.println(count);

    }

}
