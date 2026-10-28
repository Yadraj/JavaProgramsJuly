package javaPrograms;

public class RemoveDuplicate {

    public static void main(String[] args) {
        
        String str ="programming";
        StringBuilder sb = new StringBuilder();
        
        for(char ch: str.toCharArray()){
            if(sb.indexOf(String.valueOf(ch))==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    
}

