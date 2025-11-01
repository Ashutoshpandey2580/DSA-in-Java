package pattern;

public class Erhombus {
        public static void E_rhombus_shape(int n){
            for (int i = 1; i <=n ; i++) {
                //space
                for (int j = 1; j <= (n - i); j++) {
                    System.out.print(" ");

                }
                if (i == 1 || i == n || i == (n + 1) / 2) {
                    // Top, middle, bottom rows — print full line of stars
                    for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                } else {
                    // vertical bar of E- print only one star
                    System.out.print("*");
                }
                // Next line
                System.out.println();
            }

        }
        public static void main(String[] args){
            E_rhombus_shape(5);
        }
    }


