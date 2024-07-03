import java.util.Scanner;

public class DisplayDigitOfNumber {
       public static void main(String[] args) {
              
              Scanner sc = new Scanner(System.in);

              System.out.print("Enter your number: ");
              int num = sc.nextInt();
              sc.close();
              
              int count = 0;
              
              System.out.print("Number contains: ");
              do{
                     int temp = num%10;
                     num = (num - temp)/10;
                     System.out.print(temp+" ");
                     count++;
              }
              while(num > 0);
              
              System.out.print("\nNo. of Digits in give number: "+count);
       }
}
