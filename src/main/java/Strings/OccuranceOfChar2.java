package Strings;

public class OccuranceOfChar2 {

    public static void main(String[] args) {
        
        String str = "elephant";
        int temp = str.replace("e","").length();
        int len =str.length();
        int count=len-temp;
        System.out.println(count);
        
    }
    
}
