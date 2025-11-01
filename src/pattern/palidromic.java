package pattern;

public class palidromic {
    public static void palindrome_number(int n){
        // Outer loop
        for (int i = 1; i <=n ; i++) {
            //spaces
            for (int j =1 ; j<=n-i ; j++) {
                System.out.print(" ");
            }
            // numbers
            // loop for descending order
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+"");
            }
                //loop for ascending order
                for (int j = 2; j <=i ; j++) {
                    System.out.print(j+"");



            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        palindrome_number(5);

    }
}
