import java.util.Scanner;

public class Palindrome {

       public static void main(String[] args) {
              
              Scanner sc = new Scanner(System.in);
              
              System.out.print("Enter your number: ");
              int num = sc.nextInt();
              int check = num;
              sc.close();
              
              int count = 0;
              
              while(check > 0){
                     int temp = check%10;
                     check = (check - temp)/10;
                     count = count*10 + temp;
              }
              
              if(count == num){
                     System.out.println(num+" is a Palindrome Number");
              } else {
                     System.out.println(num+" is not a Palindrome Number");
              }


       }

}
