package programs;

public class PrimeNumberOrNot {

    public static void main(String[] args) {

        int num=19;
        int count=0;

        if(num>1){

            for(int i=0; i<=12; i++){

                if(num%1==0){
                    count++;
                }
            }
            if(count==2)
                System.out.println("Prime Number");
            else
                System.out.println("Not Prime Number");


        }
        else
            System.out.println("Not Prime Number");
    }



}
