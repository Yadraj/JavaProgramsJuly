package programs;

public class ReverseString {

    public static void main(String[] args) {

        //1. using concatination method

        String str = "abcd";
        String rev="";

//		int len = str.length();
//		for(int i = len-1;i>=0;i--) {
//			rev = rev +str.charAt(i);
//		}
//		System.out.println(rev);




        //2. using character array method

        char[] arr = str.toCharArray();
        int len = arr.length;
        for(int i = len-1;i>=0;i--) {
            rev = rev + arr[i];
        }
        System.out.println(rev);



        //3. using string buffer class

//		StringBuffer sb = new StringBuffer(str);
//		rev=sb.reverse().toString();
//		System.out.println(rev);




    }
}
