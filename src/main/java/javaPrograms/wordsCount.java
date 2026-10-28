package javaPrograms;

public class wordsCount {

    public static void main(String[] args) {
        
        String str = "I am human";
        String trimmeed = str.trim();
        int count = trimmeed.isEmpty()?0:trimmeed.split("\\s+").length;
        System.out.println(count);
    }
    
}
