package sumOfArrayElementsPrograms;

public class SumOfEvenNumbersInArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};
        int sum=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){

                sum= sum+arr[i];

            }
        }

        System.out.println("sum of all even Numbers in array are "+sum);
    }
}
