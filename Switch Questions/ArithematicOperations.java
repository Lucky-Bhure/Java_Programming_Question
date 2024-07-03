// Make a Menu Driven Program for Arithmetic Operations

import java.util.Scanner;

public class ArithematicOperations {
       public static void main(String args[]){

              Scanner sc = new Scanner(System.in);

              System.out.println("Menu for Arithematic Operations:");
              System.out.println("1.ADD");
              System.out.println("2.SUBSTRACT");
              System.out.println("3.MULTIPLY");
              System.out.println("4.DIVISION");
              System.out.println("5.MODULE");

              System.out.print("Choose the operation by writing value: ");
              String option = sc.nextLine();

              System.out.println("Enter two numbers: ");
              System.out.print("Enter First Numbers: ");
              int num1 = sc.nextInt();
              System.out.print("Enter Second Numbers: ");
              int num2 = sc.nextInt();

              sc.close();

              switch (option) {
                     case "ADD":
                            System.out.println("Result: "+(num1+num2));
                            break;
                     case "SUBSTRACT":
                            System.out.println("Result: "+(num1-num2));
                            break;
                     case "MULTIPLY":
                            System.out.println("Result: "+(num1*num2));
                            break;
                     case "DIVISION":
                            System.out.println("Result: "+(num1/num2));
                            break;
                     case "MODULE":
                            System.out.println("Result: "+(num1%num2));
                            break;
                     default:
                            System.out.println("Enter a valid choice");
                            break;
              }            
       }
}
