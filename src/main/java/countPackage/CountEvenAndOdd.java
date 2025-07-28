package countPackage;

public class CountEvenAndOdd {

    public  static void main (String args[]) {

        int num = 123456;
        int EvenCount=0;
        int OddCount=0;
        while(num!=0){

            int lastDigit = num%10;
            if(lastDigit%2==0){
                EvenCount++;
            }else
                OddCount++;

            num=num/10;

        }

        System.out.println("Even count : "+ EvenCount);
        System.out.println("Odd count : "+ OddCount);



    }


}
