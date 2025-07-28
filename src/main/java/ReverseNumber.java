import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

        //1.method
//		int rev=0;
//		while(num!=0) {
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		System.out.println(rev);


        //2.method
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//		System.out.println(rev);

        //3.method

        StringBuilder sb=new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.println(rev);


    }

}
