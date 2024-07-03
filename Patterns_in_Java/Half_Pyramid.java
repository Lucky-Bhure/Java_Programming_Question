import java.util.Scanner;

public class Half_Pyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height of Pyramid :");
        int height = sc.nextInt();
        sc.close();

        System.out.println("Half Pyramid Pattern : ");
        for(int i = 1 ; i <= height ; i++){
            for(int j = 1 ; j <= i; j++ ){
                System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
}