package Arrays;

public class LinearSearching {

    public static void main(String[] args) {

        int[] arr={10,20,30,40};

        int element = 30;
        boolean found=false;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==element){

                System.out.println("Element found at "+i);
                found=true;
                break;
            }
        }

        if(!found){

            System.out.println("Element not found in array");
        }
    }
}
