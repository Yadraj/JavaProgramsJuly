package Arrays;

public class Insertion {

    public static void main(String[] args) {

        int[] arr ={10,20,30,40,50};
        int index =2;
        int element=25;

        int[] arrNew = new int[arr.length+1];

        for(int i=0;i<index;i++){

            arrNew[i]=arr[i];
        }

        arrNew[index]=element;

        for(int i=index;i<arr.length;i++){

            arrNew[i+1]=arr[i];

        }

        for(int num : arrNew){

            System.out.print(num+ " ");
        }

    }
}
