import java.util.Scanner;

public class MultiplicationTable {
       public static void main(String args[]){

              Scanner sc = new Scanner(System.in);

              System.out.print("Which number table you want : ");
              int num = sc.nextInt();
              sc.close();

              System.out.println("Table: ");
              for(int i=1;i<=10;i++){
                     System.out.println(num+" * "+i+" = "+(num*i));
              }
       }
}
