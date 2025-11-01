package pattern;

public class pattern5 {
    public static void main(String[] args) {
        //outer loop
//        for (int i = 1; i <=4 ; i++) {
//            // Inner loop
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j+" ");
//
//            }
//            System.out.println();
//
//        }
        int n =4;
        for (int line = 1; line <=n ; line++) {
            for (int number = 1; number <=line ; number++) {
                System.out.print(number+" ");
                
            }
            System.out.println();

        }
    }
}
