import java.util.Scanner;

public class SumOfNNumbers {
       public static void main(String args[]){

              Scanner sc = new Scanner(System.in);
              System.out.print("Enter your number: ");
              int num = sc.nextInt();
              sc.close();

              int sum = 0;
              for(int i = 1; i <= num; i++){
                     sum = sum + i;
              }
              System.out.println("Sum of "+num+" number is "+sum);
       }
}
