import java.util.Scanner;

public class ArithmaticProgration {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

              System.out.print("Enter First Element in A.P. Series: ");
              int a = sc.nextInt();
              System.out.print("Enter Common Difference in A.P. Series: ");
              int d = sc.nextInt();
              System.out.print("How many element you want in A.P. Series: ");
              int n = sc.nextInt();
              sc.close();

              for(int i =0 ;i<n;i++){
                     int temp = a+(d*i);
                     System.out.print(temp + " ");
              }
       }
}
