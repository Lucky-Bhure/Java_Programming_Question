import java.util.Scanner;

public class Inverted_Half_Pyramid_with_Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height of Pyramid :");
        int height = sc.nextInt();
        sc.close();
        
        System.out.println("Inverted Half Pyramid with Number Pattern : ");
        for(int i = height ; i >= 1 ; i--){
            for(int j = 1 ; j <= i; j++ ){
                System.out.print(j +" ");
                }
                System.out.println(" ");
            }
        }
}
