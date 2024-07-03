import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Rows : ");
        int row = sc.nextInt();
        sc.close();

        int k = 1;

        System.out.println("Floyd's Triangle Pattern : ");
        for( int i = 1; i <= row; i++){
            for( int j = 1; j <= i ; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println(" ");
        }
    }
}
