import java.util.Scanner;
import java.lang.Math;

public class AreaOfTriangle {
       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

              int choice;
              System.out.println("Find Area of Triangle by");
              System.out.println("1. Height and Base value");
              System.out.println("2. Length of Three sides");
              System.out.println("Enter your choice : ");
              choice = sc.nextInt();

              if (choice == 1) {
                     // Area of Triangle by height and base
                     float height, base, area;
                     System.out.print("Enter Height(m) of Triangle : ");
                     height = sc.nextFloat();
                     System.out.print("Enter Base(m) of Triangle : ");
                     base = sc.nextFloat();

                     area = (height * base) / 2;
                     System.out.print("Area of Triangle is " + area + " sq.m");

              } else if(choice == 2) {
                     // Area of Triangle by three sides
                     float side1, side2, side3;
                     System.out.print("Enter Side1(m) of Triangle : ");
                     side1 = sc.nextFloat();
                     System.out.print("Enter Side2(m) of Triangle : ");
                     side2 = sc.nextFloat();
                     System.out.print("Enter Side3(m) of Triangle : ");
                     side3 = sc.nextFloat();

                     float perimeter = (side1 + side2 + side3)/2;

                     float value = perimeter*(perimeter - side1)*(perimeter - side2)*(perimeter - side3);

                     double area = Math.sqrt(value);
                     System.out.print("Area of Triangle is " + area + " sq.m");

              } else {
                     System.out.println("Enter correct choice");
              }

              sc.close();
       }
}
