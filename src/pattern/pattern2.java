package pattern;

public class pattern2 {
//   public static void main(String[] args) {
//        pattern2(5);
//    }
//    static  void pattern2(int n){
//        for (int row =1; row <= n; row++) {
//            // for every row run the col
//            for (int col = 1; col <=row; col++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//
//        }
//
//  }
//    }
public static void main(String[] args) {
    // Outer loop
    for (int line = 1; line <=10; line++) {
        //inner loop
        for (int star = 1; star <=line; star++) {
            // what to print
            System.out.print("*"+" ");
        }
        System.out.println();

    }
}
}