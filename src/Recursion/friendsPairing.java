package Recursion;

public class friendsPairing {
    public static int friendsPairing(int n){
        //base case
        if (n==1||n==2){
            return  n;

        }
//
         // or second one line of code to this method
        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
