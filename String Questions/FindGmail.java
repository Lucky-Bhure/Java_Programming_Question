// Find if the email id is on gmail
// Find username and domain name form email

import java.util.Scanner;

public class FindGmail {
       public static void main(String args[]) {

              String mail;
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter your Gmail : ");
              mail = sc.nextLine();
              sc.close();

              int index = mail.indexOf("@");

              String username = mail.substring(0, index);
              String domain = mail.substring(index + 1);

              System.out.println("Username : " + username);
              System.out.println("Domain : " + domain);

              System.out.println(domain.startsWith("gmail"));
       }

}