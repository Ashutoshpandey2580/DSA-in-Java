package pattern;

public class pattern7 {
    public static void hallow_rectangle(int totRows,int totCols){
        //Outer loop
        for (int i = 1; i <=totRows ; i++) {
            // Inner loop
            for (int j = 1; j <=totCols ; j++) {
                // cell -(i,j)
                if (i==1||i==totRows||j==1||j==totCols){
                    // boundary cell
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }


            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        //call
      hallow_rectangle(4,5);



    }
}
