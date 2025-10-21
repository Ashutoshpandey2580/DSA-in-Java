package Recursion;

public class tillingProblem {
    public static int tillingProblem(int n){ //2*n floor  size
        // base case
      if(n==0||n==1){ //
           return 1;
        }
//      //kaam
//        // vertical choice
//        int fnm1=tillingProblem(n-1);
//      //horizontal
//        int fnm2=tillingProblem(n-2);
//        int toways=fnm1+fnm2;
//        return toways;
        return tillingProblem(n-1)+(n-1)*tillingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
}
