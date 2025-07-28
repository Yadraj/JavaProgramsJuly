import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = sc.nextLine();
        String original = str;
        String rev = "";
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);
        if (original.equals(rev)) {
            System.out.println("palindrome string");
        } else
            System.out.println("not palindrome string");

    }
}
