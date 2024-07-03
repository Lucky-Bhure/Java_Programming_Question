import java.util.Scanner;

public class Upper_Full_Pyramid {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

              System.out.print("Enter number of Rows : ");
              int row = sc.nextInt();
              sc.close();

              System.out.println("Upper Full Pyramid Pattern : ");
              for (int i = 1; i <= row; i++) {
                     for (int j = 1; j <= row; j++) {
                            if ((i + j) > row) {
                                   System.out.print("*");
                            } else {
                                   System.out.print(" ");
                            }
                     }
                     if (i != 1) {
                            for (int j = 0; j < (i-1); j++) {
                                   System.out.print("*");
                            }
                     }
                     System.out.println("");
              }
       }
}
