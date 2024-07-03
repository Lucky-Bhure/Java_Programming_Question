import java.util.Scanner;

public class FibonacciSeries {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

              System.out.print("How many number you want in Fibonacci Series: ");
              int num = sc.nextInt();
              sc.close();

              int temp1 = 0,temp2 = 1;
              System.out.println("Your Fibonacci Series: ");
              System.out.print(temp1 + " " + temp2 + " ");
              
              for(int i = 1; i < (num-1); i++){
                     int temp = temp1;
                     temp1 = temp2;
                     temp2 = temp + temp1;
                     System.out.print(temp2 + " ");
              }
       }
}
