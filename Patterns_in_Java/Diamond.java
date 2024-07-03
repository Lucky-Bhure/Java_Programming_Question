import java.util.Scanner;

public class Diamond {
       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Enter number of Rows : ");
              int height = sc.nextInt();
              sc.close();

              System.out.println("Diamond Pattern : ");
              // Full Pyramid
              for (int i = 1; i <= height; i++) {
                     for (int j = 1; j <= height; j++) {
                            if ((i + j) > height) {
                                   System.out.print("* ");
                            } else {
                                   System.out.print("  ");
                            }
                     }

                     if (i > 1) {
                            for (int j = 0; j < (i - 1); j++) {
                                   System.out.print("* ");
                            }
                     }
                     System.out.println("");
              }

              // Reverse Full Pyramid
              for (int i = 1; i < height; i++) {
                     for (int j = 1; j <= height; j++) {
                            if (j > i) {
                                   System.out.print("* ");
                            } else {
                                   System.out.print("  ");
                            }
                     }

                     for (int j = (height - i); j > 1; j--) {
                            System.out.print("* ");
                     }
                     System.out.println(" ");
              }

       }
}
