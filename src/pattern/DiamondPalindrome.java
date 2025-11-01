package pattern;

public class DiamondPalindrome {
    public static void Diamond_Palindrome(int n) {

        // 🔹 Upper Half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // 🔹 Lower Half
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond_Palindrome(5);
    }
}
