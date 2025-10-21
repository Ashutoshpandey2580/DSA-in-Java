package Recursion;

public class naturalNumber {
    public static int calcSum(int n){
        // base case
        if (n==1){ // sum n is 1
            return 1;
        }
        int snm1=calcSum(n-1);
        int sn=n+snm1; // for sum  formula
        return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calcSum(n));

    }
}
