package Arrays;

public class Deletion {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int index=2;

        int[] arrNew = new int[arr.length-1];

        int j=0;

        for(int i =0; i<arr.length;i++){

            if(i==index){
                continue;
            }

            arrNew[j]=arr[i];
            j++;
        }

        for(int num : arrNew){

            System.out.print(num+ " ");
        }
    }
}
