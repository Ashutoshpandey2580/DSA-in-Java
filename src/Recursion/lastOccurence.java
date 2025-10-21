package Recursion;

public class lastOccurence
{
    public static int lastOcuurence(int arr[],int key,int  i){
        //base case
        if (i== arr.length){
            return -1;
        }
        //codition
        int isFound=lastOcuurence(arr, key, i+1);
        if (isFound== -1&& arr[i]==key) {
            return i;

        }
        return isFound;

    }
    public static void main(String[] args) {
        int []arr={5,5,5,5,5};
        System.out.println(lastOcuurence(arr,5,0));

    }
}
