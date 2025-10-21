package Recursion;

public class firstOcuurence {
    public static int firstOcuurence(int arr[],int key,int  i){
        //base case
        if (i== arr.length){
            return -1;
        }
        //codition
        if (arr[i]==key) {
            return i;

        }
        return  firstOcuurence(arr, key, i+1);

    }
    public static void main(String[] args) {
        int []arr={8,3,6,9,10,2,5,10,2,3};
        System.out.println(firstOcuurence(arr,5,0));

    }
}
