import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquationRoots {
       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);
              int a, b, c;

              System.out.println("Ax^2 + Bx + C = 0");
              System.out.print("Enter value of A : ");
              a = sc.nextInt();
              System.out.print("Enter value of B : ");
              b = sc.nextInt();
              System.out.print("Enter value of C : ");
              c = sc.nextInt();
              sc.close();

              double value =  Math.sqrt((b*b)-(4*a*c));
              
              double root1 =(-b+value)/(2*a);
              double root2 = (-b-value)/(2*a);

              System.out.println("Roots are "+root1+ " and "+ root2);

       }
}
