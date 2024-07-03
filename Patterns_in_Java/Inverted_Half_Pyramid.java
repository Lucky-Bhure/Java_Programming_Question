import java.util.Scanner;

public class Inverted_Half_Pyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height of Pyramid :");
        int height = sc.nextInt();
        sc.close();
        
        System.out.println("Inverted Half Pyramid Pattern : ");
        for(int i = 1 ; i <= height ; i++){
            for(int j = i ; j <= height ; j++){
                System.out.print("* ");
                }
                System.out.println(" ");
            }
    }
}
