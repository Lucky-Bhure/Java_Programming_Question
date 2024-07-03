import java.util.Scanner;

public class Armstrong {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

              System.out.print("Enter your number: ");
              int num = sc.nextInt();
              int check = num;
              sc.close();
              int count = 0;
              
              do{
                     int temp = check%10;
                     check = (check - temp)/10;
                     count = count + (temp*temp*temp);
              }
              while(check > 0);

              if(num == count){
                     System.out.println(num + " is an Armstrong Number");
              } else {
                     System.out.println(num + " is not an Armstrong Number");
              }

       }
}
