import java.util.Scanner;

public class SumofTwoNumbers {
	
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	int num1, num2, result;
	System.out.print("Enter First Number : ");
	num1 = sc.nextInt();
	System.out.print("Enter Second Number : ");
	num2 = sc.nextInt();
	result = num1 + num2;
	
	System.out.print("Addition of "+ num1 + " and "+ num2 + " is "+ result);
	
	sc.close();

	}
	
}