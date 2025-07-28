import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orginal = num;
        int rev = 0;
        while(num!=0)

        {

            rev = rev * 10 + num % 10;
            num = num / 10;

        }

        System.out.println(rev);
        if(orginal==rev)

        {
            System.out.println("palindrome Number");
        }else

        {
            System.out.println("Not palindrome Number");
        }
    }


}

