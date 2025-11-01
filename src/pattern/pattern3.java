package pattern;

public class pattern3 {
    public static void main(String[] args) {
pattern3(5);
    }
    static void pattern3(int n ){
        for (int row = 1; row <=n ; row++) {
            // for every row,run the col
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print(" * ");
            }
            System.out.println();


        }

    }
}
