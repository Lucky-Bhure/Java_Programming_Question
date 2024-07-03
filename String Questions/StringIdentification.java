// Find if a Number is Binary or not
// Find is a Number is Hexa-Decimal or not
// Find is the data in Date format (dd/mm/yyyy)

import java.util.Scanner;

public class StringIdentification {
       
       public static void main(String args[]){

              String str;
              Scanner sc = new Scanner(System.in);
              System.out.println("1. Enter a Binary Number");
              System.out.println("2. Enter a Hexa Decimal Number");
              System.out.println("3. Enter a Date(DD/MM/YYYY)");
              System.out.print("Enter one of above : ");
              str = sc.nextLine();
              sc.close();

              if(str.matches("(1|0)+")){
                     System.out.println("You entered an Binary Number");
              } else if(str.matches("[0-9A-F]+")){
                     System.out.println("You entered an Hexa Decimal Number");
              } else if (str.matches("([0-2][0-9]|[3][0-1])/([0][1-9]|[1][0-2])/[0-9]{4}")) {
                     System.out.println("You entered a Date "+str);
              } else {
                     System.out.println("Enter a valid Number");
              }

       }

}

